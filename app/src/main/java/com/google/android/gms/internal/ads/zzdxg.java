package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxg<E> extends zzdws<E> {
    static final zzdws<Object> zzhws = new zzdxg(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhwt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxg(Object[] objArr, int i) {
        this.zzhwt = objArr;
        this.size = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zzazl() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final Object[] zzazk() {
        return this.zzhwt;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    final int zzazm() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdws, com.google.android.gms.internal.ads.zzdwn
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhwt, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdwa.zzt(i, this.size);
        return (E) this.zzhwt[i];
    }
}
