package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmh extends zzblb {
    private final Executor zzfqs;
    private final zzagd zzftu;
    private final Runnable zzftv;

    public zzbmh(zzbmy zzbmyVar, zzagd zzagdVar, Runnable runnable, Executor executor) {
        super(zzbmyVar);
        this.zzftu = zzagdVar;
        this.zzftv = runnable;
        this.zzfqs = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzyu getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zza(ViewGroup viewGroup, zzvp zzvpVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzdmh zzajn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final View zzajo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzdmh zzajw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final int zzajx() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzke() {
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzajy() {
        final AtomicReference atomicReference = new AtomicReference(this.zzftv);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.zzbmg
            private final AtomicReference zzftt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftt = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.zzftt.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.zzfqs.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.zzbmj
            private final Runnable zzfou;
            private final zzbmh zzftw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftw = this;
                this.zzfou = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzftw.zze(this.zzfou);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Runnable runnable) {
        try {
            if (this.zzftu.zzm(ObjectWrapper.wrap(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
