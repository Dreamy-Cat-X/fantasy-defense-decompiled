package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgl implements Runnable {
    private final /* synthetic */ zzgm zzabg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgl(zzgm zzgmVar) {
        this.zzabg = zzgmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzabg.zzda();
    }
}
