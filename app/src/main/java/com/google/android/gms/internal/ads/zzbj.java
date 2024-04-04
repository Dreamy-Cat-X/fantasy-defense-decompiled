package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbj implements zzaz {
    private final /* synthetic */ Context val$appContext;
    private File zzcw = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(Context context) {
        this.val$appContext = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final File zzo() {
        if (this.zzcw == null) {
            this.zzcw = new File(this.val$appContext.getCacheDir(), "volley");
        }
        return this.zzcw;
    }
}
