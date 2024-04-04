package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzej extends zzcu<Integer, Long> {
    public long zzya;
    public long zzyb;

    public zzej() {
        this.zzya = -1L;
        this.zzyb = -1L;
    }

    public zzej(String str) {
        this();
        zzam(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Long> zzbn() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zzya));
        hashMap.put(1, Long.valueOf(this.zzyb));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzam(String str) {
        HashMap zzan = zzan(str);
        if (zzan != null) {
            this.zzya = ((Long) zzan.get(0)).longValue();
            this.zzyb = ((Long) zzan.get(1)).longValue();
        }
    }
}
