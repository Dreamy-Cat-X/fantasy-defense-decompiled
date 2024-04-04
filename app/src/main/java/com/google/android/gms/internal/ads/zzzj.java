package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.kt.olleh.inapp.net.InAppError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzzj {
    private static zzzj zzcki;
    private zzxy zzckj;
    private RewardedVideoAd zzckl;
    private InitializationStatus zzckn;
    private final Object lock = new Object();
    private boolean zzckk = false;
    private boolean zzze = false;
    private RequestConfiguration zzckm = new RequestConfiguration.Builder().build();
    private ArrayList<OnInitializationCompleteListener> zzckh = new ArrayList<>();

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private class zza extends zzajb {
        private zza() {
        }

        @Override // com.google.android.gms.internal.ads.zzajc
        public final void zze(List<zzaiv> list) throws RemoteException {
            int i = 0;
            zzzj.zza(zzzj.this, false);
            zzzj.zzb(zzzj.this, true);
            InitializationStatus zza = zzzj.zza(zzzj.this, list);
            ArrayList arrayList = zzzj.zzrr().zzckh;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((OnInitializationCompleteListener) obj).onInitializationComplete(zza);
            }
            zzzj.zzrr().zzckh.clear();
        }

        /* synthetic */ zza(zzzj zzzjVar, zzzm zzzmVar) {
            this();
        }
    }

    private zzzj() {
    }

    public static zzzj zzrr() {
        zzzj zzzjVar;
        synchronized (zzzj.class) {
            if (zzcki == null) {
                zzcki = new zzzj();
            }
            zzzjVar = zzcki;
        }
        return zzzjVar;
    }

    public final void zza(final Context context, String str, final OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.lock) {
            if (this.zzckk) {
                if (onInitializationCompleteListener != null) {
                    zzrr().zzckh.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zzze) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(getInitializationStatus());
                }
                return;
            }
            this.zzckk = true;
            if (onInitializationCompleteListener != null) {
                zzrr().zzckh.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                zzamo.zzus().zzc(context, str);
                zzg(context);
                if (onInitializationCompleteListener != null) {
                    this.zzckj.zza(new zza(this, null));
                }
                this.zzckj.zza(new zzamu());
                this.zzckj.initialize();
                this.zzckj.zza(str, ObjectWrapper.wrap(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.zzzi
                    private final zzzj zzckf;
                    private final Context zzckg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzckf = this;
                        this.zzckg = context;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzckf.getRewardedVideoAdInstance(this.zzckg);
                    }
                }));
                if (this.zzckm.getTagForChildDirectedTreatment() != -1 || this.zzckm.getTagForUnderAgeOfConsent() != -1) {
                    zza(this.zzckm);
                }
                zzabh.initialize(context);
                if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcvf)).booleanValue() && !getVersionString().endsWith(InAppError.SUCCESS)) {
                    zzaym.zzev("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.zzckn = new InitializationStatus(this) { // from class: com.google.android.gms.internal.ads.zzzk
                        private final zzzj zzckf;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzckf = this;
                        }

                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            zzzj zzzjVar = this.zzckf;
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzzm(zzzjVar));
                            return hashMap;
                        }
                    };
                    if (onInitializationCompleteListener != null) {
                        zzayd.zzaae.post(new Runnable(this, onInitializationCompleteListener) { // from class: com.google.android.gms.internal.ads.zzzl
                            private final zzzj zzckf;
                            private final OnInitializationCompleteListener zzcko;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzckf = this;
                                this.zzcko = onInitializationCompleteListener;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzckf.zza(this.zzcko);
                            }
                        });
                    }
                }
            } catch (RemoteException e) {
                zzaym.zzd("MobileAdsSettingManager initialization failed", e);
            }
        }
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (this.lock) {
            if (this.zzckl != null) {
                return this.zzckl;
            }
            zzaug zzaugVar = new zzaug(context, new zzwm(zzwo.zzqn(), context, new zzamu()).zzd(context, false));
            this.zzckl = zzaugVar;
            return zzaugVar;
        }
    }

    public final void setAppVolume(float f) {
        boolean z = true;
        Preconditions.checkArgument(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.lock) {
            if (this.zzckj == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzckj.setAppVolume(f);
            } catch (RemoteException e) {
                zzaym.zzc("Unable to set app volume.", e);
            }
        }
    }

    public final float zzqz() {
        synchronized (this.lock) {
            float f = 1.0f;
            if (this.zzckj == null) {
                return 1.0f;
            }
            try {
                f = this.zzckj.zzqz();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final void setAppMuted(boolean z) {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzckj != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzckj.setAppMuted(z);
            } catch (RemoteException e) {
                zzaym.zzc("Unable to set app mute state.", e);
            }
        }
    }

    public final boolean zzra() {
        synchronized (this.lock) {
            boolean z = false;
            if (this.zzckj == null) {
                return false;
            }
            try {
                z = this.zzckj.zzra();
            } catch (RemoteException e) {
                zzaym.zzc("Unable to get app mute state.", e);
            }
            return z;
        }
    }

    public final void openDebugMenu(Context context, String str) {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzckj != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzckj.zzb(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzaym.zzc("Unable to open debug menu.", e);
            }
        }
    }

    public final String getVersionString() {
        String zzho;
        synchronized (this.lock) {
            Preconditions.checkState(this.zzckj != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzho = zzdwi.zzho(this.zzckj.getVersionString());
            } catch (RemoteException e) {
                zzaym.zzc("Unable to get version string.", e);
                return "";
            }
        }
        return zzho;
    }

    public final void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        synchronized (this.lock) {
            try {
                this.zzckj.zzce(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzaym.zzc("Unable to register RtbAdapter", e);
            }
        }
    }

    public final InitializationStatus getInitializationStatus() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzckj != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.zzckn != null) {
                    return this.zzckn;
                }
                return zzd(this.zzckj.zzrb());
            } catch (RemoteException unused) {
                zzaym.zzev("Unable to get Initialization status.");
                return null;
            }
        }
    }

    public final void disableMediationAdapterInitialization(Context context) {
        synchronized (this.lock) {
            zzg(context);
            try {
                this.zzckj.zzrc();
            } catch (RemoteException unused) {
                zzaym.zzev("Unable to disable mediation adapter initialization.");
            }
        }
    }

    private static InitializationStatus zzd(List<zzaiv> list) {
        HashMap hashMap = new HashMap();
        for (zzaiv zzaivVar : list) {
            hashMap.put(zzaivVar.zzdhk, new zzajd(zzaivVar.zzdhl ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzaivVar.description, zzaivVar.zzdhm));
        }
        return new zzajg(hashMap);
    }

    public final RequestConfiguration getRequestConfiguration() {
        return this.zzckm;
    }

    public final void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.lock) {
            RequestConfiguration requestConfiguration2 = this.zzckm;
            this.zzckm = requestConfiguration;
            if (this.zzckj == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zza(requestConfiguration);
            }
        }
    }

    private final void zza(RequestConfiguration requestConfiguration) {
        try {
            this.zzckj.zza(new zzaak(requestConfiguration));
        } catch (RemoteException e) {
            zzaym.zzc("Unable to set request configuration parcel.", e);
        }
    }

    private final void zzg(Context context) {
        if (this.zzckj == null) {
            this.zzckj = new zzwl(zzwo.zzqn(), context).zzd(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzckn);
    }

    static /* synthetic */ boolean zza(zzzj zzzjVar, boolean z) {
        zzzjVar.zzckk = false;
        return false;
    }

    static /* synthetic */ boolean zzb(zzzj zzzjVar, boolean z) {
        zzzjVar.zzze = true;
        return true;
    }

    static /* synthetic */ InitializationStatus zza(zzzj zzzjVar, List list) {
        return zzd(list);
    }
}
