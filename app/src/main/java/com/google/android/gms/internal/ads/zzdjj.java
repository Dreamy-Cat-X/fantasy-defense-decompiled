package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdjj implements zzdza<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjj(zzdji zzdjiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(@NullableDecl Void r1) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("Notification of cache hit successful.");
    }
}
