package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzanx<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzamx {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzdmt;
    private final NETWORK_EXTRAS zzdmu;

    public zzanx(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzdmt = mediationAdapter;
        this.zzdmu = network_extras;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzyu getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzaix zzaixVar, List<zzajf> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzauj zzaujVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzauj zzaujVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar, zzadz zzadzVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzvi zzviVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzvi zzviVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzang zzuu() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanh zzuv() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final boolean zzuy() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzaff zzuz() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzanm zzva() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzapn zzvb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final zzapn zzvc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final IObjectWrapper zzut() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdmt;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaym.zzex(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
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
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdmt;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaym.zzex(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzaym.zzdy("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdmt;
            zzaoa zzaoaVar = new zzaoa(zzamzVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zzdk = zzdk(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzvpVar.width && adSizeArr[i].getHeight() == zzvpVar.height) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(com.google.android.gms.ads.zza.zza(zzvpVar.width, zzvpVar.height, zzvpVar.zzacv));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzaoaVar, activity, zzdk, adSize, zzaom.zza(zzviVar, zzc(zzviVar)), this.zzdmu);
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle zzuw() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException {
        zza(iObjectWrapper, zzviVar, str, (String) null, zzamzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdmt;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaym.zzex(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzaym.zzdy("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdmt).requestInterstitialAd(new zzaoa(zzamzVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzdk(str), zzaom.zza(zzviVar, zzc(zzviVar)), this.zzdmu);
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdmt;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzaym.zzex(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzaym.zzdy("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdmt).showInterstitial();
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
    public final void destroy() throws RemoteException {
        try {
            this.zzdmt.destroy();
        } catch (Throwable th) {
            zzaym.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    private final SERVER_PARAMETERS zzdk(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zzdmt.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
            newInstance.load(hashMap);
            return newInstance;
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
}
