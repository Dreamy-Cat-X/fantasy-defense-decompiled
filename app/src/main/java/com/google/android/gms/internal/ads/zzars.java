package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzars extends zzarm {
    private final /* synthetic */ UpdateClickUrlCallback zzdrw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzars(zzarq zzarqVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzdrw = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void onSuccess(List<Uri> list) {
        this.zzdrw.onSuccess(list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final void onError(String str) {
        this.zzdrw.onFailure(str);
    }
}
