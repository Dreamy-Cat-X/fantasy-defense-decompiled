package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxu extends com.google.android.gms.ads.internal.util.zza {
    private final /* synthetic */ zzaxs zzeaw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxu(zzaxs zzaxsVar) {
        this.zzeaw = zzaxsVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zza
    public final void zzwc() {
        Context context;
        zzayt zzaytVar;
        Object obj;
        zzabo zzaboVar;
        context = this.zzeaw.context;
        zzaytVar = this.zzeaw.zzbpd;
        zzabl zzablVar = new zzabl(context, zzaytVar.zzbrf);
        obj = this.zzeaw.lock;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzp.zzkz();
                zzaboVar = this.zzeaw.zzeaj;
                zzabq.zza(zzaboVar, zzablVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}
