package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzazq implements Runnable {
    private final /* synthetic */ MediaPlayer zzeht;
    private final /* synthetic */ zzazo zzehu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazq(zzazo zzazoVar, MediaPlayer mediaPlayer) {
        this.zzehu = zzazoVar;
        this.zzeht = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazy zzazyVar;
        zzazy zzazyVar2;
        this.zzehu.zza(this.zzeht);
        zzazyVar = this.zzehu.zzehq;
        if (zzazyVar != null) {
            zzazyVar2 = this.zzehu.zzehq;
            zzazyVar2.zzfb();
        }
    }
}
