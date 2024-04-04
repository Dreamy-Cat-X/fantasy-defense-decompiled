package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzcf;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdub extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdub> CREATOR = new zzdua();
    private final int versionCode;
    private zzcf.zza zzhsl = null;
    private byte[] zzhsm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdub(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzhsm = bArr;
        zzaym();
    }

    public final zzcf.zza zzayl() {
        if (!(this.zzhsl != null)) {
            try {
                this.zzhsl = zzcf.zza.zza(this.zzhsm, zzekd.zzbia());
                this.zzhsm = null;
            } catch (zzeld e) {
                throw new IllegalStateException(e);
            }
        }
        zzaym();
        return this.zzhsl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        byte[] bArr = this.zzhsm;
        if (bArr == null) {
            bArr = this.zzhsl.toByteArray();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void zzaym() {
        if (this.zzhsl != null || this.zzhsm == null) {
            if (this.zzhsl == null || this.zzhsm != null) {
                if (this.zzhsl != null && this.zzhsm != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (this.zzhsl == null && this.zzhsm == null) {
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Impossible");
            }
        }
    }
}
