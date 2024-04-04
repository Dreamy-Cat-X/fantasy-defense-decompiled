package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztc> CREATOR = new zztb();
    private ParcelFileDescriptor zzbut;
    private final boolean zzbuu;
    private final boolean zzbuv;
    private final long zzbuw;
    private final boolean zzbux;

    public zztc() {
        this(null, false, false, 0L, false);
    }

    public zztc(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.zzbut = parcelFileDescriptor;
        this.zzbuu = z;
        this.zzbuv = z2;
        this.zzbuw = j;
        this.zzbux = z3;
    }

    public final synchronized boolean zzmv() {
        return this.zzbut != null;
    }

    public final synchronized InputStream zzmw() {
        if (this.zzbut == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zzbut);
        this.zzbut = null;
        return autoCloseInputStream;
    }

    private final synchronized ParcelFileDescriptor zzmx() {
        return this.zzbut;
    }

    public final synchronized boolean zzmy() {
        return this.zzbuu;
    }

    public final synchronized boolean zzmz() {
        return this.zzbuv;
    }

    public final synchronized long zzna() {
        return this.zzbuw;
    }

    public final synchronized boolean zznb() {
        return this.zzbux;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmx(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, zzmy());
        SafeParcelWriter.writeBoolean(parcel, 4, zzmz());
        SafeParcelWriter.writeLong(parcel, 5, zzna());
        SafeParcelWriter.writeBoolean(parcel, 6, zznb());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
