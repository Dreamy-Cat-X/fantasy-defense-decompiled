package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzkz {
    public int index;
    public final int length;
    public int zzawr;
    public long zzaws;
    private final boolean zzawt;
    private final zzpm zzawu;
    private final zzpm zzawv;
    private int zzaww;
    private int zzawx;

    public zzkz(zzpm zzpmVar, zzpm zzpmVar2, boolean z) {
        this.zzawv = zzpmVar;
        this.zzawu = zzpmVar2;
        this.zzawt = z;
        zzpmVar2.zzbi(12);
        this.length = zzpmVar2.zzja();
        zzpmVar.zzbi(12);
        this.zzawx = zzpmVar.zzja();
        zzpf.checkState(zzpmVar.readInt() == 1, "first_chunk must be 1");
        this.index = -1;
    }

    public final boolean zzha() {
        int i = this.index + 1;
        this.index = i;
        if (i == this.length) {
            return false;
        }
        this.zzaws = this.zzawt ? this.zzawu.zzjb() : this.zzawu.zzix();
        if (this.index == this.zzaww) {
            this.zzawr = this.zzawv.zzja();
            this.zzawv.zzbj(4);
            int i2 = this.zzawx - 1;
            this.zzawx = i2;
            this.zzaww = i2 > 0 ? this.zzawv.zzja() - 1 : -1;
        }
        return true;
    }
}
