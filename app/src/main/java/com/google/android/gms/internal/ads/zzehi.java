package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzehi implements zzeai {
    private static final byte[] zzibl = new byte[0];
    private final zzehk zzihs;
    private final String zziht;
    private final byte[] zzihu;
    private final zzehr zzihv;
    private final zzehg zzihw;

    public zzehi(ECPublicKey eCPublicKey, byte[] bArr, String str, zzehr zzehrVar, zzehg zzehgVar) throws GeneralSecurityException {
        zzehm.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzihs = new zzehk(eCPublicKey);
        this.zzihu = bArr;
        this.zziht = str;
        this.zzihv = zzehrVar;
        this.zzihw = zzehgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzehn zza = this.zzihs.zza(this.zziht, this.zzihu, bArr2, this.zzihw.zzbbg(), this.zzihv);
        byte[] zzc = this.zzihw.zzm(zza.zzbfu()).zzc(bArr, zzibl);
        byte[] zzbft = zza.zzbft();
        return ByteBuffer.allocate(zzbft.length + zzc.length).put(zzbft).put(zzc).array();
    }
}
