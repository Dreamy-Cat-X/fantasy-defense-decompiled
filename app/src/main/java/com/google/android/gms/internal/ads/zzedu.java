package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedu extends zzekq<zzedu, zza> implements zzemf {
    private static volatile zzemm<zzedu> zzei;
    private static final zzedu zzicw;
    private zzedy zzicu;
    private zzefo zzicv;

    private zzedu() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedu, zza> implements zzemf {
        private zza() {
            super(zzedu.zzicw);
        }

        /* synthetic */ zza(zzedt zzedtVar) {
            this();
        }
    }

    public final zzedy zzbbt() {
        zzedy zzedyVar = this.zzicu;
        return zzedyVar == null ? zzedy.zzbca() : zzedyVar;
    }

    public final zzefo zzbbu() {
        zzefo zzefoVar = this.zzicv;
        return zzefoVar == null ? zzefo.zzbdv() : zzefoVar;
    }

    public static zzedu zzf(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzedu) zzekq.zza(zzicw, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzedt zzedtVar = null;
        switch (zzedt.zzds[i - 1]) {
            case 1:
                return new zzedu();
            case 2:
                return new zza(zzedtVar);
            case 3:
                return zza(zzicw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzicu", "zzicv"});
            case 4:
                return zzicw;
            case 5:
                zzemm<zzedu> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedu.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzicw);
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
        zzedu zzeduVar = new zzedu();
        zzicw = zzeduVar;
        zzekq.zza((Class<zzedu>) zzedu.class, zzeduVar);
    }
}
