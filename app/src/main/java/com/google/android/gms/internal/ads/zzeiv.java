package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeiv;
import com.google.android.gms.internal.ads.zzeiw;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeiv<MessageType extends zzeiw<MessageType, BuilderType>, BuilderType extends zzeiv<MessageType, BuilderType>> implements zzemc {
    protected abstract BuilderType zza(MessageType messagetype);

    public abstract BuilderType zza(zzejr zzejrVar, zzekd zzekdVar) throws IOException;

    @Override // 
    /* renamed from: zzbgb, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i, int i2, zzekd zzekdVar) throws zzeld {
        try {
            zzejr zzb = zzejr.zzb(bArr, 0, i2, false);
            zza(zzb, zzekdVar);
            zzb.zzgd(0);
            return this;
        } catch (zzeld e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzemc
    public final /* synthetic */ zzemc zzf(zzemd zzemdVar) {
        if (!zzbit().getClass().isInstance(zzemdVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((zzeiw) zzemdVar);
    }
}
