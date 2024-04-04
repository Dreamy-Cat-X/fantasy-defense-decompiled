package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvv implements zzcqq<zzblb> {
    private final zzdqy zzfvf;
    private final zzblx zzgrw;
    private final zzdzk zzguq;
    private final Context zzgux;
    private final zzacd zzguy;

    public zzcvv(Context context, zzblx zzblxVar, zzdqy zzdqyVar, zzdzk zzdzkVar, zzacd zzacdVar) {
        this.zzgux = context;
        this.zzgrw = zzblxVar;
        this.zzfvf = zzdqyVar;
        this.zzguq = zzdzkVar;
        this.zzguy = zzacdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (this.zzguy == null || zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzblb> zzb(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        zzbla zza = this.zzgrw.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzcvw(this, new View(this.zzgux), null, zzcvu.zzguw, zzdmiVar.zzhhv.get(0)));
        final zzaca zzacaVar = new zzaca(zza.zzahr(), zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd);
        return this.zzfvf.zzt(zzdqz.CUSTOM_RENDER_SYN).zza(new zzdqi(this, zzacaVar) { // from class: com.google.android.gms.internal.ads.zzcvx
            private final zzcvv zzguz;
            private final zzaca zzgva;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguz = this;
                this.zzgva = zzacaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqi
            public final void run() {
                this.zzguz.zza(this.zzgva);
            }
        }, this.zzguq).zzv(zzdqz.CUSTOM_RENDER_ACK).zze(zzdyz.zzag(zza.zzahp())).zzaxm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaca zzacaVar) throws Exception {
        this.zzguy.zza(zzacaVar);
    }
}
