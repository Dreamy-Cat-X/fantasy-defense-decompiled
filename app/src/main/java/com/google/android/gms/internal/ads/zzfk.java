package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfk implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zzaae = new Handler(Looper.getMainLooper());
    private final Context zzaaf;
    private final PowerManager zzaag;
    private final KeyguardManager zzaah;
    private BroadcastReceiver zzaai;
    private WeakReference<ViewTreeObserver> zzaaj;
    private WeakReference<View> zzaak;
    private zzem zzaal;
    private byte zzaam = -1;
    private int zzaan = -1;
    private long zzaao = -3;
    private Application zzyd;
    private final zzex zzyq;

    public zzfk(Context context, zzex zzexVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzaaf = applicationContext;
        this.zzyq = zzexVar;
        this.zzaag = (PowerManager) applicationContext.getSystemService("power");
        this.zzaah = (KeyguardManager) this.zzaaf.getSystemService("keyguard");
        Context context2 = this.zzaaf;
        if (context2 instanceof Application) {
            this.zzyd = (Application) context2;
            this.zzaal = new zzem((Application) this.zzaaf, this);
        }
        zze(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(View view) {
        View currentView = getCurrentView();
        if (currentView != null) {
            currentView.removeOnAttachStateChangeListener(this);
            zzg(currentView);
        }
        this.zzaak = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.zzaao = -2L;
            return;
        }
        this.zzaao = -3L;
    }

    private final View getCurrentView() {
        WeakReference<View> weakReference = this.zzaak;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final void zzct() {
        zzaae.post(new zzfj(this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzaan = -1;
        zzf(view);
        zzcv();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzaan = -1;
        zzcv();
        zzct();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzaak == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View currentView = getCurrentView();
        if (currentView == null || peekDecorView == null || currentView.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzaan = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzcv();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzcv();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzcv();
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzcv();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzcv();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcv();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzcv();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzcv();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzcv();
    }

    public final long zzcu() {
        if (this.zzaao <= -2 && getCurrentView() == null) {
            this.zzaao = -3L;
        }
        return this.zzaao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (r7 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzcv() {
        if (this.zzaak == null) {
            return;
        }
        View currentView = getCurrentView();
        if (currentView == null) {
            this.zzaao = -3L;
            this.zzaam = (byte) -1;
            return;
        }
        boolean z = true;
        byte b = currentView.getVisibility() != 0 ? (byte) 1 : (byte) 0;
        if (!currentView.isShown()) {
            b = (byte) (b | 2);
        }
        PowerManager powerManager = this.zzaag;
        if (powerManager != null && !powerManager.isScreenOn()) {
            b = (byte) (b | 4);
        }
        if (!this.zzyq.zzcb()) {
            KeyguardManager keyguardManager = this.zzaah;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                Activity zzd = zzfi.zzd(currentView);
                if (zzd != null) {
                    Window window = zzd.getWindow();
                    WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
                    boolean z2 = (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
                }
            }
            z = false;
        }
        if (!z) {
            b = (byte) (b | 8);
        }
        if (!currentView.getGlobalVisibleRect(new Rect())) {
            b = (byte) (b | 16);
        }
        if (!currentView.getLocalVisibleRect(new Rect())) {
            b = (byte) (b | 32);
        }
        int windowVisibility = currentView.getWindowVisibility();
        int i = this.zzaan;
        if (i != -1) {
            windowVisibility = i;
        }
        if (windowVisibility != 0) {
            b = (byte) (b | 64);
        }
        if (this.zzaam != b) {
            this.zzaam = b;
            this.zzaao = b == 0 ? SystemClock.elapsedRealtime() : (-3) - b;
        }
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzaaj = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzaai == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            zzfm zzfmVar = new zzfm(this);
            this.zzaai = zzfmVar;
            this.zzaaf.registerReceiver(zzfmVar, intentFilter);
        }
        Application application = this.zzyd;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzaal);
            } catch (Exception unused) {
            }
        }
    }

    private final void zzg(View view) {
        try {
            if (this.zzaaj != null) {
                ViewTreeObserver viewTreeObserver = this.zzaaj.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzaaj = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.zzaai;
        if (broadcastReceiver != null) {
            try {
                this.zzaaf.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.zzaai = null;
        }
        Application application = this.zzyd;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzaal);
            } catch (Exception unused4) {
            }
        }
    }
}
