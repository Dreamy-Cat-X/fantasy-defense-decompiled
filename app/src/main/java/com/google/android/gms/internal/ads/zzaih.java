package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaih extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaih> CREATOR = new zzaik();
    private final String url;
    private final String[] zzdhe;
    private final String[] zzdhf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaih(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzdhe = strArr;
        this.zzdhf = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzdhe, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzdhf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzaih zzh(zzaa<?> zzaaVar) throws zzl {
        Map<String, String> headers = zzaaVar.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new zzaih(zzaaVar.getUrl(), strArr, strArr2);
    }
}
