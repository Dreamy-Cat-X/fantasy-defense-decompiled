package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzze {
    private final zzvn zzacq;
    private boolean zzbnf;
    private VideoOptions zzbnt;
    private zzxg zzbuo;
    private String zzbup;
    private final zzamu zzbur;
    private zzuz zzcgr;
    private AdListener zzcgw;
    private AdSize[] zzcic;
    private final AtomicBoolean zzcjp;
    private final VideoController zzcjq;
    private final zzwr zzcjr;
    private AppEventListener zzcjs;
    private OnCustomRenderedAdLoadedListener zzcjt;
    private ViewGroup zzcju;
    private int zzcjv;
    private OnPaidEventListener zzcjw;

    private static boolean zzcw(int i) {
        return i == 1;
    }

    public zzze(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzvn.zzchp, 0);
    }

    public zzze(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzvn.zzchp, i);
    }

    public zzze(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzvn.zzchp, 0);
    }

    public zzze(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzvn.zzchp, i);
    }

    private zzze(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvn zzvnVar, zzxg zzxgVar, int i) {
        zzvp zzvpVar;
        this.zzbur = new zzamu();
        this.zzcjq = new VideoController();
        this.zzcjr = new zzzh(this);
        this.zzcju = viewGroup;
        this.zzacq = zzvnVar;
        this.zzbuo = null;
        this.zzcjp = new AtomicBoolean(false);
        this.zzcjv = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzvw zzvwVar = new zzvw(context, attributeSet);
                this.zzcic = zzvwVar.zzy(z);
                this.zzbup = zzvwVar.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzayd zzqm = zzwo.zzqm();
                    AdSize adSize = this.zzcic[0];
                    int i2 = this.zzcjv;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzvpVar = zzvp.zzqg();
                    } else {
                        zzvp zzvpVar2 = new zzvp(context, adSize);
                        zzvpVar2.zzcht = zzcw(i2);
                        zzvpVar = zzvpVar2;
                    }
                    zzqm.zza(viewGroup, zzvpVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzwo.zzqm().zza(viewGroup, new zzvp(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private zzze(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvn zzvnVar, int i) {
        this(viewGroup, attributeSet, z, zzvnVar, null, i);
    }

    public final void destroy() {
        try {
            if (this.zzbuo != null) {
                this.zzbuo.destroy();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzcgw;
    }

    public final AdSize getAdSize() {
        zzvp zzkf;
        try {
            if (this.zzbuo != null && (zzkf = this.zzbuo.zzkf()) != null) {
                return zzkf.zzqh();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzcic;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzcic;
    }

    public final String getAdUnitId() {
        zzxg zzxgVar;
        if (this.zzbup == null && (zzxgVar = this.zzbuo) != null) {
            try {
                this.zzbup = zzxgVar.getAdUnitId();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
        return this.zzbup;
    }

    public final AppEventListener zzrq() {
        return this.zzcjs;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcjt;
    }

    public final void zza(zzzc zzzcVar) {
        zzxg zzd;
        try {
            if (this.zzbuo == null) {
                if ((this.zzcic == null || this.zzbup == null) && this.zzbuo == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzcju.getContext();
                zzvp zza = zza(context, this.zzcic, this.zzcjv);
                if ("search_v2".equals(zza.zzacv)) {
                    zzd = new zzwg(zzwo.zzqn(), context, zza, this.zzbup).zzd(context, false);
                } else {
                    zzd = new zzvy(zzwo.zzqn(), context, zza, this.zzbup, this.zzbur).zzd(context, false);
                }
                this.zzbuo = zzd;
                zzd.zza(new zzve(this.zzcjr));
                if (this.zzcgr != null) {
                    this.zzbuo.zza(new zzvb(this.zzcgr));
                }
                if (this.zzcjs != null) {
                    this.zzbuo.zza(new zzvv(this.zzcjs));
                }
                if (this.zzcjt != null) {
                    this.zzbuo.zza(new zzaci(this.zzcjt));
                }
                if (this.zzbnt != null) {
                    this.zzbuo.zza(new zzaaq(this.zzbnt));
                }
                this.zzbuo.zza(new zzaah(this.zzcjw));
                this.zzbuo.setManualImpressionsEnabled(this.zzbnf);
                try {
                    IObjectWrapper zzkd = this.zzbuo.zzkd();
                    if (zzkd != null) {
                        this.zzcju.addView((View) ObjectWrapper.unwrap(zzkd));
                    }
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
            if (this.zzbuo.zza(zzvn.zza(this.zzcju.getContext(), zzzcVar))) {
                this.zzbur.zzf(zzzcVar.zzrj());
            }
        } catch (RemoteException e2) {
            zzaym.zze("#007 Could not call remote method.", e2);
        }
    }

    public final void pause() {
        try {
            if (this.zzbuo != null) {
                this.zzbuo.pause();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordManualImpression() {
        if (this.zzcjp.getAndSet(true)) {
            return;
        }
        try {
            if (this.zzbuo != null) {
                this.zzbuo.zzke();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void resume() {
        try {
            if (this.zzbuo != null) {
                this.zzbuo.resume();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzcgw = adListener;
        this.zzcjr.zza(adListener);
    }

    public final void zza(zzuz zzuzVar) {
        try {
            this.zzcgr = zzuzVar;
            if (this.zzbuo != null) {
                this.zzbuo.zza(zzuzVar != null ? new zzvb(zzuzVar) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzcic != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzcic = adSizeArr;
        try {
            if (this.zzbuo != null) {
                this.zzbuo.zza(zza(this.zzcju.getContext(), this.zzcic, this.zzcjv));
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        this.zzcju.requestLayout();
    }

    public final void setAdUnitId(String str) {
        if (this.zzbup != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzbup = str;
    }

    public final void zza(AppEventListener appEventListener) {
        try {
            this.zzcjs = appEventListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(appEventListener != null ? new zzvv(this.zzcjs) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcjt = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbuo != null) {
                this.zzbuo.zza(onCustomRenderedAdLoadedListener != null ? new zzaci(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbnf = z;
        try {
            if (this.zzbuo != null) {
                this.zzbuo.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbuo != null) {
                return this.zzbuo.zzkg();
            }
            return null;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbuo != null) {
                return this.zzbuo.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyt zzytVar = null;
        try {
            if (this.zzbuo != null) {
                zzytVar = this.zzbuo.zzkh();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzytVar);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcjw = onPaidEventListener;
            if (this.zzbuo != null) {
                this.zzbuo.zza(new zzaah(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzaym.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final VideoController getVideoController() {
        return this.zzcjq;
    }

    public final zzyu zzdw() {
        zzxg zzxgVar = this.zzbuo;
        if (zzxgVar == null) {
            return null;
        }
        try {
            return zzxgVar.getVideoController();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzbnt = videoOptions;
        try {
            if (this.zzbuo != null) {
                this.zzbuo.zza(videoOptions == null ? null : new zzaaq(videoOptions));
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbnt;
    }

    public final boolean zza(zzxg zzxgVar) {
        if (zzxgVar == null) {
            return false;
        }
        try {
            IObjectWrapper zzkd = zzxgVar.zzkd();
            if (zzkd == null || ((View) ObjectWrapper.unwrap(zzkd)).getParent() != null) {
                return false;
            }
            this.zzcju.addView((View) ObjectWrapper.unwrap(zzkd));
            this.zzbuo = zzxgVar;
            return true;
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    private static zzvp zza(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzvp.zzqg();
            }
        }
        zzvp zzvpVar = new zzvp(context, adSizeArr);
        zzvpVar.zzcht = zzcw(i);
        return zzvpVar;
    }
}
