package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedq extends zzekq<zzedq, zza> implements zzemf {
    private static volatile zzemm<zzedq> zzei;
    private static final zzedq zzicq;
    private int zzicp;

    private zzedq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzedq, zza> implements zzemf {
        private zza() {
            super(zzedq.zzicq);
        }

        /* synthetic */ zza(zzedp zzedpVar) {
            this();
        }
    }

    public final int zzbbm() {
        return this.zzicp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzedp zzedpVar = null;
        switch (zzedp.zzds[i - 1]) {
            case 1:
                return new zzedq();
            case 2:
                return new zza(zzedpVar);
            case 3:
                return zza(zzicq, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzicp"});
            case 4:
                return zzicq;
            case 5:
                zzemm<zzedq> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzedq.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzicq);
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

    public static zzedq zzbbn() {
        return zzicq;
    }

    static {
        zzedq zzedqVar = new zzedq();
        zzicq = zzedqVar;
        zzekq.zza((Class<zzedq>) zzedq.class, zzedqVar);
    }
}
