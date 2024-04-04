package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfh extends zzcu<Integer, Long> {
    public Long zzaaa;
    public Long zzaab;
    public Long zzzy;
    public Long zzzz;

    public zzfh() {
    }

    public zzfh(String str) {
        zzam(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzam(String str) {
        HashMap zzan = zzan(str);
        if (zzan != null) {
            this.zzzy = (Long) zzan.get(0);
            this.zzzz = (Long) zzan.get(1);
            this.zzaaa = (Long) zzan.get(2);
            this.zzaab = (Long) zzan.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Long> zzbn() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzzy);
        hashMap.put(1, this.zzzz);
        hashMap.put(2, this.zzaaa);
        hashMap.put(3, this.zzaab);
        return hashMap;
    }
}
