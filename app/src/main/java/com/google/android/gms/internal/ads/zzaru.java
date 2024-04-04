package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzaru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaru> CREATOR = new zzarx();
    public final View zzaaq;
    public final Map<String, WeakReference<View>> zzdrt;

    public zzaru(IBinder iBinder, IBinder iBinder2) {
        this.zzaaq = (View) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzdrt = (Map) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, ObjectWrapper.wrap(this.zzaaq).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, ObjectWrapper.wrap(this.zzdrt).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
