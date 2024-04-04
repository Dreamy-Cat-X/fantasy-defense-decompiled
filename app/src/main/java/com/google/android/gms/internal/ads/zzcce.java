package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.kt.olleh.inapp.net.InAppError;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcce {
    private final Executor executor;
    private final zzadz zzdmv;
    private final com.google.android.gms.ads.internal.util.zzf zzebk;
    private final Executor zzfqs;
    private final zzdmx zzfve;
    private final zzcbi zzgao;
    private final zzcbm zzgbq;
    private final zzcbh zzgbz;
    private final zzccm zzgeb;
    private final zzccu zzgec;

    public zzcce(com.google.android.gms.ads.internal.util.zzf zzfVar, zzdmx zzdmxVar, zzcbm zzcbmVar, zzcbi zzcbiVar, zzccm zzccmVar, zzccu zzccuVar, Executor executor, Executor executor2, zzcbh zzcbhVar) {
        this.zzebk = zzfVar;
        this.zzfve = zzdmxVar;
        this.zzdmv = zzdmxVar.zzdmv;
        this.zzgbq = zzcbmVar;
        this.zzgao = zzcbiVar;
        this.zzgeb = zzccmVar;
        this.zzgec = zzccuVar;
        this.zzfqs = executor;
        this.executor = executor2;
        this.zzgbz = zzcbhVar;
    }

    public final void zza(final zzcdc zzcdcVar) {
        this.zzfqs.execute(new Runnable(this, zzcdcVar) { // from class: com.google.android.gms.internal.ads.zzcch
            private final zzcdc zzgcc;
            private final zzcce zzgee;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgee = this;
                this.zzgcc = zzcdcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgee.zzi(this.zzgcc);
            }
        });
    }

    private static void zza(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i == 3) {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        }
    }

    public final void zzg(zzcdc zzcdcVar) {
        if (zzcdcVar == null || this.zzgeb == null || zzcdcVar.zzaox() == null || !this.zzgbq.zzaoe()) {
            return;
        }
        try {
            zzcdcVar.zzaox().addView(this.zzgeb.zzapd());
        } catch (zzbdt e) {
            com.google.android.gms.ads.internal.util.zzd.zza("web view can not be obtained", e);
        }
    }

    public final void zzh(zzcdc zzcdcVar) {
        if (zzcdcVar == null) {
            return;
        }
        Context context = zzcdcVar.zzajo().getContext();
        if (com.google.android.gms.ads.internal.util.zzbq.zza(context, this.zzgbq.zzgdb)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.zzd.zzdy("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzgec == null || zzcdcVar.zzaox() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzgec.zza(zzcdcVar.zzaox(), windowManager), com.google.android.gms.ads.internal.util.zzbq.zzzo());
            } catch (zzbdt e) {
                com.google.android.gms.ads.internal.util.zzd.zza("web view can not be obtained", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(zzcdc zzcdcVar, String[] strArr) {
        Map<String, WeakReference<View>> zzaou = zzcdcVar.zzaou();
        if (zzaou == null) {
            return false;
        }
        for (String str : strArr) {
            if (zzaou.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View zzanw = this.zzgao.zzanw();
        if (zzanw == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzanw.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzanw.getParent()).removeView(zzanw);
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcso)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzanw, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzgao.zzanw() != null) {
            if (2 == this.zzgao.zzans() || 1 == this.zzgao.zzans()) {
                this.zzebk.zza(this.zzfve.zzhje, String.valueOf(this.zzgao.zzans()), z);
            } else if (6 == this.zzgao.zzans()) {
                this.zzebk.zza(this.zzfve.zzhje, "2", z);
                this.zzebk.zza(this.zzfve.zzhje, InAppError.FAILED, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzcdc zzcdcVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        IObjectWrapper zztg;
        Drawable drawable;
        int i = 0;
        if (this.zzgbq.zzaog() || this.zzgbq.zzaof()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            for (int i2 = 0; i2 < 2; i2++) {
                View zzgc = zzcdcVar.zzgc(strArr[i2]);
                if (zzgc != null && (zzgc instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzgc;
                    break;
                }
            }
        }
        viewGroup = null;
        boolean z = viewGroup != null;
        Context context = zzcdcVar.zzajo().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.zzgao.zzant() != null) {
            view = this.zzgao.zzant();
            zzadz zzadzVar = this.zzdmv;
            if (zzadzVar != null && !z) {
                zza(layoutParams, zzadzVar.zzbns);
                view.setLayoutParams(layoutParams);
            }
        } else if (this.zzgao.zztn() instanceof zzadu) {
            zzadu zzaduVar = (zzadu) this.zzgao.zztn();
            if (!z) {
                zza(layoutParams, zzaduVar.zztf());
            }
            View zzadtVar = new zzadt(context, zzaduVar, layoutParams);
            zzadtVar.setContentDescription((CharSequence) zzwo.zzqq().zzd(zzabh.zzcsl));
            view = zzadtVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (z) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                AdChoicesView adChoicesView = new AdChoicesView(zzcdcVar.zzajo().getContext());
                adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                adChoicesView.addView(view);
                FrameLayout zzaox = zzcdcVar.zzaox();
                if (zzaox != null) {
                    zzaox.addView(adChoicesView);
                }
            }
            zzcdcVar.zza(zzcdcVar.zzaow(), view, true);
        }
        String[] strArr2 = zzccc.zzgdp;
        int length = strArr2.length;
        while (true) {
            if (i >= length) {
                viewGroup2 = null;
                break;
            }
            View zzgc2 = zzcdcVar.zzgc(strArr2[i]);
            if (zzgc2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzgc2;
                break;
            }
            i++;
        }
        this.executor.execute(new Runnable(this, viewGroup2) { // from class: com.google.android.gms.internal.ads.zzccg
            private final zzcce zzgee;
            private final ViewGroup zzgef;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgee = this;
                this.zzgef = viewGroup2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgee.zzb(this.zzgef);
            }
        });
        if (viewGroup2 != null) {
            if (zza(viewGroup2)) {
                if (this.zzgao.zzanx() != null) {
                    this.zzgao.zzanx().zza(new zzccj(this, zzcdcVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzajo = zzcdcVar.zzajo();
            Context context2 = zzajo != null ? zzajo.getContext() : null;
            if (context2 != null) {
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsk)).booleanValue()) {
                    zzaei zztx = this.zzgbz.zztx();
                    if (zztx == null) {
                        return;
                    }
                    try {
                        zztg = zztx.zztk();
                    } catch (RemoteException unused) {
                        com.google.android.gms.ads.internal.util.zzd.zzex("Could not get main image drawable");
                        return;
                    }
                } else {
                    zzaej zzanu = this.zzgao.zzanu();
                    if (zzanu == null) {
                        return;
                    }
                    try {
                        zztg = zzanu.zztg();
                    } catch (RemoteException unused2) {
                        com.google.android.gms.ads.internal.util.zzd.zzex("Could not get drawable from image");
                        return;
                    }
                }
                if (zztg == null || (drawable = (Drawable) ObjectWrapper.unwrap(zztg)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzaoz = zzcdcVar != null ? zzcdcVar.zzaoz() : null;
                if (zzaoz != null) {
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxa)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzaoz));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            }
        }
    }
}
