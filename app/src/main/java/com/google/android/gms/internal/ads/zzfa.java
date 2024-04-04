package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfa extends zzcu<Integer, Long> {
    public Long zzzf;
    public Long zzzg;

    public zzfa() {
    }

    public zzfa(String str) {
        zzam(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzam(String str) {
        HashMap zzan = zzan(str);
        if (zzan != null) {
            this.zzzf = (Long) zzan.get(0);
            this.zzzg = (Long) zzan.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Long> zzbn() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzzf);
        hashMap.put(1, this.zzzg);
        return hashMap;
    }
}
