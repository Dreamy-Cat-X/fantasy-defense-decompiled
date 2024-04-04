package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class BlockingServiceConnection implements ServiceConnection {
    private boolean zza = false;
    private final BlockingQueue<IBinder> zzb = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zzb.add(iBinder);
    }

    public IBinder getServiceWithTimeout(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zza) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zza = true;
        IBinder poll = this.zzb.poll(j, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zza) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zza = true;
        return this.zzb.take();
    }
}
