package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcy extends zzcu<Integer, Object> {
    public String zznp;
    public long zznq;
    public String zznr;
    public String zzns;
    public String zznt;

    public zzcy(String str) {
        this();
        zzam(str);
    }

    public zzcy() {
        this.zznp = "E";
        this.zznq = -1L;
        this.zznr = "E";
        this.zzns = "E";
        this.zznt = "E";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzam(String str) {
        HashMap zzan = zzan(str);
        if (zzan != null) {
            this.zznp = zzan.get(0) == null ? "E" : (String) zzan.get(0);
            this.zznq = zzan.get(1) == null ? -1L : ((Long) zzan.get(1)).longValue();
            this.zznr = zzan.get(2) == null ? "E" : (String) zzan.get(2);
            this.zzns = zzan.get(3) == null ? "E" : (String) zzan.get(3);
            this.zznt = zzan.get(4) != null ? (String) zzan.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Object> zzbn() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zznp);
        hashMap.put(4, this.zznt);
        hashMap.put(3, this.zzns);
        hashMap.put(2, this.zznr);
        hashMap.put(1, Long.valueOf(this.zznq));
        return hashMap;
    }
}
