package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzhs implements Parcelable {
    public static final Parcelable.Creator<zzhs> CREATOR = new zzhr();
    public final int height;
    private final String id;
    public final int width;
    public final int zzagx;
    public final String zzagy;
    private final zzmg zzagz;
    public final String zzaha;
    public final String zzahb;
    public final int zzahc;
    public final List<byte[]> zzahd;
    public final zzjn zzahe;
    public final float zzahf;
    public final int zzahg;
    public final float zzahh;
    private final int zzahi;
    private final byte[] zzahj;
    private final zzpx zzahk;
    public final int zzahl;
    public final int zzahm;
    public final int zzahn;
    private final int zzaho;
    private final int zzahp;
    public final long zzahq;
    public final int zzahr;
    public final String zzahs;
    private final int zzaht;
    private int zzahu;

    public static zzhs zza(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzpx zzpxVar, zzjn zzjnVar) {
        return new zzhs(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzpxVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzjnVar, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static zzhs zza(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzjn zzjnVar, int i5, String str4) {
        return zza(str, str2, null, -1, -1, i3, i4, -1, null, zzjnVar, 0, str4);
    }

    public static zzhs zza(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzjn zzjnVar, int i6, String str4) {
        return new zzhs(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzjnVar, null);
    }

    public static zzhs zza(String str, String str2, String str3, int i, int i2, String str4, zzjn zzjnVar) {
        return zza(str, str2, null, -1, i2, str4, -1, zzjnVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzhs zza(String str, String str2, String str3, int i, int i2, String str4, int i3, zzjn zzjnVar, long j, List<byte[]> list) {
        return new zzhs(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzjnVar, null);
    }

    public static zzhs zza(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzjn zzjnVar) {
        return new zzhs(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzjnVar, null);
    }

    public static zzhs zza(String str, String str2, long j) {
        return new zzhs(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static zzhs zza(String str, String str2, String str3, int i, zzjn zzjnVar) {
        return new zzhs(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzjnVar, null);
    }

    private zzhs(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzpx zzpxVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzjn zzjnVar, zzmg zzmgVar) {
        this.id = str;
        this.zzaha = str2;
        this.zzahb = str3;
        this.zzagy = str4;
        this.zzagx = i;
        this.zzahc = i2;
        this.width = i3;
        this.height = i4;
        this.zzahf = f;
        this.zzahg = i5;
        this.zzahh = f2;
        this.zzahj = bArr;
        this.zzahi = i6;
        this.zzahk = zzpxVar;
        this.zzahl = i7;
        this.zzahm = i8;
        this.zzahn = i9;
        this.zzaho = i10;
        this.zzahp = i11;
        this.zzahr = i12;
        this.zzahs = str5;
        this.zzaht = i13;
        this.zzahq = j;
        this.zzahd = list == null ? Collections.emptyList() : list;
        this.zzahe = zzjnVar;
        this.zzagz = zzmgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhs(Parcel parcel) {
        this.id = parcel.readString();
        this.zzaha = parcel.readString();
        this.zzahb = parcel.readString();
        this.zzagy = parcel.readString();
        this.zzagx = parcel.readInt();
        this.zzahc = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.zzahf = parcel.readFloat();
        this.zzahg = parcel.readInt();
        this.zzahh = parcel.readFloat();
        this.zzahj = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzahi = parcel.readInt();
        this.zzahk = (zzpx) parcel.readParcelable(zzpx.class.getClassLoader());
        this.zzahl = parcel.readInt();
        this.zzahm = parcel.readInt();
        this.zzahn = parcel.readInt();
        this.zzaho = parcel.readInt();
        this.zzahp = parcel.readInt();
        this.zzahr = parcel.readInt();
        this.zzahs = parcel.readString();
        this.zzaht = parcel.readInt();
        this.zzahq = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzahd = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzahd.add(parcel.createByteArray());
        }
        this.zzahe = (zzjn) parcel.readParcelable(zzjn.class.getClassLoader());
        this.zzagz = (zzmg) parcel.readParcelable(zzmg.class.getClassLoader());
    }

    public final zzhs zzv(int i) {
        return new zzhs(this.id, this.zzaha, this.zzahb, this.zzagy, this.zzagx, i, this.width, this.height, this.zzahf, this.zzahg, this.zzahh, this.zzahj, this.zzahi, this.zzahk, this.zzahl, this.zzahm, this.zzahn, this.zzaho, this.zzahp, this.zzahr, this.zzahs, this.zzaht, this.zzahq, this.zzahd, this.zzahe, this.zzagz);
    }

    public final zzhs zzds(long j) {
        return new zzhs(this.id, this.zzaha, this.zzahb, this.zzagy, this.zzagx, this.zzahc, this.width, this.height, this.zzahf, this.zzahg, this.zzahh, this.zzahj, this.zzahi, this.zzahk, this.zzahl, this.zzahm, this.zzahn, this.zzaho, this.zzahp, this.zzahr, this.zzahs, this.zzaht, j, this.zzahd, this.zzahe, this.zzagz);
    }

    public final zzhs zzb(int i, int i2) {
        return new zzhs(this.id, this.zzaha, this.zzahb, this.zzagy, this.zzagx, this.zzahc, this.width, this.height, this.zzahf, this.zzahg, this.zzahh, this.zzahj, this.zzahi, this.zzahk, this.zzahl, this.zzahm, this.zzahn, i, i2, this.zzahr, this.zzahs, this.zzaht, this.zzahq, this.zzahd, this.zzahe, this.zzagz);
    }

    public final zzhs zza(zzjn zzjnVar) {
        return new zzhs(this.id, this.zzaha, this.zzahb, this.zzagy, this.zzagx, this.zzahc, this.width, this.height, this.zzahf, this.zzahg, this.zzahh, this.zzahj, this.zzahi, this.zzahk, this.zzahl, this.zzahm, this.zzahn, this.zzaho, this.zzahp, this.zzahr, this.zzahs, this.zzaht, this.zzahq, this.zzahd, zzjnVar, this.zzagz);
    }

    public final zzhs zza(zzmg zzmgVar) {
        return new zzhs(this.id, this.zzaha, this.zzahb, this.zzagy, this.zzagx, this.zzahc, this.width, this.height, this.zzahf, this.zzahg, this.zzahh, this.zzahj, this.zzahi, this.zzahk, this.zzahl, this.zzahm, this.zzahn, this.zzaho, this.zzahp, this.zzahr, this.zzahs, this.zzaht, this.zzahq, this.zzahd, this.zzahe, zzmgVar);
    }

    public final int zzez() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final MediaFormat zzfa() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzahb);
        String str = this.zzahs;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zza(mediaFormat, "max-input-size", this.zzahc);
        zza(mediaFormat, "width", this.width);
        zza(mediaFormat, "height", this.height);
        float f = this.zzahf;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zza(mediaFormat, "rotation-degrees", this.zzahg);
        zza(mediaFormat, "channel-count", this.zzahl);
        zza(mediaFormat, "sample-rate", this.zzahm);
        zza(mediaFormat, "encoder-delay", this.zzaho);
        zza(mediaFormat, "encoder-padding", this.zzahp);
        for (int i = 0; i < this.zzahd.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.zzahd.get(i)));
        }
        zzpx zzpxVar = this.zzahk;
        if (zzpxVar != null) {
            zza(mediaFormat, "color-transfer", zzpxVar.zzart);
            zza(mediaFormat, "color-standard", zzpxVar.zzars);
            zza(mediaFormat, "color-range", zzpxVar.zzaru);
            byte[] bArr = zzpxVar.zzbkq;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.zzaha;
        String str3 = this.zzahb;
        int i = this.zzagx;
        String str4 = this.zzahs;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.zzahf;
        int i4 = this.zzahl;
        int i5 = this.zzahm;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzahu == 0) {
            String str = this.id;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zzaha;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzahb;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzagy;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzagx) * 31) + this.width) * 31) + this.height) * 31) + this.zzahl) * 31) + this.zzahm) * 31;
            String str5 = this.zzahs;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzaht) * 31;
            zzjn zzjnVar = this.zzahe;
            int hashCode6 = (hashCode5 + (zzjnVar == null ? 0 : zzjnVar.hashCode())) * 31;
            zzmg zzmgVar = this.zzagz;
            this.zzahu = hashCode6 + (zzmgVar != null ? zzmgVar.hashCode() : 0);
        }
        return this.zzahu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhs zzhsVar = (zzhs) obj;
            if (this.zzagx == zzhsVar.zzagx && this.zzahc == zzhsVar.zzahc && this.width == zzhsVar.width && this.height == zzhsVar.height && this.zzahf == zzhsVar.zzahf && this.zzahg == zzhsVar.zzahg && this.zzahh == zzhsVar.zzahh && this.zzahi == zzhsVar.zzahi && this.zzahl == zzhsVar.zzahl && this.zzahm == zzhsVar.zzahm && this.zzahn == zzhsVar.zzahn && this.zzaho == zzhsVar.zzaho && this.zzahp == zzhsVar.zzahp && this.zzahq == zzhsVar.zzahq && this.zzahr == zzhsVar.zzahr && zzps.zza(this.id, zzhsVar.id) && zzps.zza(this.zzahs, zzhsVar.zzahs) && this.zzaht == zzhsVar.zzaht && zzps.zza(this.zzaha, zzhsVar.zzaha) && zzps.zza(this.zzahb, zzhsVar.zzahb) && zzps.zza(this.zzagy, zzhsVar.zzagy) && zzps.zza(this.zzahe, zzhsVar.zzahe) && zzps.zza(this.zzagz, zzhsVar.zzagz) && zzps.zza(this.zzahk, zzhsVar.zzahk) && Arrays.equals(this.zzahj, zzhsVar.zzahj) && this.zzahd.size() == zzhsVar.zzahd.size()) {
                for (int i = 0; i < this.zzahd.size(); i++) {
                    if (!Arrays.equals(this.zzahd.get(i), zzhsVar.zzahd.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.zzaha);
        parcel.writeString(this.zzahb);
        parcel.writeString(this.zzagy);
        parcel.writeInt(this.zzagx);
        parcel.writeInt(this.zzahc);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.zzahf);
        parcel.writeInt(this.zzahg);
        parcel.writeFloat(this.zzahh);
        parcel.writeInt(this.zzahj != null ? 1 : 0);
        byte[] bArr = this.zzahj;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzahi);
        parcel.writeParcelable(this.zzahk, i);
        parcel.writeInt(this.zzahl);
        parcel.writeInt(this.zzahm);
        parcel.writeInt(this.zzahn);
        parcel.writeInt(this.zzaho);
        parcel.writeInt(this.zzahp);
        parcel.writeInt(this.zzahr);
        parcel.writeString(this.zzahs);
        parcel.writeInt(this.zzaht);
        parcel.writeLong(this.zzahq);
        int size = this.zzahd.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.zzahd.get(i2));
        }
        parcel.writeParcelable(this.zzahe, 0);
        parcel.writeParcelable(this.zzagz, 0);
    }
}
