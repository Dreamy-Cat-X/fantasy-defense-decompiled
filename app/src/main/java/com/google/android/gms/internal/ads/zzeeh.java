package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeeh extends zzekq<zzeeh, zza> implements zzemf {
    private static volatile zzemm<zzeeh> zzei;
    private static final zzeeh zzidg;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;

    private zzeeh() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeeh, zza> implements zzemf {
        private zza() {
            super(zzeeh.zzidg);
        }

        public final zza zzfa(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeeh) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzw(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeeh) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzeei zzeeiVar) {
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

    public static zzeeh zzk(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeeh) zzekq.zza(zzidg, zzejgVar, zzekdVar);
    }

    public static zza zzbcl() {
        return zzidg.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeei zzeeiVar = null;
        switch (zzeei.zzds[i - 1]) {
            case 1:
                return new zzeeh();
            case 2:
                return new zza(zzeeiVar);
            case 3:
                return zza(zzidg, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzidg;
            case 5:
                zzemm<zzeeh> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeeh.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidg);
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
        zzeeh zzeehVar = new zzeeh();
        zzidg = zzeehVar;
        zzekq.zza((Class<zzeeh>) zzeeh.class, zzeehVar);
    }
}
