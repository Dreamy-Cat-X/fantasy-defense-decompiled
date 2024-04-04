package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [AdT] */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpk<AdT> implements zzdza<zzdpb<AdT>> {
    private final /* synthetic */ zzdpj zzhni;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpk(zzdpj zzdpjVar) {
        this.zzhni = zzdpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzdpm zzdpmVar;
        zzdzt zzdztVar;
        synchronized (this.zzhni) {
            zzdpmVar = this.zzhni.zzhnf;
            zzdpmVar.zzb(th);
            zzdztVar = this.zzhni.zzhnc;
            zzdztVar.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(Object obj) {
        zzdpm zzdpmVar;
        int i;
        int i2;
        zzdzt zzdztVar;
        zzdpp zzdppVar;
        zzdor zzdorVar;
        zzdpp zzdppVar2;
        zzdpb<?> zzdpbVar = (zzdpb) obj;
        synchronized (this.zzhni) {
            zzdpmVar = this.zzhni.zzhnf;
            zzdpmVar.zza(zzdpbVar);
            i = this.zzhni.zzhne;
            if (i != zzdpo.zzhnl) {
                zzdorVar = this.zzhni.zzhft;
                zzdppVar2 = this.zzhni.zzhnb;
                zzdorVar.zza(zzdppVar2.zzaus(), zzdpbVar);
            }
            i2 = this.zzhni.zzhne;
            if (i2 == zzdpo.zzhnk) {
                zzdpj zzdpjVar = this.zzhni;
                zzdppVar = this.zzhni.zzhnb;
                zzdpjVar.zzd(zzdppVar);
            }
            this.zzhni.zzhne = zzdpo.zzhnk;
            zzdztVar = this.zzhni.zzhnc;
            zzdztVar.set(zzdpbVar);
        }
    }
}
