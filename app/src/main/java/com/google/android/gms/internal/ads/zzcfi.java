package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcfi implements zzadx {
    private final /* synthetic */ zzcfj zzggz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfi(zzcfj zzcfjVar) {
        this.zzggz = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzc(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final JSONObject zztj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzti() {
        zzcaz zzcazVar;
        zzcaz zzcazVar2;
        zzcazVar = this.zzggz.zzgdt;
        if (zzcazVar != null) {
            zzcazVar2 = this.zzggz.zzgdt;
            zzcazVar2.zzfw(NativeCustomTemplateAd.ASSET_NAME_VIDEO);
        }
    }
}
