package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzaeu;
import com.google.android.gms.internal.ads.zzamt;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzauq;
import com.google.android.gms.internal.ads.zzaxc;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzccd;
import com.google.android.gms.internal.ads.zzcxb;
import com.google.android.gms.internal.ads.zzdhl;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzxs;
import com.google.android.gms.internal.ads.zzxy;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class ClientApi extends zzxs {
    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxy zzc(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzarh zzd(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbff.zza(context, zzamtVar, i).zzafb().zzbz(context).zzc(zzvpVar).zzfp(str).zzaht().zzahs();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zzb(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbff.zza(context, zzamtVar, i).zzafg().zzca(context).zzd(zzvpVar).zzfq(str).zzahz().zzahy();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxd zza(IObjectWrapper iObjectWrapper, String str, zzamt zzamtVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzcxb(zzbff.zza(context, zzamtVar, i), context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaen zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzccc((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzatv zza(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbff.zza(context, zzamtVar, i).zzafj().zzcb(context).zzaic().zzaia();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaqs zzb(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zzd = AdOverlayInfoParcel.zzd(activity.getIntent());
        if (zzd == null) {
            return new zzs(activity);
        }
        int i = zzd.zzdrf;
        if (i == 1) {
            return new zzt(activity);
        }
        if (i == 2) {
            return new zzab(activity);
        }
        if (i == 3) {
            return new zzaa(activity);
        }
        if (i == 4) {
            return new zzv(activity, zzd);
        }
        if (i == 5) {
            return new zzz(activity);
        }
        return new zzs(activity);
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxy zza(IObjectWrapper iObjectWrapper, int i) {
        return zzbff.zzh((Context) ObjectWrapper.unwrap(iObjectWrapper), i).zzaez();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, int i) {
        return new zzj((Context) ObjectWrapper.unwrap(iObjectWrapper), zzvpVar, str, new zzayt(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaeu zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzccd((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzauq zzb(IObjectWrapper iObjectWrapper, String str, zzamt zzamtVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return zzbff.zza(context, zzamtVar, i).zzafj().zzcb(context).zzfr(str).zzaic().zzaib();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzxg zzc(IObjectWrapper iObjectWrapper, zzvp zzvpVar, String str, zzamt zzamtVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdhl zzahj = zzbff.zza(context, zzamtVar, i).zzafe().zzfo(str).zzby(context).zzahj();
        if (i >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcva)).intValue()) {
            return zzahj.zzahi();
        }
        return zzahj.zzahh();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaxc zzb(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) {
        return zzbff.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamtVar, i).zzafl();
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final zzaqh zzc(IObjectWrapper iObjectWrapper, zzamt zzamtVar, int i) {
        return zzbff.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamtVar, i).zzafm();
    }
}
