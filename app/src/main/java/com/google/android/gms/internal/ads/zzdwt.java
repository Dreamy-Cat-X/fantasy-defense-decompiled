package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdwt<E> extends zzdws<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzdws zzhwb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwt(zzdws zzdwsVar, int i, int i2) {
        this.zzhwb = zzdwsVar;
        this.offset = i;
        this.length = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final boolean zzazo() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final Object[] zzazk() {
        return this.zzhwb.zzazk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdwn
    public final int zzazl() {
        return this.zzhwb.zzazl() + this.offset;
    }

    @Override // com.google.android.gms.internal.ads.zzdwn
    final int zzazm() {
        return this.zzhwb.zzazl() + this.offset + this.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdwa.zzt(i, this.length);
        return this.zzhwb.get(i + this.offset);
    }

    @Override // com.google.android.gms.internal.ads.zzdws
    /* renamed from: zzv */
    public final zzdws<E> subList(int i, int i2) {
        zzdwa.zzf(i, i2, this.length);
        zzdws zzdwsVar = this.zzhwb;
        int i3 = this.offset;
        return (zzdws) zzdwsVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.ads.zzdws, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
