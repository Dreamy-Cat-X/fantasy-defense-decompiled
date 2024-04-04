package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzs implements MediaContent {
    private final VideoController zzcjq = new VideoController();
    private final zzaei zzcks;

    public zzzs(zzaei zzaeiVar) {
        this.zzcks = zzaeiVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zzcks.getAspectRatio();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zzcks.getDuration();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zzcks.getCurrentTime();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.zzcks.getVideoController() != null) {
                this.zzcjq.zza(this.zzcks.getVideoController());
            }
        } catch (RemoteException e) {
            zzaym.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjq;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zzcks.hasVideoContent();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.zzcks.zzo(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            IObjectWrapper zztk = this.zzcks.zztk();
            if (zztk != null) {
                return (Drawable) ObjectWrapper.unwrap(zztk);
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    public final zzaei zzrs() {
        return this.zzcks;
    }
}
