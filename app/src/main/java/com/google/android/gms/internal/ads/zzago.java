package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzago extends UnifiedNativeAd {
    private final zzaeo zzdfb;
    private final NativeAd.AdChoicesInfo zzdfc;
    private final zzagj zzdfi;
    private final List<NativeAd.Image> zzdfa = new ArrayList();
    private final VideoController zzcjq = new VideoController();
    private final List<MuteThisAdReason> zzdfj = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|(3:24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28)))|(2:41|42)|(7:44|45|46|47|(2:49|50)|52|53)|58|45|46|47|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        com.google.android.gms.internal.ads.zzaym.zzc("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[Catch: RemoteException -> 0x00bb, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00bb, blocks: (B:47:0x00a6, B:49:0x00ae), top: B:46:0x00a6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzago(zzagj zzagjVar) {
        zzaeo zzaeoVar;
        zzaej zztm;
        zzaej zzaejVar;
        IBinder iBinder;
        this.zzdfi = zzagjVar;
        zzaeg zzaegVar = null;
        try {
            List images = zzagjVar.getImages();
            if (images != null) {
                for (Object obj : images) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzaejVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        if (queryLocalInterface instanceof zzaej) {
                            zzaejVar = (zzaej) queryLocalInterface;
                        } else {
                            zzaejVar = new zzael(iBinder);
                        }
                    }
                    if (zzaejVar != null) {
                        this.zzdfa.add(new zzaeo(zzaejVar));
                    }
                }
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
        try {
            List muteThisAdReasons = this.zzdfi.getMuteThisAdReasons();
            if (muteThisAdReasons != null) {
                for (Object obj2 : muteThisAdReasons) {
                    zzyj zzg = obj2 instanceof IBinder ? zzyi.zzg((IBinder) obj2) : null;
                    if (zzg != null) {
                        this.zzdfj.add(new zzyk(zzg));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        try {
            zztm = this.zzdfi.zztm();
        } catch (RemoteException e3) {
            zzaym.zzc("", e3);
        }
        if (zztm != null) {
            zzaeoVar = new zzaeo(zztm);
            this.zzdfb = zzaeoVar;
            if (this.zzdfi.zztn() != null) {
                zzaegVar = new zzaeg(this.zzdfi.zztn());
            }
            this.zzdfc = zzaegVar;
        }
        zzaeoVar = null;
        this.zzdfb = zzaeoVar;
        if (this.zzdfi.zztn() != null) {
        }
        this.zzdfc = zzaegVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    /* renamed from: zztl, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzjs() {
        try {
            return this.zzdfi.zztl();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzjw() {
        try {
            IObjectWrapper zzto = this.zzdfi.zzto();
            if (zzto != null) {
                return ObjectWrapper.unwrap(zzto);
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzdfi.performClick(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzdfi.recordImpression(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzdfi.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.zzdfi.getHeadline();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzdfa;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.zzdfi.getBody();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.zzdfb;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.zzdfi.getCallToAction();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzdfi.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.zzdfi.getStore();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.zzdfi.getPrice();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.zzdfi.getVideoController() != null) {
                this.zzcjq.zza(this.zzdfi.getVideoController());
            }
        } catch (RemoteException e) {
            zzaym.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjq;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzdfc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.zzdfi.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle extras = this.zzdfi.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zzdfi.zztw();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zzdfi.isCustomClickGestureEnabled();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zzdfi.recordCustomClickGesture();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zzdfj;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zzdfi.isCustomMuteThisAdEnabled();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.zzdfi.destroy();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zzdfi.zza(new zzaha(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzaym.zzc("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzaym.zzev("Ad is not custom mute enabled");
                return;
            }
            if (muteThisAdReason == null) {
                this.zzdfi.zza((zzyj) null);
            } else if (muteThisAdReason instanceof zzyk) {
                this.zzdfi.zza(((zzyk) muteThisAdReason).zzre());
            } else {
                zzaym.zzev("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zzdfi.zza(new zzyg(muteThisAdListener));
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zzdfi.cancelUnconfirmedClick();
        } catch (RemoteException e) {
            zzaym.zzc("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.zzdfi.getAdvertiser();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.zzdfi.zztx() != null) {
                return new zzzs(this.zzdfi.zztx());
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar;
        try {
            zzytVar = this.zzdfi.zzkh();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            zzytVar = null;
        }
        return ResponseInfo.zza(zzytVar);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzdfi.zza(new zzaah(onPaidEventListener));
        } catch (RemoteException e) {
            zzaym.zzc("Failed to setOnPaidEventListener", e);
        }
    }
}
