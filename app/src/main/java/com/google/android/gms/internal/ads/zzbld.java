package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbld extends zzblb {
    private final Context context;
    private final View view;
    private final zzbdh zzdhu;
    private final Executor zzfqs;
    private final zzdmh zzfrt;
    private final zzbmw zzfsw;
    private final zzcbt zzfsx;
    private final zzbxj zzfsy;
    private final zzepk<zzcwz> zzfsz;
    private zzvp zzfta;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbld(zzbmy zzbmyVar, Context context, zzdmh zzdmhVar, View view, zzbdh zzbdhVar, zzbmw zzbmwVar, zzcbt zzcbtVar, zzbxj zzbxjVar, zzepk<zzcwz> zzepkVar, Executor executor) {
        super(zzbmyVar);
        this.context = context;
        this.view = view;
        this.zzdhu = zzbdhVar;
        this.zzfrt = zzdmhVar;
        this.zzfsw = zzbmwVar;
        this.zzfsx = zzcbtVar;
        this.zzfsy = zzbxjVar;
        this.zzfsz = zzepkVar;
        this.zzfqs = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final View zzajo() {
        return this.view;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zza(ViewGroup viewGroup, zzvp zzvpVar) {
        zzbdh zzbdhVar;
        if (viewGroup == null || (zzbdhVar = this.zzdhu) == null) {
            return;
        }
        zzbdhVar.zza(zzbew.zzb(zzvpVar));
        viewGroup.setMinimumHeight(zzvpVar.heightPixels);
        viewGroup.setMinimumWidth(zzvpVar.widthPixels);
        this.zzfta = zzvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzyu getVideoController() {
        try {
            return this.zzfsw.getVideoController();
        } catch (zzdnf unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzdmh zzajn() {
        boolean z;
        zzvp zzvpVar = this.zzfta;
        if (zzvpVar != null) {
            return zzdnd.zzh(zzvpVar);
        }
        if (this.zzeqz.zzhig) {
            Iterator<String> it = this.zzeqz.zzhhk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new zzdmh(this.view.getWidth(), this.view.getHeight(), false);
            }
        }
        return zzdnd.zza(this.zzeqz.zzhhs, this.zzfrt);
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final zzdmh zzajw() {
        return this.zzfrt;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final int zzajx() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyk)).booleanValue() && this.zzeqz.zzhik) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyl)).booleanValue()) {
                return 0;
            }
        }
        return this.zzfpl.zzhiz.zzera.zzhio;
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzke() {
        this.zzfsy.zzamp();
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzajy() {
        this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzblc
            private final zzbld zzfsv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsv = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfsv.zzajz();
            }
        });
        super.zzajy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzajz() {
        if (this.zzfsx.zzaok() != null) {
            try {
                this.zzfsx.zzaok().zza(this.zzfsz.get(), ObjectWrapper.wrap(this.context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
