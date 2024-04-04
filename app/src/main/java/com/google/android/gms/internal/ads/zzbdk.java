package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbdk implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzawd zzepr;
    private final /* synthetic */ zzbdg zzeps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdk(zzbdg zzbdgVar, zzawd zzawdVar) {
        this.zzeps = zzbdgVar;
        this.zzepr = zzawdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzeps.zza(view, this.zzepr, 10);
    }
}
