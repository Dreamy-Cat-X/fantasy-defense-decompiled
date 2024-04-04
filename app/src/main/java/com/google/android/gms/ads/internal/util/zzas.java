package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzas extends Exception {
    private final int errorCode;

    public zzas(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
