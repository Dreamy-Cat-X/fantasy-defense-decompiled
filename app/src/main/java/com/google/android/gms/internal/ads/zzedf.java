package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzedf extends zzeao<zzeas, zzefk> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedf(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzeao
    public final /* synthetic */ zzeas zzah(zzefk zzefkVar) throws GeneralSecurityException {
        zzefk zzefkVar2 = zzefkVar;
        zzefi zzbdx = zzefkVar2.zzbdr().zzbdx();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzefkVar2.zzbbh().toByteArray(), "HMAC");
        int zzbbm = zzefkVar2.zzbdr().zzbbm();
        int i = zzedh.zzicd[zzbdx.ordinal()];
        if (i == 1) {
            return new zzeig(new zzeie("HMACSHA1", secretKeySpec), zzbbm);
        }
        if (i == 2) {
            return new zzeig(new zzeie("HMACSHA256", secretKeySpec), zzbbm);
        }
        if (i == 3) {
            return new zzeig(new zzeie("HMACSHA512", secretKeySpec), zzbbm);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
