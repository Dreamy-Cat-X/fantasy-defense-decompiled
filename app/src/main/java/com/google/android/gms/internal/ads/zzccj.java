package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzccj implements zzadx {
    private final /* synthetic */ zzcdc zzgeg;
    private final /* synthetic */ ViewGroup zzgeh;
    private final /* synthetic */ zzcce zzgei;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccj(zzcce zzcceVar, zzcdc zzcdcVar, ViewGroup viewGroup) {
        this.zzgei = zzcceVar;
        this.zzgeg = zzcdcVar;
        this.zzgeh = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzti() {
        boolean zza;
        zzcce zzcceVar = this.zzgei;
        zza = zzcce.zza(this.zzgeg, zzccc.zzgdp);
        if (zza) {
            this.zzgeg.onClick(this.zzgeh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzc(MotionEvent motionEvent) {
        this.zzgeg.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final JSONObject zztj() {
        return this.zzgeg.zztj();
    }
}
