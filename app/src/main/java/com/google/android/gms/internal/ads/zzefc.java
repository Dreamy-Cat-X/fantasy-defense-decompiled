package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefc extends zzekq<zzefc, zza> implements zzemf {
    private static volatile zzemm<zzefc> zzei;
    private static final zzefc zzieb;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;
    private zzefd zziea;

    private zzefc() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefc, zza> implements zzemf {
        private zza() {
            super(zzefc.zzieb);
        }

        public final zza zzfe(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefc) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzb(zzefd zzefdVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefc) this.zzioz).zza(zzefdVar);
            return this;
        }

        public final zza zzab(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefc) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzefb zzefbVar) {
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

    public final zzefd zzbde() {
        zzefd zzefdVar = this.zziea;
        return zzefdVar == null ? zzefd.zzbdk() : zzefdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzefd zzefdVar) {
        zzefdVar.getClass();
        this.zziea = zzefdVar;
    }

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public static zzefc zzr(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzefc) zzekq.zza(zzieb, zzejgVar, zzekdVar);
    }

    public static zza zzbdf() {
        return zzieb.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefb zzefbVar = null;
        switch (zzefb.zzds[i - 1]) {
            case 1:
                return new zzefc();
            case 2:
                return new zza(zzefbVar);
            case 3:
                return zza(zzieb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zziea", "zzick"});
            case 4:
                return zzieb;
            case 5:
                zzemm<zzefc> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefc.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzieb);
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
        zzefc zzefcVar = new zzefc();
        zzieb = zzefcVar;
        zzekq.zza((Class<zzefc>) zzefc.class, zzefcVar);
    }
}
