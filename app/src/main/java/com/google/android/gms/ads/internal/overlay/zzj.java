package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzj extends com.google.android.gms.ads.internal.util.zza {
    final /* synthetic */ zze zzdqp;

    private zzj(zze zzeVar) {
        this.zzdqp = zzeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zza
    public final void zzwc() {
        Bitmap zza = com.google.android.gms.ads.internal.zzp.zzlj().zza(Integer.valueOf(this.zzdqp.zzdpw.zzdrh.zzboz));
        if (zza != null) {
            final Drawable zza2 = com.google.android.gms.ads.internal.zzp.zzks().zza(this.zzdqp.zzaap, zza, this.zzdqp.zzdpw.zzdrh.zzbox, this.zzdqp.zzdpw.zzdrh.zzboy);
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, zza2) { // from class: com.google.android.gms.ads.internal.overlay.zzm
                private final zzj zzdqx;
                private final Drawable zzdqy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdqx = this;
                    this.zzdqy = zza2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzj zzjVar = this.zzdqx;
                    zzjVar.zzdqp.zzaap.getWindow().setBackgroundDrawable(this.zzdqy);
                }
            });
        }
    }
}
