package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzayg;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbc extends com.google.android.gms.internal.ads.zzbh {
    private final /* synthetic */ byte[] zzeem;
    private final /* synthetic */ Map zzeen;
    private final /* synthetic */ zzayg zzeeo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzax zzaxVar, int i, String str, com.google.android.gms.internal.ads.zzal zzalVar, com.google.android.gms.internal.ads.zzai zzaiVar, byte[] bArr, Map map, zzayg zzaygVar) {
        super(i, str, zzalVar, zzaiVar);
        this.zzeem = bArr;
        this.zzeen = map;
        this.zzeeo = zzaygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaa
    public final byte[] zzg() throws com.google.android.gms.internal.ads.zzl {
        byte[] bArr = this.zzeem;
        return bArr == null ? super.zzg() : bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaa
    public final Map<String, String> getHeaders() throws com.google.android.gms.internal.ads.zzl {
        Map<String, String> map = this.zzeen;
        return map == null ? super.getHeaders() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh
    /* renamed from: zzi */
    public final void zza(String str) {
        this.zzeeo.zzes(str);
        super.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzaa
    public final /* synthetic */ void zza(String str) {
        zza(str);
    }
}
