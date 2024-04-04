package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwh extends zzwp<zzxg> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvp zzcid;
    private final /* synthetic */ String zzcie;
    private final /* synthetic */ zzamt zzcif;
    private final /* synthetic */ zzvz zzcig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwh(zzvz zzvzVar, Context context, zzvp zzvpVar, String str, zzamt zzamtVar) {
        this.zzcig = zzvzVar;
        this.val$context = context;
        this.zzcid = zzvpVar;
        this.zzcie = str;
        this.zzcif = zzamtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxg zzqi() {
        zzvz.zza(this.val$context, "app_open");
        return new zzzy();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxg zzqj() throws RemoteException {
        zzvg zzvgVar;
        zzvgVar = this.zzcig.zzcih;
        return zzvgVar.zza(this.val$context, this.zzcid, this.zzcie, this.zzcif, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzxg zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zzc(ObjectWrapper.wrap(this.val$context), this.zzcid, this.zzcie, this.zzcif, ModuleDescriptor.MODULE_VERSION);
    }
}
