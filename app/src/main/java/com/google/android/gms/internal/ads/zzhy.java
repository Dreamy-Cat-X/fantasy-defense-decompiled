package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzhy {
    public static final zzhy zzahx = new zzhy(1.0f, 1.0f);
    public final float zzahy;
    public final float zzahz;
    private final int zzaia;

    public zzhy(float f, float f2) {
        this.zzahy = f;
        this.zzahz = f2;
        this.zzaia = Math.round(f * 1000.0f);
    }

    public final long zzdu(long j) {
        return j * this.zzaia;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zzahy == zzhyVar.zzahy && this.zzahz == zzhyVar.zzahz) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzahy) + 527) * 31) + Float.floatToRawIntBits(this.zzahz);
    }
}
