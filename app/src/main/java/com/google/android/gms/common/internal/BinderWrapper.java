package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new zza();
    private IBinder zza;

    public BinderWrapper() {
        this.zza = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public BinderWrapper(IBinder iBinder) {
        this.zza = null;
        this.zza = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.zza = null;
        this.zza = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ BinderWrapper(Parcel parcel, zza zzaVar) {
        this(parcel);
    }
}
