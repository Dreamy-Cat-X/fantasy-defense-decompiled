package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfv implements zzdza<zzbdh> {
    private final /* synthetic */ String zzghk;
    private final /* synthetic */ Map zzghl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfv(zzcfp zzcfpVar, String str, Map map) {
        this.zzghk = str;
        this.zzghl = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzbdh zzbdhVar) {
        zzbdhVar.zza(this.zzghk, this.zzghl);
    }
}
