package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdwu<E> extends zzdwj<E> {
    private final zzdws<E> zzhwc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwu(zzdws<E> zzdwsVar, int i) {
        super(zzdwsVar.size(), i);
        this.zzhwc = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwj
    protected final E get(int i) {
        return this.zzhwc.get(i);
    }
}
