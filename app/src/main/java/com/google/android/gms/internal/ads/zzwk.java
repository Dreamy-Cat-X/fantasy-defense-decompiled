package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwk extends zzwp<zzaen> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvz zzcig;
    private final /* synthetic */ FrameLayout zzcip;
    private final /* synthetic */ FrameLayout zzciq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwk(zzvz zzvzVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzcig = zzvzVar;
        this.zzcip = frameLayout;
        this.zzciq = frameLayout2;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    protected final /* synthetic */ zzaen zzqi() {
        zzvz.zza(this.val$context, "native_ad_view_delegate");
        return new zzaac();
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaen zzqj() throws RemoteException {
        zzagn zzagnVar;
        zzagnVar = this.zzcig.zzcik;
        return zzagnVar.zzb(this.val$context, this.zzcip, this.zzciq);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final /* synthetic */ zzaen zza(zzxt zzxtVar) throws RemoteException {
        return zzxtVar.zza(ObjectWrapper.wrap(this.zzcip), ObjectWrapper.wrap(this.zzciq));
    }
}
