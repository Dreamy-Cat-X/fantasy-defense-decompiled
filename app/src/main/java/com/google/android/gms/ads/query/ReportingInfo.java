package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzarv;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class ReportingInfo {
    private final zzarq zzhqm;

    private ReportingInfo(Builder builder) {
        this.zzhqm = new zzarq(builder.zzhqn);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private final zzarv zzhqn;

        public Builder(View view) {
            zzarv zzarvVar = new zzarv();
            this.zzhqn = zzarvVar;
            zzarvVar.zzk(view);
        }

        public final Builder setAssetViews(Map<String, View> map) {
            this.zzhqn.zzh(map);
            return this;
        }

        public final ReportingInfo build() {
            return new ReportingInfo(this);
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzhqm.updateImpressionUrls(list, updateImpressionUrlsCallback);
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzhqm.updateClickUrl(uri, updateClickUrlCallback);
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        this.zzhqm.reportTouchEvent(motionEvent);
    }
}
