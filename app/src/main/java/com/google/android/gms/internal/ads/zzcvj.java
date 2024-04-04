package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcvj extends zzaui {
    private final /* synthetic */ zzbso zzguh;
    private final /* synthetic */ zzbqq zzgui;
    private final /* synthetic */ zzbrr zzguj;
    private final /* synthetic */ zzbxp zzguk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvj(zzcvf zzcvfVar, zzbso zzbsoVar, zzbqq zzbqqVar, zzbrr zzbrrVar, zzbxp zzbxpVar) {
        this.zzguh = zzbsoVar;
        this.zzgui = zzbqqVar;
        this.zzguj = zzbrrVar;
        this.zzguk = zzbxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzaf(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzag(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzb(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzd(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzah(IObjectWrapper iObjectWrapper) {
        this.zzguh.zzvn();
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzaj(IObjectWrapper iObjectWrapper) {
        this.zzguh.zza(com.google.android.gms.ads.internal.overlay.zzl.OTHER);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzak(IObjectWrapper iObjectWrapper) {
        this.zzgui.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzal(IObjectWrapper iObjectWrapper) {
        this.zzguj.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zza(IObjectWrapper iObjectWrapper, zzaun zzaunVar) {
        this.zzguk.zza(zzaunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzai(IObjectWrapper iObjectWrapper) {
        this.zzguk.zzua();
    }

    @Override // com.google.android.gms.internal.ads.zzauj
    public final void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzguj.onRewardedVideoCompleted();
    }
}
