package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzapn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzapn> CREATOR = new zzapq();
    private final int major;
    private final int minor;
    private final int zzdnn;

    public static zzapn zza(VersionInfo versionInfo) {
        return new zzapn(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapn(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.zzdnn = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.major);
        SafeParcelWriter.writeInt(parcel, 2, this.minor);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdnn);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String toString() {
        int i = this.major;
        int i2 = this.minor;
        int i3 = this.zzdnn;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzapn)) {
            zzapn zzapnVar = (zzapn) obj;
            if (zzapnVar.zzdnn == this.zzdnn && zzapnVar.minor == this.minor && zzapnVar.major == this.major) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.major, this.minor, this.zzdnn});
    }
}
