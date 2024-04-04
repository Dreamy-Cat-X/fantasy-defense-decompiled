package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzad implements Runnable {
    private final /* synthetic */ String val$tag;
    private final /* synthetic */ long zzbc;
    private final /* synthetic */ zzaa zzbd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(zzaa zzaaVar, String str, long j) {
        this.zzbd = zzaaVar;
        this.val$tag = str;
        this.zzbc = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaq.zza zzaVar;
        zzaq.zza zzaVar2;
        zzaVar = this.zzbd.zzao;
        zzaVar.zza(this.val$tag, this.zzbc);
        zzaVar2 = this.zzbd.zzao;
        zzaVar2.zzd(this.zzbd.toString());
    }
}
