package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegd extends zzekq<zzegd, zzb> implements zzemf {
    private static volatile zzemm<zzegd> zzei;
    private static final zzegd zzigi;
    private int zziga;
    private zzela<zza> zzigh = zzbiq();

    private zzegd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq<zza, C0012zza> implements zzemf {
        private static volatile zzemm<zza> zzei;
        private static final zza zzigj;
        private String zzifc = "";
        private int zzift;
        private int zzige;
        private int zzigf;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzegd$zza$zza, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0012zza extends zzekq.zzb<zza, C0012zza> implements zzemf {
            private C0012zza() {
                super(zza.zzigj);
            }

            public final C0012zza zzhx(String str) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzhv(str);
                return this;
            }

            public final C0012zza zzb(zzeft zzeftVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zza(zzeftVar);
                return this;
            }

            public final C0012zza zzfo(int i) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zzfm(i);
                return this;
            }

            public final C0012zza zzb(zzegm zzegmVar) {
                if (this.zzipa) {
                    zzbiv();
                    this.zzipa = false;
                }
                ((zza) this.zzioz).zza(zzegmVar);
                return this;
            }

            /* synthetic */ C0012zza(zzegc zzegcVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzhv(String str) {
            str.getClass();
            this.zzifc = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzeft zzeftVar) {
            this.zzige = zzeftVar.zzv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzfm(int i) {
            this.zzigf = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzegm zzegmVar) {
            this.zzift = zzegmVar.zzv();
        }

        public static C0012zza zzbex() {
            return zzigj.zzbil();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zzegc zzegcVar = null;
            switch (zzegc.zzds[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0012zza(zzegcVar);
                case 3:
                    return zza(zzigj, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzifc", "zzige", "zzigf", "zzift"});
                case 4:
                    return zzigj;
                case 5:
                    zzemm<zza> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zza.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzigj);
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
            zzigj = zzaVar;
            zzekq.zza((Class<zza>) zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq.zzb<zzegd, zzb> implements zzemf {
        private zzb() {
            super(zzegd.zzigi);
        }

        public final zzb zzfn(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzegd) this.zzioz).zzfl(i);
            return this;
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzegd) this.zzioz).zza(zzaVar);
            return this;
        }

        /* synthetic */ zzb(zzegc zzegcVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfl(int i) {
        this.zziga = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzela<zza> zzelaVar = this.zzigh;
        if (!zzelaVar.zzbgh()) {
            this.zzigh = zzekq.zza(zzelaVar);
        }
        this.zzigh.add(zzaVar);
    }

    public static zzb zzbev() {
        return zzigi.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegc zzegcVar = null;
        switch (zzegc.zzds[i - 1]) {
            case 1:
                return new zzegd();
            case 2:
                return new zzb(zzegcVar);
            case 3:
                return zza(zzigi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zziga", "zzigh", zza.class});
            case 4:
                return zzigi;
            case 5:
                zzemm<zzegd> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegd.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzigi);
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
        zzegd zzegdVar = new zzegd();
        zzigi = zzegdVar;
        zzekq.zza((Class<zzegd>) zzegd.class, zzegdVar);
    }
}
