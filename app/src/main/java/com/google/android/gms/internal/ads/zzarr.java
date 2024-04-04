package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzarr extends zzaxa {
    private final /* synthetic */ QueryInfoGenerationCallback zzdrv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarr(zzaro zzaroVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zzdrv = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zzj(String str, String str2) {
        QueryInfo queryInfo = new QueryInfo(new zzzp(str, null));
        zzwo.zzqu().put(queryInfo, str2);
        this.zzdrv.onSuccess(queryInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void onError(String str) {
        this.zzdrv.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaxb
    public final void zza(String str, String str2, Bundle bundle) {
        QueryInfo queryInfo = new QueryInfo(new zzzp(str, bundle));
        zzwo.zzqu().put(queryInfo, str2);
        this.zzdrv.onSuccess(queryInfo);
    }
}
