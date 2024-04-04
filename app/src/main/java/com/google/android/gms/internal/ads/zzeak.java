package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzemd;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzeak<PrimitiveT, KeyProtoT extends zzemd> implements zzeal<PrimitiveT> {
    private final zzeam<KeyProtoT> zzhzr;
    private final Class<PrimitiveT> zzhzs;

    public zzeak(zzeam<KeyProtoT> zzeamVar, Class<PrimitiveT> cls) {
        if (!zzeamVar.zzbap().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzeamVar.toString(), cls.getName()));
        }
        this.zzhzr = zzeamVar;
        this.zzhzs = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzeal
    public final PrimitiveT zzm(zzejg zzejgVar) throws GeneralSecurityException {
        try {
            return zzb(this.zzhzr.zzp(zzejgVar));
        } catch (zzeld e) {
            String valueOf = String.valueOf(this.zzhzr.zzban().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeal
    public final PrimitiveT zza(zzemd zzemdVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzhzr.zzban().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (!this.zzhzr.zzban().isInstance(zzemdVar)) {
            throw new GeneralSecurityException(concat);
        }
        return (PrimitiveT) zzb(zzemdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeal
    public final zzemd zzn(zzejg zzejgVar) throws GeneralSecurityException {
        try {
            return zzbam().zzq(zzejgVar);
        } catch (zzeld e) {
            String valueOf = String.valueOf(this.zzhzr.zzbar().zzbas().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeal
    public final String getKeyType() {
        return this.zzhzr.getKeyType();
    }

    @Override // com.google.android.gms.internal.ads.zzeal
    public final zzefs zzo(zzejg zzejgVar) throws GeneralSecurityException {
        try {
            return (zzefs) ((zzekq) zzefs.zzbed().zzhw(this.zzhzr.getKeyType()).zzag(zzbam().zzq(zzejgVar).zzbgc()).zzb(this.zzhzr.zzbao()).zzbiz());
        } catch (zzeld e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeal
    public final Class<PrimitiveT> zzbal() {
        return this.zzhzs;
    }

    private final PrimitiveT zzb(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.zzhzs)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zzhzr.zzc(keyprotot);
        return (PrimitiveT) this.zzhzr.zza(keyprotot, this.zzhzs);
    }

    private final zzean<?, KeyProtoT> zzbam() {
        return new zzean<>(this.zzhzr.zzbar());
    }
}
