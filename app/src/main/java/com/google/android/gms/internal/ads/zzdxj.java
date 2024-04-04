package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxj extends zzdws<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzhwr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxj(Object[] objArr, int i, int i2) {
        this.zzhwr = objArr;
        this.offset = i;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdwa.zzt(i, this.size);
        return this.zzhwr[(i * 2) + this.offset];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }
}
