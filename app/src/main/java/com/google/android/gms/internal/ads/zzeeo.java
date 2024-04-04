package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeeo extends zzekq<zzeeo, zza> implements zzemf {
    private static volatile zzemm<zzeeo> zzei;
    private static final zzeeo zzidj;
    private int zzicj;
    private int zzicn;

    private zzeeo() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeeo, zza> implements zzemf {
        private zza() {
            super(zzeeo.zzidj);
        }

        /* synthetic */ zza(zzeen zzeenVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzicn;
    }

    public static zzeeo zzn(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeeo) zzekq.zza(zzidj, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeen zzeenVar = null;
        switch (zzeen.zzds[i - 1]) {
            case 1:
                return new zzeeo();
            case 2:
                return new zza(zzeenVar);
            case 3:
                return zza(zzidj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzicj", "zzicn"});
            case 4:
                return zzidj;
            case 5:
                zzemm<zzeeo> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeeo.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidj);
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
        zzeeo zzeeoVar = new zzeeo();
        zzidj = zzeeoVar;
        zzekq.zza((Class<zzeeo>) zzeeo.class, zzeeoVar);
    }
}
