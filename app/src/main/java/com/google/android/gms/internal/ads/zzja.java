package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzja extends Exception {
    private final int errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzja(int i) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(36);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        this.errorCode = i;
    }
}
