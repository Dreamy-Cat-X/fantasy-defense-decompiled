package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzclg extends zzaja {
    private final /* synthetic */ zzckx zzglo;
    private final /* synthetic */ Object zzglp;
    private final /* synthetic */ String zzglq;
    private final /* synthetic */ long zzglr;
    private final /* synthetic */ zzazc zzgls;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclg(zzckx zzckxVar, Object obj, String str, long j, zzazc zzazcVar) {
        this.zzglo = zzckxVar;
        this.zzglp = obj;
        this.zzglq = str;
        this.zzglr = j;
        this.zzgls = zzazcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaix
    public final void onInitializationSucceeded() {
        zzckh zzckhVar;
        zzbwl zzbwlVar;
        synchronized (this.zzglp) {
            this.zzglo.zza(this.zzglq, true, "", (int) (com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzglr));
            zzckhVar = this.zzglo.zzglf;
            zzckhVar.zzgg(this.zzglq);
            zzbwlVar = this.zzglo.zzglh;
            zzbwlVar.zzfu(this.zzglq);
            this.zzgls.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaix
    public final void onInitializationFailed(String str) {
        zzckh zzckhVar;
        zzbwl zzbwlVar;
        synchronized (this.zzglp) {
            this.zzglo.zza(this.zzglq, false, str, (int) (com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - this.zzglr));
            zzckhVar = this.zzglo.zzglf;
            zzckhVar.zzs(this.zzglq, "error");
            zzbwlVar = this.zzglo.zzglh;
            zzbwlVar.zzm(this.zzglq, "error");
            this.zzgls.set(false);
        }
    }
}
