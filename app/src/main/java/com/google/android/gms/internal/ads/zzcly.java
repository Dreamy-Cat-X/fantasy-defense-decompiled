package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcly implements zzepq<PackageInfo> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<ApplicationInfo> zzgmi;

    private zzcly(zzeqd<Context> zzeqdVar, zzeqd<ApplicationInfo> zzeqdVar2) {
        this.zzeuo = zzeqdVar;
        this.zzgmi = zzeqdVar2;
    }

    public static zzcly zzak(zzeqd<Context> zzeqdVar, zzeqd<ApplicationInfo> zzeqdVar2) {
        return new zzcly(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzclo.zza(this.zzeuo.get(), this.zzgmi.get());
    }
}
