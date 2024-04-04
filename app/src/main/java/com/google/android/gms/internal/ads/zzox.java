package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzox extends zzou {
    private final int responseCode;
    private final Map<String, List<String>> zzbje;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzox(int i, Map<String, List<String>> map, zzor zzorVar) {
        super(r0.toString(), zzorVar, 1);
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        this.responseCode = i;
        this.zzbje = map;
    }
}
