package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanp extends zzamx {
    private final Object zzdmc;
    private zzanu zzdmd;
    private zzauj zzdme;
    private IObjectWrapper zzdmf;
    private MediationRewardedAd zzdmg;

    public zzanp(MediationAdapter mediationAdapter) {
        this.zzdmc = mediationAdapter;
    }

    public zzanp(Adapter adapter) {
        this.zzdmc = adapter;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final IObjectWrapper zzut() throws RemoteException {
        Object obj = this.zzdmc;
        if (!(obj instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        zza(iObjectWrapper, zzvpVar, zzviVar, str, null, zzamzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException {
        AdSize zza;
        if (!(this.zzdmc instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdmc;
            zzanq zzanqVar = new zzanq(zzviVar.zzcgx == -1 ? null : new Date(zzviVar.zzcgx), zzviVar.zzcgy, zzviVar.zzcgz != null ? new HashSet(zzviVar.zzcgz) : null, zzviVar.zzmy, zzc(zzviVar), zzviVar.zzadl, zzviVar.zzchj, zzviVar.zzadm, zza(str, zzviVar));
            Bundle bundle = zzviVar.zzche != null ? zzviVar.zzche.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            if (zzvpVar.zzchx) {
                zza = com.google.android.gms.ads.zza.zza(zzvpVar.width, zzvpVar.height);
            } else {
                zza = com.google.android.gms.ads.zza.zza(zzvpVar.width, zzvpVar.height, zzvpVar.zzacv);
            }
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzanu(zzamzVar), zza(str, zzviVar, str2), zza, zzanqVar, bundle);
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle zzuw() {
        Object obj = this.zzdmc;
        if (!(obj instanceof zzbfe)) {
            String canonicalName = zzbfe.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            return new Bundle();
        }
        return ((zzbfe) obj).zzuw();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        zza(iObjectWrapper, zzviVar, str, (String) null, zzamzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException {
        if (!(this.zzdmc instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzdmc;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzanu(zzamzVar), zza(str, zzviVar, str2), new zzanq(zzviVar.zzcgx == -1 ? null : new Date(zzviVar.zzcgx), zzviVar.zzcgy, zzviVar.zzcgz != null ? new HashSet(zzviVar.zzcgz) : null, zzviVar.zzmy, zzc(zzviVar), zzviVar.zzadl, zzviVar.zzchj, zzviVar.zzadm, zza(str, zzviVar)), zzviVar.zzche != null ? zzviVar.zzche.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.zzdmc;
        if (!(obj instanceof zzbfd)) {
            String canonicalName = zzbfd.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            return new Bundle();
        }
        return ((zzbfd) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar, zzadz zzadzVar, List<String> list) throws RemoteException {
        Object obj = this.zzdmc;
        if (!(obj instanceof MediationNativeAdapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
            zzany zzanyVar = new zzany(zzviVar.zzcgx == -1 ? null : new Date(zzviVar.zzcgx), zzviVar.zzcgy, zzviVar.zzcgz != null ? new HashSet(zzviVar.zzcgz) : null, zzviVar.zzmy, zzc(zzviVar), zzviVar.zzadl, zzadzVar, list, zzviVar.zzchj, zzviVar.zzadm, zza(str, zzviVar));
            Bundle bundle = zzviVar.zzche != null ? zzviVar.zzche.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzdmd = new zzanu(zzamzVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzdmd, zza(str, zzviVar, str2), zzanyVar, bundle);
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle zzux() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzang zzuu() {
        NativeAdMapper zzvh = this.zzdmd.zzvh();
        if (zzvh instanceof NativeAppInstallAdMapper) {
            return new zzanw((NativeAppInstallAdMapper) zzvh);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanm zzva() {
        UnifiedNativeAdMapper zzvi = this.zzdmd.zzvi();
        if (zzvi != null) {
            return new zzaoo(zzvi);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanh zzuv() {
        NativeAdMapper zzvh = this.zzdmd.zzvh();
        if (zzvh instanceof NativeContentAdMapper) {
            return new zzanv((NativeContentAdMapper) zzvh);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzaff zzuz() {
        NativeCustomTemplateAd zzvj = this.zzdmd.zzvj();
        if (zzvj instanceof zzafk) {
            return ((zzafk) zzvj).zztu();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final boolean zzuy() {
        return this.zzdmc instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzauj zzaujVar, String str2) throws RemoteException {
        zzanq zzanqVar;
        Bundle bundle;
        Object obj = this.zzdmc;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzaym.zzdy("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdmc;
                Bundle zza = zza(str2, zzviVar, (String) null);
                if (zzviVar != null) {
                    zzanq zzanqVar2 = new zzanq(zzviVar.zzcgx == -1 ? null : new Date(zzviVar.zzcgx), zzviVar.zzcgy, zzviVar.zzcgz != null ? new HashSet(zzviVar.zzcgz) : null, zzviVar.zzmy, zzc(zzviVar), zzviVar.zzadl, zzviVar.zzchj, zzviVar.zzadm, zza(str2, zzviVar));
                    bundle = zzviVar.zzche != null ? zzviVar.zzche.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzanqVar = zzanqVar2;
                } else {
                    zzanqVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzanqVar, str, new zzauk(zzaujVar), zza, bundle);
                return;
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
        if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        this.zzdmf = iObjectWrapper;
        this.zzdme = zzaujVar;
        zzaujVar.zzaf(ObjectWrapper.wrap(obj));
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzauj zzaujVar, List<String> list) throws RemoteException {
        if (!(this.zzdmc instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzdmc;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zza(it.next(), (zzvi) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzauk(zzaujVar), arrayList);
        } catch (Throwable th) {
            zzaym.zzd("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzvi zzviVar, String str) throws RemoteException {
        zza(zzviVar, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzvi zzviVar, String str, String str2) throws RemoteException {
        Object obj = this.zzdmc;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzaym.zzdy("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdmc;
                mediationRewardedVideoAdAdapter.loadAd(new zzanq(zzviVar.zzcgx == -1 ? null : new Date(zzviVar.zzcgx), zzviVar.zzcgy, zzviVar.zzcgz != null ? new HashSet(zzviVar.zzcgz) : null, zzviVar.zzmy, zzc(zzviVar), zzviVar.zzadl, zzviVar.zzchj, zzviVar.zzadm, zza(str, zzviVar)), zza(str, zzviVar, str2), zzviVar.zzche != null ? zzviVar.zzche.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
        if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzb(this.zzdmf, zzviVar, str, new zzant((Adapter) this.zzdmc, this.zzdme));
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void showVideo() throws RemoteException {
        Object obj = this.zzdmc;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzaym.zzdy("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzdmc).showVideo();
                return;
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
        if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.zzdmg;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzdmf));
        } else {
            zzaym.zzev("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final boolean isInitialized() throws RemoteException {
        Object obj = this.zzdmc;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzaym.zzdy("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzdmc).isInitialized();
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return this.zzdme != null;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.zzdmc.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzaym.zzex(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        if (!(this.zzdmc instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Requesting rewarded ad from adapter.");
        try {
            ((Adapter) this.zzdmc).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza(str, zzviVar, (String) null), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str, zzviVar), ""), zza(zzamzVar));
        } catch (Exception e) {
            zzaym.zzc("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        if (!(this.zzdmc instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Requesting rewarded interstitial ad from adapter.");
        try {
            ((Adapter) this.zzdmc).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza(str, zzviVar, (String) null), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str, zzviVar), ""), zza(zzamzVar));
        } catch (Exception e) {
            zzaym.zzc("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (!(this.zzdmc instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzdmg;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzaym.zzev("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.zzdmc;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzdy(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzaym.zzc("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzyu getVideoController() {
        Object obj = this.zzdmc;
        if (!(obj instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
        } catch (Throwable th) {
            zzaym.zzc("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void showInterstitial() throws RemoteException {
        if (!(this.zzdmc instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdmc.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        }
        zzaym.zzdy("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdmc).showInterstitial();
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void destroy() throws RemoteException {
        Object obj = this.zzdmc;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void pause() throws RemoteException {
        Object obj = this.zzdmc;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void resume() throws RemoteException {
        Object obj = this.zzdmc;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzaym.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zzdmc;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(IObjectWrapper iObjectWrapper, zzaix zzaixVar, List<zzajf> list) throws RemoteException {
        AdFormat adFormat;
        if (!(this.zzdmc instanceof Adapter)) {
            throw new RemoteException();
        }
        zzans zzansVar = new zzans(this, zzaixVar);
        ArrayList arrayList = new ArrayList();
        for (zzajf zzajfVar : list) {
            String str = zzajfVar.zzdho;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                    }
                    if (c == 0) {
                        adFormat = AdFormat.BANNER;
                    } else if (c == 1) {
                        adFormat = AdFormat.INTERSTITIAL;
                    } else if (c == 2) {
                        adFormat = AdFormat.REWARDED;
                    } else if (c == 3) {
                        adFormat = AdFormat.NATIVE;
                    } else {
                        throw new RemoteException();
                    }
                    arrayList.add(new MediationConfiguration(adFormat, zzajfVar.extras));
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                    }
                    if (c == 0) {
                    }
                    arrayList.add(new MediationConfiguration(adFormat, zzajfVar.extras));
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                    }
                    if (c == 0) {
                    }
                    arrayList.add(new MediationConfiguration(adFormat, zzajfVar.extras));
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                    }
                    if (c == 0) {
                    }
                    arrayList.add(new MediationConfiguration(adFormat, zzajfVar.extras));
                    break;
                default:
                    if (c == 0) {
                    }
                    arrayList.add(new MediationConfiguration(adFormat, zzajfVar.extras));
                    break;
            }
        }
        ((Adapter) this.zzdmc).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzansVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzapn zzvb() {
        Object obj = this.zzdmc;
        if (obj instanceof Adapter) {
            return zzapn.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzapn zzvc() {
        Object obj = this.zzdmc;
        if (obj instanceof Adapter) {
            return zzapn.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzamz zzamzVar) {
        return new zzanr(this, zzamzVar);
    }

    private final Bundle zza(String str, zzvi zzviVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzaym.zzdy(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zzdmc instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzviVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzviVar.zzadl);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    private static boolean zzc(zzvi zzviVar) {
        if (zzviVar.zzcha) {
            return true;
        }
        zzwo.zzqm();
        return zzayd.zzzu();
    }

    private static String zza(String str, zzvi zzviVar) {
        String str2 = zzviVar.zzadn;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private final Bundle zzd(zzvi zzviVar) {
        Bundle bundle;
        return (zzviVar.zzche == null || (bundle = zzviVar.zzche.getBundle(this.zzdmc.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
