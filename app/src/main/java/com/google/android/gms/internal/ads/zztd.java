package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.kt.olleh.inapp.net.InAppError;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztd> CREATOR = new zztg();
    public final String url;
    private final long zzbuy;
    private final String zzbuz;
    private final String zzbva;
    private final String zzbvb;
    private final Bundle zzbvc;
    public final boolean zzbvd;
    public long zzbve;
    public String zzbvf;
    public int zzbvg;

    public static zztd zzbs(String str) {
        return zzd(Uri.parse(str));
    }

    public static zztd zzd(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(ImagesContract.URL);
            boolean equals = InAppError.FAILED.equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zztd(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztd(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.url = str;
        this.zzbuy = j;
        this.zzbuz = str2 == null ? "" : str2;
        this.zzbva = str3 == null ? "" : str3;
        this.zzbvb = str4 == null ? "" : str4;
        this.zzbvc = bundle == null ? new Bundle() : bundle;
        this.zzbvd = z;
        this.zzbve = j2;
        this.zzbvf = str5;
        this.zzbvg = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.url, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzbuy);
        SafeParcelWriter.writeString(parcel, 4, this.zzbuz, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbva, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbvb, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzbvc, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbvd);
        SafeParcelWriter.writeLong(parcel, 9, this.zzbve);
        SafeParcelWriter.writeString(parcel, 10, this.zzbvf, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzbvg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
