package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbks extends zzbmz {
    private final zzbdh zzdhu;
    private final int zzfru;
    private final zzbkb zzfsk;
    private final zzbzl zzfsm;
    private boolean zzfsn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbks(zzbmy zzbmyVar, zzbdh zzbdhVar, int i, zzbkb zzbkbVar, zzbzl zzbzlVar) {
        super(zzbmyVar);
        this.zzfsn = false;
        this.zzdhu = zzbdhVar;
        this.zzfru = i;
        this.zzfsk = zzbkbVar;
        this.zzfsm = zzbzlVar;
    }

    public final void zza(zzsd zzsdVar) {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            zzbdhVar.zza(zzsdVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Activity activity, zzsr zzsrVar) throws RemoteException {
        boolean z;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcod)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            if (com.google.android.gms.ads.internal.util.zzm.zzar(activity)) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                zzsrVar.zzb(zzdns.zza(zzdnu.APP_NOT_FOREGROUND, null, null));
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoe)).booleanValue()) {
                    new zzdtb(activity.getApplicationContext(), com.google.android.gms.ads.internal.zzp.zzle().zzzn()).zzhh(this.zzfpl.zzhiz.zzera.zzbvf);
                }
                z = false;
                if (z) {
                    try {
                        this.zzfsm.zza(false, activity);
                        this.zzfsn = true;
                        return;
                    } catch (zzbzk e) {
                        zzsrVar.zzb(zzdns.zzh(e));
                        return;
                    }
                }
                return;
            }
        }
        if (this.zzfsn) {
            com.google.android.gms.ads.internal.util.zzd.zzex("App open interstitial ad is already visible.");
        }
        if (!this.zzfsn) {
            z = true;
            if (z) {
            }
        }
        z = false;
        if (z) {
        }
    }

    public final int zzaje() {
        return this.zzfru;
    }

    public final void zzb(long j, int i) {
        this.zzfsk.zzb(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void destroy() {
        super.destroy();
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            zzbdhVar.destroy();
        }
    }
}
