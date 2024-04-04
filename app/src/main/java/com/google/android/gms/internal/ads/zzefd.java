package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefd extends zzekq<zzefd, zza> implements zzemf {
    private static volatile zzemm<zzefd> zzei;
    private static final zzefd zziee;
    private int zzicj;
    private zzeez zzidu;
    private zzejg zziec = zzejg.zzikj;
    private zzejg zzied = zzejg.zzikj;

    private zzefd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefd, zza> implements zzemf {
        private zza() {
            super(zzefd.zziee);
        }

        public final zza zzff(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefd) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzc(zzeez zzeezVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefd) this.zzioz).zzb(zzeezVar);
            return this;
        }

        public final zza zzac(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefd) this.zzioz).zzz(zzejgVar);
            return this;
        }

        public final zza zzad(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefd) this.zzioz).zzaa(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzefe zzefeVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzicj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzicj = i;
    }

    public final zzeez zzbcx() {
        zzeez zzeezVar = this.zzidu;
        return zzeezVar == null ? zzeez.zzbdc() : zzeezVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzeez zzeezVar) {
        zzeezVar.getClass();
        this.zzidu = zzeezVar;
    }

    public final zzejg zzbdh() {
        return this.zziec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzz(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zziec = zzejgVar;
    }

    public final zzejg zzbdi() {
        return this.zzied;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzied = zzejgVar;
    }

    public static zzefd zzs(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzefd) zzekq.zza(zziee, zzejgVar, zzekdVar);
    }

    public static zza zzbdj() {
        return zziee.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefe zzefeVar = null;
        switch (zzefe.zzds[i - 1]) {
            case 1:
                return new zzefd();
            case 2:
                return new zza(zzefeVar);
            case 3:
                return zza(zziee, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzicj", "zzidu", "zziec", "zzied"});
            case 4:
                return zziee;
            case 5:
                zzemm<zzefd> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefd.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zziee);
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

    public static zzefd zzbdk() {
        return zziee;
    }

    static {
        zzefd zzefdVar = new zzefd();
        zziee = zzefdVar;
        zzekq.zza((Class<zzefd>) zzefd.class, zzefdVar);
    }
}
