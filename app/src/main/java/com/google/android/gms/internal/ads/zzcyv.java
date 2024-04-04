package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzczi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcyv extends zzaxf {
    private static final List<String> zzgxw = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    private static final List<String> zzgxx = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    private static final List<String> zzgxy = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    private static final List<String> zzgxz = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private Context context;
    private zzayt zzbos;
    private final ScheduledExecutorService zzfpk;
    private zzef zzfpp;
    private Point zzgay = new Point();
    private Point zzgaz = new Point();
    private final zzdzk zzgfs;
    private zzdnr<zzcfp> zzgsx;
    private zzbff zzgya;
    private zzaru zzgyb;

    public zzcyv(zzbff zzbffVar, Context context, zzef zzefVar, zzayt zzaytVar, zzdnr<zzcfp> zzdnrVar, zzdzk zzdzkVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzgya = zzbffVar;
        this.context = context;
        this.zzfpp = zzefVar;
        this.zzbos = zzaytVar;
        this.zzgsx = zzdnrVar;
        this.zzgfs = zzdzkVar;
        this.zzfpk = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zza(IObjectWrapper iObjectWrapper, zzaxi zzaxiVar, zzaxb zzaxbVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.context = context;
        String str = zzaxiVar.zzbup;
        String str2 = zzaxiVar.zzbrc;
        zzvp zzvpVar = zzaxiVar.zzdzu;
        zzvi zzviVar = zzaxiVar.zzdzv;
        zzcys zzafk = this.zzgya.zzafk();
        zzbqd.zza zzcg = new zzbqd.zza().zzcg(context);
        zzdmz zzdmzVar = new zzdmz();
        if (str == null) {
            str = "adUnitId";
        }
        zzdmz zzgs = zzdmzVar.zzgs(str);
        if (zzviVar == null) {
            zzviVar = new zzvl().zzqc();
        }
        zzdmz zzh = zzgs.zzh(zzviVar);
        if (zzvpVar == null) {
            zzvpVar = new zzvp();
        }
        zzdyz.zza(zzafk.zzg(zzcg.zza(zzh.zzg(zzvpVar).zzavi()).zzalm()).zza(new zzczi(new zzczi.zza().zzgr(str2))).zzg(new zzbvl.zza().zzamj()).zzaie().zzaik(), new zzcze(this, zzaxbVar), this.zzgya.zzaet());
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zzan(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyf)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzaru zzaruVar = this.zzgyb;
            this.zzgay = com.google.android.gms.ads.internal.util.zzbq.zza(motionEvent, zzaruVar == null ? null : zzaruVar.zzaaq);
            if (motionEvent.getAction() == 0) {
                this.zzgaz = this.zzgay;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzgay.x, this.zzgay.y);
            this.zzfpp.zza(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zza(zzaru zzaruVar) {
        this.zzgyb = zzaruVar;
        this.zzgsx.ensureSize(1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zza(final List<Uri> list, final IObjectWrapper iObjectWrapper, zzarn zzarnVar) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyf)).booleanValue()) {
            try {
                zzarnVar.onError("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzaym.zzc("", e);
                return;
            }
        }
        zzdzl submit = this.zzgfs.submit(new Callable(this, list, iObjectWrapper) { // from class: com.google.android.gms.internal.ads.zzcyu
            private final zzcyv zzgxt;
            private final List zzgxu;
            private final IObjectWrapper zzgxv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxt = this;
                this.zzgxu = list;
                this.zzgxv = iObjectWrapper;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgxt.zza(this.zzgxu, this.zzgxv);
            }
        });
        if (zzasw()) {
            submit = zzdyz.zzb(submit, new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzcyx
                private final zzcyv zzgxt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgxt = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdyj
                public final zzdzl zzf(Object obj) {
                    return this.zzgxt.zzb((ArrayList) obj);
                }
            }, this.zzgfs);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzew("Asset view map is empty.");
        }
        zzdyz.zza(submit, new zzczh(this, zzarnVar), this.zzgya.zzaet());
    }

    @Override // com.google.android.gms.internal.ads.zzaxc
    public final void zzb(List<Uri> list, final IObjectWrapper iObjectWrapper, zzarn zzarnVar) {
        try {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcyf)).booleanValue()) {
                zzarnVar.onError("The updating URL feature is not enabled.");
                return;
            }
            if (list.size() != 1) {
                zzarnVar.onError("There should be only 1 click URL.");
                return;
            }
            final Uri uri = list.get(0);
            if (!zza(uri, zzgxw, zzgxx)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
                zzarnVar.onSuccess(list);
                return;
            }
            zzdzl submit = this.zzgfs.submit(new Callable(this, uri, iObjectWrapper) { // from class: com.google.android.gms.internal.ads.zzcyw
                private final Uri zzgsf;
                private final zzcyv zzgxt;
                private final IObjectWrapper zzgxv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgxt = this;
                    this.zzgsf = uri;
                    this.zzgxv = iObjectWrapper;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzgxt.zzb(this.zzgsf, this.zzgxv);
                }
            });
            if (zzasw()) {
                submit = zzdyz.zzb(submit, new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzcyz
                    private final zzcyv zzgxt;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgxt = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdyj
                    public final zzdzl zzf(Object obj) {
                        return this.zzgxt.zzl((Uri) obj);
                    }
                }, this.zzgfs);
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzew("Asset view map is empty.");
            }
            zzdyz.zza(submit, new zzczg(this, zzarnVar), this.zzgya.zzaet());
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    private static boolean zzk(Uri uri) {
        return zza(uri, zzgxy, zzgxz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Uri zzb(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzfpp.zza(uri, this.context, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzei e) {
            zzaym.zzd("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean zza(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (path.contains(it.next())) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith(it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final zzdzl<String> zzgq(final String str) {
        final zzcfp[] zzcfpVarArr = new zzcfp[1];
        zzdzl zzb = zzdyz.zzb(this.zzgsx.zzavo(), new zzdyj(this, zzcfpVarArr, str) { // from class: com.google.android.gms.internal.ads.zzczc
            private final String zzdkf;
            private final zzcyv zzgxt;
            private final zzcfp[] zzgyc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxt = this;
                this.zzgyc = zzcfpVarArr;
                this.zzdkf = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgxt.zza(this.zzgyc, this.zzdkf, (zzcfp) obj);
            }
        }, this.zzgfs);
        zzb.addListener(new Runnable(this, zzcfpVarArr) { // from class: com.google.android.gms.internal.ads.zzczf
            private final zzcyv zzgxt;
            private final zzcfp[] zzgyc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxt = this;
                this.zzgyc = zzcfpVarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgxt.zza(this.zzgyc);
            }
        }, this.zzgfs);
        return zzdyu.zzg(zzb).zza(((Integer) zzwo.zzqq().zzd(zzabh.zzcyg)).intValue(), TimeUnit.MILLISECONDS, this.zzfpk).zza(zzcza.zzdyn, this.zzgfs).zza(Exception.class, zzczd.zzdyn, this.zzgfs);
    }

    private static Uri zza(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private final boolean zzasw() {
        zzaru zzaruVar = this.zzgyb;
        return (zzaruVar == null || zzaruVar.zzdrt == null || this.zzgyb.zzdrt.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcfp[] zzcfpVarArr) {
        if (zzcfpVarArr[0] != null) {
            this.zzgsx.zzd(zzdyz.zzag(zzcfpVarArr[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzcfp[] zzcfpVarArr, String str, zzcfp zzcfpVar) throws Exception {
        zzcfpVarArr[0] = zzcfpVar;
        JSONObject zza = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, this.zzgyb.zzdrt, this.zzgyb.zzdrt, this.zzgyb.zzaaq);
        JSONObject zza2 = com.google.android.gms.ads.internal.util.zzbq.zza(this.context, this.zzgyb.zzaaq);
        JSONObject zzt = com.google.android.gms.ads.internal.util.zzbq.zzt(this.zzgyb.zzaaq);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbq.zzb(this.context, this.zzgyb.zzaaq);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zza);
        jSONObject.put("ad_view_signal", zza2);
        jSONObject.put("scroll_view_signal", zzt);
        jSONObject.put("lock_screen_signal", zzb);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbq.zza((String) null, this.context, this.zzgaz, this.zzgay));
        }
        return zzcfpVar.zzc(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ String zza(Exception exc) {
        zzaym.zzc("", exc);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Uri zzc(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zza(uri, "nas", str) : uri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList zza(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzl(final Uri uri) throws Exception {
        return zzdyz.zzb(zzgq("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzdvo(this, uri) { // from class: com.google.android.gms.internal.ads.zzczb
            private final Uri zzgsf;
            private final zzcyv zzgxt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxt = this;
                this.zzgsf = uri;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return zzcyv.zzc(this.zzgsf, (String) obj);
            }
        }, this.zzgfs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzb(final ArrayList arrayList) throws Exception {
        return zzdyz.zzb(zzgq("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzdvo(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzcyy
            private final zzcyv zzgxt;
            private final List zzgxu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxt = this;
                this.zzgxu = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return zzcyv.zza(this.zzgxu, (String) obj);
            }
        }, this.zzgfs);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zza(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zza = this.zzfpp.zzca() != null ? this.zzfpp.zzca().zza(this.context, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (TextUtils.isEmpty(zza)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "ms", zza));
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }
}
