package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyd;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdym<V, C> extends zzdyd<V, C> {
    private List<zzdyo<V>> zzhyo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdym(zzdwn<? extends zzdzl<? extends V>> zzdwnVar, boolean z) {
        super(zzdwnVar, true, true);
        List<zzdyo<V>> zzet;
        if (zzdwnVar.isEmpty()) {
            zzet = zzdws.zzazp();
        } else {
            zzet = zzdxa.zzet(zzdwnVar.size());
        }
        for (int i = 0; i < zzdwnVar.size(); i++) {
            zzet.add(null);
        }
        this.zzhyo = zzet;
    }

    abstract C zzl(List<zzdyo<V>> list);

    @Override // com.google.android.gms.internal.ads.zzdyd
    final void zzb(int i, @NullableDecl V v) {
        List<zzdyo<V>> list = this.zzhyo;
        if (list != null) {
            list.set(i, new zzdyo<>(v));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyd
    final void zzbaa() {
        List<zzdyo<V>> list = this.zzhyo;
        if (list != null) {
            set(zzl(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdyd
    public final void zza(zzdyd.zza zzaVar) {
        super.zza(zzaVar);
        this.zzhyo = null;
    }
}
