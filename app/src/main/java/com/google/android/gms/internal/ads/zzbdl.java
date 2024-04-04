package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbdl implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzawd zzepr;
    private final /* synthetic */ zzbdg zzeps;
    private final /* synthetic */ int zzept;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdl(zzbdg zzbdgVar, View view, zzawd zzawdVar, int i) {
        this.zzeps = zzbdgVar;
        this.val$view = view;
        this.zzepr = zzawdVar;
        this.zzept = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeps.zza(this.val$view, this.zzepr, this.zzept - 1);
    }
}
