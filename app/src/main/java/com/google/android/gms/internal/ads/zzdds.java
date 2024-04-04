package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdds implements zzdeu<zzder<Bundle>> {
    private final Context context;
    private final String zzfxe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdds(Context context, String str) {
        this.context = context;
        this.zzfxe = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        return zzdyz.zzag(this.zzfxe == null ? null : new zzder(this) { // from class: com.google.android.gms.internal.ads.zzddr
            private final zzdds zzhav;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhav = this;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj) {
                this.zzhav.zzp((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.context.getPackageName());
    }
}
