package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [T, F] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdxc<F, T> extends zzdxq<F, T> {
    private final /* synthetic */ zzdwz zzhwn;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdxc(zzdwz zzdwzVar, ListIterator listIterator) {
        super(listIterator);
        this.zzhwn = zzdwzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdxn
    public final T zzae(F f) {
        return this.zzhwn.zzhwm.apply(f);
    }
}
