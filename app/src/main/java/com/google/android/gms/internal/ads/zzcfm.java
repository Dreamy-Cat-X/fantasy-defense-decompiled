package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfm implements zzahv<Object> {
    private final zzepk<zzcfj> zzgbv;
    private final zzcfp zzgel;
    private final zzafp zzghb;

    public zzcfm(zzcbt zzcbtVar, zzcbi zzcbiVar, zzcfp zzcfpVar, zzepk<zzcfj> zzepkVar) {
        this.zzghb = zzcbtVar.zzgb(zzcbiVar.getCustomTemplateId());
        this.zzgel = zzcfpVar;
        this.zzgbv = zzepkVar;
    }

    public final void zzapl() {
        if (this.zzghb == null) {
            return;
        }
        this.zzgel.zza("/nativeAdCustomClick", this);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zzghb.zza(this.zzgbv.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            com.google.android.gms.ads.internal.util.zzd.zzd(sb.toString(), e);
        }
    }
}
