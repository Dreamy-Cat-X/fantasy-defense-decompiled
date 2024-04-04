package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafc extends NativeAppInstallAd {
    private final zzaex zzdez;
    private final zzaeo zzdfb;
    private final NativeAd.AdChoicesInfo zzdfc;
    private final List<NativeAd.Image> zzdfa = new ArrayList();
    private final VideoController zzcjq = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        com.google.android.gms.internal.ads.zzaym.zzc("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RemoteException -> 0x0081, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0081, blocks: (B:30:0x006c, B:32:0x0074), top: B:29:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzafc(zzaex zzaexVar) {
        zzaeo zzaeoVar;
        zzaej zztm;
        zzaej zzaejVar;
        IBinder iBinder;
        this.zzdez = zzaexVar;
        zzaeg zzaegVar = null;
        try {
            List images = zzaexVar.getImages();
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
            zztm = this.zzdez.zztm();
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        if (zztm != null) {
            zzaeoVar = new zzaeo(zztm);
            this.zzdfb = zzaeoVar;
            if (this.zzdez.zztn() != null) {
                zzaegVar = new zzaeg(this.zzdez.zztn());
            }
            this.zzdfc = zzaegVar;
        }
        zzaeoVar = null;
        this.zzdfb = zzaeoVar;
        if (this.zzdez.zztn() != null) {
        }
        this.zzdfc = zzaegVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zztl, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzjs() {
        try {
            return this.zzdez.zztl();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzdez.performClick(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzdez.recordImpression(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzdez.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getHeadline() {
        try {
            return this.zzdez.getHeadline();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final List<NativeAd.Image> getImages() {
        return this.zzdfa;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getBody() {
        try {
            return this.zzdez.getBody();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.Image getIcon() {
        return this.zzdfb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzdez.getCallToAction();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzdez.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getStore() {
        try {
            return this.zzdez.getStore();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getPrice() {
        try {
            return this.zzdez.getPrice();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final VideoController getVideoController() {
        try {
            if (this.zzdez.getVideoController() != null) {
                this.zzcjq.zza(this.zzdez.getVideoController());
            }
        } catch (RemoteException e) {
            zzaym.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjq;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzdfc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzdez.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Bundle getExtras() {
        try {
            return this.zzdez.getExtras();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final void destroy() {
        try {
            this.zzdez.destroy();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
