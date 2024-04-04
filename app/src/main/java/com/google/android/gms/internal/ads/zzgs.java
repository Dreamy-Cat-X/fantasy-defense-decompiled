package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgs extends zzekq<zzgs, zza> implements zzemf {
    private static final zzgs zzabz;
    private static volatile zzemm<zzgs> zzei;
    private zzgt zzabw;
    private zzejg zzabx = zzejg.zzikj;
    private zzejg zzaby = zzejg.zzikj;
    private int zzdt;

    private zzgs() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzgs, zza> implements zzemf {
        private zza() {
            super(zzgs.zzabz);
        }

        /* synthetic */ zza(zzgr zzgrVar) {
            this();
        }
    }

    public final zzgt zzdc() {
        zzgt zzgtVar = this.zzabw;
        return zzgtVar == null ? zzgt.zzdm() : zzgtVar;
    }

    public final zzejg zzdd() {
        return this.zzabx;
    }

    public final zzejg zzde() {
        return this.zzaby;
    }

    public static zzgs zza(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzgs) zzekq.zza(zzabz, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzgr zzgrVar = null;
        switch (zzgr.zzds[i - 1]) {
            case 1:
                return new zzgs();
            case 2:
                return new zza(zzgrVar);
            case 3:
                return zza(zzabz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzabw", "zzabx", "zzaby"});
            case 4:
                return zzabz;
            case 5:
                zzemm<zzgs> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzgs.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzabz);
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
        zzgs zzgsVar = new zzgs();
        zzabz = zzgsVar;
        zzekq.zza((Class<zzgs>) zzgs.class, zzgsVar);
    }
}
