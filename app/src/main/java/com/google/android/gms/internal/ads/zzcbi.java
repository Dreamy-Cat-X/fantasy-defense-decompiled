package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.kt.olleh.inapp.net.ResTags;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbi {
    private Bundle extras;
    private zzaeb zzdew;
    private List<?> zzetd;
    private double zzeti;
    private float zzett;
    private IObjectWrapper zzfty;
    private int zzgcl;
    private zzyu zzgcm;
    private View zzgcn;
    private zzzq zzgco;
    private zzbdh zzgcp;
    private zzbdh zzgcq;
    private View zzgcr;
    private IObjectWrapper zzgcs;
    private zzaej zzgct;
    private zzaej zzgcu;
    private String zzgcv;
    private String zzgcy;
    private SimpleArrayMap<String, zzadv> zzgcw = new SimpleArrayMap<>();
    private SimpleArrayMap<String, String> zzgcx = new SimpleArrayMap<>();
    private List<zzzq> zzdfj = Collections.emptyList();

    public final synchronized void zzea(int i) {
        this.zzgcl = i;
    }

    public final synchronized void zzb(zzyu zzyuVar) {
        this.zzgcm = zzyuVar;
    }

    public final synchronized void zza(zzaeb zzaebVar) {
        this.zzdew = zzaebVar;
    }

    public final synchronized void setImages(List<zzadv> list) {
        this.zzetd = list;
    }

    public final synchronized void zzh(List<zzzq> list) {
        this.zzdfj = list;
    }

    public final synchronized void zza(zzzq zzzqVar) {
        this.zzgco = zzzqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzgcr = view;
    }

    public final synchronized void setStarRating(double d) {
        this.zzeti = d;
    }

    public final synchronized void zza(zzaej zzaejVar) {
        this.zzgct = zzaejVar;
    }

    public final synchronized void zzb(zzaej zzaejVar) {
        this.zzgcu = zzaejVar;
    }

    public final synchronized void zzfx(String str) {
        this.zzgcv = str;
    }

    public final synchronized void zzf(zzbdh zzbdhVar) {
        this.zzgcp = zzbdhVar;
    }

    public final synchronized void zzg(zzbdh zzbdhVar) {
        this.zzgcq = zzbdhVar;
    }

    public final synchronized void zzat(IObjectWrapper iObjectWrapper) {
        this.zzfty = iObjectWrapper;
    }

    public final synchronized void zzn(String str, String str2) {
        if (str2 == null) {
            this.zzgcx.remove(str);
        } else {
            this.zzgcx.put(str, str2);
        }
    }

    public final synchronized void zza(String str, zzadv zzadvVar) {
        if (zzadvVar == null) {
            this.zzgcw.remove(str);
        } else {
            this.zzgcw.put(str, zzadvVar);
        }
    }

    private final synchronized void setMediaContentAspectRatio(float f) {
        this.zzett = f;
    }

    public final synchronized void zzfy(String str) {
        this.zzgcy = str;
    }

    private final synchronized String zzfz(String str) {
        return this.zzgcx.get(str);
    }

    public final synchronized int zzans() {
        return this.zzgcl;
    }

    public final synchronized zzyu getVideoController() {
        return this.zzgcm;
    }

    public final synchronized zzaeb zztn() {
        return this.zzdew;
    }

    public final synchronized View zzant() {
        return this.zzgcn;
    }

    public final synchronized String getHeadline() {
        return zzfz("headline");
    }

    public final synchronized List<?> getImages() {
        return this.zzetd;
    }

    public final zzaej zzanu() {
        List<?> list = this.zzetd;
        if (list != null && list.size() != 0) {
            Object obj = this.zzetd.get(0);
            if (obj instanceof IBinder) {
                return zzaem.zzo((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized List<zzzq> getMuteThisAdReasons() {
        return this.zzdfj;
    }

    public final synchronized zzzq zzanv() {
        return this.zzgco;
    }

    public final synchronized String getBody() {
        return zzfz("body");
    }

    public final synchronized Bundle getExtras() {
        if (this.extras == null) {
            this.extras = new Bundle();
        }
        return this.extras;
    }

    public final synchronized String getCallToAction() {
        return zzfz("call_to_action");
    }

    public final synchronized View zzanw() {
        return this.zzgcr;
    }

    public final synchronized IObjectWrapper zzto() {
        return this.zzgcs;
    }

    public final synchronized String getStore() {
        return zzfz("store");
    }

    public final synchronized String getPrice() {
        return zzfz(ResTags.PRICE);
    }

    public final synchronized double getStarRating() {
        return this.zzeti;
    }

    public final synchronized zzaej zztm() {
        return this.zzgct;
    }

    public final synchronized String getAdvertiser() {
        return zzfz("advertiser");
    }

    public final synchronized zzaej zztp() {
        return this.zzgcu;
    }

    public final synchronized String getCustomTemplateId() {
        return this.zzgcv;
    }

    public final synchronized zzbdh zzanx() {
        return this.zzgcp;
    }

    public final synchronized zzbdh zzany() {
        return this.zzgcq;
    }

    public final synchronized IObjectWrapper zzanz() {
        return this.zzfty;
    }

    public final synchronized SimpleArrayMap<String, zzadv> zzaoa() {
        return this.zzgcw;
    }

    public final synchronized float getMediaContentAspectRatio() {
        return this.zzett;
    }

    public final synchronized String zzaob() {
        return this.zzgcy;
    }

    public final synchronized SimpleArrayMap<String, String> zzaoc() {
        return this.zzgcx;
    }

    public final synchronized void destroy() {
        if (this.zzgcp != null) {
            this.zzgcp.destroy();
            this.zzgcp = null;
        }
        if (this.zzgcq != null) {
            this.zzgcq.destroy();
            this.zzgcq = null;
        }
        this.zzfty = null;
        this.zzgcw.clear();
        this.zzgcx.clear();
        this.zzgcm = null;
        this.zzdew = null;
        this.zzgcn = null;
        this.zzetd = null;
        this.extras = null;
        this.zzgcr = null;
        this.zzgcs = null;
        this.zzgct = null;
        this.zzgcu = null;
        this.zzgcv = null;
    }

    public static zzcbi zza(zzanh zzanhVar) {
        try {
            zzcbj zza = zza(zzanhVar.getVideoController(), (zzanm) null);
            zzaeb zztn = zzanhVar.zztn();
            View view = (View) zzau(zzanhVar.zzvf());
            String headline = zzanhVar.getHeadline();
            List<?> images = zzanhVar.getImages();
            String body = zzanhVar.getBody();
            Bundle extras = zzanhVar.getExtras();
            String callToAction = zzanhVar.getCallToAction();
            View view2 = (View) zzau(zzanhVar.zzvg());
            IObjectWrapper zzto = zzanhVar.zzto();
            String advertiser = zzanhVar.getAdvertiser();
            zzaej zztp = zzanhVar.zztp();
            zzcbi zzcbiVar = new zzcbi();
            zzcbiVar.zzgcl = 1;
            zzcbiVar.zzgcm = zza;
            zzcbiVar.zzdew = zztn;
            zzcbiVar.zzgcn = view;
            zzcbiVar.zzn("headline", headline);
            zzcbiVar.zzetd = images;
            zzcbiVar.zzn("body", body);
            zzcbiVar.extras = extras;
            zzcbiVar.zzn("call_to_action", callToAction);
            zzcbiVar.zzgcr = view2;
            zzcbiVar.zzgcs = zzto;
            zzcbiVar.zzn("advertiser", advertiser);
            zzcbiVar.zzgcu = zztp;
            return zzcbiVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzcbi zza(zzang zzangVar) {
        try {
            zzcbj zza = zza(zzangVar.getVideoController(), (zzanm) null);
            zzaeb zztn = zzangVar.zztn();
            View view = (View) zzau(zzangVar.zzvf());
            String headline = zzangVar.getHeadline();
            List<?> images = zzangVar.getImages();
            String body = zzangVar.getBody();
            Bundle extras = zzangVar.getExtras();
            String callToAction = zzangVar.getCallToAction();
            View view2 = (View) zzau(zzangVar.zzvg());
            IObjectWrapper zzto = zzangVar.zzto();
            String store = zzangVar.getStore();
            String price = zzangVar.getPrice();
            double starRating = zzangVar.getStarRating();
            zzaej zztm = zzangVar.zztm();
            zzcbi zzcbiVar = new zzcbi();
            zzcbiVar.zzgcl = 2;
            zzcbiVar.zzgcm = zza;
            zzcbiVar.zzdew = zztn;
            zzcbiVar.zzgcn = view;
            zzcbiVar.zzn("headline", headline);
            zzcbiVar.zzetd = images;
            zzcbiVar.zzn("body", body);
            zzcbiVar.extras = extras;
            zzcbiVar.zzn("call_to_action", callToAction);
            zzcbiVar.zzgcr = view2;
            zzcbiVar.zzgcs = zzto;
            zzcbiVar.zzn("store", store);
            zzcbiVar.zzn(ResTags.PRICE, price);
            zzcbiVar.zzeti = starRating;
            zzcbiVar.zzgct = zztm;
            return zzcbiVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzcbi zzb(zzanm zzanmVar) {
        try {
            return zza(zza(zzanmVar.getVideoController(), zzanmVar), zzanmVar.zztn(), (View) zzau(zzanmVar.zzvf()), zzanmVar.getHeadline(), zzanmVar.getImages(), zzanmVar.getBody(), zzanmVar.getExtras(), zzanmVar.getCallToAction(), (View) zzau(zzanmVar.zzvg()), zzanmVar.zzto(), zzanmVar.getStore(), zzanmVar.getPrice(), zzanmVar.getStarRating(), zzanmVar.zztm(), zzanmVar.getAdvertiser(), zzanmVar.getMediaContentAspectRatio());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzcbi zzb(zzang zzangVar) {
        try {
            return zza(zza(zzangVar.getVideoController(), (zzanm) null), zzangVar.zztn(), (View) zzau(zzangVar.zzvf()), zzangVar.getHeadline(), zzangVar.getImages(), zzangVar.getBody(), zzangVar.getExtras(), zzangVar.getCallToAction(), (View) zzau(zzangVar.zzvg()), zzangVar.zzto(), zzangVar.getStore(), zzangVar.getPrice(), zzangVar.getStarRating(), zzangVar.zztm(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzcbi zzb(zzanh zzanhVar) {
        try {
            return zza(zza(zzanhVar.getVideoController(), (zzanm) null), zzanhVar.zztn(), (View) zzau(zzanhVar.zzvf()), zzanhVar.getHeadline(), zzanhVar.getImages(), zzanhVar.getBody(), zzanhVar.getExtras(), zzanhVar.getCallToAction(), (View) zzau(zzanhVar.zzvg()), zzanhVar.zzto(), null, null, -1.0d, zzanhVar.zztp(), zzanhVar.getAdvertiser(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzcbi zza(zzyu zzyuVar, zzaeb zzaebVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzaej zzaejVar, String str6, float f) {
        zzcbi zzcbiVar = new zzcbi();
        zzcbiVar.zzgcl = 6;
        zzcbiVar.zzgcm = zzyuVar;
        zzcbiVar.zzdew = zzaebVar;
        zzcbiVar.zzgcn = view;
        zzcbiVar.zzn("headline", str);
        zzcbiVar.zzetd = list;
        zzcbiVar.zzn("body", str2);
        zzcbiVar.extras = bundle;
        zzcbiVar.zzn("call_to_action", str3);
        zzcbiVar.zzgcr = view2;
        zzcbiVar.zzgcs = iObjectWrapper;
        zzcbiVar.zzn("store", str4);
        zzcbiVar.zzn(ResTags.PRICE, str5);
        zzcbiVar.zzeti = d;
        zzcbiVar.zzgct = zzaejVar;
        zzcbiVar.zzn("advertiser", str6);
        zzcbiVar.setMediaContentAspectRatio(f);
        return zzcbiVar;
    }

    private static <T> T zzau(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzcbj zza(zzyu zzyuVar, zzanm zzanmVar) {
        if (zzyuVar == null) {
            return null;
        }
        return new zzcbj(zzyuVar, zzanmVar);
    }
}
