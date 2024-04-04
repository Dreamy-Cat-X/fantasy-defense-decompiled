package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzapy implements View.OnClickListener {
    private final /* synthetic */ zzapv zzdoo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapy(zzapv zzapvVar) {
        this.zzdoo = zzapvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzdoo.zzac(true);
    }
}
