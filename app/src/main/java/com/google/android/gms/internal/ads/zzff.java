package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzff extends zzcu<Integer, Long> {
    public Long zzzm;
    public Long zzzn;
    public Long zzzo;
    public Long zzzp;
    public Long zzzq;
    public Long zzzr;
    public Long zzzs;
    public Long zzzt;
    public Long zzzu;
    public Long zzzv;
    public Long zzzw;

    public zzff() {
    }

    public zzff(String str) {
        zzam(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzam(String str) {
        HashMap zzan = zzan(str);
        if (zzan != null) {
            this.zzzm = (Long) zzan.get(0);
            this.zzzn = (Long) zzan.get(1);
            this.zzzo = (Long) zzan.get(2);
            this.zzzp = (Long) zzan.get(3);
            this.zzzq = (Long) zzan.get(4);
            this.zzzr = (Long) zzan.get(5);
            this.zzzs = (Long) zzan.get(6);
            this.zzzt = (Long) zzan.get(7);
            this.zzzu = (Long) zzan.get(8);
            this.zzzv = (Long) zzan.get(9);
            this.zzzw = (Long) zzan.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    protected final HashMap<Integer, Long> zzbn() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzzm);
        hashMap.put(1, this.zzzn);
        hashMap.put(2, this.zzzo);
        hashMap.put(3, this.zzzp);
        hashMap.put(4, this.zzzq);
        hashMap.put(5, this.zzzr);
        hashMap.put(6, this.zzzs);
        hashMap.put(7, this.zzzt);
        hashMap.put(8, this.zzzu);
        hashMap.put(9, this.zzzv);
        hashMap.put(10, this.zzzw);
        return hashMap;
    }
}
