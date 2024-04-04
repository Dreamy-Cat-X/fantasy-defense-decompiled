package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzckd extends zzckc {
    private final zzdrw zzgkl;

    public zzckd(Executor executor, zzayq zzayqVar, zzdrw zzdrwVar, zzdry zzdryVar) {
        super(executor, zzayqVar, zzdryVar);
        this.zzgkl = zzdrwVar;
        zzaqy();
    }

    public final Map<String, String> zzaqz() {
        return new HashMap(this.zzgka);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzckc
    public final void zzaqy() {
        this.zzgkl.zzq(this.zzgka);
    }
}
