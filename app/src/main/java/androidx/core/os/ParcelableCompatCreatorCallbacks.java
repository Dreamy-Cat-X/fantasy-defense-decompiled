package androidx.core.os;

import android.os.Parcel;

@Deprecated
/* loaded from: D:\decomp\classes.dex */
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i);
}
