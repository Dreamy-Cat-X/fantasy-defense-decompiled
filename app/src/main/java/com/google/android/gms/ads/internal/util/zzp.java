package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzayh;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzp implements zzayh {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzeda;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(zzm zzmVar, Context context, String str) {
        this.val$context = context;
        this.zzeda = str;
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    public final void zzel(String str) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzm.zzb(this.val$context, this.zzeda, str);
    }
}
