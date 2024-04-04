package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzby {

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq<zza, C0008zza> implements zzemf {
        private static volatile zzemm<zza> zzei;
        private static final zza zzeu;
        private int zzdt;
        private zzb zzes;
        private zzc zzet;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzby$zza$zza, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0008zza extends zzekq.zzb<zza, C0008zza> implements zzemf {
            private C0008zza() {
                super(zza.zzeu);
            }

            /* synthetic */ C0008zza(zzca zzcaVar) {
                this();
            }
        }

        public final boolean zzx() {
            return (this.zzdt & 1) != 0;
        }

        public final zzb zzy() {
            zzb zzbVar = this.zzes;
            return zzbVar == null ? zzb.zzad() : zzbVar;
        }

        public final boolean zzz() {
            return (this.zzdt & 2) != 0;
        }

        public final zzc zzaa() {
            zzc zzcVar = this.zzet;
            return zzcVar == null ? zzc.zzag() : zzcVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzca zzcaVar = null;
            switch (zzca.zzds[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0008zza(zzcaVar);
                case 3:
                    return zza(zzeu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzes", "zzet"});
                case 4:
                    return zzeu;
                case 5:
                    zzemm<zza> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zza.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzeu);
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
            zza zzaVar = new zza();
            zzeu = zzaVar;
            zzekq.zza((Class<zza>) zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq<zzb, zza> implements zzemf {
        private static volatile zzemm<zzb> zzei;
        private static final zzb zzew;
        private int zzdt;
        private int zzev = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzb, zza> implements zzemf {
            private zza() {
                super(zzb.zzew);
            }

            /* synthetic */ zza(zzca zzcaVar) {
                this();
            }
        }

        public final zzcb zzac() {
            zzcb zzj = zzcb.zzj(this.zzev);
            return zzj == null ? zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD : zzj;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzca zzcaVar = null;
            switch (zzca.zzds[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzcaVar);
                case 3:
                    return zza(zzew, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdt", "zzev", zzcb.zzw()});
                case 4:
                    return zzew;
                case 5:
                    zzemm<zzb> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzb.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzew);
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

        public static zzb zzad() {
            return zzew;
        }

        static {
            zzb zzbVar = new zzb();
            zzew = zzbVar;
            zzekq.zza((Class<zzb>) zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzc extends zzekq<zzc, zza> implements zzemf {
        private static volatile zzemm<zzc> zzei;
        private static final zzc zzfj;
        private int zzdt;
        private String zzfd = "";
        private String zzfe = "";
        private String zzff = "";
        private String zzfg = "";
        private String zzfh = "";
        private String zzfi = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzc, zza> implements zzemf {
            private zza() {
                super(zzc.zzfj);
            }

            /* synthetic */ zza(zzca zzcaVar) {
                this();
            }
        }

        public final String zzaf() {
            return this.zzfd;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzca zzcaVar = null;
            switch (zzca.zzds[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzcaVar);
                case 3:
                    return zza(zzfj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdt", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi"});
                case 4:
                    return zzfj;
                case 5:
                    zzemm<zzc> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzc.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzfj);
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

        public static zzc zzag() {
            return zzfj;
        }

        static {
            zzc zzcVar = new zzc();
            zzfj = zzcVar;
            zzekq.zza((Class<zzc>) zzc.class, zzcVar);
        }
    }
}
