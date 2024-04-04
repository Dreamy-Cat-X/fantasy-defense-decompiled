package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzepf extends zzepi {
    private String name;

    public zzepf(String str) {
        this.name = str;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zziq(String str) {
        String str2 = this.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
