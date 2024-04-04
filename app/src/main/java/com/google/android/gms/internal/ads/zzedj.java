package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
class zzedj implements zzeaw<zzeas, zzeas> {
    private static final Logger logger = Logger.getLogger(zzedj.class.getName());

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final Class<zzeas> zzbal() {
        return zzeas.class;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final Class<zzeas> zzbav() {
        return zzeas.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static class zza implements zzeas {
        private final zzeau<zzeas> zzibx;
        private final byte[] zzici;

        private zza(zzeau<zzeas> zzeauVar) {
            this.zzici = new byte[]{0};
            this.zzibx = zzeauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzeas
        public final byte[] zzk(byte[] bArr) throws GeneralSecurityException {
            if (this.zzibx.zzbau().zzbay().equals(zzegm.LEGACY)) {
                return zzehd.zza(this.zzibx.zzbau().zzbaz(), this.zzibx.zzbau().zzbaw().zzk(zzehd.zza(bArr, this.zzici)));
            }
            return zzehd.zza(this.zzibx.zzbau().zzbaz(), this.zzibx.zzbau().zzbaw().zzk(bArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final /* synthetic */ zzeas zza(zzeau<zzeas> zzeauVar) throws GeneralSecurityException {
        return new zza(zzeauVar);
    }
}
