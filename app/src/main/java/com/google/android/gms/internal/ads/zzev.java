package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzev extends zzcu<Integer, Object> {
    public Long zzyk;
    public Boolean zzyl;
    public Boolean zzym;

    public zzev() {
    }

    public zzev(String str) {
        zzam(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzam(String str) {
        HashMap zzan = zzan(str);
        if (zzan != null) {
            this.zzyk = (Long) zzan.get(0);
            this.zzyl = (Boolean) zzan.get(1);
            this.zzym = (Boolean) zzan.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Object> zzbn() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzyk);
        hashMap.put(1, this.zzyl);
        hashMap.put(2, this.zzym);
        return hashMap;
    }
}
