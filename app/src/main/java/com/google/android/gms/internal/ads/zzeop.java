package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeop {

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq<zza, C0013zza> implements zzemf {
        private static volatile zzemm<zza> zzei;
        private static final zza zziwb;
        private int zzdt;
        private int zzivu;
        private zzb zzivv;
        private boolean zzivy;
        private boolean zzivz;
        private byte zziwa = 2;
        private zzejg zzivw = zzejg.zzikj;
        private zzejg zzivx = zzejg.zzikj;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzb extends zzekq<zzb, C0014zza> implements zzemf {
            private static volatile zzemm<zzb> zzei;
            private static final zzb zziwg;
            private int zzdt;
            private String zziwc = "";
            private String zziwd = "";
            private String zziwe = "";
            private int zziwf;

            private zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzeop$zza$zzb$zza, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0014zza extends zzekq.zzb<zzb, C0014zza> implements zzemf {
                private C0014zza() {
                    super(zzb.zziwg);
                }

                /* synthetic */ C0014zza(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0014zza(zzeooVar);
                    case 3:
                        return zza(zziwg, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zzdt", "zziwc", "zziwd", "zziwe", "zziwf"});
                    case 4:
                        return zziwg;
                    case 5:
                        zzemm<zzb> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzb.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zziwg);
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
                zziwg = zzbVar;
                zzekq.zza((Class<zzb>) zzb.class, zzbVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzc implements zzekv {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);

            private static final zzeku<zzc> zzep = new zzeoq();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            public static zzc zzhy(int i) {
                if (i == 0) {
                    return SAFE;
                }
                if (i == 1) {
                    return DANGEROUS;
                }
                if (i == 2) {
                    return UNKNOWN;
                }
                if (i == 3) {
                    return POTENTIALLY_UNWANTED;
                }
                if (i != 4) {
                    return null;
                }
                return DANGEROUS_HOST;
            }

            public static zzekx zzw() {
                return zzeor.zzer;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzeop$zza$zza, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0013zza extends zzekq.zzb<zza, C0013zza> implements zzemf {
            private C0013zza() {
                super(zza.zziwb);
            }

            /* synthetic */ C0013zza(zzeoo zzeooVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzeoo zzeooVar = null;
            switch (zzeoo.zzds[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0013zza(zzeooVar);
                case 3:
                    return zza(zziwb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzdt", "zzivu", zzc.zzw(), "zzivv", "zzivw", "zzivx", "zzivy", "zzivz"});
                case 4:
                    return zziwb;
                case 5:
                    zzemm<zza> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zza.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zziwb);
                                zzei = zzemmVar;
                            }
                        }
                    }
                    return zzemmVar;
                case 6:
                    return Byte.valueOf(this.zziwa);
                case 7:
                    this.zziwa = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zziwb = zzaVar;
            zzekq.zza((Class<zza>) zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq<zzb, C0016zzb> implements zzemf {
        private static volatile zzemm<zzb> zzei;
        private static final zzb zzixc;
        private int zzbzn;
        private int zzdt;
        private int zziwn;
        private zza zziwq;
        private zzf zziwt;
        private boolean zziwu;
        private boolean zziwx;
        private boolean zziwy;
        private zzi zziwz;
        private byte zziwa = 2;
        private String zziwd = "";
        private String zziwo = "";
        private String zziwp = "";
        private zzela<zzh> zziwr = zzbiq();
        private String zziws = "";
        private zzela<String> zziwv = zzekq.zzbiq();
        private String zziww = "";
        private zzejg zzivw = zzejg.zzikj;
        private zzela<String> zzixa = zzekq.zzbiq();
        private zzela<String> zzixb = zzekq.zzbiq();

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zze extends zzekq<zze, C0020zzb> implements zzemf {
            private static volatile zzemm<zze> zzei;
            private static final zze zzixt;
            private int zzdt;
            private int zzixl;
            private zza zzixr;
            private byte zziwa = 2;
            private zzela<zzc> zzixi = zzbiq();
            private zzejg zzixj = zzejg.zzikj;
            private zzejg zzixk = zzejg.zzikj;
            private zzejg zzixs = zzejg.zzikj;

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* loaded from: D:\decomp\classes.dex */
            public static final class zza extends zzekq<zza, C0019zza> implements zzemf {
                private static volatile zzemm<zza> zzei;
                private static final zza zzixw;
                private int zzdt;
                private int zzixu;
                private zzejg zzixv = zzejg.zzikj;
                private zzejg zzixp = zzejg.zzikj;

                private zza() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zze$zza$zza, reason: collision with other inner class name */
                /* loaded from: D:\decomp\classes.dex */
                public static final class C0019zza extends zzekq.zzb<zza, C0019zza> implements zzemf {
                    private C0019zza() {
                        super(zza.zzixw);
                    }

                    /* synthetic */ C0019zza(zzeoo zzeooVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzekq
                public final Object zza(int i, Object obj, Object obj2) {
                    zzeoo zzeooVar = null;
                    switch (zzeoo.zzds[i - 1]) {
                        case 1:
                            return new zza();
                        case 2:
                            return new C0019zza(zzeooVar);
                        case 3:
                            return zza(zzixw, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzixu", "zzixv", "zzixp"});
                        case 4:
                            return zzixw;
                        case 5:
                            zzemm<zza> zzemmVar = zzei;
                            if (zzemmVar == null) {
                                synchronized (zza.class) {
                                    zzemmVar = zzei;
                                    if (zzemmVar == null) {
                                        zzemmVar = new zzekq.zza<>(zzixw);
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
                    zzixw = zzaVar;
                    zzekq.zza((Class<zza>) zza.class, zzaVar);
                }
            }

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zze$zzb, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0020zzb extends zzekq.zzb<zze, C0020zzb> implements zzemf {
                private C0020zzb() {
                    super(zze.zzixt);
                }

                /* synthetic */ C0020zzb(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0020zzb(zzeooVar);
                    case 3:
                        return zza(zzixt, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzdt", "zzixr", "zzixi", zzc.class, "zzixj", "zzixk", "zzixl", "zzixs"});
                    case 4:
                        return zzixt;
                    case 5:
                        zzemm<zze> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zze.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzixt);
                                    zzei = zzemmVar;
                                }
                            }
                        }
                        return zzemmVar;
                    case 6:
                        return Byte.valueOf(this.zziwa);
                    case 7:
                        this.zziwa = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zze zzeVar = new zze();
                zzixt = zzeVar;
                zzekq.zza((Class<zze>) zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzg implements zzekv {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);

            private static final zzeku<zzg> zzep = new zzeou();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            public static zzg zzia(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static zzekx zzw() {
                return zzeov.zzer;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzg(int i) {
                this.value = i;
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq<zza, C0015zza> implements zzemf {
            private static volatile zzemm<zza> zzei;
            private static final zza zzixe;
            private int zzdt;
            private String zzixd = "";

            private zza() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zza$zza, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0015zza extends zzekq.zzb<zza, C0015zza> implements zzemf {
                private C0015zza() {
                    super(zza.zzixe);
                }

                public final C0015zza zzij(String str) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zza) this.zzioz).zzif(str);
                    return this;
                }

                /* synthetic */ C0015zza(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzif(String str) {
                str.getClass();
                this.zzdt |= 1;
                this.zzixd = str;
            }

            public static C0015zza zzblu() {
                return zzixe.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0015zza(zzeooVar);
                    case 3:
                        return zza(zzixe, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdt", "zzixd"});
                    case 4:
                        return zzixe;
                    case 5:
                        zzemm<zza> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zza.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzixe);
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
                zzixe = zzaVar;
                zzekq.zza((Class<zza>) zza.class, zzaVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzc extends zzekq<zzc, zza> implements zzemf {
            private static volatile zzemm<zzc> zzei;
            private static final zzc zzixg;
            private int zzdt;
            private byte zziwa = 2;
            private zzejg zzixf = zzejg.zzikj;
            private zzejg zzifd = zzejg.zzikj;

            private zzc() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* loaded from: D:\decomp\classes.dex */
            public static final class zza extends zzekq.zzb<zzc, zza> implements zzemf {
                private zza() {
                    super(zzc.zzixg);
                }

                public final zza zzap(zzejg zzejgVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzc) this.zzioz).zzao(zzejgVar);
                    return this;
                }

                public final zza zzaq(zzejg zzejgVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzc) this.zzioz).zzaf(zzejgVar);
                    return this;
                }

                /* synthetic */ zza(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzao(zzejg zzejgVar) {
                zzejgVar.getClass();
                this.zzdt |= 1;
                this.zzixf = zzejgVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzaf(zzejg zzejgVar) {
                zzejgVar.getClass();
                this.zzdt |= 2;
                this.zzifd = zzejgVar;
            }

            public static zza zzblx() {
                return zzixg.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(zzeooVar);
                    case 3:
                        return zza(zzixg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzdt", "zzixf", "zzifd"});
                    case 4:
                        return zzixg;
                    case 5:
                        zzemm<zzc> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzc.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzixg);
                                    zzei = zzemmVar;
                                }
                            }
                        }
                        return zzemmVar;
                    case 6:
                        return Byte.valueOf(this.zziwa);
                    case 7:
                        this.zziwa = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzixg = zzcVar;
                zzekq.zza((Class<zzc>) zzc.class, zzcVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzd extends zzekq<zzd, C0018zzb> implements zzemf {
            private static volatile zzemm<zzd> zzei;
            private static final zzd zzixm;
            private int zzdt;
            private zza zzixh;
            private int zzixl;
            private byte zziwa = 2;
            private zzela<zzc> zzixi = zzbiq();
            private zzejg zzixj = zzejg.zzikj;
            private zzejg zzixk = zzejg.zzikj;

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* loaded from: D:\decomp\classes.dex */
            public static final class zza extends zzekq<zza, C0017zza> implements zzemf {
                private static volatile zzemm<zza> zzei;
                private static final zza zzixq;
                private int zzdt;
                private zzejg zzixn = zzejg.zzikj;
                private zzejg zzixo = zzejg.zzikj;
                private zzejg zzixp = zzejg.zzikj;

                private zza() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zzd$zza$zza, reason: collision with other inner class name */
                /* loaded from: D:\decomp\classes.dex */
                public static final class C0017zza extends zzekq.zzb<zza, C0017zza> implements zzemf {
                    private C0017zza() {
                        super(zza.zzixq);
                    }

                    /* synthetic */ C0017zza(zzeoo zzeooVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzekq
                public final Object zza(int i, Object obj, Object obj2) {
                    zzeoo zzeooVar = null;
                    switch (zzeoo.zzds[i - 1]) {
                        case 1:
                            return new zza();
                        case 2:
                            return new C0017zza(zzeooVar);
                        case 3:
                            return zza(zzixq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzixn", "zzixo", "zzixp"});
                        case 4:
                            return zzixq;
                        case 5:
                            zzemm<zza> zzemmVar = zzei;
                            if (zzemmVar == null) {
                                synchronized (zza.class) {
                                    zzemmVar = zzei;
                                    if (zzemmVar == null) {
                                        zzemmVar = new zzekq.zza<>(zzixq);
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
                    zzixq = zzaVar;
                    zzekq.zza((Class<zza>) zza.class, zzaVar);
                }
            }

            private zzd() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zzd$zzb, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0018zzb extends zzekq.zzb<zzd, C0018zzb> implements zzemf {
                private C0018zzb() {
                    super(zzd.zzixm);
                }

                public final C0018zzb zzb(zzc zzcVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzd) this.zzioz).zza(zzcVar);
                    return this;
                }

                /* synthetic */ C0018zzb(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzc zzcVar) {
                zzcVar.getClass();
                zzela<zzc> zzelaVar = this.zzixi;
                if (!zzelaVar.zzbgh()) {
                    this.zzixi = zzekq.zza(zzelaVar);
                }
                this.zzixi.add(zzcVar);
            }

            public static C0018zzb zzblz() {
                return zzixm.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new C0018zzb(zzeooVar);
                    case 3:
                        return zza(zzixm, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzdt", "zzixh", "zzixi", zzc.class, "zzixj", "zzixk", "zzixl"});
                    case 4:
                        return zzixm;
                    case 5:
                        zzemm<zzd> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzd.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzixm);
                                    zzei = zzemmVar;
                                }
                            }
                        }
                        return zzemmVar;
                    case 6:
                        return Byte.valueOf(this.zziwa);
                    case 7:
                        this.zziwa = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzd zzdVar = new zzd();
                zzixm = zzdVar;
                zzekq.zza((Class<zzd>) zzd.class, zzdVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzf extends zzekq<zzf, C0021zzb> implements zzemf {
            private static volatile zzemm<zzf> zzei;
            private static final zzf zzixz;
            private int zzbzn;
            private int zzdt;
            private String zzixx = "";
            private zzejg zzixy = zzejg.zzikj;

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* loaded from: D:\decomp\classes.dex */
            public enum zza implements zzekv {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);

                private static final zzeku<zza> zzep = new zzeot();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzekv
                public final int zzv() {
                    return this.value;
                }

                public static zza zzhz(int i) {
                    if (i == 0) {
                        return TYPE_UNKNOWN;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return TYPE_CREATIVE;
                }

                public static zzekx zzw() {
                    return zzeos.zzer;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                zza(int i) {
                    this.value = i;
                }
            }

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zzf$zzb, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0021zzb extends zzekq.zzb<zzf, C0021zzb> implements zzemf {
                private C0021zzb() {
                    super(zzf.zzixz);
                }

                public final C0021zzb zzb(zza zzaVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).zza(zzaVar);
                    return this;
                }

                public final C0021zzb zzik(String str) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).setMimeType(str);
                    return this;
                }

                public final C0021zzb zzas(zzejg zzejgVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).zzar(zzejgVar);
                    return this;
                }

                /* synthetic */ C0021zzb(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zza zzaVar) {
                this.zzbzn = zzaVar.zzv();
                this.zzdt |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setMimeType(String str) {
                str.getClass();
                this.zzdt |= 2;
                this.zzixx = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzar(zzejg zzejgVar) {
                zzejgVar.getClass();
                this.zzdt |= 4;
                this.zzixy = zzejgVar;
            }

            public static C0021zzb zzbme() {
                return zzixz.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0021zzb(zzeooVar);
                    case 3:
                        return zza(zzixz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzbzn", zza.zzw(), "zzixx", "zzixy"});
                    case 4:
                        return zzixz;
                    case 5:
                        zzemm<zzf> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzf.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzixz);
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
                zzf zzfVar = new zzf();
                zzixz = zzfVar;
                zzekq.zza((Class<zzf>) zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzh extends zzekq<zzh, C0022zzb> implements zzemf {
            private static volatile zzemm<zzh> zzei;
            private static final zzh zziyw;
            private int zzdt;
            private int zziyo;
            private zzd zziyp;
            private zze zziyq;
            private int zziyr;
            private int zziyu;
            private byte zziwa = 2;
            private String zziwd = "";
            private zzekw zziys = zzbio();
            private String zziyt = "";
            private zzela<String> zziyv = zzekq.zzbiq();

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* loaded from: D:\decomp\classes.dex */
            public enum zza implements zzekv {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);

                private static final zzeku<zza> zzep = new zzeow();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzekv
                public final int zzv() {
                    return this.value;
                }

                public static zza zzib(int i) {
                    if (i == 0) {
                        return AD_RESOURCE_UNKNOWN;
                    }
                    if (i == 1) {
                        return AD_RESOURCE_CREATIVE;
                    }
                    if (i == 2) {
                        return AD_RESOURCE_POST_CLICK;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                }

                public static zzekx zzw() {
                    return zzeox.zzer;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                zza(int i) {
                    this.value = i;
                }
            }

            private zzh() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zzh$zzb, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0022zzb extends zzekq.zzb<zzh, C0022zzb> implements zzemf {
                private C0022zzb() {
                    super(zzh.zziyw);
                }

                public final C0022zzb zzic(int i) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzh) this.zzioz).setId(i);
                    return this;
                }

                public final C0022zzb zzim(String str) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzh) this.zzioz).setUrl(str);
                    return this;
                }

                public final C0022zzb zzb(zzd zzdVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzh) this.zzioz).zza(zzdVar);
                    return this;
                }

                public final C0022zzb zzb(zza zzaVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzh) this.zzioz).zza(zzaVar);
                    return this;
                }

                public final C0022zzb zzin(String str) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzh) this.zzioz).zzil(str);
                    return this;
                }

                /* synthetic */ C0022zzb(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setId(int i) {
                this.zzdt |= 1;
                this.zziyo = i;
            }

            public final String getUrl() {
                return this.zziwd;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setUrl(String str) {
                str.getClass();
                this.zzdt |= 2;
                this.zziwd = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzd zzdVar) {
                zzdVar.getClass();
                this.zziyp = zzdVar;
                this.zzdt |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zza zzaVar) {
                this.zziyu = zzaVar.zzv();
                this.zzdt |= 64;
            }

            public final int zzbmg() {
                return this.zziyv.size();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzil(String str) {
                str.getClass();
                zzela<String> zzelaVar = this.zziyv;
                if (!zzelaVar.zzbgh()) {
                    this.zziyv = zzekq.zza(zzelaVar);
                }
                this.zziyv.add(str);
            }

            public static C0022zzb zzbmh() {
                return zziyw.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0022zzb(zzeooVar);
                    case 3:
                        return zza(zziyw, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzdt", "zziyo", "zziwd", "zziyp", "zziyq", "zziyr", "zziys", "zziyt", "zziyu", zza.zzw(), "zziyv"});
                    case 4:
                        return zziyw;
                    case 5:
                        zzemm<zzh> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzh.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zziyw);
                                    zzei = zzemmVar;
                                }
                            }
                        }
                        return zzemmVar;
                    case 6:
                        return Byte.valueOf(this.zziwa);
                    case 7:
                        this.zziwa = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzh zzhVar = new zzh();
                zziyw = zzhVar;
                zzekq.zza((Class<zzh>) zzh.class, zzhVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzi extends zzekq<zzi, zza> implements zzemf {
            private static volatile zzemm<zzi> zzei;
            private static final zzi zzizf;
            private int zzdt;
            private String zzizc = "";
            private long zzizd;
            private boolean zzize;

            private zzi() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
            /* loaded from: D:\decomp\classes.dex */
            public static final class zza extends zzekq.zzb<zzi, zza> implements zzemf {
                private zza() {
                    super(zzi.zzizf);
                }

                public final zza zzio(String str) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzi) this.zzioz).zzip(str);
                    return this;
                }

                public final zza zzfs(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzi) this.zzioz).zzft(j);
                    return this;
                }

                public final zza zzbu(boolean z) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzi) this.zzioz).zzbv(z);
                    return this;
                }

                /* synthetic */ zza(zzeoo zzeooVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzip(String str) {
                str.getClass();
                this.zzdt |= 1;
                this.zzizc = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzft(long j) {
                this.zzdt |= 2;
                this.zzizd = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzbv(boolean z) {
                this.zzdt |= 4;
                this.zzize = z;
            }

            public static zza zzbmj() {
                return zzizf.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzeoo zzeooVar = null;
                switch (zzeoo.zzds[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza(zzeooVar);
                    case 3:
                        return zza(zzizf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzdt", "zzizc", "zzizd", "zzize"});
                    case 4:
                        return zzizf;
                    case 5:
                        zzemm<zzi> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzi.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzizf);
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
                zzi zziVar = new zzi();
                zzizf = zziVar;
                zzekq.zza((Class<zzi>) zzi.class, zziVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzeop$zzb$zzb, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0016zzb extends zzekq.zzb<zzb, C0016zzb> implements zzemf {
            private C0016zzb() {
                super(zzb.zzixc);
            }

            public final C0016zzb zzb(zzg zzgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zza(zzgVar);
                return this;
            }

            public final String getUrl() {
                return ((zzb) this.zzioz).getUrl();
            }

            public final C0016zzb zzig(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).setUrl(str);
                return this;
            }

            public final C0016zzb zzih(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zzie(str);
                return this;
            }

            public final C0016zzb zzb(zza zzaVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zza(zzaVar);
                return this;
            }

            public final List<zzh> zzblp() {
                return Collections.unmodifiableList(((zzb) this.zzioz).zzblp());
            }

            public final C0016zzb zzb(zzh zzhVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zza(zzhVar);
                return this;
            }

            public final String zzblq() {
                return ((zzb) this.zzioz).zzblq();
            }

            public final C0016zzb zzii(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zzdv(str);
                return this;
            }

            public final C0016zzb zzblw() {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zzblr();
                return this;
            }

            public final C0016zzb zzb(zzf zzfVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zza(zzfVar);
                return this;
            }

            public final C0016zzb zzb(zzi zziVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zza(zziVar);
                return this;
            }

            public final C0016zzb zzo(Iterable<String> iterable) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zzm(iterable);
                return this;
            }

            public final C0016zzb zzp(Iterable<String> iterable) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzb) this.zzioz).zzn(iterable);
                return this;
            }

            /* synthetic */ C0016zzb(zzeoo zzeooVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzg zzgVar) {
            this.zzbzn = zzgVar.zzv();
            this.zzdt |= 1;
        }

        public final String getUrl() {
            return this.zziwd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setUrl(String str) {
            str.getClass();
            this.zzdt |= 4;
            this.zziwd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzie(String str) {
            str.getClass();
            this.zzdt |= 8;
            this.zziwo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zza zzaVar) {
            zzaVar.getClass();
            this.zziwq = zzaVar;
            this.zzdt |= 32;
        }

        public final List<zzh> zzblp() {
            return this.zziwr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzh zzhVar) {
            zzhVar.getClass();
            zzela<zzh> zzelaVar = this.zziwr;
            if (!zzelaVar.zzbgh()) {
                this.zziwr = zzekq.zza(zzelaVar);
            }
            this.zziwr.add(zzhVar);
        }

        public final String zzblq() {
            return this.zziws;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzdv(String str) {
            str.getClass();
            this.zzdt |= 64;
            this.zziws = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzblr() {
            this.zzdt &= -65;
            this.zziws = zzixc.zziws;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzf zzfVar) {
            zzfVar.getClass();
            this.zziwt = zzfVar;
            this.zzdt |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzi zziVar) {
            zziVar.getClass();
            this.zziwz = zziVar;
            this.zzdt |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzm(Iterable<String> iterable) {
            zzela<String> zzelaVar = this.zzixa;
            if (!zzelaVar.zzbgh()) {
                this.zzixa = zzekq.zza(zzelaVar);
            }
            zzeiw.zza(iterable, this.zzixa);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn(Iterable<String> iterable) {
            zzela<String> zzelaVar = this.zzixb;
            if (!zzelaVar.zzbgh()) {
                this.zzixb = zzekq.zza(zzelaVar);
            }
            zzeiw.zza(iterable, this.zzixb);
        }

        public static C0016zzb zzbls() {
            return zzixc.zzbil();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzeoo zzeooVar = null;
            switch (zzeoo.zzds[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0016zzb(zzeooVar);
                case 3:
                    return zza(zzixc, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzdt", "zziwd", "zziwo", "zziwp", "zziwr", zzh.class, "zziwu", "zziwv", "zziww", "zziwx", "zziwy", "zzbzn", zzg.zzw(), "zziwn", zza.zzc.zzw(), "zziwq", "zziws", "zziwt", "zzivw", "zziwz", "zzixa", "zzixb"});
                case 4:
                    return zzixc;
                case 5:
                    zzemm<zzb> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzb.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzixc);
                                zzei = zzemmVar;
                            }
                        }
                    }
                    return zzemmVar;
                case 6:
                    return Byte.valueOf(this.zziwa);
                case 7:
                    this.zziwa = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzixc = zzbVar;
            zzekq.zza((Class<zzb>) zzb.class, zzbVar);
        }
    }
}
