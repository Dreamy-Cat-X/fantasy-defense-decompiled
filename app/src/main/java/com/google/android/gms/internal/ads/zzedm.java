package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedm extends zzekq<zzedm, zza> implements zzemf {
    private static volatile zzemm<zzedm> zzei;
    private static final zzedm zzicm;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;
    private zzedq zzicl;

    private zzedm() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedm, zza> implements zzemf {
        private zza() {
            super(zzedm.zzicm);
        }

        public final zza zzew(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedm) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzt(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedm) this.zzioz).zzs(zzejgVar);
            return this;
        }

        public final zza zzd(zzedq zzedqVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzedm) this.zzioz).zzc(zzedqVar);
            return this;
        }

        /* synthetic */ zza(zzedl zzedlVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzicj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzicj = 0;
    }

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public final zzedq zzbbi() {
        zzedq zzedqVar = this.zzicl;
        return zzedqVar == null ? zzedq.zzbbn() : zzedqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzedq zzedqVar) {
        zzedqVar.getClass();
        this.zzicl = zzedqVar;
    }

    public static zzedm zzc(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzedm) zzekq.zza(zzicm, zzejgVar, zzekdVar);
    }

    public static zza zzbbj() {
        return zzicm.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzedl zzedlVar = null;
        switch (zzedl.zzds[i - 1]) {
            case 1:
                return new zzedm();
            case 2:
                return new zza(zzedlVar);
            case 3:
                return zza(zzicm, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzicj", "zzick", "zzicl"});
            case 4:
                return zzicm;
            case 5:
                zzemm<zzedm> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedm.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzicm);
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
        zzedm zzedmVar = new zzedm();
        zzicm = zzedmVar;
        zzekq.zza((Class<zzedm>) zzedm.class, zzedmVar);
    }
}
