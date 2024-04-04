package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzefs;
import com.google.android.gms.internal.ads.zzemd;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeam<KeyProtoT extends zzemd> {
    private final Class<KeyProtoT> zzhzt;
    private final Map<Class<?>, zzeao<?, KeyProtoT>> zzhzu;
    private final Class<?> zzhzv;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzeam(Class<KeyProtoT> cls, zzeao<?, KeyProtoT>... zzeaoVarArr) {
        this.zzhzt = cls;
        HashMap hashMap = new HashMap();
        for (zzeao<?, KeyProtoT> zzeaoVar : zzeaoVarArr) {
            if (hashMap.containsKey(zzeaoVar.zzbal())) {
                String valueOf = String.valueOf(zzeaoVar.zzbal().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(zzeaoVar.zzbal(), zzeaoVar);
        }
        if (zzeaoVarArr.length > 0) {
            this.zzhzv = zzeaoVarArr[0].zzbal();
        } else {
            this.zzhzv = Void.class;
        }
        this.zzhzu = Collections.unmodifiableMap(hashMap);
    }

    public abstract String getKeyType();

    public abstract zzefs.zza zzbao();

    public abstract void zzc(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT zzp(zzejg zzejgVar) throws zzeld;

    public final Class<KeyProtoT> zzban() {
        return this.zzhzt;
    }

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzeao<?, KeyProtoT> zzeaoVar = this.zzhzu.get(cls);
        if (zzeaoVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (P) zzeaoVar.zzah(keyprotot);
    }

    public final Set<Class<?>> zzbap() {
        return this.zzhzu.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> zzbaq() {
        return this.zzhzv;
    }

    public zzeap<?, KeyProtoT> zzbar() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
