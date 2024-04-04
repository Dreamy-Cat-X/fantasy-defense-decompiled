package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfs implements zzdza<zzbdh> {
    private final /* synthetic */ String zzepw;
    private final /* synthetic */ zzahv zzghh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfs(zzcfp zzcfpVar, String str, zzahv zzahvVar) {
        this.zzepw = str;
        this.zzghh = zzahvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbdh zzbdhVar) {
        zzbdhVar.zzb(this.zzepw, this.zzghh);
    }
}
