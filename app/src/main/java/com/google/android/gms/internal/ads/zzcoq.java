package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcoq implements zzbwq {
    private final zzdro zzdgv;
    private final String zzgkt;
    private boolean zzgkr = false;
    private boolean zzgks = false;
    private final com.google.android.gms.ads.internal.util.zzf zzdza = com.google.android.gms.ads.internal.zzp.zzku().zzxq();

    public zzcoq(String str, zzdro zzdroVar) {
        this.zzgkt = str;
        this.zzdgv = zzdroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzft(String str) {
        this.zzdgv.zzb(zzgl("adapter_init_started").zzu("ancn", str));
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzfu(String str) {
        this.zzdgv.zzb(zzgl("adapter_init_finished").zzu("ancn", str));
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzm(String str, String str2) {
        this.zzdgv.zzb(zzgl("adapter_init_finished").zzu("ancn", str).zzu("rqe", str2));
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void zzamk() {
        if (!this.zzgkr) {
            this.zzdgv.zzb(zzgl("init_started"));
            this.zzgkr = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final synchronized void zzaml() {
        if (!this.zzgks) {
            this.zzdgv.zzb(zzgl("init_finished"));
            this.zzgks = true;
        }
    }

    private final zzdrp zzgl(String str) {
        return zzdrp.zzgz(str).zzu("tms", Long.toString(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime(), 10)).zzu("tid", this.zzdza.zzys() ? "" : this.zzgkt);
    }
}
