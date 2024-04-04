package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbkj;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbvl;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdhn<AppOpenAd extends zzbmz, AppOpenRequestComponent extends zzbkj<AppOpenAd>, AppOpenRequestComponentBuilder extends zzbqa<AppOpenRequestComponent>> implements zzcyj<AppOpenAd> {
    private final Executor zzfqs;
    private final ViewGroup zzfsr;
    private final zzdmz zzgwc;
    protected final zzbff zzgya;
    private final Context zzhdr;
    private final zzdht zzhds;
    private final zzdjv<AppOpenRequestComponent, AppOpenAd> zzhdt;

    @Nullable
    private zzdzl<AppOpenAd> zzhdu;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdhn(Context context, Executor executor, zzbff zzbffVar, zzdjv<AppOpenRequestComponent, AppOpenAd> zzdjvVar, zzdht zzdhtVar, zzdmz zzdmzVar) {
        this.zzhdr = context;
        this.zzfqs = executor;
        this.zzgya = zzbffVar;
        this.zzhdt = zzdjvVar;
        this.zzhds = zzdhtVar;
        this.zzgwc = zzdmzVar;
        this.zzfsr = new FrameLayout(context);
    }

    protected abstract AppOpenRequestComponentBuilder zza(zzbkw zzbkwVar, zzbqd zzbqdVar, zzbvl zzbvlVar);

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final boolean isLoading() {
        zzdzl<AppOpenAd> zzdzlVar = this.zzhdu;
        return (zzdzlVar == null || zzdzlVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final synchronized boolean zza(zzvi zzviVar, String str, zzcyi zzcyiVar, zzcyl<? super AppOpenAd> zzcylVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Ad unit ID should not be null for app open ad.");
            this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdhq
                private final zzdhn zzhdv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhdv = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzhdv.zzauh();
                }
            });
            return false;
        }
        if (this.zzhdu != null) {
            return false;
        }
        zzdnp.zze(this.zzhdr, zzviVar.zzcha);
        zzdmx zzavi = this.zzgwc.zzgs(str).zzg(zzvp.zzqf()).zzh(zzviVar).zzavi();
        zzdhu zzdhuVar = new zzdhu(null);
        zzdhuVar.zzfve = zzavi;
        zzdzl<AppOpenAd> zza = this.zzhdt.zza(new zzdka(zzdhuVar), new zzdjx(this) { // from class: com.google.android.gms.internal.ads.zzdhp
            private final zzdhn zzhdv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhdv = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdjx
            public final zzbqa zzc(zzdjy zzdjyVar) {
                return this.zzhdv.zzb(zzdjyVar);
            }
        });
        this.zzhdu = zza;
        zzdyz.zza(zza, new zzdhs(this, zzcylVar, zzdhuVar), this.zzfqs);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized AppOpenRequestComponentBuilder zzb(zzdjy zzdjyVar) {
        zzdhu zzdhuVar = (zzdhu) zzdjyVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyw)).booleanValue()) {
            return zza(new zzbkw(this.zzfsr), new zzbqd.zza().zzcg(this.zzhdr).zza(zzdhuVar.zzfve).zzalm(), new zzbvl.zza().zzamj());
        }
        zzdht zzb = zzdht.zzb(this.zzhds);
        zzbvl.zza zzaVar = new zzbvl.zza();
        zzaVar.zza((zzbqw) zzb, this.zzfqs);
        zzaVar.zza((zzbsl) zzb, this.zzfqs);
        zzaVar.zza((com.google.android.gms.ads.internal.overlay.zzp) zzb, this.zzfqs);
        zzaVar.zza(zzb);
        return zza(new zzbkw(this.zzfsr), new zzbqd.zza().zzcg(this.zzhdr).zza(zzdhuVar.zzfve).zzalm(), zzaVar.zzamj());
    }

    public final void zza(zzvu zzvuVar) {
        this.zzgwc.zzb(zzvuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzauh() {
        this.zzhds.zzd(zzdns.zza(zzdnu.INVALID_AD_UNIT_ID, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdzl zza(zzdhn zzdhnVar, zzdzl zzdzlVar) {
        zzdhnVar.zzhdu = null;
        return null;
    }
}
