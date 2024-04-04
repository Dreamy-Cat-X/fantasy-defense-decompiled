package com.google.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class AdRequest {
    public static final String LOGTAG = "Ads";
    public static final String TEST_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final String VERSION = "0.0.0";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private AdRequest() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum ErrorCode {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");

        private final String description;

        ErrorCode(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.description;
        }
    }
}
