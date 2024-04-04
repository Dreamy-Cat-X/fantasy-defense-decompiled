package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzduo extends Exception {
    private final int zzhtc;

    public zzduo(int i, String str) {
        super(str);
        this.zzhtc = i;
    }

    public zzduo(int i, Throwable th) {
        super(th);
        this.zzhtc = i;
    }

    public final int zzayx() {
        return this.zzhtc;
    }
}
