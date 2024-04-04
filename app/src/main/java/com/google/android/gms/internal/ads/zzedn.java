package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedn extends zzekq<zzedn, zza> implements zzemf {
    private static volatile zzemm<zzedn> zzei;
    private static final zzedn zzico;
    private zzedq zzicl;
    private int zzicn;

    private zzedn() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedn, zza> implements zzemf {
        private zza() {
            super(zzedn.zzico);
        }

        /* synthetic */ zza(zzedo zzedoVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzicn;
    }

    public final zzedq zzbbi() {
        zzedq zzedqVar = this.zzicl;
        return zzedqVar == null ? zzedq.zzbbn() : zzedqVar;
    }

    public static zzedn zzd(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzedn) zzekq.zza(zzico, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzedo zzedoVar = null;
        switch (zzedo.zzds[i - 1]) {
            case 1:
                return new zzedn();
            case 2:
                return new zza(zzedoVar);
            case 3:
                return zza(zzico, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzicn", "zzicl"});
            case 4:
                return zzico;
            case 5:
                zzemm<zzedn> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedn.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzico);
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
        zzedn zzednVar = new zzedn();
        zzico = zzednVar;
        zzekq.zza((Class<zzedn>) zzedn.class, zzednVar);
    }
}
