package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzazc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbd extends com.google.android.gms.internal.ads.zzaa<com.google.android.gms.internal.ads.zzy> {
    private final Map<String, String> zzal;
    private final zzazc<com.google.android.gms.internal.ads.zzy> zzeep;
    private final zzayg zzeeq;

    public zzbd(String str, zzazc<com.google.android.gms.internal.ads.zzy> zzazcVar) {
        this(str, null, zzazcVar);
    }

    private zzbd(String str, Map<String, String> map, zzazc<com.google.android.gms.internal.ads.zzy> zzazcVar) {
        super(0, str, new zzbg(zzazcVar));
        this.zzal = null;
        this.zzeep = zzazcVar;
        zzayg zzaygVar = new zzayg();
        this.zzeeq = zzaygVar;
        zzaygVar.zza(str, "GET", null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzaa
    public final com.google.android.gms.internal.ads.zzaj<com.google.android.gms.internal.ads.zzy> zza(com.google.android.gms.internal.ads.zzy zzyVar) {
        return com.google.android.gms.internal.ads.zzaj.zza(zzyVar, com.google.android.gms.internal.ads.zzbc.zzb(zzyVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaa
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzy zzyVar) {
        com.google.android.gms.internal.ads.zzy zzyVar2 = zzyVar;
        this.zzeeq.zza(zzyVar2.zzal, zzyVar2.statusCode);
        zzayg zzaygVar = this.zzeeq;
        byte[] bArr = zzyVar2.data;
        if (zzayg.isEnabled() && bArr != null) {
            zzaygVar.zzi(bArr);
        }
        this.zzeep.set(zzyVar2);
    }
}
