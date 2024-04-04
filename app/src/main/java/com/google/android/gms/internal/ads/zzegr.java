package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegr extends zzekq<zzegr, zza> implements zzemf {
    private static volatile zzemm<zzegr> zzei;
    private static final zzegr zzihd;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;

    private zzegr() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzegr, zza> implements zzemf {
        private zza() {
            super(zzegr.zzihd);
        }

        public final zza zzfs(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzegr) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzah(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzegr) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzegq zzegqVar) {
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

    public static zzegr zzz(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzegr) zzekq.zza(zzihd, zzejgVar, zzekdVar);
    }

    public static zza zzbfp() {
        return zzihd.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegq zzegqVar = null;
        switch (zzegq.zzds[i - 1]) {
            case 1:
                return new zzegr();
            case 2:
                return new zza(zzegqVar);
            case 3:
                return zza(zzihd, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzihd;
            case 5:
                zzemm<zzegr> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegr.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzihd);
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
        zzegr zzegrVar = new zzegr();
        zzihd = zzegrVar;
        zzekq.zza((Class<zzegr>) zzegr.class, zzegrVar);
    }
}
