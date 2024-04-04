package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzayq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbp extends zza {
    private final String url;
    private final zzayq zzeex;

    public zzbp(Context context, String str, String str2) {
        this(str2, com.google.android.gms.ads.internal.zzp.zzkq().zzq(context, str));
    }

    private zzbp(String str, String str2) {
        this.zzeex = new zzayq(str2);
        this.url = str;
    }

    @Override // com.google.android.gms.ads.internal.util.zza
    public final void zzwc() {
        this.zzeex.zzel(this.url);
    }
}
