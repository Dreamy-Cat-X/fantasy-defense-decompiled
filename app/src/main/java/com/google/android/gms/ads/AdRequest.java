package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzf;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;

    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @Deprecated
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    protected final zzzc zzact;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    /* loaded from: D:\decomp\classes.dex */
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    /* loaded from: D:\decomp\classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AdRequest(Builder builder) {
        this.zzact = new zzzc(builder.zzacs);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class Builder {
        protected final zzzf zzacs;

        public Builder() {
            zzzf zzzfVar = new zzzf();
            this.zzacs = zzzfVar;
            zzzfVar.zzcg("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public Builder addKeyword(String str) {
            this.zzacs.zzcf(str);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzacs.zza(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zzacs.zza(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zzacs.zzch("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzacs.zzb(cls, bundle);
            return this;
        }

        @Deprecated
        public Builder addTestDevice(String str) {
            this.zzacs.zzcg(str);
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        @Deprecated
        public Builder setBirthday(Date date) {
            this.zzacs.zza(date);
            return this;
        }

        public Builder setContentUrl(String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zzacs.zzci(str);
            return this;
        }

        public Builder setNeighboringContentUrls(List<String> list) {
            if (list == null) {
                zzaym.zzex("neighboring content URLs list should not be null");
                return this;
            }
            this.zzacs.zzc(list);
            return this;
        }

        @Deprecated
        public Builder setGender(int i) {
            this.zzacs.zzcx(i);
            return this;
        }

        public Builder setLocation(Location location) {
            this.zzacs.zza(location);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.zzacs.zzck(str);
            return this;
        }

        @Deprecated
        public Builder tagForChildDirectedTreatment(boolean z) {
            this.zzacs.zzz(z);
            return this;
        }

        @Deprecated
        public Builder setIsDesignedForFamilies(boolean z) {
            this.zzacs.zzaa(z);
            return this;
        }

        public Builder setAdInfo(AdInfo adInfo) {
            this.zzacs.zza(adInfo);
            return this;
        }

        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i) {
            this.zzacs.zzcy(i);
            return this;
        }

        @Deprecated
        public Builder setMaxAdContentRating(String str) {
            this.zzacs.zzcm(str);
            return this;
        }

        public Builder setHttpTimeoutMillis(int i) {
            this.zzacs.zzcz(i);
            return this;
        }
    }

    @Deprecated
    public Date getBirthday() {
        return this.zzact.getBirthday();
    }

    public String getContentUrl() {
        return this.zzact.getContentUrl();
    }

    public List<String> getNeighboringContentUrls() {
        return this.zzact.zzrg();
    }

    @Deprecated
    public int getGender() {
        return this.zzact.getGender();
    }

    public Set<String> getKeywords() {
        return this.zzact.getKeywords();
    }

    public Location getLocation() {
        return this.zzact.getLocation();
    }

    @Deprecated
    public <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzact.getNetworkExtras(cls);
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzact.getNetworkExtrasBundle(cls);
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzact.getCustomEventExtrasBundle(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.zzact.isTestDevice(context);
    }

    public zzzc zzds() {
        return this.zzact;
    }
}
