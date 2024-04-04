package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzcuq extends zzcvs {
    private zzbxp zzgtw;

    public zzcuq(zzbqq zzbqqVar, zzbri zzbriVar, zzbrr zzbrrVar, zzbsb zzbsbVar, zzbqy zzbqyVar, zzbuy zzbuyVar, zzbxu zzbxuVar, zzbso zzbsoVar, zzbxp zzbxpVar, zzbur zzburVar) {
        super(zzbqqVar, zzbriVar, zzbrrVar, zzbsbVar, zzbuyVar, zzbsoVar, zzbxuVar, zzburVar, zzbqyVar);
        this.zzgtw = zzbxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void zzvd() {
        this.zzgtw.zzua();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void zzve() throws RemoteException {
        this.zzgtw.zzub();
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void zza(zzaup zzaupVar) throws RemoteException {
        super.zza(zzaupVar);
        this.zzgtw.zza(new zzaun(zzaupVar.getType(), zzaupVar.getAmount()));
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzaun zzaunVar) {
        super.zzb(zzaunVar);
        this.zzgtw.zza(zzaunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs, com.google.android.gms.internal.ads.zzamz
    public final void onVideoEnd() {
        this.zzgtw.zzub();
    }
}
