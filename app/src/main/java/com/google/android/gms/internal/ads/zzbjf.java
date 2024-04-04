package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjf implements com.google.android.gms.ads.internal.overlay.zzp, zzbrj, zzbrm, zzqv {
    private final Clock zzbpw;
    private final zzbiw zzfqo;
    private final zzbjd zzfqp;
    private final zzamk<JSONObject, JSONObject> zzfqr;
    private final Executor zzfqs;
    private final Set<zzbdh> zzfqq = new HashSet();
    private final AtomicBoolean zzfqt = new AtomicBoolean(false);
    private final zzbjh zzfqu = new zzbjh();
    private boolean zzfqv = false;
    private WeakReference<?> zzfqw = new WeakReference<>(this);

    public zzbjf(zzamd zzamdVar, zzbjd zzbjdVar, Executor executor, zzbiw zzbiwVar, Clock clock) {
        this.zzfqo = zzbiwVar;
        this.zzfqr = zzamdVar.zzb("google.afma.activeView.handleUpdate", zzalt.zzdjj, zzalt.zzdjj);
        this.zzfqp = zzbjdVar;
        this.zzfqs = executor;
        this.zzbpw = clock;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
    }

    public final synchronized void zzaiv() {
        if (!(this.zzfqw.get() != null)) {
            zzaix();
            return;
        }
        if (!this.zzfqv && this.zzfqt.get()) {
            try {
                this.zzfqu.timestamp = this.zzbpw.elapsedRealtime();
                final JSONObject zzi = this.zzfqp.zzi(this.zzfqu);
                for (final zzbdh zzbdhVar : this.zzfqq) {
                    this.zzfqs.execute(new Runnable(zzbdhVar, zzi) { // from class: com.google.android.gms.internal.ads.zzbje
                        private final zzbdh zzesn;
                        private final JSONObject zzfqn;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzesn = zzbdhVar;
                            this.zzfqn = zzi;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzesn.zzb("AFMA_updateActiveView", this.zzfqn);
                        }
                    });
                }
                zzayy.zzb(this.zzfqr.zzf(zzi), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zza("Failed to call ActiveViewJS", e);
            }
        }
    }

    private final void zzaiw() {
        Iterator<zzbdh> it = this.zzfqq.iterator();
        while (it.hasNext()) {
            this.zzfqo.zzb(it.next());
        }
        this.zzfqo.zzaiu();
    }

    public final synchronized void zzaix() {
        zzaiw();
        this.zzfqv = true;
    }

    public final synchronized void zzc(zzbdh zzbdhVar) {
        this.zzfqq.add(zzbdhVar);
        this.zzfqo.zza(zzbdhVar);
    }

    public final void zzn(Object obj) {
        this.zzfqw = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final synchronized void zza(zzqw zzqwVar) {
        this.zzfqu.zzbqz = zzqwVar.zzbqz;
        this.zzfqu.zzfre = zzqwVar;
        zzaiv();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final synchronized void zzcc(Context context) {
        this.zzfqu.zzfrb = true;
        zzaiv();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final synchronized void zzcd(Context context) {
        this.zzfqu.zzfrb = false;
        zzaiv();
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final synchronized void zzce(Context context) {
        this.zzfqu.zzfrd = "u";
        zzaiv();
        zzaiw();
        this.zzfqv = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onPause() {
        this.zzfqu.zzfrb = true;
        zzaiv();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void onResume() {
        this.zzfqu.zzfrb = false;
        zzaiv();
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final synchronized void onAdImpression() {
        if (this.zzfqt.compareAndSet(false, true)) {
            this.zzfqo.zza(this);
            zzaiv();
        }
    }
}
