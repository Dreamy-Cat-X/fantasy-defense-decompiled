package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeez extends zzekq<zzeez, zza> implements zzemf {
    private static volatile zzemm<zzeez> zzei;
    private static final zzeez zzidz;
    private zzefg zzidw;
    private zzeeu zzidx;
    private int zzidy;

    private zzeez() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeez, zza> implements zzemf {
        private zza() {
            super(zzeez.zzidz);
        }

        /* synthetic */ zza(zzefa zzefaVar) {
            this();
        }
    }

    public final zzefg zzbcz() {
        zzefg zzefgVar = this.zzidw;
        return zzefgVar == null ? zzefg.zzbdp() : zzefgVar;
    }

    public final zzeeu zzbda() {
        zzeeu zzeeuVar = this.zzidx;
        return zzeeuVar == null ? zzeeu.zzbcv() : zzeeuVar;
    }

    public final zzeet zzbdb() {
        zzeet zzfd = zzeet.zzfd(this.zzidy);
        return zzfd == null ? zzeet.UNRECOGNIZED : zzfd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefa zzefaVar = null;
        switch (zzefa.zzds[i - 1]) {
            case 1:
                return new zzeez();
            case 2:
                return new zza(zzefaVar);
            case 3:
                return zza(zzidz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzidw", "zzidx", "zzidy"});
            case 4:
                return zzidz;
            case 5:
                zzemm<zzeez> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeez.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidz);
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

    public static zzeez zzbdc() {
        return zzidz;
    }

    static {
        zzeez zzeezVar = new zzeez();
        zzidz = zzeezVar;
        zzekq.zza((Class<zzeez>) zzeez.class, zzeezVar);
    }
}
