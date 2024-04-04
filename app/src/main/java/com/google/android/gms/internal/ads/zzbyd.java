package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbyd extends zzbmz {
    private final Context context;
    private final zzbzl zzfsm;
    private boolean zzfsn;
    private final WeakReference<zzbdh> zzfzl;
    private final zzbwt zzfzm;
    private final zzbns zzfzn;
    private final zzdtb zzfzo;
    private final zzbqy zzfzp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyd(zzbmy zzbmyVar, Context context, @Nullable zzbdh zzbdhVar, zzbwt zzbwtVar, zzbzl zzbzlVar, zzbns zzbnsVar, zzdtb zzdtbVar, zzbqy zzbqyVar) {
        super(zzbmyVar);
        this.zzfsn = false;
        this.context = context;
        this.zzfzl = new WeakReference<>(zzbdhVar);
        this.zzfzm = zzbwtVar;
        this.zzfsm = zzbzlVar;
        this.zzfzn = zzbnsVar;
        this.zzfzo = zzdtbVar;
        this.zzfzp = zzbqyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(boolean z, @Nullable Activity activity) {
        boolean z2;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcod)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            if (com.google.android.gms.ads.internal.util.zzm.zzar(this.context)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzfzp.zzaln();
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoe)).booleanValue()) {
                    this.zzfzo.zzhh(this.zzfpl.zzhiz.zzera.zzbvf);
                }
                z2 = false;
                if (!z2) {
                    return false;
                }
                this.zzfzm.zzalc();
                Activity activity2 = activity;
                if (activity == null) {
                    activity2 = this.context;
                }
                try {
                    this.zzfsm.zza(z, activity2);
                    this.zzfzm.zzala();
                    this.zzfsn = true;
                    return true;
                } catch (zzbzk e) {
                    this.zzfzp.zza(e);
                    return false;
                }
            }
        }
        if (!this.zzfsn) {
            z2 = true;
            if (!z2) {
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    public final boolean isClosed() {
        return this.zzfzn.isClosed();
    }

    public final void finalize() throws Throwable {
        try {
            zzbdh zzbdhVar = this.zzfzl.get();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxz)).booleanValue()) {
                if (!this.zzfsn && zzbdhVar != null) {
                    zzdzk zzdzkVar = zzayv.zzegm;
                    zzbdhVar.getClass();
                    zzdzkVar.execute(zzbyc.zze(zzbdhVar));
                }
            } else if (zzbdhVar != null) {
                zzbdhVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
