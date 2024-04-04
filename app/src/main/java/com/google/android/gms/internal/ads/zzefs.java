package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefs extends zzekq<zzefs, zzb> implements zzemf {
    private static volatile zzemm<zzefs> zzei;
    private static final zzefs zziff;
    private String zzifc = "";
    private zzejg zzifd = zzejg.zzikj;
    private int zzife;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum zza implements zzekv {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private static final zzeku<zza> zzep = new zzefu();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzekv
        public final int zzv() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static zza zzfj(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zzv());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzefs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq.zzb<zzefs, zzb> implements zzemf {
        private zzb() {
            super(zzefs.zziff);
        }

        public final zzb zzhw(String str) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefs) this.zzioz).zzhv(str);
            return this;
        }

        public final zzb zzag(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefs) this.zzioz).zzaf(zzejgVar);
            return this;
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefs) this.zzioz).zza(zzaVar);
            return this;
        }

        /* synthetic */ zzb(zzefr zzefrVar) {
            this();
        }
    }

    public final String zzbea() {
        return this.zzifc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzhv(String str) {
        str.getClass();
        this.zzifc = str;
    }

    public final zzejg zzbeb() {
        return this.zzifd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzifd = zzejgVar;
    }

    public final zza zzbec() {
        zza zzfj = zza.zzfj(this.zzife);
        return zzfj == null ? zza.UNRECOGNIZED : zzfj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzife = zzaVar.zzv();
    }

    public static zzb zzbed() {
        return zziff.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefr zzefrVar = null;
        switch (zzefr.zzds[i - 1]) {
            case 1:
                return new zzefs();
            case 2:
                return new zzb(zzefrVar);
            case 3:
                return zza(zziff, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzifc", "zzifd", "zzife"});
            case 4:
                return zziff;
            case 5:
                zzemm<zzefs> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefs.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zziff);
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

    public static zzefs zzbee() {
        return zziff;
    }

    static {
        zzefs zzefsVar = new zzefs();
        zziff = zzefsVar;
        zzekq.zza((Class<zzefs>) zzefs.class, zzefsVar);
    }
}
