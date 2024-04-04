package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeec extends zzekq<zzeec, zza> implements zzemf {
    private static volatile zzemm<zzeec> zzei;
    private static final zzeec zzidd;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;
    private zzeeg zzidc;

    private zzeec() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeec, zza> implements zzemf {
        private zza() {
            super(zzeec.zzidd);
        }

        public final zza zzez(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeec) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzb(zzeeg zzeegVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeec) this.zzioz).zza(zzeegVar);
            return this;
        }

        public final zza zzv(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeec) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzeeb zzeebVar) {
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

    public final zzeeg zzbcf() {
        zzeeg zzeegVar = this.zzidc;
        return zzeegVar == null ? zzeeg.zzbcj() : zzeegVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzeeg zzeegVar) {
        zzeegVar.getClass();
        this.zzidc = zzeegVar;
    }

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public static zzeec zzi(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeec) zzekq.zza(zzidd, zzejgVar, zzekdVar);
    }

    public static zza zzbcg() {
        return zzidd.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeeb zzeebVar = null;
        switch (zzeeb.zzds[i - 1]) {
            case 1:
                return new zzeec();
            case 2:
                return new zza(zzeebVar);
            case 3:
                return zza(zzidd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zzidc", "zzick"});
            case 4:
                return zzidd;
            case 5:
                zzemm<zzeec> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeec.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidd);
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
        zzeec zzeecVar = new zzeec();
        zzidd = zzeecVar;
        zzekq.zza((Class<zzeec>) zzeec.class, zzeecVar);
    }
}
