package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapi extends zzapc {
    private MediationRewardedAd zzdmg;
    private final RtbAdapter zzdnf;
    private MediationInterstitialAd zzdng;
    private String zzdnh = "";

    public zzapi(RtbAdapter rtbAdapter) {
        this.zzdnf = rtbAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzy(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaon zzaonVar, zzamz zzamzVar, zzvp zzvpVar) throws RemoteException {
        try {
            this.zzdnf.loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdp(str2), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str2, zzviVar), com.google.android.gms.ads.zza.zza(zzvpVar.width, zzvpVar.height, zzvpVar.zzacv), this.zzdnh), new zzaph(this, zzaonVar, zzamzVar));
        } catch (Throwable th) {
            zzaym.zzc("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamz zzamzVar) throws RemoteException {
        try {
            this.zzdnf.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdp(str2), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str2, zzviVar), this.zzdnh), new zzapk(this, zzaosVar, zzamzVar));
        } catch (Throwable th) {
            zzaym.zzc("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaoy zzaoyVar, zzamz zzamzVar) throws RemoteException {
        try {
            this.zzdnf.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdp(str2), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str2, zzviVar), this.zzdnh), zza(zzaoyVar, zzamzVar));
        } catch (Throwable th) {
            zzaym.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzb(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaoy zzaoyVar, zzamz zzamzVar) throws RemoteException {
        try {
            this.zzdnf.loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdp(str2), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str2, zzviVar), this.zzdnh), zza(zzaoyVar, zzamzVar));
        } catch (Throwable th) {
            zzaym.zzc("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(String str, String str2, zzvi zzviVar, IObjectWrapper iObjectWrapper, zzaot zzaotVar, zzamz zzamzVar) throws RemoteException {
        try {
            this.zzdnf.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdp(str2), zzd(zzviVar), zzc(zzviVar), zzviVar.zzmy, zzviVar.zzadl, zzviVar.zzadm, zza(str2, zzviVar), this.zzdnh), new zzapj(this, zzaotVar, zzamzVar));
        } catch (Throwable th) {
            zzaym.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzdng;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzaym.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzdmg;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzaym.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzyu getVideoController() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zzdnf;
        if (!(mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
        } catch (Throwable th) {
            zzaym.zzc("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvp zzvpVar, zzape zzapeVar) throws RemoteException {
        AdFormat adFormat;
        try {
            zzapm zzapmVar = new zzapm(this, zzapeVar);
            RtbAdapter rtbAdapter = this.zzdnf;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
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
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zza.zza(zzvpVar.width, zzvpVar.height, zzvpVar.zzacv)), zzapmVar);
        } catch (Throwable th) {
            zzaym.zzc("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzapn zzvb() throws RemoteException {
        return zzapn.zza(this.zzdnf.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzapn zzvc() throws RemoteException {
        return zzapn.zza(this.zzdnf.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final void zzdm(String str) {
        this.zzdnh = str;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzaoy zzaoyVar, zzamz zzamzVar) {
        return new zzapl(this, zzaoyVar, zzamzVar);
    }

    private static Bundle zzdp(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzaym.zzex(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzaym.zzc("", e);
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
        return (zzviVar.zzche == null || (bundle = zzviVar.zzche.getBundle(this.zzdnf.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
