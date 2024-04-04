package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedz extends zzekq<zzedz, zza> implements zzemf {
    private static volatile zzemm<zzedz> zzei;
    private static final zzedz zzidb;
    private int zzida;

    private zzedz() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedz, zza> implements zzemf {
        private zza() {
            super(zzedz.zzidb);
        }

        /* synthetic */ zza(zzeea zzeeaVar) {
            this();
        }
    }

    public final int zzbcc() {
        return this.zzida;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeea zzeeaVar = null;
        switch (zzeea.zzds[i - 1]) {
            case 1:
                return new zzedz();
            case 2:
                return new zza(zzeeaVar);
            case 3:
                return zza(zzidb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzida"});
            case 4:
                return zzidb;
            case 5:
                zzemm<zzedz> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedz.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidb);
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

    public static zzedz zzbcd() {
        return zzidb;
    }

    static {
        zzedz zzedzVar = new zzedz();
        zzidb = zzedzVar;
        zzekq.zza((Class<zzedz>) zzedz.class, zzedzVar);
    }
}
