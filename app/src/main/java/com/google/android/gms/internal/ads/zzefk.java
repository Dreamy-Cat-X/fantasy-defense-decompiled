package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefk extends zzekq<zzefk, zza> implements zzemf {
    private static volatile zzemm<zzefk> zzei;
    private static final zzefk zziey;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;
    private zzefp zziex;

    private zzefk() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefk, zza> implements zzemf {
        private zza() {
            super(zzefk.zziey);
        }

        public final zza zzfi(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefk) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzd(zzefp zzefpVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefk) this.zzioz).zzc(zzefpVar);
            return this;
        }

        public final zza zzae(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzefk) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzefm zzefmVar) {
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

    public final zzefp zzbdr() {
        zzefp zzefpVar = this.zziex;
        return zzefpVar == null ? zzefp.zzbdy() : zzefpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzefp zzefpVar) {
        zzefpVar.getClass();
        this.zziex = zzefpVar;
    }

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public static zzefk zzt(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzefk) zzekq.zza(zziey, zzejgVar, zzekdVar);
    }

    public static zza zzbds() {
        return zziey.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefm zzefmVar = null;
        switch (zzefm.zzds[i - 1]) {
            case 1:
                return new zzefk();
            case 2:
                return new zza(zzefmVar);
            case 3:
                return zza(zziey, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzicj", "zziex", "zzick"});
            case 4:
                return zziey;
            case 5:
                zzemm<zzefk> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefk.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zziey);
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

    public static zzefk zzbdt() {
        return zziey;
    }

    static {
        zzefk zzefkVar = new zzefk();
        zziey = zzefkVar;
        zzekq.zza((Class<zzefk>) zzefk.class, zzefkVar);
    }
}
