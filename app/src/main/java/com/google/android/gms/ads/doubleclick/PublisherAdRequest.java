package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
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
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
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

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final zzzc zzact;

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

    private PublisherAdRequest(Builder builder) {
        this.zzact = new zzzc(builder.zzacs);
    }

    @Deprecated
    public static void updateCorrelator() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private final zzzf zzacs = new zzzf();

        public final Builder addKeyword(String str) {
            this.zzacs.zzcf(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzacs.zza(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zzacs.zza(cls, bundle);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzacs.zzb(cls, bundle);
            return this;
        }

        @Deprecated
        public final Builder addTestDevice(String str) {
            this.zzacs.zzcg(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        @Deprecated
        public final Builder setBirthday(Date date) {
            this.zzacs.zza(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zzacs.zzci(str);
            return this;
        }

        public final Builder setNeighboringContentUrls(List<String> list) {
            if (list == null) {
                zzaym.zzex("neighboring content URLs list should not be null");
                return this;
            }
            this.zzacs.zzc(list);
            return this;
        }

        @Deprecated
        public final Builder setGender(int i) {
            this.zzacs.zzcx(i);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzacs.zza(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzacs.setManualImpressionsEnabled(z);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzacs.zzcj(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzacs.zzck(str);
            return this;
        }

        @Deprecated
        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzacs.zzz(z);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzacs.zzd(str, str2);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzacs.zzd(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final Builder addCategoryExclusion(String str) {
            this.zzacs.zzcl(str);
            return this;
        }

        public final Builder setAdInfo(AdInfo adInfo) {
            this.zzacs.zza(adInfo);
            return this;
        }

        @Deprecated
        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzacs.zzaa(z);
            return this;
        }

        @Deprecated
        public final Builder setTagForUnderAgeOfConsent(int i) {
            this.zzacs.zzcy(i);
            return this;
        }

        @Deprecated
        public final Builder setMaxAdContentRating(String str) {
            this.zzacs.zzcm(str);
            return this;
        }

        public final Builder setHttpTimeoutMillis(int i) {
            this.zzacs.zzcz(i);
            return this;
        }
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzact.getBirthday();
    }

    public final String getContentUrl() {
        return this.zzact.getContentUrl();
    }

    public final List<String> getNeighboringContentUrls() {
        return this.zzact.zzrg();
    }

    @Deprecated
    public final int getGender() {
        return this.zzact.getGender();
    }

    public final Set<String> getKeywords() {
        return this.zzact.getKeywords();
    }

    public final Location getLocation() {
        return this.zzact.getLocation();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzact.getManualImpressionsEnabled();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzact.getNetworkExtras(cls);
    }

    public final <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzact.getNetworkExtrasBundle(cls);
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzact.getCustomEventExtrasBundle(cls);
    }

    public final String getPublisherProvidedId() {
        return this.zzact.getPublisherProvidedId();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzact.isTestDevice(context);
    }

    public final Bundle getCustomTargeting() {
        return this.zzact.getCustomTargeting();
    }

    public final zzzc zzds() {
        return this.zzact;
    }
}
