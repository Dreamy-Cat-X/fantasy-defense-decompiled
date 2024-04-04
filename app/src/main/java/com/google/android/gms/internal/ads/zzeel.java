package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeel extends zzekq<zzeel, zza> implements zzemf {
    private static volatile zzemm<zzeel> zzei;
    private static final zzeel zzidi;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;

    private zzeel() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeel, zza> implements zzemf {
        private zza() {
            super(zzeel.zzidi);
        }

        public final zza zzfb(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeel) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzx(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeel) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzeem zzeemVar) {
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

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public static zzeel zzm(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeel) zzekq.zza(zzidi, zzejgVar, zzekdVar);
    }

    public static zza zzbco() {
        return zzidi.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeem zzeemVar = null;
        switch (zzeem.zzds[i - 1]) {
            case 1:
                return new zzeel();
            case 2:
                return new zza(zzeemVar);
            case 3:
                return zza(zzidi, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzidi;
            case 5:
                zzemm<zzeel> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeel.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidi);
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
        zzeel zzeelVar = new zzeel();
        zzidi = zzeelVar;
        zzekq.zza((Class<zzeel>) zzeel.class, zzeelVar);
    }
}
