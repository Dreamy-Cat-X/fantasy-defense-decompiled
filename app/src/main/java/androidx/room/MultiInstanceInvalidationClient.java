package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: D:\decomp\classes.dex */
public class MultiInstanceInvalidationClient {
    int mClientId;
    Context mContext;
    final Executor mExecutor;
    final InvalidationTracker mInvalidationTracker;
    final String mName;
    final InvalidationTracker.Observer mObserver;
    IMultiInstanceInvalidationService mService;
    final IMultiInstanceInvalidationCallback mCallback = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient.1
        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(final String[] strArr) {
            MultiInstanceInvalidationClient.this.mExecutor.execute(new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.1.1
                @Override // java.lang.Runnable
                public void run() {
                    MultiInstanceInvalidationClient.this.mInvalidationTracker.notifyObserversByTableNames(strArr);
                }
            });
        }
    };
    final AtomicBoolean mStopped = new AtomicBoolean(false);
    final ServiceConnection mServiceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MultiInstanceInvalidationClient.this.mService = IMultiInstanceInvalidationService.Stub.asInterface(iBinder);
            MultiInstanceInvalidationClient.this.mExecutor.execute(MultiInstanceInvalidationClient.this.mSetUpRunnable);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MultiInstanceInvalidationClient.this.mExecutor.execute(MultiInstanceInvalidationClient.this.mRemoveObserverRunnable);
            MultiInstanceInvalidationClient.this.mService = null;
            MultiInstanceInvalidationClient.this.mContext = null;
        }
    };
    final Runnable mSetUpRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.3
        @Override // java.lang.Runnable
        public void run() {
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = MultiInstanceInvalidationClient.this.mService;
                if (iMultiInstanceInvalidationService != null) {
                    MultiInstanceInvalidationClient.this.mClientId = iMultiInstanceInvalidationService.registerCallback(MultiInstanceInvalidationClient.this.mCallback, MultiInstanceInvalidationClient.this.mName);
                    MultiInstanceInvalidationClient.this.mInvalidationTracker.addObserver(MultiInstanceInvalidationClient.this.mObserver);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    };
    final Runnable mRemoveObserverRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.4
        @Override // java.lang.Runnable
        public void run() {
            MultiInstanceInvalidationClient.this.mInvalidationTracker.removeObserver(MultiInstanceInvalidationClient.this.mObserver);
        }
    };
    private final Runnable mTearDownRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.5
        @Override // java.lang.Runnable
        public void run() {
            MultiInstanceInvalidationClient.this.mInvalidationTracker.removeObserver(MultiInstanceInvalidationClient.this.mObserver);
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = MultiInstanceInvalidationClient.this.mService;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(MultiInstanceInvalidationClient.this.mCallback, MultiInstanceInvalidationClient.this.mClientId);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            if (MultiInstanceInvalidationClient.this.mContext != null) {
                MultiInstanceInvalidationClient.this.mContext.unbindService(MultiInstanceInvalidationClient.this.mServiceConnection);
                MultiInstanceInvalidationClient.this.mContext = null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public MultiInstanceInvalidationClient(Context context, String str, InvalidationTracker invalidationTracker, Executor executor) {
        this.mContext = context.getApplicationContext();
        this.mName = str;
        this.mInvalidationTracker = invalidationTracker;
        this.mExecutor = executor;
        this.mObserver = new InvalidationTracker.Observer(invalidationTracker.mTableNames) { // from class: androidx.room.MultiInstanceInvalidationClient.6
            @Override // androidx.room.InvalidationTracker.Observer
            boolean isRemote() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> set) {
                if (MultiInstanceInvalidationClient.this.mStopped.get()) {
                    return;
                }
                try {
                    MultiInstanceInvalidationClient.this.mService.broadcastInvalidation(MultiInstanceInvalidationClient.this.mClientId, (String[]) set.toArray(new String[0]));
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        };
        this.mContext.bindService(new Intent(this.mContext, (Class<?>) MultiInstanceInvalidationService.class), this.mServiceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stop() {
        if (this.mStopped.compareAndSet(false, true)) {
            this.mExecutor.execute(this.mTearDownRunnable);
        }
    }
}
