package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzzp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class QueryInfo {
    private final zzzp zzhqj;

    public QueryInfo(zzzp zzzpVar) {
        this.zzhqj = zzzpVar;
    }

    public String getQuery() {
        return this.zzhqj.getQuery();
    }

    public Bundle getQueryBundle() {
        return this.zzhqj.getQueryBundle();
    }

    public String getRequestId() {
        return zzzp.zza(this);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        new zzaro(context, adFormat, adRequest == null ? null : adRequest.zzds()).zza(queryInfoGenerationCallback);
    }
}
