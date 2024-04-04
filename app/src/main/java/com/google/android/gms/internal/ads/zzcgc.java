package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgc extends VideoController.VideoLifecycleCallbacks {
    private final zzcbi zzgao;

    public zzcgc(zzcbi zzcbiVar) {
        this.zzgao = zzcbiVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzyz zza = zza(this.zzgao);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoStart();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzyz zza = zza(this.zzgao);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoPause();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzyz zza = zza(this.zzgao);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoEnd();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Unable to call onVideoEnd()", e);
        }
    }

    private static zzyz zza(zzcbi zzcbiVar) {
        zzyu videoController = zzcbiVar.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzrf();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
