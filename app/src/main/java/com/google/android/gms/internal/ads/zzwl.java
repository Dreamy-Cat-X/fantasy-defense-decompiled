package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwl extends zzwp<zzxy> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvz zzcig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwl(zzvz zzvzVar, Context context) {
        this.zzcig = zzvzVar;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzxy zzqi() {
        zzvz.zza(this.val$context, "mobile_ads_settings");
        return new zzaaa();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxy zzqj() throws RemoteException {
        zzzr zzzrVar;
        zzzrVar = this.zzcig.zzcij;
        return zzzrVar.zzh(this.val$context);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxy zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zza(ObjectWrapper.wrap(this.val$context), ModuleDescriptor.MODULE_VERSION);
    }
}
