package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbjo implements zzqv {
    private final Clock zzbpw;
    private zzbdh zzdhu;
    private final zzbjd zzfqp;
    private final Executor zzfqs;
    private boolean zzbvu = false;
    private boolean zzfrm = false;
    private zzbjh zzfqu = new zzbjh();

    public zzbjo(Executor executor, zzbjd zzbjdVar, Clock clock) {
        this.zzfqs = executor;
        this.zzfqp = zzbjdVar;
        this.zzbpw = clock;
    }

    private final void zzaiy() {
        try {
            final JSONObject zzi = this.zzfqp.zzi(this.zzfqu);
            if (this.zzdhu != null) {
                this.zzfqs.execute(new Runnable(this, zzi) { // from class: com.google.android.gms.internal.ads.zzbjr
                    private final JSONObject zzfqn;
                    private final zzbjo zzfrn;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfrn = this;
                        this.zzfqn = zzi;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzfrn.zzi(this.zzfqn);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zzd.zza("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza(zzqw zzqwVar) {
        this.zzfqu.zzbqz = this.zzfrm ? false : zzqwVar.zzbqz;
        this.zzfqu.timestamp = this.zzbpw.elapsedRealtime();
        this.zzfqu.zzfre = zzqwVar;
        if (this.zzbvu) {
            zzaiy();
        }
    }

    public final void zzd(zzbdh zzbdhVar) {
        this.zzdhu = zzbdhVar;
    }

    public final void disable() {
        this.zzbvu = false;
    }

    public final void enable() {
        this.zzbvu = true;
        zzaiy();
    }

    public final void zzbe(boolean z) {
        this.zzfrm = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(JSONObject jSONObject) {
        this.zzdhu.zzb("AFMA_updateActiveView", jSONObject);
    }
}
