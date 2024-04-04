package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefo extends zzekq<zzefo, zza> implements zzemf {
    private static volatile zzemm<zzefo> zzei;
    private static final zzefo zziez;
    private int zzicj;
    private int zzicn;
    private zzefp zziex;

    private zzefo() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefo, zza> implements zzemf {
        private zza() {
            super(zzefo.zziez);
        }

        /* synthetic */ zza(zzefn zzefnVar) {
            this();
        }
    }

    public final zzefp zzbdr() {
        zzefp zzefpVar = this.zziex;
        return zzefpVar == null ? zzefp.zzbdy() : zzefpVar;
    }

    public final int getKeySize() {
        return this.zzicn;
    }

    public static zzefo zzu(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzefo) zzekq.zza(zziez, zzejgVar, zzekdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzefn zzefnVar = null;
        switch (zzefn.zzds[i - 1]) {
            case 1:
                return new zzefo();
            case 2:
                return new zza(zzefnVar);
            case 3:
                return zza(zziez, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zziex", "zzicn", "zzicj"});
            case 4:
                return zziez;
            case 5:
                zzemm<zzefo> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefo.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zziez);
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

    public static zzefo zzbdv() {
        return zziez;
    }

    static {
        zzefo zzefoVar = new zzefo();
        zziez = zzefoVar;
        zzekq.zza((Class<zzefo>) zzefo.class, zzefoVar);
    }
}
