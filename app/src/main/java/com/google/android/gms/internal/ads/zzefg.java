package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzefg extends zzekq<zzefg, zza> implements zzemf {
    private static volatile zzemm<zzefg> zzei;
    private static final zzefg zziei;
    private int zzief;
    private int zzieg;
    private zzejg zzieh = zzejg.zzikj;

    private zzefg() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzefg, zza> implements zzemf {
        private zza() {
            super(zzefg.zziei);
        }

        /* synthetic */ zza(zzeff zzeffVar) {
            this();
        }
    }

    public final zzefh zzbdm() {
        zzefh zzfg = zzefh.zzfg(this.zzief);
        return zzfg == null ? zzefh.UNRECOGNIZED : zzfg;
    }

    public final zzefi zzbdn() {
        zzefi zzfh = zzefi.zzfh(this.zzieg);
        return zzfh == null ? zzefi.UNRECOGNIZED : zzfh;
    }

    public final zzejg zzbdo() {
        return this.zzieh;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeff zzeffVar = null;
        switch (zzeff.zzds[i - 1]) {
            case 1:
                return new zzefg();
            case 2:
                return new zza(zzeffVar);
            case 3:
                return zza(zziei, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzief", "zzieg", "zzieh"});
            case 4:
                return zziei;
            case 5:
                zzemm<zzefg> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzefg.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zziei);
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

    public static zzefg zzbdp() {
        return zziei;
    }

    static {
        zzefg zzefgVar = new zzefg();
        zziei = zzefgVar;
        zzekq.zza((Class<zzefg>) zzefg.class, zzefgVar);
    }
}
