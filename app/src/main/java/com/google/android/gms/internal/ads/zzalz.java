package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzalz<I, O> implements zzalq<I, O> {
    private final zzako zzdjo;
    private final zzals<O> zzdjp;
    private final zzalr<I> zzdjq;
    private final String zzdjr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalz(zzako zzakoVar, String str, zzalr<I> zzalrVar, zzals<O> zzalsVar) {
        this.zzdjo = zzakoVar;
        this.zzdjr = str;
        this.zzdjq = zzalrVar;
        this.zzdjp = zzalsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final zzdzl<O> zzh(I i) {
        zzazc zzazcVar = new zzazc();
        zzalb zzb = this.zzdjo.zzb((zzef) null);
        zzb.zza(new zzamc(this, zzb, i, zzazcVar), new zzamb(this, zzazcVar, zzb));
        return zzazcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzalb zzalbVar, zzalm zzalmVar, I i, zzazc<O> zzazcVar) {
        try {
            com.google.android.gms.ads.internal.zzp.zzkq();
            String zzyw = com.google.android.gms.ads.internal.util.zzm.zzyw();
            zzahg.zzdgo.zza(zzyw, new zzame(this, zzalbVar, zzazcVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", zzyw);
            jSONObject.put("args", this.zzdjq.zzi(i));
            zzalmVar.zzb(this.zzdjr, jSONObject);
        } catch (Exception e) {
            try {
                zzazcVar.setException(e);
                com.google.android.gms.ads.internal.util.zzd.zzc("Unable to invokeJavascript", e);
            } finally {
                zzalbVar.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdzl<O> zzf(I i) throws Exception {
        return zzh(i);
    }
}
