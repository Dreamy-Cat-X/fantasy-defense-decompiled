package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeeg extends zzekq<zzeeg, zza> implements zzemf {
    private static volatile zzemm<zzeeg> zzei;
    private static final zzeeg zzidf;
    private int zzida;

    private zzeeg() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeeg, zza> implements zzemf {
        private zza() {
            super(zzeeg.zzidf);
        }

        /* synthetic */ zza(zzeef zzeefVar) {
            this();
        }
    }

    public final int zzbcc() {
        return this.zzida;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeef zzeefVar = null;
        switch (zzeef.zzds[i - 1]) {
            case 1:
                return new zzeeg();
            case 2:
                return new zza(zzeefVar);
            case 3:
                return zza(zzidf, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzida"});
            case 4:
                return zzidf;
            case 5:
                zzemm<zzeeg> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeeg.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidf);
                            zzei = zzemmVar;
                        }
                    }
                }
                return zzemmVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzeeg zzbcj() {
        return zzidf;
    }

    static {
        zzeeg zzeegVar = new zzeeg();
        zzidf = zzeegVar;
        zzekq.zza((Class<zzeeg>) zzeeg.class, zzeegVar);
    }
}
