package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwf extends zzwp<zzaqh> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamt zzcif;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwf(zzvz zzvzVar, Context context, zzamt zzamtVar) {
        this.val$context = context;
        this.zzcif = zzamtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* bridge */ /* synthetic */ zzaqh zzqi() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzwp
    /* renamed from: zzql, reason: merged with bridge method [inline-methods] */
    public final zzaqh zzqj() {
        try {
            return ((zzaqm) zzayp.zza(this.val$context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzwe.zzbxt)).zzc(ObjectWrapper.wrap(this.val$context), this.zzcif, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzayr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaqh zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zzc(ObjectWrapper.wrap(this.val$context), this.zzcif, ModuleDescriptor.MODULE_VERSION);
    }
}
