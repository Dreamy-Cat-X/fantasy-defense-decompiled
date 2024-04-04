package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbvl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdlo implements zzcyj<zzcgg> {
    private final Executor zzfqs;
    private final zzdmw zzfxf;
    private final zzdmz zzgwc;
    private final zzbff zzgya;
    private final Context zzhdr;
    private final zzdjv<zzcgn, zzcgg> zzhdt;
    private zzdzl<zzcgg> zzhes;
    private final zzdkp zzhgs;

    public zzdlo(Context context, Executor executor, zzbff zzbffVar, zzdjv<zzcgn, zzcgg> zzdjvVar, zzdkp zzdkpVar, zzdmz zzdmzVar, zzdmw zzdmwVar) {
        this.zzhdr = context;
        this.zzfqs = executor;
        this.zzgya = zzbffVar;
        this.zzhdt = zzdjvVar;
        this.zzhgs = zzdkpVar;
        this.zzgwc = zzdmzVar;
        this.zzfxf = zzdmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean isLoading() {
        zzdzl<zzcgg> zzdzlVar = this.zzhes;
        return (zzdzlVar == null || zzdzlVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean zza(zzvi zzviVar, String str, zzcyi zzcyiVar, zzcyl<? super zzcgg> zzcylVar) throws RemoteException {
        zzaue zzaueVar = new zzaue(zzviVar, str);
        zzdlp zzdlpVar = null;
        String str2 = zzcyiVar instanceof zzdll ? ((zzdll) zzcyiVar).zzhgq : null;
        if (zzaueVar.zzbup == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Ad unit ID should not be null for rewarded video ad.");
            this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdln
                private final zzdlo zzhgr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhgr = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzhgr.zzaux();
                }
            });
            return false;
        }
        zzdzl<zzcgg> zzdzlVar = this.zzhes;
        if (zzdzlVar != null && !zzdzlVar.isDone()) {
            return false;
        }
        zzdnp.zze(this.zzhdr, zzaueVar.zzdsi.zzcha);
        zzdmx zzavi = this.zzgwc.zzgs(zzaueVar.zzbup).zzg(zzvp.zzqe()).zzh(zzaueVar.zzdsi).zzavi();
        zzdlu zzdluVar = new zzdlu(zzdlpVar);
        zzdluVar.zzfve = zzavi;
        zzdluVar.zzhgq = str2;
        zzdzl<zzcgg> zza = this.zzhdt.zza(new zzdka(zzdluVar), new zzdjx(this) { // from class: com.google.android.gms.internal.ads.zzdlq
            private final zzdlo zzhgr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhgr = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdjx
            public final zzbqa zzc(zzdjy zzdjyVar) {
                return this.zzhgr.zze(zzdjyVar);
            }
        });
        this.zzhes = zza;
        zzdyz.zza(zza, new zzdlp(this, zzcylVar, zzdluVar), this.zzfqs);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzed(int i) {
        this.zzgwc.zzavh().zzee(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzcgm zze(zzdjy zzdjyVar) {
        zzdlu zzdluVar = (zzdlu) zzdjyVar;
        return this.zzgya.zzafi().zzf(new zzbqd.zza().zzcg(this.zzhdr).zza(zzdluVar.zzfve).zzfs(zzdluVar.zzhgq).zza(this.zzfxf).zzalm()).zzf(new zzbvl.zza().zzamj());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaux() {
        this.zzhgs.zzd(zzdns.zza(zzdnu.INVALID_AD_UNIT_ID, null, null));
    }
}
