package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzelq implements zzenb {
    private static final zzema zziqq = new zzelt();
    private final zzema zziqp;

    public zzelq() {
        this(new zzels(zzekr.zzbiu(), zzbjt()));
    }

    private zzelq(zzema zzemaVar) {
        this.zziqp = (zzema) zzeks.zza(zzemaVar, "messageInfoFactory");
    }

    @Override // com.google.android.gms.internal.ads.zzenb
    public final <T> zzemy<T> zzg(Class<T> cls) {
        zzena.zzi(cls);
        zzemb zzf = this.zziqp.zzf(cls);
        if (zzf.zzbkc()) {
            if (zzekq.class.isAssignableFrom(cls)) {
                return zzemj.zza(zzena.zzbkq(), zzekg.zzbic(), zzf.zzbkd());
            }
            return zzemj.zza(zzena.zzbko(), zzekg.zzbid(), zzf.zzbkd());
        }
        if (zzekq.class.isAssignableFrom(cls)) {
            if (zza(zzf)) {
                return zzemh.zza(cls, zzf, zzemn.zzbkf(), zzeln.zzbjs(), zzena.zzbkq(), zzekg.zzbic(), zzely.zzbjz());
            }
            return zzemh.zza(cls, zzf, zzemn.zzbkf(), zzeln.zzbjs(), zzena.zzbkq(), (zzekf<?>) null, zzely.zzbjz());
        }
        if (zza(zzf)) {
            return zzemh.zza(cls, zzf, zzemn.zzbke(), zzeln.zzbjr(), zzena.zzbko(), zzekg.zzbid(), zzely.zzbjy());
        }
        return zzemh.zza(cls, zzf, zzemn.zzbke(), zzeln.zzbjr(), zzena.zzbkp(), (zzekf<?>) null, zzely.zzbjy());
    }

    private static boolean zza(zzemb zzembVar) {
        return zzembVar.zzbkb() == zzemo.zziru;
    }

    private static zzema zzbjt() {
        try {
            return (zzema) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return zziqq;
        }
    }
}
