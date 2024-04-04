package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzebg implements zzeaw<zzeaf, zzeaf> {
    private static final Logger logger = Logger.getLogger(zzebg.class.getName());

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final Class<zzeaf> zzbal() {
        return zzeaf.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static class zza implements zzeaf {
        private final zzeau<zzeaf> zzibe;

        private zza(zzeau<zzeaf> zzeauVar) {
            this.zzibe = zzeauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzeaf
        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzehd.zza(this.zzibe.zzbau().zzbaz(), this.zzibe.zzbau().zzbaw().zzc(bArr, bArr2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final Class<zzeaf> zzbav() {
        return zzeaf.class;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final /* synthetic */ zzeaf zza(zzeau<zzeaf> zzeauVar) throws GeneralSecurityException {
        return new zza(zzeauVar);
    }
}
