package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzegn extends zzekq<zzegn, zza> implements zzemf {
    private static volatile zzemm<zzegn> zzei;
    private static final zzegn zzihc;
    private String zziha = "";
    private zzela<zzefz> zzihb = zzbiq();

    private zzegn() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzegn, zza> implements zzemf {
        private zza() {
            super(zzegn.zzihc);
        }

        /* synthetic */ zza(zzegp zzegpVar) {
            this();
        }
    }

    public final List<zzefz> zzbfm() {
        return this.zzihb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegp zzegpVar = null;
        switch (zzegp.zzds[i - 1]) {
            case 1:
                return new zzegn();
            case 2:
                return new zza(zzegpVar);
            case 3:
                return zza(zzihc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zziha", "zzihb", zzefz.class});
            case 4:
                return zzihc;
            case 5:
                zzemm<zzegn> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegn.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzihc);
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

    public static zzegn zzbfn() {
        return zzihc;
    }

    static {
        zzegn zzegnVar = new zzegn();
        zzihc = zzegnVar;
        zzekq.zza((Class<zzegn>) zzegn.class, zzegnVar);
    }
}
