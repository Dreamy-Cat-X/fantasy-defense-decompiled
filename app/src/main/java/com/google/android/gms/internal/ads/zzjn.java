package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjn implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzjn> CREATOR = new zzjp();
    private int zzahu;
    private final zza[] zzaof;
    public final int zzaog;

    public zzjn(List<zza> list) {
        this(false, (zza[]) list.toArray(new zza[list.size()]));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new zzjr();
        private final byte[] data;
        private final String mimeType;
        private final UUID uuid;
        private int zzahu;
        public final boolean zzaok;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) zzpf.checkNotNull(uuid);
            this.mimeType = (String) zzpf.checkNotNull(str);
            this.data = (byte[]) zzpf.checkNotNull(bArr);
            this.zzaok = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public zza(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.zzaok = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zzaVar = (zza) obj;
            return this.mimeType.equals(zzaVar.mimeType) && zzps.zza(this.uuid, zzaVar.uuid) && Arrays.equals(this.data, zzaVar.data);
        }

        public final int hashCode() {
            if (this.zzahu == 0) {
                this.zzahu = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.zzahu;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte(this.zzaok ? (byte) 1 : (byte) 0);
        }
    }

    public zzjn(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    private zzjn(boolean z, zza... zzaVarArr) {
        zzaVarArr = z ? (zza[]) zzaVarArr.clone() : zzaVarArr;
        Arrays.sort(zzaVarArr, this);
        for (int i = 1; i < zzaVarArr.length; i++) {
            if (zzaVarArr[i - 1].uuid.equals(zzaVarArr[i].uuid)) {
                String valueOf = String.valueOf(zzaVarArr[i].uuid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.zzaof = zzaVarArr;
        this.zzaog = zzaVarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.zzaof = zzaVarArr;
        this.zzaog = zzaVarArr.length;
    }

    public final zza zzac(int i) {
        return this.zzaof[i];
    }

    public final int hashCode() {
        if (this.zzahu == 0) {
            this.zzahu = Arrays.hashCode(this.zzaof);
        }
        return this.zzahu;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzaof, ((zzjn) obj).zzaof);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzaof, 0);
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        if (zzhe.UUID_NIL.equals(zzaVar3.uuid)) {
            return zzhe.UUID_NIL.equals(zzaVar4.uuid) ? 0 : 1;
        }
        return zzaVar3.uuid.compareTo(zzaVar4.uuid);
    }
}
