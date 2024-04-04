package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzemt implements zzemb {
    private final int flags;
    private final String info;
    private final Object[] zzirc;
    private final zzemd zzirf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemt(zzemd zzemdVar, String str, Object[] objArr) {
        this.zzirf = zzemdVar;
        this.info = str;
        this.zzirc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.flags = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzbkj() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzbkk() {
        return this.zzirc;
    }

    @Override // com.google.android.gms.internal.ads.zzemb
    public final zzemd zzbkd() {
        return this.zzirf;
    }

    @Override // com.google.android.gms.internal.ads.zzemb
    public final int zzbkb() {
        return (this.flags & 1) == 1 ? zzemo.zziru : zzemo.zzirv;
    }

    @Override // com.google.android.gms.internal.ads.zzemb
    public final boolean zzbkc() {
        return (this.flags & 2) == 2;
    }
}
