package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbu extends zzepb {
    private Date zzdb;
    private Date zzdc;
    private long zzdd;
    private long zzde;
    private double zzdf;
    private float zzdg;
    private zzepl zzdh;
    private long zzdi;
    private int zzdj;
    private int zzdk;
    private int zzdl;
    private int zzdm;
    private int zzdn;
    private int zzdo;

    public zzbu() {
        super("mvhd");
        this.zzdf = 1.0d;
        this.zzdg = 1.0f;
        this.zzdh = zzepl.zzjab;
    }

    public final long zzr() {
        return this.zzdd;
    }

    public final long getDuration() {
        return this.zzde;
    }

    @Override // com.google.android.gms.internal.ads.zzeoz
    public final void zzl(ByteBuffer byteBuffer) {
        zzr(byteBuffer);
        if (getVersion() == 1) {
            this.zzdb = zzepe.zzfu(zzbq.zzh(byteBuffer));
            this.zzdc = zzepe.zzfu(zzbq.zzh(byteBuffer));
            this.zzdd = zzbq.zzf(byteBuffer);
            this.zzde = zzbq.zzh(byteBuffer);
        } else {
            this.zzdb = zzepe.zzfu(zzbq.zzf(byteBuffer));
            this.zzdc = zzepe.zzfu(zzbq.zzf(byteBuffer));
            this.zzdd = zzbq.zzf(byteBuffer);
            this.zzde = zzbq.zzf(byteBuffer);
        }
        this.zzdf = zzbq.zzi(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzdg = ((short) ((r0[1] & 255) | ((short) (0 | ((r0[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))))) / 256.0f;
        zzbq.zzg(byteBuffer);
        zzbq.zzf(byteBuffer);
        zzbq.zzf(byteBuffer);
        this.zzdh = zzepl.zzs(byteBuffer);
        this.zzdj = byteBuffer.getInt();
        this.zzdk = byteBuffer.getInt();
        this.zzdl = byteBuffer.getInt();
        this.zzdm = byteBuffer.getInt();
        this.zzdn = byteBuffer.getInt();
        this.zzdo = byteBuffer.getInt();
        this.zzdi = zzbq.zzf(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzdb + ";modificationTime=" + this.zzdc + ";timescale=" + this.zzdd + ";duration=" + this.zzde + ";rate=" + this.zzdf + ";volume=" + this.zzdg + ";matrix=" + this.zzdh + ";nextTrackId=" + this.zzdi + "]";
    }
}
