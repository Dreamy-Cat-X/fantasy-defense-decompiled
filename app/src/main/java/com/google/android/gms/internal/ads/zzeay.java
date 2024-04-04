package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzemd;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeay<KeyProtoT extends zzemd, PublicKeyProtoT extends zzemd> extends zzeam<KeyProtoT> {
    private final Class<PublicKeyProtoT> zziag;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzeay(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzeao<?, KeyProtoT>... zzeaoVarArr) {
        super(cls, zzeaoVarArr);
        this.zziag = cls2;
    }
}
