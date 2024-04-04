package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbob implements zzdza<zzasu> {
    private final /* synthetic */ zzbnw zzfvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbob(zzbnw zzbnwVar) {
        this.zzfvr = zzbnwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzbuz zzbuzVar;
        zzbuzVar = this.zzfvr.zzfvi;
        zzbuzVar.zzbf(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(@NullableDecl zzasu zzasuVar) {
        zzbuz zzbuzVar;
        zzbuzVar = this.zzfvr.zzfvi;
        zzbuzVar.zzbf(true);
    }
}
