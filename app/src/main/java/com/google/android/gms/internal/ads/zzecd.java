package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzecd implements zzeaf {
    private static final byte[] zzibl = new byte[0];
    private final zzefv zzibm;
    private final zzeaf zzibn;

    public zzecd(zzefv zzefvVar, zzeaf zzeafVar) {
        this.zzibm = zzefvVar;
        this.zzibn = zzeafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeaf
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] byteArray = zzebb.zzb(this.zzibm).toByteArray();
        byte[] zzc = this.zzibn.zzc(byteArray, zzibl);
        byte[] zzc2 = ((zzeaf) zzebb.zza(this.zzibm.zzbea(), byteArray, zzeaf.class)).zzc(bArr, bArr2);
        return ByteBuffer.allocate(zzc.length + 4 + zzc2.length).putInt(zzc.length).put(zzc).put(zzc2).array();
    }
}
