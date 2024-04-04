package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdrv {
    public final String label;
    public final String value;

    public zzdrv(String str, String str2) {
        this.label = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdrv)) {
            return false;
        }
        zzdrv zzdrvVar = (zzdrv) obj;
        return this.label.equals(zzdrvVar.label) && this.value.equals(zzdrvVar.value);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.label);
        String valueOf2 = String.valueOf(this.value);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
