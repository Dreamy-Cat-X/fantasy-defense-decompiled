package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdjr implements zzdvo<zzcnj, zzdjt> {
    private final /* synthetic */ zzdjp zzhfz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjr(zzdjp zzdjpVar) {
        this.zzhfz = zzdjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvo
    @NullableDecl
    public final /* synthetic */ zzdjt apply(@NullableDecl zzcnj zzcnjVar) {
        zzdpa zzauv;
        zzdjt zzdjtVar;
        zzaym.zzc("", zzcnjVar);
        com.google.android.gms.ads.internal.util.zzd.zzeb("Failed to get a cache key, reverting to legacy flow.");
        zzdjp zzdjpVar = this.zzhfz;
        zzauv = this.zzhfz.zzauv();
        zzdjpVar.zzhfx = new zzdjt(null, zzauv, null);
        zzdjtVar = this.zzhfz.zzhfx;
        return zzdjtVar;
    }
}
