package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.Collections;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzczg implements zzdza<Uri> {
    private final /* synthetic */ zzarn zzgyf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczg(zzcyv zzcyvVar, zzarn zzarnVar) {
        this.zzgyf = zzarnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        try {
            zzarn zzarnVar = this.zzgyf;
            String valueOf = String.valueOf(th.getMessage());
            zzarnVar.onError(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(@Nonnull Uri uri) {
        try {
            this.zzgyf.onSuccess(Collections.singletonList(uri));
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
