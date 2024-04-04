package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdValue {
    private final int zzacz;
    private final String zzada;
    private final long zzadb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: D:\decomp\classes.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, String str, long j) {
        this.zzacz = i;
        this.zzada = str;
        this.zzadb = j;
    }

    public static AdValue zza(int i, String str, long j) {
        return new AdValue(i, str, j);
    }

    public final int getPrecisionType() {
        return this.zzacz;
    }

    public final String getCurrencyCode() {
        return this.zzada;
    }

    public final long getValueMicros() {
        return this.zzadb;
    }
}
