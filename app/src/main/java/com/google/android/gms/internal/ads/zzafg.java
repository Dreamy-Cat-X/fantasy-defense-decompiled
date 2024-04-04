package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzafg extends NativeContentAd {
    private final NativeAd.AdChoicesInfo zzdfc;
    private final zzafb zzdfd;
    private final zzaeo zzdfe;
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
    public zzafg(zzafb zzafbVar) {
        zzaeo zzaeoVar;
        zzaej zztp;
        zzaej zzaejVar;
        IBinder iBinder;
        this.zzdfd = zzafbVar;
        zzaeg zzaegVar = null;
        try {
            List images = zzafbVar.getImages();
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
            zztp = this.zzdfd.zztp();
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
        if (zztp != null) {
            zzaeoVar = new zzaeo(zztp);
            this.zzdfe = zzaeoVar;
            if (this.zzdfd.zztn() != null) {
                zzaegVar = new zzaeg(this.zzdfd.zztn());
            }
            this.zzdfc = zzaegVar;
        }
        zzaeoVar = null;
        this.zzdfe = zzaeoVar;
        if (this.zzdfd.zztn() != null) {
        }
        this.zzdfc = zzaegVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zztl, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzjs() {
        try {
            return this.zzdfd.zztl();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzdfd.performClick(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzdfd.recordImpression(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzdfd.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getHeadline() {
        try {
            return this.zzdfd.getHeadline();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final List<NativeAd.Image> getImages() {
        return this.zzdfa;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getBody() {
        try {
            return this.zzdfd.getBody();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.Image getLogo() {
        return this.zzdfe;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzdfd.getCallToAction();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getAdvertiser() {
        try {
            return this.zzdfd.getAdvertiser();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final VideoController getVideoController() {
        try {
            if (this.zzdfd.getVideoController() != null) {
                this.zzcjq.zza(this.zzdfd.getVideoController());
            }
        } catch (RemoteException e) {
            zzaym.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjq;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final Bundle getExtras() {
        try {
            return this.zzdfd.getExtras();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzdfc;
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzdfd.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeContentAd
    public final void destroy() {
        try {
            this.zzdfd.destroy();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
