package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedr extends zzekq<zzedr, zza> implements zzemf {
    private static volatile zzemm<zzedr> zzei;
    private static final zzedr zzict;
    private int zzicj;
    private zzedv zzicr;
    private zzefk zzics;

    private zzedr() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedr, zza> implements zzemf {
        private zza() {
            super(zzedr.zzict);
        }

        public final zza zzex(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedr) this.zzioz).setVersion(i);
            return this;
        }

        public final zza zzc(zzedv zzedvVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedr) this.zzioz).zzb(zzedvVar);
            return this;
        }

        public final zza zzc(zzefk zzefkVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedr) this.zzioz).zzb(zzefkVar);
            return this;
        }

        /* synthetic */ zza(zzeds zzedsVar) {
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

    public final zzedv zzbbp() {
        zzedv zzedvVar = this.zzicr;
        return zzedvVar == null ? zzedv.zzbby() : zzedvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzedv zzedvVar) {
        zzedvVar.getClass();
        this.zzicr = zzedvVar;
    }

    public final zzefk zzbbq() {
        zzefk zzefkVar = this.zzics;
        return zzefkVar == null ? zzefk.zzbdt() : zzefkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzefk zzefkVar) {
        zzefkVar.getClass();
        this.zzics = zzefkVar;
    }

    public static zzedr zze(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzedr) zzekq.zza(zzict, zzejgVar, zzekdVar);
    }

    public static zza zzbbr() {
        return zzict.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeds zzedsVar = null;
        switch (zzeds.zzds[i - 1]) {
            case 1:
                return new zzedr();
            case 2:
                return new zza(zzedsVar);
            case 3:
                return zza(zzict, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzicj", "zzicr", "zzics"});
            case 4:
                return zzict;
            case 5:
                zzemm<zzedr> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedr.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzict);
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
        zzedr zzedrVar = new zzedr();
        zzict = zzedrVar;
        zzekq.zza((Class<zzedr>) zzedr.class, zzedrVar);
    }
}
