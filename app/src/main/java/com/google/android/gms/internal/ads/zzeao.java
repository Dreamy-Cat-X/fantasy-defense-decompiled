package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeao<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zzhzt;

    public zzeao(Class<PrimitiveT> cls) {
        this.zzhzt = cls;
    }

    public abstract PrimitiveT zzah(KeyT keyt) throws GeneralSecurityException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<PrimitiveT> zzbal() {
        return this.zzhzt;
    }
}
