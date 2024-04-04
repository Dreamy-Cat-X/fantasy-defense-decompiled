package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwn extends zzwp<zzaeu> {
    private final /* synthetic */ zzvz zzcig;
    private final /* synthetic */ View zzcir;
    private final /* synthetic */ HashMap zzcis;
    private final /* synthetic */ HashMap zzcit;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwn(zzvz zzvzVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzcig = zzvzVar;
        this.zzcir = view;
        this.zzcis = hashMap;
        this.zzcit = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzaeu zzqi() {
        zzvz.zza(this.zzcir.getContext(), "native_ad_view_holder_delegate");
        return new zzaab();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaeu zzqj() throws RemoteException {
        zzagq zzagqVar;
        zzagqVar = this.zzcig.zzcio;
        return zzagqVar.zzb(this.zzcir, this.zzcis, this.zzcit);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaeu zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zza(ObjectWrapper.wrap(this.zzcir), ObjectWrapper.wrap(this.zzcis), ObjectWrapper.wrap(this.zzcit));
    }
}
