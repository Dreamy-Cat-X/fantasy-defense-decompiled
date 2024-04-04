package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzecy implements zzehg {
    private final String zziby;
    private final int zzibz;
    private zzeeh zzica;
    private zzedr zzicb;
    private int zzicc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecy(zzefv zzefvVar) throws GeneralSecurityException {
        String zzbea = zzefvVar.zzbea();
        this.zziby = zzbea;
        if (zzbea.equals(zzebh.zziau)) {
            try {
                zzeek zzl = zzeek.zzl(zzefvVar.zzbeb(), zzekd.zzbhz());
                this.zzica = (zzeeh) zzebb.zzb(zzefvVar);
                this.zzibz = zzl.getKeySize();
                return;
            } catch (zzeld e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (this.zziby.equals(zzebh.zziat)) {
            try {
                zzedu zzf = zzedu.zzf(zzefvVar.zzbeb(), zzekd.zzbhz());
                this.zzicb = (zzedr) zzebb.zzb(zzefvVar);
                this.zzicc = zzf.zzbbt().getKeySize();
                this.zzibz = this.zzicc + zzf.zzbbu().getKeySize();
                return;
            } catch (zzeld e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        String valueOf = String.valueOf(this.zziby);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
    }

    @Override // com.google.android.gms.internal.ads.zzehg
    public final int zzbbg() {
        return this.zzibz;
    }

    @Override // com.google.android.gms.internal.ads.zzehg
    public final zzeaf zzm(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzibz) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zziby.equals(zzebh.zziau)) {
            return (zzeaf) zzebb.zza(this.zziby, (zzeeh) ((zzekq) zzeeh.zzbcl().zza(this.zzica).zzw(zzejg.zzi(bArr, 0, this.zzibz)).zzbiz()), zzeaf.class);
        }
        if (this.zziby.equals(zzebh.zziat)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzicc);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzicc, this.zzibz);
            zzedv zzedvVar = (zzedv) ((zzekq) zzedv.zzbbx().zza(this.zzicb.zzbbp()).zzu(zzejg.zzt(copyOfRange)).zzbiz());
            return (zzeaf) zzebb.zza(this.zziby, (zzedr) ((zzekq) zzedr.zzbbr().zzex(this.zzicb.getVersion()).zzc(zzedvVar).zzc((zzefk) ((zzekq) zzefk.zzbds().zza(this.zzicb.zzbbq()).zzae(zzejg.zzt(copyOfRange2)).zzbiz())).zzbiz()), zzeaf.class);
        }
        throw new GeneralSecurityException("unknown DEM key type");
    }
}
