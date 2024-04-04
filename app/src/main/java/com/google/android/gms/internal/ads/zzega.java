package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzega extends zzekq<zzega, zza> implements zzemf {
    private static volatile zzemm<zzega> zzei;
    private static final zzega zzigc;
    private int zziga;
    private zzela<zzb> zzigb = zzbiq();

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq<zzb, zza> implements zzemf {
        private static volatile zzemm<zzb> zzei;
        private static final zzb zzigg;
        private int zzift;
        private zzefs zzigd;
        private int zzige;
        private int zzigf;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzb, zza> implements zzemf {
            private zza() {
                super(zzb.zzigg);
            }

            /* synthetic */ zza(zzegb zzegbVar) {
                this();
            }
        }

        public final boolean zzber() {
            return this.zzigd != null;
        }

        public final zzefs zzbes() {
            zzefs zzefsVar = this.zzigd;
            return zzefsVar == null ? zzefs.zzbee() : zzefsVar;
        }

        public final zzeft zzbax() {
            zzeft zzfk = zzeft.zzfk(this.zzige);
            return zzfk == null ? zzeft.UNRECOGNIZED : zzfk;
        }

        public final int zzbet() {
            return this.zzigf;
        }

        public final zzegm zzbay() {
            zzegm zzfr = zzegm.zzfr(this.zzift);
            return zzfr == null ? zzegm.UNRECOGNIZED : zzfr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzegb zzegbVar = null;
            switch (zzegb.zzds[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzegbVar);
                case 3:
                    return zza(zzigg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzigd", "zzige", "zzigf", "zzift"});
                case 4:
                    return zzigg;
                case 5:
                    zzemm<zzb> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzb.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzigg);
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
            zzb zzbVar = new zzb();
            zzigg = zzbVar;
            zzekq.zza((Class<zzb>) zzb.class, zzbVar);
        }
    }

    private zzega() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzega, zza> implements zzemf {
        private zza() {
            super(zzega.zzigc);
        }

        /* synthetic */ zza(zzegb zzegbVar) {
            this();
        }
    }

    public final int zzben() {
        return this.zziga;
    }

    public final List<zzb> zzbeo() {
        return this.zzigb;
    }

    public final int zzbep() {
        return this.zzigb.size();
    }

    public static zzega zzc(byte[] bArr, zzekd zzekdVar) throws zzeld {
        return (zzega) zzekq.zza(zzigc, bArr, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegb zzegbVar = null;
        switch (zzegb.zzds[i - 1]) {
            case 1:
                return new zzega();
            case 2:
                return new zza(zzegbVar);
            case 3:
                return zza(zzigc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zziga", "zzigb", zzb.class});
            case 4:
                return zzigc;
            case 5:
                zzemm<zzega> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzega.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzigc);
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
        zzega zzegaVar = new zzega();
        zzigc = zzegaVar;
        zzekq.zza((Class<zzega>) zzega.class, zzegaVar);
    }
}
