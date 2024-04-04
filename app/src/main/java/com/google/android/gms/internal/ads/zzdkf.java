package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbvl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdkf implements zzcyj<zzbyd> {
    private final Executor zzfqs;
    private final zzdmz zzgwc;
    private final zzcxf zzgwg;
    private final zzbff zzgya;
    private final Context zzhdr;
    private zzacd zzheq;
    private zzdzl<zzbyd> zzhes;
    private final zzdkp zzhgc;

    public zzdkf(Context context, Executor executor, zzbff zzbffVar, zzcxf zzcxfVar, zzdkp zzdkpVar, zzdmz zzdmzVar) {
        this.zzhdr = context;
        this.zzfqs = executor;
        this.zzgya = zzbffVar;
        this.zzgwg = zzcxfVar;
        this.zzgwc = zzdmzVar;
        this.zzhgc = zzdkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean isLoading() {
        zzdzl<zzbyd> zzdzlVar = this.zzhes;
        return (zzdzlVar == null || zzdzlVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean zza(zzvi zzviVar, String str, zzcyi zzcyiVar, zzcyl<? super zzbyd> zzcylVar) {
        zzvp zzvpVar;
        zzbzd zzahu;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Ad unit ID should not be null for interstitial ad.");
            this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdki
                private final zzdkf zzhgf;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhgf = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzhgf.zzauw();
                }
            });
            return false;
        }
        if (isLoading()) {
            return false;
        }
        if (zzcyiVar instanceof zzdkg) {
            zzvpVar = ((zzdkg) zzcyiVar).zzdzu;
        } else {
            zzvpVar = new zzvp();
        }
        zzdmx zzavi = this.zzgwc.zzgs(str).zzg(zzvpVar).zzh(zzviVar).zzavi();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyx)).booleanValue()) {
            zzahu = this.zzgya.zzaff().zze(new zzbqd.zza().zzcg(this.zzhdr).zza(zzavi).zzalm()).zze(new zzbvl.zza().zza((zzbtf) this.zzgwg, this.zzfqs).zza((AppEventListener) this.zzgwg, this.zzfqs).zzamj()).zzb(new zzcwh(this.zzheq)).zzahu();
        } else {
            zzbvl.zza zzaVar = new zzbvl.zza();
            zzdkp zzdkpVar = this.zzhgc;
            if (zzdkpVar != null) {
                zzaVar.zza((zzbqr) zzdkpVar, this.zzfqs).zza((zzbsg) this.zzhgc, this.zzfqs).zza((zzbqw) this.zzhgc, this.zzfqs);
            }
            zzahu = this.zzgya.zzaff().zze(new zzbqd.zza().zzcg(this.zzhdr).zza(zzavi).zzalm()).zze(zzaVar.zza((zzbtf) this.zzgwg, this.zzfqs).zza((zzbqr) this.zzgwg, this.zzfqs).zza((zzbsg) this.zzgwg, this.zzfqs).zza((zzbqw) this.zzgwg, this.zzfqs).zza((zzuz) this.zzgwg, this.zzfqs).zza((AppEventListener) this.zzgwg, this.zzfqs).zza((zzbsy) this.zzgwg, this.zzfqs).zza((zzbrf) this.zzgwg, this.zzfqs).zzamj()).zzb(new zzcwh(this.zzheq)).zzahu();
        }
        zzdzl<zzbyd> zzaky = zzahu.zzagu().zzaky();
        this.zzhes = zzaky;
        zzdyz.zza(zzaky, new zzdkh(this, zzcylVar, zzahu), this.zzfqs);
        return true;
    }

    public final void zza(zzacd zzacdVar) {
        this.zzheq = zzacdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzauw() {
        this.zzgwg.zzd(zzdns.zza(zzdnu.INVALID_AD_UNIT_ID, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdzl zza(zzdkf zzdkfVar, zzdzl zzdzlVar) {
        zzdkfVar.zzhes = null;
        return null;
    }
}
