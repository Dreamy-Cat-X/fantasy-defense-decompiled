package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzec implements Runnable {
    private final /* synthetic */ Context zzxi;
    private final /* synthetic */ View zzxk;
    private final /* synthetic */ Activity zzxl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzdx zzdxVar, Context context, View view, Activity activity) {
        this.zzxi = context;
        this.zzxk = view;
        this.zzxl = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdsn zzdsnVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdx.zzwe;
            zzdpVar.zza(this.zzxi, this.zzxk, this.zzxl);
        } catch (Exception e) {
            zzdsnVar = zzdx.zzwg;
            zzdsnVar.zza(2020, -1L, e);
        }
    }
}
