package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegl extends zzekq<zzegl, zza> implements zzemf {
    private static volatile zzemm<zzegl> zzei;
    private static final zzegl zzigs;
    private String zzigq = "";
    private zzefv zzigr;

    private zzegl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzegl, zza> implements zzemf {
        private zza() {
            super(zzegl.zzigs);
        }

        /* synthetic */ zza(zzegk zzegkVar) {
            this();
        }
    }

    public final String zzbfi() {
        return this.zzigq;
    }

    public final zzefv zzbfj() {
        zzefv zzefvVar = this.zzigr;
        return zzefvVar == null ? zzefv.zzbeg() : zzefvVar;
    }

    public static zzegl zzy(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzegl) zzekq.zza(zzigs, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegk zzegkVar = null;
        switch (zzegk.zzds[i - 1]) {
            case 1:
                return new zzegl();
            case 2:
                return new zza(zzegkVar);
            case 3:
                return zza(zzigs, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzigq", "zzigr"});
            case 4:
                return zzigs;
            case 5:
                zzemm<zzegl> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegl.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzigs);
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

    public static zzegl zzbfk() {
        return zzigs;
    }

    static {
        zzegl zzeglVar = new zzegl();
        zzigs = zzeglVar;
        zzekq.zza((Class<zzegl>) zzegl.class, zzeglVar);
    }
}
