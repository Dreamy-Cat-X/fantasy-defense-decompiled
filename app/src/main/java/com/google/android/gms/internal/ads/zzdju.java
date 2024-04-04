package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdju implements zzdvo<zzasu, zzdjt> {
    private final /* synthetic */ zzdjp zzhfz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdju(zzdjp zzdjpVar) {
        this.zzhfz = zzdjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvo
    @NullableDecl
    public final /* synthetic */ zzdjt apply(@NullableDecl zzasu zzasuVar) {
        zzdjt zzdjtVar;
        zzasu zzasuVar2 = zzasuVar;
        this.zzhfz.zzhfx = new zzdjt(zzasuVar2, new zzdpc(zzasuVar2.zzdvq), null);
        zzdjtVar = this.zzhfz.zzhfx;
        return zzdjtVar;
    }
}
