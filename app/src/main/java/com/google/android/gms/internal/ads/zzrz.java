package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzrz {
    final long value;
    final int zzbts;
    final String zzbtz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrz(long j, String str, int i) {
        this.value = j;
        this.zzbtz = str;
        this.zzbts = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzrz)) {
            zzrz zzrzVar = (zzrz) obj;
            if (zzrzVar.value == this.value && zzrzVar.zzbts == this.zzbts) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
