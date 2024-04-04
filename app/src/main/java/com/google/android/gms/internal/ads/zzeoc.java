package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeoc extends IllegalArgumentException {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzeoc(int i, int i2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
    }
}
