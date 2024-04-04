package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaiu implements Runnable {
    private final /* synthetic */ zzaip zzdhj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiu(zzaip zzaipVar) {
        this.zzdhj = zzaipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdhj.disconnect();
    }
}
