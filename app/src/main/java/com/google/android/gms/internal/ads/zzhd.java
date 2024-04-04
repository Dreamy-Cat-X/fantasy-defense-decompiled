package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzhd extends Exception {
    private final int type;
    private final int zzaeg;

    public static zzhd zza(Exception exc, int i) {
        return new zzhd(1, null, exc, i);
    }

    public static zzhd zza(IOException iOException) {
        return new zzhd(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhd zza(RuntimeException runtimeException) {
        return new zzhd(2, null, runtimeException, -1);
    }

    private zzhd(int i, String str, Throwable th, int i2) {
        super(null, th);
        this.type = i;
        this.zzaeg = i2;
    }
}
