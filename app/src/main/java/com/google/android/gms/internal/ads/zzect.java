package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzect implements zzeaw<zzeaj, zzeaj> {
    private static final Logger logger = Logger.getLogger(zzect.class.getName());

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static class zza implements zzeaj {
        private final zzeau<zzeaj> zzibx;

        public zza(zzeau<zzeaj> zzeauVar) {
            this.zzibx = zzeauVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final Class<zzeaj> zzbal() {
        return zzeaj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final Class<zzeaj> zzbav() {
        return zzeaj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final /* synthetic */ zzeaj zza(zzeau<zzeaj> zzeauVar) throws GeneralSecurityException {
        return new zza(zzeauVar);
    }
}
