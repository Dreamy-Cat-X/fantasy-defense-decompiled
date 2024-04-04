package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamb implements zzaze {
    private final /* synthetic */ zzazc zzdhc;
    private final /* synthetic */ zzalb zzdjs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamb(zzalz zzalzVar, zzazc zzazcVar, zzalb zzalbVar) {
        this.zzdhc = zzazcVar;
        this.zzdjs = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaze
    public final void run() {
        this.zzdhc.setException(new zzaln("Unable to obtain a JavascriptEngine."));
        this.zzdjs.release();
    }
}
