package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxn implements zzbxk {
    private final List<String> zzduf;
    private final zzdsh zzfpv;
    private boolean zzfzj;

    public zzbxn(zzdmi zzdmiVar, zzdsh zzdshVar) {
        this.zzduf = zzdmiVar.zzduf;
        this.zzfpv = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxk
    public final void zzamp() {
        if (this.zzfzj) {
            return;
        }
        this.zzfpv.zzk(this.zzduf);
        this.zzfzj = true;
    }
}
