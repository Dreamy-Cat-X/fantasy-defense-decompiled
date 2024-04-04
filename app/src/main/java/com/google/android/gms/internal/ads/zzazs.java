package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzazs implements Runnable {
    private final /* synthetic */ zzazo zzehu;
    private final /* synthetic */ String zzehw;
    private final /* synthetic */ String zzehx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazs(zzazo zzazoVar, String str, String str2) {
        this.zzehu = zzazoVar;
        this.zzehw = str;
        this.zzehx = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazy zzazyVar;
        zzazy zzazyVar2;
        zzazyVar = this.zzehu.zzehq;
        if (zzazyVar != null) {
            zzazyVar2 = this.zzehu.zzehq;
            zzazyVar2.zzl(this.zzehw, this.zzehx);
        }
    }
}
