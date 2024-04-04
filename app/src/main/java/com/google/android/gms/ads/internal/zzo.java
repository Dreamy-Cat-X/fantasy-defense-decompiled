package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzef;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzo implements Callable<zzef> {
    private final /* synthetic */ zzj zzbpl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzj zzjVar) {
        this.zzbpl = zzjVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzef call() throws Exception {
        zzayt zzaytVar;
        Context context;
        zzaytVar = this.zzbpl.zzbpd;
        String str = zzaytVar.zzbrf;
        context = this.zzbpl.context;
        return new zzef(zzeg.zzb(str, context, false));
    }
}
