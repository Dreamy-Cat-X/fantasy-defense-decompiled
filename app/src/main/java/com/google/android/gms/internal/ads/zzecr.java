package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzecr {
    private static final String zzibv = new zzecp().getKeyType();
    private static final String zzibw = new zzeco().getKeyType();

    @Deprecated
    public static final zzegn zzibb = zzegn.zzbfn();

    @Deprecated
    private static final zzegn zzibc = zzegn.zzbfn();

    @Deprecated
    private static final zzegn zzibd = zzegn.zzbfn();

    static {
        try {
            zzebh.zzbbd();
            zzebb.zza((zzeay) new zzeco(), (zzeam) new zzecp(), true);
            zzebb.zza(new zzect());
            zzebb.zza(new zzecu());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
