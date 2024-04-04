package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzefz extends zzekq<zzefz, zza> implements zzemf {
    private static volatile zzemm<zzefz> zzei;
    private static final zzefz zzifz;
    private int zzifw;
    private boolean zzifx;
    private String zzifv = "";
    private String zzifc = "";
    private String zzify = "";

    private zzefz() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefz, zza> implements zzemf {
        private zza() {
            super(zzefz.zzifz);
        }

        /* synthetic */ zza(zzefy zzefyVar) {
            this();
        }
    }

    public final String zzbei() {
        return this.zzifv;
    }

    public final String zzbea() {
        return this.zzifc;
    }

    public final int zzbej() {
        return this.zzifw;
    }

    public final boolean zzbek() {
        return this.zzifx;
    }

    public final String zzbel() {
        return this.zzify;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefy zzefyVar = null;
        switch (zzefy.zzds[i - 1]) {
            case 1:
                return new zzefz();
            case 2:
                return new zza(zzefyVar);
            case 3:
                return zza(zzifz, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzifv", "zzifc", "zzifw", "zzifx", "zzify"});
            case 4:
                return zzifz;
            case 5:
                zzemm<zzefz> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefz.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzifz);
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

    static {
        zzefz zzefzVar = new zzefz();
        zzifz = zzefzVar;
        zzekq.zza((Class<zzefz>) zzefz.class, zzefzVar);
    }
}
