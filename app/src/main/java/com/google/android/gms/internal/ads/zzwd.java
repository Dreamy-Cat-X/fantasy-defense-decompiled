package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwd extends zzwp<zzaxc> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamt zzcif;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwd(zzvz zzvzVar, Context context, zzamt zzamtVar) {
        this.val$context = context;
        this.zzcif = zzamtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* bridge */ /* synthetic */ zzaxc zzqi() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzwp
    /* renamed from: zzqk, reason: merged with bridge method [inline-methods] */
    public final zzaxc zzqj() {
        try {
            return ((zzaxh) zzayp.zza(this.val$context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzwc.zzbxt)).zze(ObjectWrapper.wrap(this.val$context), this.zzcif, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzayr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaxc zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzcif, ModuleDescriptor.MODULE_VERSION);
    }
}
