package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchm implements zzbrm {
    private final zzbdh zzdhu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchm(zzbdh zzbdhVar) {
        this.zzdhu = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcom)).booleanValue() ? zzbdhVar : null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcc(Context context) {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            zzbdhVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzcd(Context context) {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            zzbdhVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrm
    public final void zzce(Context context) {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            zzbdhVar.destroy();
        }
    }
}
