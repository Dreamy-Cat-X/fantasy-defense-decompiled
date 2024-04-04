package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class ServerSideVerificationOptions {
    private final String zzdxo;
    private final String zzdxp;

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdxo = builder.zzdxo;
        this.zzdxp = builder.zzdxp;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private String zzdxo = "";
        private String zzdxp = "";

        public final Builder setUserId(String str) {
            this.zzdxo = str;
            return this;
        }

        public final Builder setCustomData(String str) {
            this.zzdxp = str;
            return this;
        }

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }
    }

    public String getUserId() {
        return this.zzdxo;
    }

    public String getCustomData() {
        return this.zzdxp;
    }
}
