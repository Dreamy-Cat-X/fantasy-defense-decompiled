package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeey extends zzekq<zzeey, zza> implements zzemf {
    private static volatile zzemm<zzeey> zzei;
    private static final zzeey zzidv;
    private zzeez zzidu;

    private zzeey() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeey, zza> implements zzemf {
        private zza() {
            super(zzeey.zzidv);
        }

        /* synthetic */ zza(zzeex zzeexVar) {
            this();
        }
    }

    public final zzeez zzbcx() {
        zzeez zzeezVar = this.zzidu;
        return zzeezVar == null ? zzeez.zzbdc() : zzeezVar;
    }

    public static zzeey zzq(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeey) zzekq.zza(zzidv, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeex zzeexVar = null;
        switch (zzeex.zzds[i - 1]) {
            case 1:
                return new zzeey();
            case 2:
                return new zza(zzeexVar);
            case 3:
                return zza(zzidv, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzidu"});
            case 4:
                return zzidv;
            case 5:
                zzemm<zzeey> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeey.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidv);
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
        zzeey zzeeyVar = new zzeey();
        zzidv = zzeeyVar;
        zzekq.zza((Class<zzeey>) zzeey.class, zzeeyVar);
    }
}
