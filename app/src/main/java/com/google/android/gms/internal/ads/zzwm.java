package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwm extends zzwp<zzatv> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamt zzcif;
    private final /* synthetic */ zzvz zzcig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwm(zzvz zzvzVar, Context context, zzamt zzamtVar) {
        this.zzcig = zzvzVar;
        this.val$context = context;
        this.zzcif = zzamtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzatv zzqi() {
        zzvz.zza(this.val$context, "rewarded_video");
        return new zzaag();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzatv zzqj() throws RemoteException {
        zzauc zzaucVar;
        zzaucVar = this.zzcig.zzcil;
        return zzaucVar.zzc(this.val$context, this.zzcif);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzatv zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zza(ObjectWrapper.wrap(this.val$context), this.zzcif, ModuleDescriptor.MODULE_VERSION);
    }
}
