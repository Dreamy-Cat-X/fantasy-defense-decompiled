package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaun extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaun> CREATOR = new zzaum();
    public final String type;
    public final int zzdxh;

    public zzaun(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzaun(String str, int i) {
        this.type = str;
        this.zzdxh = i;
    }

    public static zzaun zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzaun(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.type, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdxh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaun)) {
            zzaun zzaunVar = (zzaun) obj;
            if (Objects.equal(this.type, zzaunVar.type) && Objects.equal(Integer.valueOf(this.zzdxh), Integer.valueOf(zzaunVar.zzdxh))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.type, Integer.valueOf(this.zzdxh));
    }
}
