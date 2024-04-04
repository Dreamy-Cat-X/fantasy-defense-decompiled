package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegs extends zzekq<zzegs, zza> implements zzemf {
    private static volatile zzemm<zzegs> zzei;
    private static final zzegs zzihe;

    private zzegs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzegs, zza> implements zzemf {
        private zza() {
            super(zzegs.zzihe);
        }

        /* synthetic */ zza(zzegt zzegtVar) {
            this();
        }
    }

    public static zzegs zzaa(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzegs) zzekq.zza(zzihe, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegt zzegtVar = null;
        switch (zzegt.zzds[i - 1]) {
            case 1:
                return new zzegs();
            case 2:
                return new zza(zzegtVar);
            case 3:
                return zza(zzihe, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzihe;
            case 5:
                zzemm<zzegs> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegs.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzihe);
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
        zzegs zzegsVar = new zzegs();
        zzihe = zzegsVar;
        zzekq.zza((Class<zzegs>) zzegs.class, zzegsVar);
    }
}
