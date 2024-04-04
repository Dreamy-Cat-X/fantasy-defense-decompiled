package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedy extends zzekq<zzedy, zza> implements zzemf {
    private static volatile zzemm<zzedy> zzei;
    private static final zzedy zzicz;
    private int zzicn;
    private zzedz zzicx;

    private zzedy() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedy, zza> implements zzemf {
        private zza() {
            super(zzedy.zzicz);
        }

        /* synthetic */ zza(zzedx zzedxVar) {
            this();
        }
    }

    public final zzedz zzbbw() {
        zzedz zzedzVar = this.zzicx;
        return zzedzVar == null ? zzedz.zzbcd() : zzedzVar;
    }

    public final int getKeySize() {
        return this.zzicn;
    }

    public static zzedy zzh(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzedy) zzekq.zza(zzicz, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzedx zzedxVar = null;
        switch (zzedx.zzds[i - 1]) {
            case 1:
                return new zzedy();
            case 2:
                return new zza(zzedxVar);
            case 3:
                return zza(zzicz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzicx", "zzicn"});
            case 4:
                return zzicz;
            case 5:
                zzemm<zzedy> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedy.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzicz);
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

    public static zzedy zzbca() {
        return zzicz;
    }

    static {
        zzedy zzedyVar = new zzedy();
        zzicz = zzedyVar;
        zzekq.zza((Class<zzedy>) zzedy.class, zzedyVar);
    }
}
