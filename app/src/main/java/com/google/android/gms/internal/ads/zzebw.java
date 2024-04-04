package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebw extends zzeam<zzeel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebw() {
        super(zzeel.class, new zzebv(zzeaf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzefs.zza zzbao() {
        return zzefs.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final zzeap<?, zzeel> zzbar() {
        return new zzeby(this, zzeeo.class);
    }

    private static boolean zzbbe() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void zzbp(boolean z) throws GeneralSecurityException {
        if (zzbbe()) {
            zzebb.zza((zzeam) new zzebw(), true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ void zzc(zzeel zzeelVar) throws GeneralSecurityException {
        zzeel zzeelVar2 = zzeelVar;
        zzeik.zzz(zzeelVar2.getVersion(), 0);
        zzeik.zzfu(zzeelVar2.zzbbh().size());
    }

    @Override // com.google.android.gms.internal.ads.zzeam
    public final /* synthetic */ zzeel zzp(zzejg zzejgVar) throws zzeld {
        return zzeel.zzm(zzejgVar, zzekd.zzbhz());
    }
}
