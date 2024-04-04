package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zziv extends Exception {
    private final int zzamb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zziv(int i, int i2, int i3, int i4) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(82);
        sb.append("AudioTrack init failed: ");
        sb.append(i);
        sb.append(", Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(")");
        this.zzamb = i;
    }
}
