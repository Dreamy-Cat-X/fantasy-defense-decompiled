package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgg extends zzbmz {
    private final Context context;
    private final zzaup zzdxr;
    private final WeakReference<zzbdh> zzfzl;
    private final zzbwt zzfzm;
    private final zzbns zzfzn;
    private final zzdtb zzfzo;
    private final zzbqy zzfzp;
    private final zzbzl zzfzq;
    private boolean zzggx;
    private final zzbsf zzghm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgg(zzbmy zzbmyVar, Context context, zzbdh zzbdhVar, zzbzl zzbzlVar, zzbwt zzbwtVar, zzbqy zzbqyVar, zzbsf zzbsfVar, zzbns zzbnsVar, zzdmi zzdmiVar, zzdtb zzdtbVar) {
        super(zzbmyVar);
        this.zzggx = false;
        this.context = context;
        this.zzfzq = zzbzlVar;
        this.zzfzl = new WeakReference<>(zzbdhVar);
        this.zzfzm = zzbwtVar;
        this.zzfzp = zzbqyVar;
        this.zzghm = zzbsfVar;
        this.zzfzn = zzbnsVar;
        this.zzfzo = zzdtbVar;
        this.zzdxr = new zzavm(zzdmiVar.zzdur);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public final boolean zzb(boolean z, Activity activity) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcod)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            if (com.google.android.gms.ads.internal.util.zzm.zzar(this.context)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzfzp.zzaln();
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoe)).booleanValue()) {
                    this.zzfzo.zzhh(this.zzfpl.zzhiz.zzera.zzbvf);
                }
                return false;
            }
        }
        if (this.zzggx) {
            com.google.android.gms.ads.internal.util.zzd.zzex("The rewarded ad have been showed.");
            this.zzfzp.zzl(zzdns.zza(zzdnu.AD_REUSED, null, null));
            return false;
        }
        this.zzggx = true;
        this.zzfzm.zzalc();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.context;
        }
        try {
            this.zzfzq.zza(z, activity2);
            this.zzfzm.zzala();
            return true;
        } catch (zzbzk e) {
            this.zzfzp.zza(e);
            return false;
        }
    }

    public final boolean isUsed() {
        return this.zzggx;
    }

    public final zzaup zzru() {
        return this.zzdxr;
    }

    public final boolean isClosed() {
        return this.zzfzn.isClosed();
    }

    public final boolean zzrv() {
        zzbdh zzbdhVar = this.zzfzl.get();
        return (zzbdhVar == null || zzbdhVar.zzadx()) ? false : true;
    }

    public final Bundle getAdMetadata() {
        return this.zzghm.getAdMetadata();
    }

    public final void finalize() throws Throwable {
        try {
            zzbdh zzbdhVar = this.zzfzl.get();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxz)).booleanValue()) {
                if (!this.zzggx && zzbdhVar != null) {
                    zzdzk zzdzkVar = zzayv.zzegm;
                    zzbdhVar.getClass();
                    zzdzkVar.execute(zzcgj.zze(zzbdhVar));
                }
            } else if (zzbdhVar != null) {
                zzbdhVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
