package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdis implements zzdza<zzblb> {
    private final /* synthetic */ zzcyl zzgxo;
    private final /* synthetic */ zzblx zzhet;
    final /* synthetic */ zzdiq zzheu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdis(zzdiq zzdiqVar, zzcyl zzcylVar, zzblx zzblxVar) {
        this.zzheu = zzdiqVar;
        this.zzgxo = zzcylVar;
        this.zzhet = zzblxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        zzbsx zzbsxVar;
        Executor executor;
        final zzvc zze = this.zzhet.zzagu().zze(th);
        synchronized (this.zzheu) {
            zzdiq.zza(this.zzheu, null);
            this.zzhet.zzagv().zzd(zze);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyv)).booleanValue()) {
                executor = this.zzheu.zzfqs;
                executor.execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzdiu
                    private final zzvc zzgxs;
                    private final zzdis zzhex;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhex = this;
                        this.zzgxs = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxf zzcxfVar;
                        zzdis zzdisVar = this.zzhex;
                        zzvc zzvcVar = this.zzgxs;
                        zzcxfVar = zzdisVar.zzheu.zzgwg;
                        zzcxfVar.zzd(zzvcVar);
                    }
                });
            }
            zzbsxVar = this.zzheu.zzher;
            zzbsxVar.zzdy(60);
            zzdnp.zza(zze.errorCode, th, "BannerAdLoader.onFailure");
            this.zzgxo.zzask();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(zzblb zzblbVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzbsx zzbsxVar;
        Executor executor;
        zzcxf zzcxfVar;
        zzcxf zzcxfVar2;
        zzcxz zzcxzVar;
        zzblb zzblbVar2 = zzblbVar;
        synchronized (this.zzheu) {
            zzdiq.zza(this.zzheu, null);
            viewGroup = this.zzheu.zzfsr;
            viewGroup.removeAllViews();
            if (zzblbVar2.zzajo() != null) {
                ViewParent parent = zzblbVar2.zzajo().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = zzblbVar2.zzako() != null ? zzblbVar2.zzako().getMediationAdapterClassName() : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(mediationAdapterClassName).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(mediationAdapterClassName);
                    sb.append(" already has a parent view. Removing its old parent.");
                    com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
                    ((ViewGroup) parent).removeView(zzblbVar2.zzajo());
                }
            }
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyv)).booleanValue()) {
                zzbuj zzakq = zzblbVar2.zzakq();
                zzcxfVar2 = this.zzheu.zzgwg;
                zzbuj zza = zzakq.zza(zzcxfVar2);
                zzcxzVar = this.zzheu.zzhep;
                zza.zza(zzcxzVar);
            }
            viewGroup2 = this.zzheu.zzfsr;
            viewGroup2.addView(zzblbVar2.zzajo());
            this.zzgxo.onSuccess(zzblbVar2);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyv)).booleanValue()) {
                executor = this.zzheu.zzfqs;
                zzcxfVar = this.zzheu.zzgwg;
                zzcxfVar.getClass();
                executor.execute(zzdir.zzb(zzcxfVar));
            }
            zzbsxVar = this.zzheu.zzher;
            zzbsxVar.zzdy(zzblbVar2.zzajx());
        }
    }
}
