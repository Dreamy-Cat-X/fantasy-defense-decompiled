package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwb extends zzwp<zzauq> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcie;
    private final /* synthetic */ zzamt zzcif;
    private final /* synthetic */ zzvz zzcig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwb(zzvz zzvzVar, Context context, String str, zzamt zzamtVar) {
        this.zzcig = zzvzVar;
        this.val$context = context;
        this.zzcie = str;
        this.zzcif = zzamtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzauq zzqi() {
        zzvz.zza(this.val$context, "rewarded");
        return new zzaae();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzauq zzqj() throws RemoteException {
        return zzavg.zzd(this.val$context, this.zzcie, this.zzcif);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzauq zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzcie, this.zzcif, ModuleDescriptor.MODULE_VERSION);
    }
}
