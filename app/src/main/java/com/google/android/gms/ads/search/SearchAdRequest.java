package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final zzzc zzact;
    private final String zzbqr;

    private SearchAdRequest(Builder builder) {
        this.zzbqr = builder.zzbqr;
        this.zzact = new zzzc(builder.zzacs, this);
    }

    @Deprecated
    public final int getAnchorTextColor() {
        return 0;
    }

    @Deprecated
    public final int getBackgroundColor() {
        return 0;
    }

    @Deprecated
    public final int getBackgroundGradientBottom() {
        return 0;
    }

    @Deprecated
    public final int getBackgroundGradientTop() {
        return 0;
    }

    @Deprecated
    public final int getBorderColor() {
        return 0;
    }

    @Deprecated
    public final int getBorderThickness() {
        return 0;
    }

    @Deprecated
    public final int getBorderType() {
        return 0;
    }

    @Deprecated
    public final int getCallButtonColor() {
        return 0;
    }

    @Deprecated
    public final String getCustomChannels() {
        return null;
    }

    @Deprecated
    public final int getDescriptionTextColor() {
        return 0;
    }

    @Deprecated
    public final String getFontFace() {
        return null;
    }

    @Deprecated
    public final int getHeaderTextColor() {
        return 0;
    }

    @Deprecated
    public final int getHeaderTextSize() {
        return 0;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private final zzzf zzacs = new zzzf();
        private String zzbqr;

        @Deprecated
        public final Builder setAnchorTextColor(int i) {
            return this;
        }

        @Deprecated
        public final Builder setBackgroundColor(int i) {
            return this;
        }

        @Deprecated
        public final Builder setBackgroundGradient(int i, int i2) {
            return this;
        }

        @Deprecated
        public final Builder setBorderColor(int i) {
            return this;
        }

        @Deprecated
        public final Builder setBorderThickness(int i) {
            return this;
        }

        @Deprecated
        public final Builder setBorderType(int i) {
            return this;
        }

        @Deprecated
        public final Builder setCallButtonColor(int i) {
            return this;
        }

        @Deprecated
        public final Builder setCustomChannels(String str) {
            return this;
        }

        @Deprecated
        public final Builder setDescriptionTextColor(int i) {
            return this;
        }

        @Deprecated
        public final Builder setFontFace(String str) {
            return this;
        }

        @Deprecated
        public final Builder setHeaderTextColor(int i) {
            return this;
        }

        @Deprecated
        public final Builder setHeaderTextSize(int i) {
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzacs.zza(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
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

        public final SearchAdRequest build() {
            return new SearchAdRequest(this);
        }

        public final Builder setLocation(Location location) {
            this.zzacs.zza(location);
            return this;
        }

        public final Builder setQuery(String str) {
            this.zzbqr = str;
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzacs.zzck(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzacs.zzz(z);
            return this;
        }
    }

    public final Location getLocation() {
        return this.zzact.getLocation();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzact.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzact.getNetworkExtrasBundle(cls);
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzact.getCustomEventExtrasBundle(cls);
    }

    public final String getQuery() {
        return this.zzbqr;
    }

    public final boolean isTestDevice(Context context) {
        return this.zzact.isTestDevice(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzzc zzds() {
        return this.zzact;
    }
}
