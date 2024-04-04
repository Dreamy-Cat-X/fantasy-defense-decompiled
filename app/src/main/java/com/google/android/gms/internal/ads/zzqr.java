package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqr implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long zzbqt = ((Long) zzwo.zzqq().zzd(zzabh.zzcpz)).longValue();
    private final Context zzaaf;
    private final PowerManager zzaag;
    private final KeyguardManager zzaah;
    private WeakReference<ViewTreeObserver> zzaaj;
    private final WindowManager zzbqu;
    private BroadcastReceiver zzbqv;
    private WeakReference<View> zzbqw;
    private zzqy zzbqx;
    private final Rect zzbrb;
    private final DisplayMetrics zzxh;
    private Application zzyd;
    private com.google.android.gms.ads.internal.util.zzbs zzbqy = new com.google.android.gms.ads.internal.util.zzbs(zzbqt);
    private boolean zzbqz = false;
    private int zzaan = -1;
    private final HashSet<zzqv> zzbra = new HashSet<>();

    public zzqr(Context context, View view) {
        this.zzaaf = context.getApplicationContext();
        this.zzbqu = (WindowManager) context.getSystemService("window");
        this.zzaag = (PowerManager) this.zzaaf.getSystemService("power");
        this.zzaah = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.zzaaf;
        if (context2 instanceof Application) {
            this.zzyd = (Application) context2;
            this.zzbqx = new zzqy((Application) this.zzaaf, this);
        }
        this.zzxh = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzbrb = rect;
        rect.right = this.zzbqu.getDefaultDisplay().getWidth();
        this.zzbrb.bottom = this.zzbqu.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzbqw;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzg(view2);
        }
        this.zzbqw = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.zzp.zzks().isAttachedToWindow(view)) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void zza(zzqv zzqvVar) {
        this.zzbra.add(zzqvVar);
        zzbr(3);
    }

    public final void zzb(zzqv zzqvVar) {
        this.zzbra.remove(zzqvVar);
    }

    private final void zzct() {
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzqu
            private final zzqr zzbrj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbrj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbrj.zzlt();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzaan = -1;
        zzf(view);
        zzbr(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzaan = -1;
        zzbr(3);
        zzct();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzbqw == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.zzbqw.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzaan = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzbr(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzbr(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzbr(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzbr(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzbr(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbr(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzbr(3);
        zzct();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzbr(2);
        zzct();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzbr(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135 A[LOOP:0: B:55:0x012f->B:57:0x0135, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzbr(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> emptyList;
        boolean z3;
        Iterator<zzqv> it;
        if (this.zzbra.size() == 0 || (weakReference = this.zzbqw) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z4 = i == 1;
        boolean z5 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Failure getting view location.", e);
            }
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqc)).booleanValue() && view != null) {
            emptyList = zzi(view);
        } else {
            emptyList = Collections.emptyList();
        }
        List<Rect> list = emptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i2 = this.zzaan;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        if (!z5) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            if (com.google.android.gms.ads.internal.util.zzm.zza(view, this.zzaag, this.zzaah) && z && z2 && windowVisibility == 0) {
                z3 = true;
                if (z4 || this.zzbqy.tryAcquire() || z3 != this.zzbqz) {
                    if (z3 && !this.zzbqz && i == 1) {
                        return;
                    }
                    zzqw zzqwVar = new zzqw(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime(), this.zzaag.isScreenOn(), view == null && com.google.android.gms.ads.internal.zzp.zzks().isAttachedToWindow(view), view == null ? view.getWindowVisibility() : 8, zza(this.zzbrb), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), this.zzxh.density, z3, list);
                    it = this.zzbra.iterator();
                    while (it.hasNext()) {
                        it.next().zza(zzqwVar);
                    }
                    this.zzbqz = z3;
                }
                return;
            }
        }
        z3 = false;
        if (z4) {
        }
        if (z3) {
        }
        zzqw zzqwVar2 = new zzqw(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime(), this.zzaag.isScreenOn(), view == null && com.google.android.gms.ads.internal.zzp.zzks().isAttachedToWindow(view), view == null ? view.getWindowVisibility() : 8, zza(this.zzbrb), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), this.zzxh.density, z3, list);
        it = this.zzbra.iterator();
        while (it.hasNext()) {
        }
        this.zzbqz = z3;
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzbs(rect.left), zzbs(rect.top), zzbs(rect.right), zzbs(rect.bottom));
    }

    private final int zzbs(int i) {
        return (int) (i / this.zzxh.density);
    }

    private final List<Rect> zzi(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(zza(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzaaj = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzbqv == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzbqv = new zzqt(this);
            com.google.android.gms.ads.internal.zzp.zzll().zza(this.zzaaf, this.zzbqv, intentFilter);
        }
        Application application = this.zzyd;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzbqx);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error registering activity lifecycle callbacks.", e);
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
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzbqv != null) {
            try {
                com.google.android.gms.ads.internal.zzp.zzll().zza(this.zzaaf, this.zzbqv);
            } catch (IllegalStateException e3) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzbqv = null;
        }
        Application application = this.zzyd;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzbqx);
            } catch (Exception e5) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void zzen(long j) {
        this.zzbqy.zzfb(j);
    }

    public final void zzls() {
        this.zzbqy.zzfb(zzbqt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzlt() {
        zzbr(3);
    }
}
