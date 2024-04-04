package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzjh {
    private int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean zzgh() {
        return zzab(Integer.MIN_VALUE);
    }

    public final boolean zzgi() {
        return zzab(4);
    }

    public final boolean zzgj() {
        return zzab(1);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void zzaa(int i) {
        this.flags |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzab(int i) {
        return (this.flags & i) == i;
    }
}
