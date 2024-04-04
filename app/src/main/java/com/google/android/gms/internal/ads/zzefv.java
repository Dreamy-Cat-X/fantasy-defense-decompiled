package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefv extends zzekq<zzefv, zza> implements zzemf {
    private static volatile zzemm<zzefv> zzei;
    private static final zzefv zzifu;
    private String zzifc = "";
    private zzejg zzifd = zzejg.zzikj;
    private int zzift;

    private zzefv() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefv, zza> implements zzemf {
        private zza() {
            super(zzefv.zzifu);
        }

        /* synthetic */ zza(zzefx zzefxVar) {
            this();
        }
    }

    public final String zzbea() {
        return this.zzifc;
    }

    public final zzejg zzbeb() {
        return this.zzifd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefx zzefxVar = null;
        switch (zzefx.zzds[i - 1]) {
            case 1:
                return new zzefv();
            case 2:
                return new zza(zzefxVar);
            case 3:
                return zza(zzifu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzifc", "zzifd", "zzift"});
            case 4:
                return zzifu;
            case 5:
                zzemm<zzefv> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefv.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzifu);
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

    public static zzefv zzbeg() {
        return zzifu;
    }

    static {
        zzefv zzefvVar = new zzefv();
        zzifu = zzefvVar;
        zzekq.zza((Class<zzefv>) zzefv.class, zzefvVar);
    }
}
