package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdek implements zzdeu<zzder<Bundle>> {
    private final boolean zzhbm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdek(zzdkd zzdkdVar) {
        if (zzdkdVar != null) {
            this.zzhbm = true;
        } else {
            this.zzhbm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        return zzdyz.zzag(this.zzhbm ? zzdej.zzhbl : null);
    }
}
