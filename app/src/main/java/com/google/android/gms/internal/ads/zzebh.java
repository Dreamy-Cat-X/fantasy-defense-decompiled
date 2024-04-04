package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebh {
    public static final String zziat = new zzebk().getKeyType();
    public static final String zziau = new zzebr().getKeyType();
    private static final String zziav = new zzebw().getKeyType();
    private static final String zziaw = new zzebq().getKeyType();
    private static final String zziax = new zzecc().getKeyType();
    private static final String zziay = new zzecg().getKeyType();
    private static final String zziaz = new zzebx().getKeyType();
    private static final String zziba = new zzech().getKeyType();

    @Deprecated
    private static final zzegn zzibb;

    @Deprecated
    private static final zzegn zzibc;

    @Deprecated
    private static final zzegn zzibd;

    public static void zzbbd() throws GeneralSecurityException {
        zzedg.zzbbd();
        zzebb.zza((zzeam) new zzebk(), true);
        zzebb.zza((zzeam) new zzebq(), true);
        zzebb.zza((zzeam) new zzebr(), true);
        zzebw.zzbp(true);
        zzebb.zza((zzeam) new zzebx(), true);
        zzebb.zza((zzeam) new zzecc(), true);
        zzebb.zza((zzeam) new zzecg(), true);
        zzebb.zza((zzeam) new zzech(), true);
        zzebb.zza(new zzebg());
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
