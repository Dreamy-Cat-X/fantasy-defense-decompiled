package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeb implements Runnable {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Context zzxi;
    private final /* synthetic */ String zzxj;
    private final /* synthetic */ View zzxk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(zzdx zzdxVar, Context context, String str, View view, Activity activity) {
        this.zzxi = context;
        this.zzxj = str;
        this.zzxk = view;
        this.val$activity = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdsn zzdsnVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdx.zzwe;
            zzdpVar.zza(this.zzxi, this.zzxj, this.zzxk, this.val$activity);
        } catch (Exception e) {
            zzdsnVar = zzdx.zzwg;
            zzdsnVar.zza(2021, -1L, e);
        }
    }
}
