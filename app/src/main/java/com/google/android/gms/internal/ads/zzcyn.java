package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbvl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcyn implements zzcyj<zzbmz> {
    private final zzbff zzgtg;
    private final Context zzgwb;
    private final zzdmz zzgwc;
    private final zzcyh zzgxm;
    private zzbng zzgxn;

    public zzcyn(zzbff zzbffVar, Context context, zzcyh zzcyhVar, zzdmz zzdmzVar) {
        this.zzgtg = zzbffVar;
        this.zzgwb = context;
        this.zzgxm = zzcyhVar;
        this.zzgwc = zzdmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean isLoading() {
        zzbng zzbngVar = this.zzgxn;
        return zzbngVar != null && zzbngVar.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean zza(zzvi zzviVar, String str, zzcyi zzcyiVar, zzcyl<? super zzbmz> zzcylVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzba(this.zzgwb) && zzviVar.zzchk == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Failed to load the ad because app ID is missing.");
            this.zzgtg.zzaet().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcym
                private final zzcyn zzgxl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgxl = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgxl.zzasv();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Ad unit ID should not be null for NativeAdLoader.");
            this.zzgtg.zzaet().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcyp
                private final zzcyn zzgxl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgxl = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgxl.zzasu();
                }
            });
            return false;
        }
        zzdnp.zze(this.zzgwb, zzviVar.zzcha);
        zzbzz zzagc = this.zzgtg.zzafh().zza(new zzbqd.zza().zzcg(this.zzgwb).zza(this.zzgwc.zzh(zzviVar).zzef(zzcyiVar instanceof zzcyk ? ((zzcyk) zzcyiVar).zzgxk : 1).zzavi()).zzalm()).zza(new zzbvl.zza().zzamj()).zza(this.zzgxm.zzasq()).zza(new zzbkw(null)).zzagc();
        this.zzgtg.zzafn().ensureSize(1);
        zzbng zzbngVar = new zzbng(this.zzgtg.zzaev(), this.zzgtg.zzaeu(), zzagc.zzagu().zzaky());
        this.zzgxn = zzbngVar;
        zzbngVar.zza(new zzcyo(this, zzcylVar, zzagc));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzasu() {
        this.zzgxm.zzast().zzd(zzdns.zza(zzdnu.INVALID_AD_UNIT_ID, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzasv() {
        this.zzgxm.zzast().zzd(zzdns.zza(zzdnu.APP_ID_MISSING, null, null));
    }
}
