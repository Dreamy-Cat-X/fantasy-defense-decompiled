package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwa<AdT> implements zzcqq<AdT> {
    private final zzdqy zzfvf;
    private final zzdzk zzguq;
    private final zzacd zzguy;
    private final zzcwf<AdT> zzgvc;

    public zzcwa(zzdqy zzdqyVar, zzdzk zzdzkVar, zzacd zzacdVar, zzcwf<AdT> zzcwfVar) {
        this.zzfvf = zzdqyVar;
        this.zzguq = zzdzkVar;
        this.zzguy = zzacdVar;
        this.zzgvc = zzcwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (this.zzguy == null || zzdmiVar.zzhht == null || zzdmiVar.zzhht.zzdrd == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<AdT> zzb(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        zzazc zzazcVar = new zzazc();
        zzcwi zzcwiVar = new zzcwi();
        zzcwiVar.zza(new zzcwc(this, zzazcVar, zzdmtVar, zzdmiVar, zzcwiVar));
        final zzaca zzacaVar = new zzaca(zzcwiVar, zzdmiVar.zzhht.zzdrb, zzdmiVar.zzhht.zzdrd);
        return this.zzfvf.zzt(zzdqz.CUSTOM_RENDER_SYN).zza(new zzdqi(this, zzacaVar) { // from class: com.google.android.gms.internal.ads.zzcwd
            private final zzaca zzgva;
            private final zzcwa zzgvi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgvi = this;
                this.zzgva = zzacaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqi
            public final void run() {
                this.zzgvi.zzb(this.zzgva);
            }
        }, this.zzguq).zzv(zzdqz.CUSTOM_RENDER_ACK).zze(zzazcVar).zzaxm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzaca zzacaVar) throws Exception {
        this.zzguy.zza(zzacaVar);
    }
}
