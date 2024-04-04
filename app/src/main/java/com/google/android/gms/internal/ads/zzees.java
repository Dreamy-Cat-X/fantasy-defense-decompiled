package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzees extends zzekq<zzees, zza> implements zzemf {
    private static volatile zzemm<zzees> zzei;
    private static final zzees zzidl;

    private zzees() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzees, zza> implements zzemf {
        private zza() {
            super(zzees.zzidl);
        }

        /* synthetic */ zza(zzeer zzeerVar) {
            this();
        }
    }

    public static zzees zzp(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzees) zzekq.zza(zzidl, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeer zzeerVar = null;
        switch (zzeer.zzds[i - 1]) {
            case 1:
                return new zzees();
            case 2:
                return new zza(zzeerVar);
            case 3:
                return zza(zzidl, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzidl;
            case 5:
                zzemm<zzees> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzees.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidl);
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
        zzees zzeesVar = new zzees();
        zzidl = zzeesVar;
        zzekq.zza((Class<zzees>) zzees.class, zzeesVar);
    }
}
