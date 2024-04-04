package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefp extends zzekq<zzefp, zza> implements zzemf {
    private static volatile zzemm<zzefp> zzei;
    private static final zzefp zzifb;
    private int zzicp;
    private int zzifa;

    private zzefp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefp, zza> implements zzemf {
        private zza() {
            super(zzefp.zzifb);
        }

        /* synthetic */ zza(zzefq zzefqVar) {
            this();
        }
    }

    public final zzefi zzbdx() {
        zzefi zzfh = zzefi.zzfh(this.zzifa);
        return zzfh == null ? zzefi.UNRECOGNIZED : zzfh;
    }

    public final int zzbbm() {
        return this.zzicp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefq zzefqVar = null;
        switch (zzefq.zzds[i - 1]) {
            case 1:
                return new zzefp();
            case 2:
                return new zza(zzefqVar);
            case 3:
                return zza(zzifb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzifa", "zzicp"});
            case 4:
                return zzifb;
            case 5:
                zzemm<zzefp> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefp.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzifb);
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

    public static zzefp zzbdy() {
        return zzifb;
    }

    static {
        zzefp zzefpVar = new zzefp();
        zzifb = zzefpVar;
        zzekq.zza((Class<zzefp>) zzefp.class, zzefpVar);
    }
}
