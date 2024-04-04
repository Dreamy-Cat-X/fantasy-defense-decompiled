package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamk<I, O> implements zzdyj<I, O> {
    private final zzals<O> zzdjp;
    private final zzalr<I> zzdjq;
    private final String zzdjr;
    private final zzdzl<zzalm> zzdjv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamk(zzdzl<zzalm> zzdzlVar, String str, zzalr<I> zzalrVar, zzals<O> zzalsVar) {
        this.zzdjv = zzdzlVar;
        this.zzdjr = str;
        this.zzdjq = zzalrVar;
        this.zzdjp = zzalsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdzl<O> zzf(final I i) throws Exception {
        return zzdyz.zzb(this.zzdjv, new zzdyj(this, i) { // from class: com.google.android.gms.internal.ads.zzamj
            private final zzamk zzdka;
            private final Object zzdkb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdka = this;
                this.zzdkb = i;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzdka.zza(this.zzdkb, (zzalm) obj);
            }
        }, zzayv.zzegn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(Object obj, zzalm zzalmVar) throws Exception {
        zzazc zzazcVar = new zzazc();
        com.google.android.gms.ads.internal.zzp.zzkq();
        String zzyw = com.google.android.gms.ads.internal.util.zzm.zzyw();
        zzahg.zzdgo.zza(zzyw, new zzamm(this, zzazcVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", zzyw);
        jSONObject.put("args", this.zzdjq.zzi(obj));
        zzalmVar.zzb(this.zzdjr, jSONObject);
        return zzazcVar;
    }
}
