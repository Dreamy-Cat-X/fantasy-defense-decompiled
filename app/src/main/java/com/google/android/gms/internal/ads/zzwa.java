package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwa extends zzwp<zzaqs> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzvz zzcig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwa(zzvz zzvzVar, Activity activity) {
        this.zzcig = zzvzVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzaqs zzqi() {
        zzvz.zza(this.val$activity, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaqs zzqj() throws RemoteException {
        zzaqt zzaqtVar;
        zzaqtVar = this.zzcig.zzcin;
        return zzaqtVar.zze(this.val$activity);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaqs zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zzb(ObjectWrapper.wrap(this.val$activity));
    }
}
