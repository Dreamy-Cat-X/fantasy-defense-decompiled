package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzpd extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpd(Throwable th) {
        super(r3.toString(), th);
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 13 + String.valueOf(message).length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(": ");
        sb.append(message);
    }
}
