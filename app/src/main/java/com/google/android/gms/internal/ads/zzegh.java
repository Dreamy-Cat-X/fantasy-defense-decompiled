package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegh extends zzekq<zzegh, zza> implements zzemf {
    private static volatile zzemm<zzegh> zzei;
    private static final zzegh zzign;
    private String zzigm = "";

    private zzegh() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzegh, zza> implements zzemf {
        private zza() {
            super(zzegh.zzign);
        }

        /* synthetic */ zza(zzegg zzeggVar) {
            this();
        }
    }

    public final String zzbfc() {
        return this.zzigm;
    }

    public static zzegh zzw(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzegh) zzekq.zza(zzign, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegg zzeggVar = null;
        switch (zzegg.zzds[i - 1]) {
            case 1:
                return new zzegh();
            case 2:
                return new zza(zzeggVar);
            case 3:
                return zza(zzign, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzigm"});
            case 4:
                return zzign;
            case 5:
                zzemm<zzegh> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegh.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzign);
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

    public static zzegh zzbfd() {
        return zzign;
    }

    static {
        zzegh zzeghVar = new zzegh();
        zzign = zzeghVar;
        zzekq.zza((Class<zzegh>) zzegh.class, zzeghVar);
    }
}
