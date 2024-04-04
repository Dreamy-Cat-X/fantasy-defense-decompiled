package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzif {
    private static final zzif zzaiq = new zzif(new int[]{2}, 2);
    private final int[] zzair;
    private final int zzais;

    private zzif(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzair = copyOf;
        Arrays.sort(copyOf);
        this.zzais = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzif)) {
            return false;
        }
        zzif zzifVar = (zzif) obj;
        return Arrays.equals(this.zzair, zzifVar.zzair) && this.zzais == zzifVar.zzais;
    }

    public final int hashCode() {
        return this.zzais + (Arrays.hashCode(this.zzair) * 31);
    }

    public final String toString() {
        int i = this.zzais;
        String arrays = Arrays.toString(this.zzair);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
