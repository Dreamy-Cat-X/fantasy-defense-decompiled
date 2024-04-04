package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedg {

    @Deprecated
    private static final zzegn zzibb;

    @Deprecated
    private static final zzegn zzibc;

    @Deprecated
    private static final zzegn zzibd;
    private static final String zzich = new zzedc().getKeyType();

    public static void zzbbd() throws GeneralSecurityException {
        zzebb.zza((zzeam) new zzedc(), true);
        zzebb.zza((zzeam) new zzedb(), true);
        zzebb.zza(new zzedj());
    }

    static {
        zzegn zzbfn = zzegn.zzbfn();
        zzibb = zzbfn;
        zzibc = zzbfn;
        zzibd = zzbfn;
        try {
            zzbbd();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
