package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzmw implements zznm {
    private final int track;
    private final /* synthetic */ zzmr zzbdi;

    public zzmw(zzmr zzmrVar, int i) {
        this.zzbdi = zzmrVar;
        this.track = i;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final boolean isReady() {
        return this.zzbdi.zzaz(this.track);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzhs() throws IOException {
        this.zzbdi.zzhs();
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final int zzb(zzhu zzhuVar, zzjo zzjoVar, boolean z) {
        return this.zzbdi.zza(this.track, zzhuVar, zzjoVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzeh(long j) {
        this.zzbdi.zze(this.track, j);
    }
}
