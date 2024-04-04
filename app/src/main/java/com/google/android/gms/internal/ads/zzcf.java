package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcf {

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq<zza, C0009zza> implements zzemf {
        private static volatile zzemm<zza> zzei;
        private static final zza zzih;
        private int zzdt;
        private int zzfk;
        private int zzfl;
        private long zzfn;
        private long zzfo;
        private long zzfp;
        private long zzfq;
        private long zzfr;
        private long zzfs;
        private long zzft;
        private long zzfu;
        private long zzfv;
        private long zzfw;
        private long zzfy;
        private long zzfz;
        private long zzga;
        private long zzgb;
        private long zzgc;
        private long zzgd;
        private long zzge;
        private long zzgf;
        private long zzgg;
        private long zzgj;
        private long zzgk;
        private long zzgl;
        private long zzgm;
        private zzb zzgp;
        private zze zzhf;
        private zzf zzhh;
        private int zzhs;
        private int zzht;
        private int zzhu;
        private zze zzhv;
        private long zzia;
        private boolean zzid;
        private long zzif;
        private zzd zzig;
        private String zzfm = "";
        private String zzed = "";
        private String zzfx = "";
        private String zzfd = "";
        private String zzgh = "D";
        private String zzgi = "";
        private String zzff = "";
        private long zzgn = -1;
        private long zzgo = -1;
        private long zzgq = -1;
        private long zzgr = -1;
        private long zzgs = -1;
        private long zzgt = -1;
        private long zzgu = -1;
        private long zzgv = -1;
        private String zzfg = "D";
        private String zzfh = "D";
        private long zzgw = -1;
        private int zzgx = 1000;
        private int zzgy = 1000;
        private long zzgz = -1;
        private long zzha = -1;
        private long zzhb = -1;
        private long zzhc = -1;
        private long zzhd = -1;
        private int zzhe = 1000;
        private zzela<zze> zzhg = zzbiq();
        private long zzhi = -1;
        private long zzhj = -1;
        private long zzhk = -1;
        private long zzhl = -1;
        private long zzhm = -1;
        private long zzhn = -1;
        private long zzho = -1;
        private long zzhp = -1;
        private String zzhq = "D";
        private long zzhr = -1;
        private long zzhw = -1;
        private int zzhx = 1000;
        private int zzhy = 1000;
        private String zzhz = "D";
        private String zzib = "";
        private int zzic = 2;
        private String zzie = "";

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzb implements zzekv {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3),
            DEBUGGER_STATE_ENVVAR(4),
            DEBUGGER_STATE_MACHPORT(5),
            DEBUGGER_STATE_ENVVAR_MACHPORT(6);

            private static final zzeku<zzb> zzep = new zzcg();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            public static zzb zzk(int i) {
                switch (i) {
                    case 0:
                        return DEBUGGER_STATE_UNSPECIFIED;
                    case 1:
                        return DEBUGGER_STATE_NOT_INSTALLED;
                    case 2:
                        return DEBUGGER_STATE_INSTALLED;
                    case 3:
                        return DEBUGGER_STATE_ACTIVE;
                    case 4:
                        return DEBUGGER_STATE_ENVVAR;
                    case 5:
                        return DEBUGGER_STATE_MACHPORT;
                    case 6:
                        return DEBUGGER_STATE_ENVVAR_MACHPORT;
                    default:
                        return null;
                }
            }

            public static zzekx zzw() {
                return zzch.zzer;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzb(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzc implements zzekv {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);

            private static final zzeku<zzc> zzep = new zzcj();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            public static zzc zzl(int i) {
                switch (i) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            public static zzekx zzw() {
                return zzci.zzer;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzd implements zzekv {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(128),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(512),
            PSN_INVALID_ERROR_CODE(1024),
            PSN_TIMESTAMP_EXPIRED(2048),
            PSN_ENCODE_SIZE_FAIL(4096),
            PSN_BLANK_VALUE(8192),
            PSN_INITIALIZATION_FAIL(16384),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);

            private static final zzeku<zzd> zzep = new zzck();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzd(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zze extends zzekq<zze, C0010zza> implements zzemf {
            private static volatile zzemm<zze> zzei;
            private static final zze zzkr;
            private int zzdt;
            private long zzkl;
            private long zzkm;
            private long zzfy = -1;
            private long zzfz = -1;
            private long zzjy = -1;
            private long zzjz = -1;
            private long zzka = -1;
            private long zzkb = -1;
            private int zzkc = 1000;
            private long zzkd = -1;
            private long zzke = -1;
            private long zzkf = -1;
            private int zzkg = 1000;
            private long zzkh = -1;
            private long zzki = -1;
            private long zzkj = -1;
            private long zzkk = -1;
            private long zzkn = -1;
            private long zzko = -1;
            private long zzkp = -1;
            private long zzkq = -1;

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzcf$zza$zze$zza, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0010zza extends zzekq.zzb<zze, C0010zza> implements zzemf {
                private C0010zza() {
                    super(zze.zzkr);
                }

                public final C0010zza zzbs(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzaq(j);
                    return this;
                }

                public final C0010zza zzbt(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzar(j);
                    return this;
                }

                public final C0010zza zzbu(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcj(j);
                    return this;
                }

                public final C0010zza zzbv(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzck(j);
                    return this;
                }

                public final C0010zza zzat() {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzau();
                    return this;
                }

                public final C0010zza zzbw(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcl(j);
                    return this;
                }

                public final C0010zza zzbx(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcm(j);
                    return this;
                }

                public final C0010zza zzk(zzcn zzcnVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzm(zzcnVar);
                    return this;
                }

                public final C0010zza zzby(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcn(j);
                    return this;
                }

                public final C0010zza zzbz(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzco(j);
                    return this;
                }

                public final C0010zza zzca(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcp(j);
                    return this;
                }

                public final C0010zza zzl(zzcn zzcnVar) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzn(zzcnVar);
                    return this;
                }

                public final C0010zza zzcb(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcq(j);
                    return this;
                }

                public final C0010zza zzcc(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcr(j);
                    return this;
                }

                public final C0010zza zzcd(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcs(j);
                    return this;
                }

                public final C0010zza zzce(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzct(j);
                    return this;
                }

                public final C0010zza zzcf(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcu(j);
                    return this;
                }

                public final C0010zza zzcg(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcv(j);
                    return this;
                }

                public final C0010zza zzch(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcw(j);
                    return this;
                }

                public final C0010zza zzci(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zze) this.zzioz).zzcx(j);
                    return this;
                }

                /* synthetic */ C0010zza(zzce zzceVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzaq(long j) {
                this.zzdt |= 1;
                this.zzfy = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzar(long j) {
                this.zzdt |= 2;
                this.zzfz = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcj(long j) {
                this.zzdt |= 4;
                this.zzjy = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzck(long j) {
                this.zzdt |= 8;
                this.zzjz = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzau() {
                this.zzdt &= -9;
                this.zzjz = -1L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcl(long j) {
                this.zzdt |= 16;
                this.zzka = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcm(long j) {
                this.zzdt |= 32;
                this.zzkb = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzm(zzcn zzcnVar) {
                this.zzkc = zzcnVar.zzv();
                this.zzdt |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcn(long j) {
                this.zzdt |= 128;
                this.zzkd = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzco(long j) {
                this.zzdt |= 256;
                this.zzke = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcp(long j) {
                this.zzdt |= 512;
                this.zzkf = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzn(zzcn zzcnVar) {
                this.zzkg = zzcnVar.zzv();
                this.zzdt |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcq(long j) {
                this.zzdt |= 2048;
                this.zzkh = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcr(long j) {
                this.zzdt |= 4096;
                this.zzki = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcs(long j) {
                this.zzdt |= 8192;
                this.zzkj = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzct(long j) {
                this.zzdt |= 16384;
                this.zzkk = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcu(long j) {
                this.zzdt |= 32768;
                this.zzkl = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcv(long j) {
                this.zzdt |= 65536;
                this.zzkm = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcw(long j) {
                this.zzdt |= 131072;
                this.zzkn = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcx(long j) {
                this.zzdt |= 262144;
                this.zzko = j;
            }

            public static C0010zza zzav() {
                return zzkr.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzce zzceVar = null;
                switch (zzce.zzds[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0010zza(zzceVar);
                    case 3:
                        return zza(zzkr, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzdt", "zzfy", "zzfz", "zzjy", "zzjz", "zzka", "zzkb", "zzkc", zzcn.zzw(), "zzkd", "zzke", "zzkf", "zzkg", zzcn.zzw(), "zzkh", "zzki", "zzkj", "zzkk", "zzkl", "zzkm", "zzkn", "zzko", "zzkp", "zzkq"});
                    case 4:
                        return zzkr;
                    case 5:
                        zzemm<zze> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zze.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzkr);
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
                zze zzeVar = new zze();
                zzkr = zzeVar;
                zzekq.zza((Class<zze>) zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzf extends zzekq<zzf, C0011zza> implements zzemf {
            private static volatile zzemm<zzf> zzei;
            private static final zzf zzkw;
            private int zzdt;
            private long zzhc = -1;
            private long zzhd = -1;
            private long zzks = -1;
            private long zzkt = -1;
            private long zzku = -1;
            private long zzkv = -1;

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzcf$zza$zzf$zza, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0011zza extends zzekq.zzb<zzf, C0011zza> implements zzemf {
                private C0011zza() {
                    super(zzf.zzkw);
                }

                public final C0011zza zzcy(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).zzdc(j);
                    return this;
                }

                public final C0011zza zzcz(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).zzdd(j);
                    return this;
                }

                public final C0011zza zzda(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).zzde(j);
                    return this;
                }

                public final C0011zza zzdb(long j) {
                    if (this.zzipa) {
                        zzbiv();
                        this.zzipa = false;
                    }
                    ((zzf) this.zzioz).zzdf(j);
                    return this;
                }

                /* synthetic */ C0011zza(zzce zzceVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdc(long j) {
                this.zzdt |= 4;
                this.zzks = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdd(long j) {
                this.zzdt |= 8;
                this.zzkt = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzde(long j) {
                this.zzdt |= 16;
                this.zzku = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdf(long j) {
                this.zzdt |= 32;
                this.zzkv = j;
            }

            public static C0011zza zzax() {
                return zzkw.zzbil();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzce zzceVar = null;
                switch (zzce.zzds[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0011zza(zzceVar);
                    case 3:
                        return zza(zzkw, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzdt", "zzhc", "zzhd", "zzks", "zzkt", "zzku", "zzkv"});
                    case 4:
                        return zzkw;
                    case 5:
                        zzemm<zzf> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzf.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzkw);
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
                zzkw = zzfVar;
                zzekq.zza((Class<zzf>) zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzcf$zza$zza, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0009zza extends zzekq.zzb<zza, C0009zza> implements zzemf {
            private C0009zza() {
                super(zza.zzih);
            }

            public final C0009zza zzt(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzac(str);
                return this;
            }

            public final C0009zza zzu(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzad(str);
                return this;
            }

            public final C0009zza zze(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzal(j);
                return this;
            }

            public final C0009zza zzf(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzam(j);
                return this;
            }

            public final C0009zza zzg(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzan(j);
                return this;
            }

            public final C0009zza zzh(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzao(j);
                return this;
            }

            public final C0009zza zzi(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzap(j);
                return this;
            }

            public final C0009zza zzj(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzaq(j);
                return this;
            }

            public final C0009zza zzk(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzar(j);
                return this;
            }

            public final C0009zza zzl(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzas(j);
                return this;
            }

            public final C0009zza zzm(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzat(j);
                return this;
            }

            public final C0009zza zzn(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzau(j);
                return this;
            }

            public final C0009zza zzo(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzav(j);
                return this;
            }

            public final C0009zza zzp(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzaw(j);
                return this;
            }

            public final C0009zza zzv(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzae(str);
                return this;
            }

            public final C0009zza zzw(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzaf(str);
                return this;
            }

            public final C0009zza zzq(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzax(j);
                return this;
            }

            public final C0009zza zzr(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzay(j);
                return this;
            }

            public final C0009zza zzs(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzaz(j);
                return this;
            }

            public final C0009zza zzx(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzag(str);
                return this;
            }

            public final C0009zza zzt(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzba(j);
                return this;
            }

            @Deprecated
            public final C0009zza zzu(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbb(j);
                return this;
            }

            public final C0009zza zzv(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbc(j);
                return this;
            }

            public final C0009zza zzw(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbd(j);
                return this;
            }

            public final C0009zza zzx(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbe(j);
                return this;
            }

            public final C0009zza zzy(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbf(j);
                return this;
            }

            public final C0009zza zzz(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbg(j);
                return this;
            }

            public final C0009zza zzaa(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbh(j);
                return this;
            }

            public final C0009zza zzab(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbi(j);
                return this;
            }

            public final C0009zza zzy(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzah(str);
                return this;
            }

            public final C0009zza zzz(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzai(str);
                return this;
            }

            public final C0009zza zza(zzcn zzcnVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzf(zzcnVar);
                return this;
            }

            public final C0009zza zzb(zzcn zzcnVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzg(zzcnVar);
                return this;
            }

            public final C0009zza zzac(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbj(j);
                return this;
            }

            public final C0009zza zzad(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbk(j);
                return this;
            }

            public final C0009zza zzae(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbl(j);
                return this;
            }

            public final C0009zza zzc(zzcn zzcnVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzh(zzcnVar);
                return this;
            }

            public final C0009zza zza(zze zzeVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzc(zzeVar);
                return this;
            }

            public final C0009zza zzb(zze zzeVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzd(zzeVar);
                return this;
            }

            public final C0009zza zzai() {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzak();
                return this;
            }

            public final C0009zza zza(zzf zzfVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzb(zzfVar);
                return this;
            }

            public final C0009zza zzaf(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbm(j);
                return this;
            }

            public final C0009zza zzag(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbn(j);
                return this;
            }

            public final C0009zza zzah(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbo(j);
                return this;
            }

            public final C0009zza zzai(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbp(j);
                return this;
            }

            public final C0009zza zzaj(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbq(j);
                return this;
            }

            public final C0009zza zzaa(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzaj(str);
                return this;
            }

            public final C0009zza zzd(zzcn zzcnVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzi(zzcnVar);
                return this;
            }

            public final C0009zza zze(zzcn zzcnVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzj(zzcnVar);
                return this;
            }

            public final C0009zza zzab(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzak(str);
                return this;
            }

            public final C0009zza zza(zzc zzcVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzb(zzcVar);
                return this;
            }

            public final C0009zza zza(boolean z) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzb(z);
                return this;
            }

            public final C0009zza zzak(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzbr(j);
                return this;
            }

            /* synthetic */ C0009zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzac(String str) {
            str.getClass();
            this.zzdt |= 1;
            this.zzfm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzad(String str) {
            str.getClass();
            this.zzdt |= 2;
            this.zzed = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzal(long j) {
            this.zzdt |= 4;
            this.zzfn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzam(long j) {
            this.zzdt |= 16;
            this.zzfp = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzan(long j) {
            this.zzdt |= 32;
            this.zzfq = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzao(long j) {
            this.zzdt |= 1024;
            this.zzfv = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzap(long j) {
            this.zzdt |= 2048;
            this.zzfw = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaq(long j) {
            this.zzdt |= 8192;
            this.zzfy = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzar(long j) {
            this.zzdt |= 16384;
            this.zzfz = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzas(long j) {
            this.zzdt |= 32768;
            this.zzga = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzat(long j) {
            this.zzdt |= 65536;
            this.zzgb = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzau(long j) {
            this.zzdt |= 524288;
            this.zzge = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzav(long j) {
            this.zzdt |= 1048576;
            this.zzgf = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaw(long j) {
            this.zzdt |= 2097152;
            this.zzgg = j;
        }

        public final boolean zzaj() {
            return (this.zzdt & 4194304) != 0;
        }

        public final String zzaf() {
            return this.zzfd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzae(String str) {
            str.getClass();
            this.zzdt |= 4194304;
            this.zzfd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaf(String str) {
            str.getClass();
            this.zzdt |= 16777216;
            this.zzgi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzax(long j) {
            this.zzdt |= 33554432;
            this.zzgj = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzay(long j) {
            this.zzdt |= 67108864;
            this.zzgk = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaz(long j) {
            this.zzdt |= 134217728;
            this.zzgl = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzag(String str) {
            str.getClass();
            this.zzdt |= 268435456;
            this.zzff = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzba(long j) {
            this.zzdt |= 536870912;
            this.zzgm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbb(long j) {
            this.zzdt |= 1073741824;
            this.zzgn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbc(long j) {
            this.zzdt |= Integer.MIN_VALUE;
            this.zzgo = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbd(long j) {
            this.zzfk |= 2;
            this.zzgq = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbe(long j) {
            this.zzfk |= 4;
            this.zzgr = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbf(long j) {
            this.zzfk |= 8;
            this.zzgs = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbg(long j) {
            this.zzfk |= 16;
            this.zzgt = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbh(long j) {
            this.zzfk |= 32;
            this.zzgu = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbi(long j) {
            this.zzfk |= 64;
            this.zzgv = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzah(String str) {
            str.getClass();
            this.zzfk |= 128;
            this.zzfg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzai(String str) {
            str.getClass();
            this.zzfk |= 256;
            this.zzfh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzcn zzcnVar) {
            this.zzgx = zzcnVar.zzv();
            this.zzfk |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(zzcn zzcnVar) {
            this.zzgy = zzcnVar.zzv();
            this.zzfk |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbj(long j) {
            this.zzfk |= 4096;
            this.zzgz = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbk(long j) {
            this.zzfk |= 8192;
            this.zzha = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbl(long j) {
            this.zzfk |= 16384;
            this.zzhb = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(zzcn zzcnVar) {
            this.zzhe = zzcnVar.zzv();
            this.zzfk |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(zze zzeVar) {
            zzeVar.getClass();
            this.zzhf = zzeVar;
            this.zzfk |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(zze zzeVar) {
            zzeVar.getClass();
            zzela<zze> zzelaVar = this.zzhg;
            if (!zzelaVar.zzbgh()) {
                this.zzhg = zzekq.zza(zzelaVar);
            }
            this.zzhg.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzak() {
            this.zzhg = zzbiq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzf zzfVar) {
            zzfVar.getClass();
            this.zzhh = zzfVar;
            this.zzfk |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbm(long j) {
            this.zzfk |= 2097152;
            this.zzhj = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbn(long j) {
            this.zzfk |= 4194304;
            this.zzhk = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbo(long j) {
            this.zzfk |= 8388608;
            this.zzhl = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbp(long j) {
            this.zzfk |= 67108864;
            this.zzho = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbq(long j) {
            this.zzfk |= 134217728;
            this.zzhp = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaj(String str) {
            str.getClass();
            this.zzfk |= 268435456;
            this.zzhq = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(zzcn zzcnVar) {
            this.zzhx = zzcnVar.zzv();
            this.zzfl |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzj(zzcn zzcnVar) {
            this.zzhy = zzcnVar.zzv();
            this.zzfl |= 16;
        }

        public final String zzal() {
            return this.zzib;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzak(String str) {
            str.getClass();
            this.zzfl |= 128;
            this.zzib = str;
        }

        public final zzc zzam() {
            zzc zzl = zzc.zzl(this.zzic);
            return zzl == null ? zzc.DEVICE_IDENTIFIER_GLOBAL_ID : zzl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzc zzcVar) {
            this.zzic = zzcVar.zzv();
            this.zzfl |= 256;
        }

        public final boolean zzan() {
            return this.zzid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(boolean z) {
            this.zzfl |= 512;
            this.zzid = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbr(long j) {
            this.zzfl |= 2048;
            this.zzif = j;
        }

        public final boolean zzao() {
            return (this.zzfl & 4096) != 0;
        }

        public final zzd zzap() {
            zzd zzdVar = this.zzig;
            return zzdVar == null ? zzd.zzbi() : zzdVar;
        }

        public static zza zza(byte[] bArr, zzekd zzekdVar) throws zzeld {
            return (zza) zzekq.zza(zzih, bArr, zzekdVar);
        }

        public static C0009zza zzaq() {
            return zzih.zzbil();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzce zzceVar = null;
            switch (zzce.zzds[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0009zza(zzceVar);
                case 3:
                    return zza(zzih, "\u0001N\u0000\u0003\u0001ÉN\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂF\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈG\u0019ဂK\u001aဌH\u001bဈ\u0016\u001cဇI\u001dဈ\u0018\u001eဈJ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEÉဉL", new Object[]{"zzdt", "zzfk", "zzfl", "zzfm", "zzed", "zzfn", "zzfo", "zzfp", "zzfq", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzfy", "zzfz", "zzga", "zzgb", "zzgc", "zzgd", "zzge", "zzia", "zzgf", "zzgg", "zzib", "zzif", "zzic", zzc.zzw(), "zzfd", "zzid", "zzgi", "zzie", "zzgj", "zzgk", "zzgl", "zzff", "zzgm", "zzgn", "zzgo", "zzgp", "zzgq", "zzgr", "zzgs", "zzgt", "zzhg", zze.class, "zzgu", "zzgv", "zzfg", "zzfh", "zzgx", zzcn.zzw(), "zzgy", zzcn.zzw(), "zzhf", "zzgz", "zzha", "zzhb", "zzhc", "zzhd", "zzhe", zzcn.zzw(), "zzhh", "zzhi", "zzhj", "zzhk", "zzhl", "zzho", "zzhp", "zzhr", "zzhs", zzcm.zzw(), "zzht", zzcs.zzw(), "zzhq", "zzhu", zzb.zzw(), "zzhv", "zzhw", "zzhm", "zzhn", "zzhx", zzcn.zzw(), "zzgw", "zzgh", "zzhy", zzcn.zzw(), "zzhz", "zzig"});
                case 4:
                    return zzih;
                case 5:
                    zzemm<zza> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zza.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzih);
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

        public static zza zzar() {
            return zzih;
        }

        static {
            zza zzaVar = new zza();
            zzih = zzaVar;
            zzekq.zza((Class<zza>) zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq<zzb, zza> implements zzemf {
        private static volatile zzemm<zzb> zzei;
        private static final zzb zzlc;
        private int zzdt;
        private long zzkx;
        private int zzky;
        private boolean zzkz;
        private zzekw zzla = zzbio();
        private long zzlb;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzb, zza> implements zzemf {
            private zza() {
                super(zzb.zzlc);
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzce zzceVar = null;
            switch (zzce.zzds[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzceVar);
                case 3:
                    return zza(zzlc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzdt", "zzkx", "zzky", "zzkz", "zzla", "zzlb"});
                case 4:
                    return zzlc;
                case 5:
                    zzemm<zzb> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzb.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzlc);
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
            zzlc = zzbVar;
            zzekq.zza((Class<zzb>) zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzd extends zzekq<zzd, zza> implements zzemf {
        private static volatile zzemm<zzd> zzei;
        private static final zzd zzmb;
        private int zzdt;
        private long zzkx;
        private String zzlz = "";
        private zzejg zzma = zzejg.zzikj;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzd, zza> implements zzemf {
            private zza() {
                super(zzd.zzmb);
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        public final boolean zzbg() {
            return (this.zzdt & 1) != 0;
        }

        public final long zzbh() {
            return this.zzkx;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzce zzceVar = null;
            switch (zzce.zzds[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(zzceVar);
                case 3:
                    return zza(zzmb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzdt", "zzkx", "zzlz", "zzma"});
                case 4:
                    return zzmb;
                case 5:
                    zzemm<zzd> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzd.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzmb);
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

        public static zzd zzbi() {
            return zzmb;
        }

        static {
            zzd zzdVar = new zzd();
            zzmb = zzdVar;
            zzekq.zza((Class<zzd>) zzd.class, zzdVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zze extends zzekq<zze, zza> implements zzemf {
        private static volatile zzemm<zze> zzei;
        private static final zze zzmc;
        private int zzdt;
        private String zzfi = "";

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zze, zza> implements zzemf {
            private zza() {
                super(zze.zzmc);
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzce zzceVar = null;
            switch (zzce.zzds[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(zzceVar);
                case 3:
                    return zza(zzmc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdt", "zzfi"});
                case 4:
                    return zzmc;
                case 5:
                    zzemm<zze> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zze.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzmc);
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
            zze zzeVar = new zze();
            zzmc = zzeVar;
            zzekq.zza((Class<zze>) zze.class, zzeVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzc extends zzekq<zzc, zza> implements zzemf {
        private static volatile zzemm<zzc> zzei;
        private static final zzc zzlh;
        private int zzdt;
        private zzejg zzld = zzejg.zzikj;
        private zzejg zzle = zzejg.zzikj;
        private zzejg zzlf = zzejg.zzikj;
        private zzejg zzlg = zzejg.zzikj;

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzc, zza> implements zzemf {
            private zza() {
                super(zzc.zzlh);
            }

            public final zza zza(zzejg zzejgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzc) this.zzioz).zze(zzejgVar);
                return this;
            }

            public final zza zzb(zzejg zzejgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzc) this.zzioz).zzf(zzejgVar);
                return this;
            }

            public final zza zzc(zzejg zzejgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzc) this.zzioz).zzg(zzejgVar);
                return this;
            }

            public final zza zzd(zzejg zzejgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzc) this.zzioz).zzh(zzejgVar);
                return this;
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        public final zzejg zzba() {
            return this.zzld;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(zzejg zzejgVar) {
            zzejgVar.getClass();
            this.zzdt |= 1;
            this.zzld = zzejgVar;
        }

        public final zzejg zzbb() {
            return this.zzle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzejg zzejgVar) {
            zzejgVar.getClass();
            this.zzdt |= 2;
            this.zzle = zzejgVar;
        }

        public final zzejg zzbc() {
            return this.zzlf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(zzejg zzejgVar) {
            zzejgVar.getClass();
            this.zzdt |= 4;
            this.zzlf = zzejgVar;
        }

        public final zzejg zzbd() {
            return this.zzlg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(zzejg zzejgVar) {
            zzejgVar.getClass();
            this.zzdt |= 8;
            this.zzlg = zzejgVar;
        }

        public static zzc zzb(byte[] bArr, zzekd zzekdVar) throws zzeld {
            return (zzc) zzekq.zza(zzlh, bArr, zzekdVar);
        }

        public static zza zzbe() {
            return zzlh.zzbil();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzce zzceVar = null;
            switch (zzce.zzds[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(zzceVar);
                case 3:
                    return zza(zzlh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzdt", "zzld", "zzle", "zzlf", "zzlg"});
                case 4:
                    return zzlh;
                case 5:
                    zzemm<zzc> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzc.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzlh);
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
            zzc zzcVar = new zzc();
            zzlh = zzcVar;
            zzekq.zza((Class<zzc>) zzc.class, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzf extends zzekq<zzf, zza> implements zzemf {
        private static volatile zzemm<zzf> zzei;
        private static final zzf zzme;
        private int zzdt;
        private zzela<zzejg> zzmd = zzbiq();
        private zzejg zzle = zzejg.zzikj;
        private int zzht = 1;
        private int zzhs = 1;

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zza extends zzekq.zzb<zzf, zza> implements zzemf {
            private zza() {
                super(zzf.zzme);
            }

            public final zza zzj(zzejg zzejgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzf) this.zzioz).zzi(zzejgVar);
                return this;
            }

            public final zza zzk(zzejg zzejgVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzf) this.zzioz).zzf(zzejgVar);
                return this;
            }

            public final zza zzb(zzcm zzcmVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zzf) this.zzioz).zza(zzcmVar);
                return this;
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(zzejg zzejgVar) {
            zzejgVar.getClass();
            zzela<zzejg> zzelaVar = this.zzmd;
            if (!zzelaVar.zzbgh()) {
                this.zzmd = zzekq.zza(zzelaVar);
            }
            this.zzmd.add(zzejgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzejg zzejgVar) {
            zzejgVar.getClass();
            this.zzdt |= 1;
            this.zzle = zzejgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzcm zzcmVar) {
            this.zzhs = zzcmVar.zzv();
            this.zzdt |= 4;
        }

        public static zza zzbl() {
            return zzme.zzbil();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzce zzceVar = null;
            switch (zzce.zzds[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(zzceVar);
                case 3:
                    return zza(zzme, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzdt", "zzmd", "zzle", "zzht", zzcs.zzw(), "zzhs", zzcm.zzw()});
                case 4:
                    return zzme;
                case 5:
                    zzemm<zzf> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zzf.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzme);
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
            zzme = zzfVar;
            zzekq.zza((Class<zzf>) zzf.class, zzfVar);
        }
    }
}
