package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafk implements NativeCustomTemplateAd {
    private final VideoController zzcjq = new VideoController();
    private final zzaff zzdff;
    private final MediaView zzdfg;
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzdfh;

    public zzafk(zzaff zzaffVar) {
        Context context;
        this.zzdff = zzaffVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzaffVar.zztq());
        } catch (RemoteException | NullPointerException e) {
            zzaym.zzc("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (this.zzdff.zzp(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzaym.zzc("", e2);
            }
        }
        this.zzdfg = mediaView;
    }

    public final zzaff zztu() {
        return this.zzdff;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.zzdff.zzct(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            zzaej zzcu = this.zzdff.zzcu(str);
            if (zzcu != null) {
                return new zzaeo(zzcu);
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            zzyu videoController = this.zzdff.getVideoController();
            if (videoController != null) {
                this.zzcjq.zza(videoController);
            }
        } catch (RemoteException e) {
            zzaym.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjq;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.zzdfg;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zzdff.getAvailableAssetNames();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.zzdff.getCustomTemplateId();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.zzdff.performClick(str);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.zzdff.recordImpression();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzdfh == null && this.zzdff.zztr()) {
                this.zzdfh = new zzaef(this.zzdff);
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
        return this.zzdfh;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.zzdff.destroy();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
