package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzate implements Callable<zzatd> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzatf zzdxa;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzate(zzatf zzatfVar, Context context) {
        this.zzdxa = zzatfVar;
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzatd call() throws Exception {
        WeakHashMap weakHashMap;
        zzatd zzwq;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzdxa.zzdxb;
        zzath zzathVar = (zzath) weakHashMap.get(this.val$context);
        if (zzathVar != null) {
            if (!(zzathVar.zzdxe + zzacw.zzdbw.get().longValue() < com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis())) {
                zzwq = new zzatc(this.val$context, zzathVar.zzdxf).zzwq();
                weakHashMap2 = this.zzdxa.zzdxb;
                weakHashMap2.put(this.val$context, new zzath(this.zzdxa, zzwq));
                return zzwq;
            }
        }
        zzwq = new zzatc(this.val$context).zzwq();
        weakHashMap2 = this.zzdxa.zzdxb;
        weakHashMap2.put(this.val$context, new zzath(this.zzdxa, zzwq));
        return zzwq;
    }
}
