package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzavy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavy> CREATOR = new zzawb();
    public final String zzdyq;
    public final String zzdyr;
    public final boolean zzdys;
    public final boolean zzdyt;
    public final List<String> zzdyu;
    public final boolean zzdyv;
    public final boolean zzdyw;
    private final List<String> zzdyx;

    public zzavy(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.zzdyq = str;
        this.zzdyr = str2;
        this.zzdys = z;
        this.zzdyt = z2;
        this.zzdyu = list;
        this.zzdyv = z3;
        this.zzdyw = z4;
        this.zzdyx = list2 == null ? new ArrayList<>() : list2;
    }

    public static zzavy zzg(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new zzavy(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbk.zza(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbk.zza(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdyq, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdyr, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdys);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdyt);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzdyu, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzdyv);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdyw);
        SafeParcelWriter.writeStringList(parcel, 9, this.zzdyx, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
