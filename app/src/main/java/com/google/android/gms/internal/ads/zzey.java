package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzey implements zzduq {
    private final zzfk zzwn;
    private final zzdsr zzyo;
    private final zzdtd zzyp;
    private final zzex zzyq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(zzdsr zzdsrVar, zzdtd zzdtdVar, zzfk zzfkVar, zzex zzexVar) {
        this.zzyo = zzdsrVar;
        this.zzyp = zzdtdVar;
        this.zzwn = zzfkVar;
        this.zzyq = zzexVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(View view) {
        this.zzwn.zze(view);
    }

    private final Map<String, Object> zzcc() {
        HashMap hashMap = new HashMap();
        zzcf.zza zzco = this.zzyp.zzco();
        hashMap.put("v", this.zzyo.zzaxs());
        hashMap.put("gms", Boolean.valueOf(this.zzyo.zzcm()));
        hashMap.put("int", zzco.zzaf());
        hashMap.put("up", Boolean.valueOf(this.zzyq.zzcb()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzduq
    public final Map<String, Object> zzcd() {
        Map<String, Object> zzcc = zzcc();
        zzcf.zza zzaxz = this.zzyp.zzaxz();
        zzcc.put("gai", Boolean.valueOf(this.zzyo.zzaxt()));
        zzcc.put("did", zzaxz.zzal());
        zzcc.put("dst", Integer.valueOf(zzaxz.zzam().zzv()));
        zzcc.put("doo", Boolean.valueOf(zzaxz.zzan()));
        return zzcc;
    }

    @Override // com.google.android.gms.internal.ads.zzduq
    public final Map<String, Object> zzce() {
        return zzcc();
    }

    @Override // com.google.android.gms.internal.ads.zzduq
    public final Map<String, Object> zzcf() {
        Map<String, Object> zzcc = zzcc();
        zzcc.put("lts", Long.valueOf(this.zzwn.zzcu()));
        return zzcc;
    }
}
