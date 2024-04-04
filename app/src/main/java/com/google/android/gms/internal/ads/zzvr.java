package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzvr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvr> CREATOR = new zzvq();
    public final int type;
    public final int zzacz;
    public final String zzada;
    public final long zzadb;

    public zzvr(int i, int i2, String str, long j) {
        this.type = i;
        this.zzacz = i2;
        this.zzada = str;
        this.zzadb = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.type);
        SafeParcelWriter.writeInt(parcel, 2, this.zzacz);
        SafeParcelWriter.writeString(parcel, 3, this.zzada, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzadb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzvr zza(JSONObject jSONObject) throws JSONException {
        return new zzvr(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }
}
