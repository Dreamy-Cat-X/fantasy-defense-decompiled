package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzedc extends zzeam<zzefk> {
    public zzedc() {
        super(zzefk.class, new zzedf(zzeas.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    public static void zza(zzefk zzefkVar) throws GeneralSecurityException {
        zzeik.zzz(zzefkVar.getVersion(), 0);
        if (zzefkVar.zzbbh().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzefkVar.zzbdr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzefp zzefpVar) throws GeneralSecurityException {
        if (zzefpVar.zzbbm() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = zzedh.zzicd[zzefpVar.zzbdx().ordinal()];
        if (i == 1) {
            if (zzefpVar.zzbbm() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (zzefpVar.zzbbm() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i == 3) {
                if (zzefpVar.zzbbm() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzefk> zzbar() {
        return new zzede(this, zzefo.class);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzefk zzefkVar) throws GeneralSecurityException {
        zza(zzefkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzefk zzp(zzejg zzejgVar) throws zzeld {
        return zzefk.zzt(zzejgVar, zzekd.zzbhz());
    }
}
