package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.kt.olleh.inapp.net.InAppError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzayt> CREATOR = new zzays();
    public String zzbrf;
    public int zzege;
    public int zzegf;
    public boolean zzegg;
    public boolean zzegh;

    public zzayt(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzayt(int i, int i2, boolean z, boolean z2) {
        this((int) ModuleDescriptor.MODULE_VERSION, i2, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzayt(int i, int i2, boolean z, boolean z2, boolean z3) {
        this(r0.toString(), i, i2, z, false);
        String str = z ? InAppError.SUCCESS : InAppError.FAILED;
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayt(String str, int i, int i2, boolean z, boolean z2) {
        this.zzbrf = str;
        this.zzege = i;
        this.zzegf = i2;
        this.zzegg = z;
        this.zzegh = z2;
    }

    public static zzayt zzzz() {
        return new zzayt(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbrf, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzege);
        SafeParcelWriter.writeInt(parcel, 4, this.zzegf);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzegg);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzegh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
