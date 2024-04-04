package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwi extends zzwp<zzxd> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcie;
    private final /* synthetic */ zzamt zzcif;
    private final /* synthetic */ zzvz zzcig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwi(zzvz zzvzVar, Context context, String str, zzamt zzamtVar) {
        this.zzcig = zzvzVar;
        this.val$context = context;
        this.zzcie = str;
        this.zzcif = zzamtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzxd zzqi() {
        zzvz.zza(this.val$context, "native_ad");
        return new zzzu();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxd zzqj() throws RemoteException {
        zzvh zzvhVar;
        zzvhVar = this.zzcig.zzcii;
        return zzvhVar.zza(this.val$context, this.zzcie, this.zzcif);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxd zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zza(ObjectWrapper.wrap(this.val$context), this.zzcie, this.zzcif, ModuleDescriptor.MODULE_VERSION);
    }
}
