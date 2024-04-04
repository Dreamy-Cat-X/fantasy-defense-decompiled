package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcdf implements zzbrj {
    private final zzcbi zzgao;
    private final zzcbm zzgbq;

    public zzcdf(zzcbi zzcbiVar, zzcbm zzcbmVar) {
        this.zzgao = zzcbiVar;
        this.zzgbq = zzcbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        if (this.zzgao.zzanz() == null) {
            return;
        }
        zzbdh zzany = this.zzgao.zzany();
        zzbdh zzanx = this.zzgao.zzanx();
        if (zzany == null) {
            zzany = zzanx != null ? zzanx : null;
        }
        if (!this.zzgbq.zzano() || zzany == null) {
            return;
        }
        zzany.zza("onSdkImpression", new ArrayMap());
    }
}
