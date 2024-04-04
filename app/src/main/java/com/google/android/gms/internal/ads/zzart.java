package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzart extends zzarm {
    private final /* synthetic */ UpdateImpressionUrlsCallback zzdrx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzart(zzarq zzarqVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzdrx = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void onSuccess(List<Uri> list) {
        this.zzdrx.onSuccess(list);
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void onError(String str) {
        this.zzdrx.onFailure(str);
    }
}
