package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzih extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzih(int i, int i2, int i3) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(78);
        sb.append("Unhandled format: ");
        sb.append(i);
        sb.append(" Hz, ");
        sb.append(i2);
        sb.append(" channels in encoding ");
        sb.append(i3);
    }
}
