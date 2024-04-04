package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxq {
    private long zzdzx = -1;
    private long zzdzy = -1;
    private final /* synthetic */ zzaxr zzdzz;

    public zzaxq(zzaxr zzaxrVar) {
        this.zzdzz = zzaxrVar;
    }

    public final long zzxd() {
        return this.zzdzy;
    }

    public final void zzxe() {
        Clock clock;
        clock = this.zzdzz.zzbpw;
        this.zzdzy = clock.elapsedRealtime();
    }

    public final void zzxf() {
        Clock clock;
        clock = this.zzdzz.zzbpw;
        this.zzdzx = clock.elapsedRealtime();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzdzx);
        bundle.putLong("tclose", this.zzdzy);
        return bundle;
    }
}
