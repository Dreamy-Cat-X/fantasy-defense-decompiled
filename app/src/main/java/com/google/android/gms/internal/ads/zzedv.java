package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedv extends zzekq<zzedv, zza> implements zzemf {
    private static volatile zzemm<zzedv> zzei;
    private static final zzedv zzicy;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;
    private zzedz zzicx;

    private zzedv() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedv, zza> implements zzemf {
        private zza() {
            super(zzedv.zzicy);
        }

        public final zza zzey(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedv) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzc(zzedz zzedzVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedv) this.zzioz).zzb(zzedzVar);
            return this;
        }

        public final zza zzu(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedv) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzedw zzedwVar) {
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

    public final zzedz zzbbw() {
        zzedz zzedzVar = this.zzicx;
        return zzedzVar == null ? zzedz.zzbcd() : zzedzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzedz zzedzVar) {
        zzedzVar.getClass();
        this.zzicx = zzedzVar;
    }

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public static zzedv zzg(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzedv) zzekq.zza(zzicy, zzejgVar, zzekdVar);
    }

    public static zza zzbbx() {
        return zzicy.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzedw zzedwVar = null;
        switch (zzedw.zzds[i - 1]) {
            case 1:
                return new zzedv();
            case 2:
                return new zza(zzedwVar);
            case 3:
                return zza(zzicy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zzicx", "zzick"});
            case 4:
                return zzicy;
            case 5:
                zzemm<zzedv> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedv.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzicy);
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

    public static zzedv zzbby() {
        return zzicy;
    }

    static {
        zzedv zzedvVar = new zzedv();
        zzicy = zzedvVar;
        zzekq.zza((Class<zzedv>) zzedv.class, zzedvVar);
    }
}
