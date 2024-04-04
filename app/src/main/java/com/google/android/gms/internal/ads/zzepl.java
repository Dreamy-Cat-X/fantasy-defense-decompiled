package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzepl {
    public static final zzepl zzjab = new zzepl(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzepl zzjac = new zzepl(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzepl zzjad = new zzepl(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzepl zzjae = new zzepl(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double w;
    private final double zzizx;
    private final double zzizy;
    private final double zzizz;
    private final double zzjaa;

    private zzepl(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zzizx = d5;
        this.zzizy = d6;
        this.w = d7;
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.zzizz = d8;
        this.zzjaa = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzepl zzeplVar = (zzepl) obj;
        return Double.compare(zzeplVar.a, this.a) == 0 && Double.compare(zzeplVar.b, this.b) == 0 && Double.compare(zzeplVar.c, this.c) == 0 && Double.compare(zzeplVar.d, this.d) == 0 && Double.compare(zzeplVar.zzizz, this.zzizz) == 0 && Double.compare(zzeplVar.zzjaa, this.zzjaa) == 0 && Double.compare(zzeplVar.zzizx, this.zzizx) == 0 && Double.compare(zzeplVar.zzizy, this.zzizy) == 0 && Double.compare(zzeplVar.w, this.w) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zzizx);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zzizy);
        int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.w);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.a);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.b);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.c);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.d);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.zzizz);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.zzjaa);
        return (i7 * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zzjab)) {
            return "Rotate 0°";
        }
        if (equals(zzjac)) {
            return "Rotate 90°";
        }
        if (equals(zzjad)) {
            return "Rotate 180°";
        }
        if (equals(zzjae)) {
            return "Rotate 270°";
        }
        double d = this.zzizx;
        double d2 = this.zzizy;
        double d3 = this.w;
        double d4 = this.a;
        double d5 = this.b;
        double d6 = this.c;
        double d7 = this.d;
        double d8 = this.zzizz;
        double d9 = this.zzjaa;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    public static zzepl zzs(ByteBuffer byteBuffer) {
        double zzi = zzbq.zzi(byteBuffer);
        double zzi2 = zzbq.zzi(byteBuffer);
        double zzj = zzbq.zzj(byteBuffer);
        return new zzepl(zzi, zzi2, zzbq.zzi(byteBuffer), zzbq.zzi(byteBuffer), zzj, zzbq.zzj(byteBuffer), zzbq.zzj(byteBuffer), zzbq.zzi(byteBuffer), zzbq.zzi(byteBuffer));
    }
}
