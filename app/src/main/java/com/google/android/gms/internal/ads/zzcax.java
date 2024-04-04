package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcax extends zzaeh {
    private final zzcbi zzgao;
    private IObjectWrapper zzgbm;

    public zzcax(zzcbi zzcbiVar) {
        this.zzgao = zzcbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final float getAspectRatio() throws RemoteException {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcxe)).booleanValue()) {
            return 0.0f;
        }
        if (this.zzgao.getMediaContentAspectRatio() != 0.0f) {
            return this.zzgao.getMediaContentAspectRatio();
        }
        if (this.zzgao.getVideoController() != null) {
            return zzanm();
        }
        IObjectWrapper iObjectWrapper = this.zzgbm;
        if (iObjectWrapper != null) {
            return zzas(iObjectWrapper);
        }
        zzaej zzanu = this.zzgao.zzanu();
        if (zzanu == null) {
            return 0.0f;
        }
        float width = (zzanu == null || zzanu.getWidth() == -1 || zzanu.getHeight() == -1) ? 0.0f : zzanu.getWidth() / zzanu.getHeight();
        return width != 0.0f ? width : zzas(zzanu.zztg());
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final float getDuration() throws RemoteException {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxf)).booleanValue() && this.zzgao.getVideoController() != null) {
            return this.zzgao.getVideoController().getDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final float getCurrentTime() throws RemoteException {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxf)).booleanValue() && this.zzgao.getVideoController() != null) {
            return this.zzgao.getVideoController().getCurrentTime();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final zzyu getVideoController() throws RemoteException {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxf)).booleanValue()) {
            return this.zzgao.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final boolean hasVideoContent() throws RemoteException {
        return ((Boolean) zzwo.zzqq().zzd(zzabh.zzcxf)).booleanValue() && this.zzgao.getVideoController() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final void zza(zzafv zzafvVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxf)).booleanValue() && (this.zzgao.getVideoController() instanceof zzbeb)) {
            ((zzbeb) this.zzgao.getVideoController()).zza(zzafvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsk)).booleanValue()) {
            this.zzgbm = iObjectWrapper;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaei
    public final IObjectWrapper zztk() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzgbm;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzaej zzanu = this.zzgao.zzanu();
        if (zzanu == null) {
            return null;
        }
        return zzanu.zztg();
    }

    private final float zzanm() {
        try {
            return this.zzgao.getVideoController().getAspectRatio();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    private static float zzas(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }
}
