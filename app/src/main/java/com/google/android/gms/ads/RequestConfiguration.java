package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaym;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public static final List<String> zzadp = Arrays.asList("MA", "T", "PG", "G");
    private final int zzadl;
    private final int zzadm;
    private final String zzadn;
    private final List<String> zzado;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: D:\decomp\classes.dex */
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: D:\decomp\classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: D:\decomp\classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    private RequestConfiguration(int i, int i2, String str, List<String> list) {
        this.zzadl = i;
        this.zzadm = i2;
        this.zzadn = str;
        this.zzado = list;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class Builder {
        private int zzadl = -1;
        private int zzadm = -1;
        private String zzadn = null;
        private final List<String> zzado = new ArrayList();

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zzadl, this.zzadm, this.zzadn, this.zzado);
        }

        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzadl = i;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                zzaym.zzex(sb.toString());
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.zzadm = i;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                zzaym.zzex(sb.toString());
            }
            return this;
        }

        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.zzadn = null;
            } else if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
                this.zzadn = str;
            } else {
                String valueOf = String.valueOf(str);
                zzaym.zzex(valueOf.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(valueOf) : new String("Invalid value passed to setMaxAdContentRating: "));
            }
            return this;
        }

        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.zzado.clear();
            if (list != null) {
                this.zzado.addAll(list);
            }
            return this;
        }
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzadl;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzadm;
    }

    public String getMaxAdContentRating() {
        String str = this.zzadn;
        return str == null ? "" : str;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zzado);
    }

    public Builder toBuilder() {
        return new Builder().setTagForChildDirectedTreatment(this.zzadl).setTagForUnderAgeOfConsent(this.zzadm).setMaxAdContentRating(this.zzadn).setTestDeviceIds(this.zzado);
    }
}
