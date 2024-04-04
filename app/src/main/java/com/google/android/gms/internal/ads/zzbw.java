package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbw {

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq<zza, C0006zza> implements zzemf {
        private static final zza zzeh;
        private static volatile zzemm<zza> zzei;
        private int zzdt;
        private long zzdv;
        private long zzdz;
        private long zzea;
        private long zzec;
        private int zzeg;
        private String zzdu = "";
        private String zzdw = "";
        private String zzdx = "";
        private String zzdy = "";
        private String zzeb = "";
        private String zzed = "";
        private String zzee = "";
        private zzela<zzb> zzef = zzbiq();

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public static final class zzb extends zzekq<zzb, C0007zza> implements zzemf {
            private static volatile zzemm<zzb> zzei;
            private static final zzb zzel;
            private int zzdt;
            private String zzej = "";
            private String zzek = "";

            private zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zzb$zza, reason: collision with other inner class name */
            /* loaded from: D:\decomp\classes.dex */
            public static final class C0007zza extends zzekq.zzb<zzb, C0007zza> implements zzemf {
                private C0007zza() {
                    super(zzb.zzel);
                }

                /* synthetic */ C0007zza(zzbv zzbvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzekq
            public final Object zza(int i, Object obj, Object obj2) {
                zzbv zzbvVar = null;
                switch (zzbv.zzds[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0007zza(zzbvVar);
                    case 3:
                        return zza(zzel, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdt", "zzej", "zzek"});
                    case 4:
                        return zzel;
                    case 5:
                        zzemm<zzb> zzemmVar = zzei;
                        if (zzemmVar == null) {
                            synchronized (zzb.class) {
                                zzemmVar = zzei;
                                if (zzemmVar == null) {
                                    zzemmVar = new zzekq.zza<>(zzel);
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
                zzel = zzbVar;
                zzekq.zza((Class<zzb>) zzb.class, zzbVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzc implements zzekv {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);

            private static final zzeku<zzc> zzep = new zzbx();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            public static zzc zzh(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ENABLED;
                }
                if (i != 2) {
                    return null;
                }
                return DISABLED;
            }

            public static zzekx zzw() {
                return zzbz.zzer;
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

        /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zza, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0006zza extends zzekq.zzb<zza, C0006zza> implements zzemf {
            private C0006zza() {
                super(zza.zzeh);
            }

            public final C0006zza zzj(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzo(str);
                return this;
            }

            public final C0006zza zzc(long j) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzd(j);
                return this;
            }

            public final C0006zza zzk(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzp(str);
                return this;
            }

            public final C0006zza zzl(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzq(str);
                return this;
            }

            public final C0006zza zzm(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzr(str);
                return this;
            }

            public final C0006zza zzn(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzs(str);
                return this;
            }

            public final C0006zza zza(zzc zzcVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzb(zzcVar);
                return this;
            }

            /* synthetic */ C0006zza(zzbv zzbvVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo(String str) {
            str.getClass();
            this.zzdt |= 1;
            this.zzdu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdt |= 2;
            this.zzdv = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdt |= 4;
            this.zzdw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zzdt |= 8;
            this.zzdx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzdt |= 16;
            this.zzdy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzs(String str) {
            str.getClass();
            this.zzdt |= 1024;
            this.zzee = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzc zzcVar) {
            this.zzeg = zzcVar.zzv();
            this.zzdt |= 2048;
        }

        public static C0006zza zzs() {
            return zzeh.zzbil();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzbv zzbvVar = null;
            switch (zzbv.zzds[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0006zza(zzbvVar);
                case 3:
                    return zza(zzeh, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdt", "zzdu", "zzdv", "zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", zzb.class, "zzeg", zzc.zzw()});
                case 4:
                    return zzeh;
                case 5:
                    zzemm<zza> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zza.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzeh);
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
            zzeh = zzaVar;
            zzekq.zza((Class<zza>) zza.class, zzaVar);
        }
    }
}
