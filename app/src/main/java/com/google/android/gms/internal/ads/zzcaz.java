package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcaz extends zzbmz {
    private final Context context;
    private final zzayt zzbpd;
    private final zzef zzequ;
    private final Executor zzfqs;
    private final zzcbt zzfsx;
    private final zzawh zzfui;
    private final zzcbi zzgao;
    private final zzcbq zzgbo;
    private final zzcce zzgbp;
    private final zzcbm zzgbq;
    private final zzepk<zzcfh> zzgbr;
    private final zzepk<zzcff> zzgbs;
    private final zzepk<zzcfk> zzgbt;
    private final zzepk<zzcfb> zzgbu;
    private final zzepk<zzcfj> zzgbv;
    private zzcdc zzgbw;
    private boolean zzgbx;
    private boolean zzgby;
    private final zzcbh zzgbz;
    private final zzcxx zzgca;

    public zzcaz(zzbmy zzbmyVar, Executor executor, zzcbi zzcbiVar, zzcbq zzcbqVar, zzcce zzcceVar, zzcbm zzcbmVar, zzcbt zzcbtVar, zzepk<zzcfh> zzepkVar, zzepk<zzcff> zzepkVar2, zzepk<zzcfk> zzepkVar3, zzepk<zzcfb> zzepkVar4, zzepk<zzcfj> zzepkVar5, zzawh zzawhVar, zzef zzefVar, zzayt zzaytVar, Context context, zzcbh zzcbhVar, zzcxx zzcxxVar) {
        super(zzbmyVar);
        this.zzgby = false;
        this.zzfqs = executor;
        this.zzgao = zzcbiVar;
        this.zzgbo = zzcbqVar;
        this.zzgbp = zzcceVar;
        this.zzgbq = zzcbmVar;
        this.zzfsx = zzcbtVar;
        this.zzgbr = zzepkVar;
        this.zzgbs = zzepkVar2;
        this.zzgbt = zzepkVar3;
        this.zzgbu = zzepkVar4;
        this.zzgbv = zzepkVar5;
        this.zzfui = zzawhVar;
        this.zzequ = zzefVar;
        this.zzbpd = zzaytVar;
        this.context = context;
        this.zzgbz = zzcbhVar;
        this.zzgca = zzcxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzajy() {
        this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcay
            private final zzcaz zzgbn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbn = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgbn.zzanr();
            }
        });
        if (this.zzgao.zzans() != 7) {
            Executor executor = this.zzfqs;
            zzcbq zzcbqVar = this.zzgbo;
            zzcbqVar.getClass();
            executor.execute(zzcbb.zza(zzcbqVar));
        }
        super.zzajy();
    }

    public final synchronized void zzfw(String str) {
        this.zzgbo.zzfw(str);
    }

    public final synchronized void zzanh() {
        if (this.zzgbx) {
            return;
        }
        this.zzgbo.zzanh();
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzgbo.zzf(bundle);
    }

    public final synchronized boolean zzh(Bundle bundle) {
        if (this.zzgbx) {
            return true;
        }
        boolean zzh = this.zzgbo.zzh(bundle);
        this.zzgbx = zzh;
        return zzh;
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzgbo.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void destroy() {
        this.zzfqs.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcba
            private final zzcaz zzgbn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbn = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgbn.zzanq();
            }
        });
        super.destroy();
    }

    public final synchronized void zza(final zzcdc zzcdcVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqp)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, zzcdcVar) { // from class: com.google.android.gms.internal.ads.zzcbd
                private final zzcaz zzgbn;
                private final zzcdc zzgcc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbn = this;
                    this.zzgcc = zzcdcVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgbn.zzf(this.zzgcc);
                }
            });
        } else {
            zzf(zzcdcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zzf(zzcdc zzcdcVar) {
        zzdv zzca;
        this.zzgbw = zzcdcVar;
        this.zzgbp.zza(zzcdcVar);
        this.zzgbo.zza(zzcdcVar.zzajo(), zzcdcVar.zzaou(), zzcdcVar.zzaov(), zzcdcVar, zzcdcVar);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrh)).booleanValue() && (zzca = this.zzequ.zzca()) != null) {
            zzca.zzb(zzcdcVar.zzajo());
        }
        if (zzcdcVar.zzaoy() != null) {
            zzcdcVar.zzaoy().zza(this.zzfui);
        }
    }

    public final synchronized void zzc(final zzcdc zzcdcVar) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqp)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, zzcdcVar) { // from class: com.google.android.gms.internal.ads.zzcbc
                private final zzcaz zzgbn;
                private final zzcdc zzgcc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbn = this;
                    this.zzgcc = zzcdcVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgbn.zze(this.zzgcc);
                }
            });
        } else {
            zze(zzcdcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zze(zzcdc zzcdcVar) {
        this.zzgbo.zza(zzcdcVar.zzajo(), zzcdcVar.zzaot());
        if (zzcdcVar.zzaox() != null) {
            zzcdcVar.zzaox().setClickable(false);
            zzcdcVar.zzaox().removeAllViews();
        }
        if (zzcdcVar.zzaoy() != null) {
            zzcdcVar.zzaoy().zzb(this.zzfui);
        }
        this.zzgbw = null;
    }

    public final synchronized void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzgbp.zzg(this.zzgbw);
        this.zzgbo.zza(view, view2, map, map2, z);
        if (this.zzgby) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsi)).booleanValue() && this.zzgao.zzanx() != null) {
                this.zzgao.zzanx().zza("onSdkAdUserInteractionClick", new ArrayMap());
            }
        }
    }

    public final synchronized void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzgbo.zza(view, motionEvent, view2);
    }

    public final synchronized void zzb(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzgbx) {
            return;
        }
        if (z) {
            this.zzgbp.zzh(this.zzgbw);
            this.zzgbo.zzb(view, map, map2);
            this.zzgbx = true;
            return;
        }
        if (!z) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsp)).booleanValue() && map != null) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null && zzz(view2)) {
                        this.zzgbp.zzh(this.zzgbw);
                        this.zzgbo.zzb(view, map, map2);
                        this.zzgbx = true;
                        return;
                    }
                }
            }
        }
    }

    public final synchronized JSONObject zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.zzgbo.zza(view, map, map2);
    }

    public final synchronized void setClickConfirmingView(View view) {
        this.zzgbo.setClickConfirmingView(view);
    }

    public final synchronized void zza(zzagi zzagiVar) {
        this.zzgbo.zza(zzagiVar);
    }

    public final synchronized void cancelUnconfirmedClick() {
        this.zzgbo.cancelUnconfirmedClick();
    }

    public final synchronized void zza(zzyj zzyjVar) {
        this.zzgbo.zza(zzyjVar);
    }

    public final synchronized void zza(zzyf zzyfVar) {
        this.zzgbo.zza(zzyfVar);
    }

    public final synchronized void zztw() {
        this.zzgbo.zztw();
    }

    public final synchronized void recordCustomClickGesture() {
        if (this.zzgbw == null) {
            com.google.android.gms.ads.internal.util.zzd.zzdy("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = this.zzgbw instanceof zzccd;
            this.zzfqs.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzcbf
                private final boolean zzeiv;
                private final zzcaz zzgbn;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbn = this;
                    this.zzeiv = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgbn.zzbh(this.zzeiv);
                }
            });
        }
    }

    public final synchronized boolean isCustomClickGestureEnabled() {
        return this.zzgbo.isCustomClickGestureEnabled();
    }

    public static boolean zzz(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    public final boolean zzann() {
        return this.zzgbq.zzaof();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(String str, boolean z) {
        String str2;
        IObjectWrapper zza;
        zzaqp zzaqpVar;
        zzaqr zzaqrVar;
        if (!this.zzgbq.zzano()) {
            return;
        }
        zzbdh zzany = this.zzgao.zzany();
        zzbdh zzanx = this.zzgao.zzanx();
        if (zzany == null && zzanx == null) {
            return;
        }
        boolean z2 = zzany != null;
        boolean z3 = zzanx != null;
        String str3 = null;
        if (!z2) {
            if (!z3) {
                zzany = null;
                str2 = null;
                if (zzany.getWebView() != null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Webview is null in InternalNativeAd");
                    return;
                }
                if (!com.google.android.gms.ads.internal.zzp.zzlf().zzm(this.context)) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Failed to initialize omid in InternalNativeAd");
                    return;
                }
                int i = this.zzbpd.zzege;
                int i2 = this.zzbpd.zzegf;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String sb2 = sb.toString();
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcut)).booleanValue()) {
                    if (z3) {
                        zzaqpVar = zzaqp.VIDEO;
                        zzaqrVar = zzaqr.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzaqpVar = zzaqp.NATIVE_DISPLAY;
                        if (this.zzgao.zzans() == 3) {
                            zzaqrVar = zzaqr.UNSPECIFIED;
                        } else {
                            zzaqrVar = zzaqr.ONE_PIXEL;
                        }
                    }
                    zza = com.google.android.gms.ads.internal.zzp.zzlf().zzb(sb2, zzany.getWebView(), "", "javascript", str2, str, zzaqrVar, zzaqpVar, this.zzeqz.zzchd);
                } else {
                    zza = com.google.android.gms.ads.internal.zzp.zzlf().zza(sb2, zzany.getWebView(), "", "javascript", str2, str);
                }
                if (zza == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Failed to create omid session in InternalNativeAd");
                    return;
                }
                this.zzgao.zzat(zza);
                zzany.zzaq(zza);
                if (z3) {
                    View view = zzanx.getView();
                    if (view != null) {
                        com.google.android.gms.ads.internal.zzp.zzlf().zza(zza, view);
                    }
                    this.zzgby = true;
                }
                if (z) {
                    com.google.android.gms.ads.internal.zzp.zzlf().zzab(zza);
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuv)).booleanValue()) {
                        zzany.zza("onSdkLoaded", new ArrayMap());
                        return;
                    }
                    return;
                }
                return;
            }
            str3 = "javascript";
            zzany = zzanx;
        }
        str2 = str3;
        if (zzany.getWebView() != null) {
        }
    }

    public final boolean zzano() {
        return this.zzgbq.zzano();
    }

    public final void zzaa(View view) {
        IObjectWrapper zzanz = this.zzgao.zzanz();
        boolean z = this.zzgao.zzany() != null;
        if (!this.zzgbq.zzano() || zzanz == null || !z || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzlf().zza(zzanz, view);
    }

    public final void zzab(View view) {
        IObjectWrapper zzanz = this.zzgao.zzanz();
        if (!this.zzgbq.zzano() || zzanz == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzlf().zzb(zzanz, view);
    }

    public final zzcbh zzanp() {
        return this.zzgbz;
    }

    public final synchronized void zza(zzyo zzyoVar) {
        this.zzgca.zzc(zzyoVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzbh(boolean z) {
        this.zzgbo.zza(this.zzgbw.zzajo(), this.zzgbw.zzaot(), this.zzgbw.zzaou(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzanq() {
        this.zzgbo.destroy();
        this.zzgao.destroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzanr() {
        try {
            int zzans = this.zzgao.zzans();
            if (zzans == 1) {
                if (this.zzfsx.zzaoh() != null) {
                    zzi("Google", true);
                    this.zzfsx.zzaoh().zza(this.zzgbr.get());
                    return;
                }
                return;
            }
            if (zzans == 2) {
                if (this.zzfsx.zzaoi() != null) {
                    zzi("Google", true);
                    this.zzfsx.zzaoi().zza(this.zzgbs.get());
                    return;
                }
                return;
            }
            if (zzans == 3) {
                if (this.zzfsx.zzga(this.zzgao.getCustomTemplateId()) != null) {
                    if (this.zzgao.zzanx() != null) {
                        zzi("Google", true);
                    }
                    this.zzfsx.zzga(this.zzgao.getCustomTemplateId()).zza(this.zzgbv.get());
                    return;
                }
                return;
            }
            if (zzans == 6) {
                if (this.zzfsx.zzaoj() != null) {
                    zzi("Google", true);
                    this.zzfsx.zzaoj().zza(this.zzgbt.get());
                    return;
                }
                return;
            }
            if (zzans == 7) {
                if (this.zzfsx.zzaol() != null) {
                    this.zzfsx.zzaol().zza(this.zzgbu.get());
                    return;
                }
                return;
            }
            com.google.android.gms.ads.internal.util.zzd.zzev("Wrong native template id!");
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("RemoteException when notifyAdLoad is called", e);
        }
    }
}
