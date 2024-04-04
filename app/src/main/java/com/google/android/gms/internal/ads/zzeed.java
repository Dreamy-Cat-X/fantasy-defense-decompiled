package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeed extends zzekq<zzeed, zza> implements zzemf {
    private static volatile zzemm<zzeed> zzei;
    private static final zzeed zzide;
    private int zzicn;
    private zzeeg zzidc;

    private zzeed() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeed, zza> implements zzemf {
        private zza() {
            super(zzeed.zzide);
        }

        /* synthetic */ zza(zzeee zzeeeVar) {
            this();
        }
    }

    public final zzeeg zzbcf() {
        zzeeg zzeegVar = this.zzidc;
        return zzeegVar == null ? zzeeg.zzbcj() : zzeegVar;
    }

    public final int getKeySize() {
        return this.zzicn;
    }

    public static zzeed zzj(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeed) zzekq.zza(zzide, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeee zzeeeVar = null;
        switch (zzeee.zzds[i - 1]) {
            case 1:
                return new zzeed();
            case 2:
                return new zza(zzeeeVar);
            case 3:
                return zza(zzide, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzidc", "zzicn"});
            case 4:
                return zzide;
            case 5:
                zzemm<zzeed> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeed.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzide);
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
        zzeed zzeedVar = new zzeed();
        zzide = zzeedVar;
        zzekq.zza((Class<zzeed>) zzeed.class, zzeedVar);
    }
}
