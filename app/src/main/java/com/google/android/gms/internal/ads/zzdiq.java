package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbvl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdiq implements zzcyj<zzblb> {
    private final Executor zzfqs;
    private final ViewGroup zzfsr;
    private final zzdmz zzgwc;
    private final zzcxf zzgwg;
    private final zzbff zzgya;
    private final Context zzhdr;
    private final zzcxz zzhep;
    private zzacd zzheq;
    private final zzbsx zzher;
    private zzdzl<zzblb> zzhes;

    public zzdiq(Context context, Executor executor, zzvp zzvpVar, zzbff zzbffVar, zzcxf zzcxfVar, zzcxz zzcxzVar, zzdmz zzdmzVar) {
        this.zzhdr = context;
        this.zzfqs = executor;
        this.zzgya = zzbffVar;
        this.zzgwg = zzcxfVar;
        this.zzhep = zzcxzVar;
        this.zzgwc = zzdmzVar;
        this.zzher = zzbffVar.zzaex();
        this.zzfsr = new FrameLayout(context);
        zzdmzVar.zzg(zzvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean isLoading() {
        zzdzl<zzblb> zzdzlVar = this.zzhes;
        return (zzdzlVar == null || zzdzlVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean zza(zzvi zzviVar, String str, zzcyi zzcyiVar, zzcyl<? super zzblb> zzcylVar) throws RemoteException {
        zzblx zzahm;
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Ad unit ID should not be null for banner ad.");
            this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdip
                private final zzdiq zzheo;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzheo = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzheo.zzauo();
                }
            });
            return false;
        }
        if (isLoading()) {
            return false;
        }
        zzdmx zzavi = this.zzgwc.zzgs(str).zzh(zzviVar).zzavi();
        if (zzadf.zzddf.get().booleanValue() && this.zzgwc.zzkf().zzchu) {
            zzcxf zzcxfVar = this.zzgwg;
            if (zzcxfVar != null) {
                zzcxfVar.zzd(zzdns.zza(zzdnu.INVALID_AD_SIZE, null, null));
            }
            return false;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyv)).booleanValue()) {
            zzahm = this.zzgya.zzafa().zzd(new zzbqd.zza().zzcg(this.zzhdr).zza(zzavi).zzalm()).zzd(new zzbvl.zza().zza((zzbtf) this.zzgwg, this.zzfqs).zza((AppEventListener) this.zzgwg, this.zzfqs).zzamj()).zza(new zzcwh(this.zzheq)).zzb(new zzbzv(zzcbt.zzgdl, null)).zza(new zzbms(this.zzher)).zzd(new zzbkw(this.zzfsr)).zzahm();
        } else {
            zzahm = this.zzgya.zzafa().zzd(new zzbqd.zza().zzcg(this.zzhdr).zza(zzavi).zzalm()).zzd(new zzbvl.zza().zza((zzbtf) this.zzgwg, this.zzfqs).zza((zzuz) this.zzgwg, this.zzfqs).zza(this.zzhep, this.zzfqs).zza((zzbrj) this.zzgwg, this.zzfqs).zza((zzbqr) this.zzgwg, this.zzfqs).zza((zzbsg) this.zzgwg, this.zzfqs).zza((zzbqw) this.zzgwg, this.zzfqs).zza((AppEventListener) this.zzgwg, this.zzfqs).zza((zzbsy) this.zzgwg, this.zzfqs).zzamj()).zza(new zzcwh(this.zzheq)).zzb(new zzbzv(zzcbt.zzgdl, null)).zza(new zzbms(this.zzher)).zzd(new zzbkw(this.zzfsr)).zzahm();
        }
        zzdzl<zzblb> zzaky = zzahm.zzagu().zzaky();
        this.zzhes = zzaky;
        zzdyz.zza(zzaky, new zzdis(this, zzcylVar, zzahm), this.zzfqs);
        return true;
    }

    public final ViewGroup zzauk() {
        return this.zzfsr;
    }

    public final void zza(zzacd zzacdVar) {
        this.zzheq = zzacdVar;
    }

    public final void zza(zzwq zzwqVar) {
        this.zzhep.zzb(zzwqVar);
    }

    public final zzdmz zzaul() {
        return this.zzgwc;
    }

    public final boolean zzaum() {
        Object parent = this.zzfsr.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return com.google.android.gms.ads.internal.zzp.zzkq().zza(view, view.getContext());
    }

    public final void zza(zzbtb zzbtbVar) {
        this.zzher.zza(zzbtbVar, this.zzfqs);
    }

    public final void zzaun() {
        this.zzher.zzdy(60);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzauo() {
        this.zzgwg.zzd(zzdns.zza(zzdnu.INVALID_AD_UNIT_ID, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdzl zza(zzdiq zzdiqVar, zzdzl zzdzlVar) {
        zzdiqVar.zzhes = null;
        return null;
    }
}
