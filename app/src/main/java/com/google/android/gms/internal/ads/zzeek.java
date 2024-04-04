package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeek extends zzekq<zzeek, zza> implements zzemf {
    private static volatile zzemm<zzeek> zzei;
    private static final zzeek zzidh;
    private int zzicj;
    private int zzicn;

    private zzeek() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeek, zza> implements zzemf {
        private zza() {
            super(zzeek.zzidh);
        }

        /* synthetic */ zza(zzeej zzeejVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzicn;
    }

    public static zzeek zzl(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeek) zzekq.zza(zzidh, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeej zzeejVar = null;
        switch (zzeej.zzds[i - 1]) {
            case 1:
                return new zzeek();
            case 2:
                return new zza(zzeejVar);
            case 3:
                return zza(zzidh, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzicn", "zzicj"});
            case 4:
                return zzidh;
            case 5:
                zzemm<zzeek> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeek.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidh);
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
        zzeek zzeekVar = new zzeek();
        zzidh = zzeekVar;
        zzekq.zza((Class<zzeek>) zzeek.class, zzeekVar);
    }
}
