package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzazb implements zzdza<Object> {
    private final /* synthetic */ String zzegr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazb(String str) {
        this.zzegr = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        com.google.android.gms.ads.internal.zzp.zzku().zza(th, this.zzegr);
    }
}
