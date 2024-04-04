package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdwe implements Iterable<String> {
    private final /* synthetic */ CharSequence zzhup;
    private final /* synthetic */ zzdvz zzhuq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwe(zzdvz zzdvzVar, CharSequence charSequence) {
        this.zzhuq = zzdvzVar;
        this.zzhup = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> zzb;
        zzb = this.zzhuq.zzb(this.zzhup);
        return zzb;
    }

    public final String toString() {
        StringBuilder zza = zzdvr.zzhm(", ").zza(new StringBuilder("["), iterator());
        zza.append(']');
        return zza.toString();
    }
}
