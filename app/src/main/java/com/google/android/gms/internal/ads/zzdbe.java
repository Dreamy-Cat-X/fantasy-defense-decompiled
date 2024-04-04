package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbe implements zzdeu<zzdbb> {
    private final Context context;
    private final zzdzk zzgfs;

    public zzdbe(zzdzk zzdzkVar, Context context) {
        this.zzgfs = zzdzkVar;
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdbb> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbd
            private final zzdbe zzgzp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzp = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgzp.zzate();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdbb zzate() throws Exception {
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        return new zzdbb(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzp.zzkv().zzqz(), com.google.android.gms.ads.internal.zzp.zzkv().zzra());
    }
}
