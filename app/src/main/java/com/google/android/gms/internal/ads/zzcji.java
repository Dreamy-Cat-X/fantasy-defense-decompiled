package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.kt.olleh.inapp.net.InAppError;
import com.kt.olleh.inapp.net.ResTags;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcji implements zzbqv, zzbrj, zzbuv, zzuz {
    private final Context context;
    private final zzcju zzdgu;
    private final zzcpy zzdgy;
    private final zzdmt zzexh;
    private final zzdmi zzfpm;
    private final zzdnk zzgjr;
    private Boolean zzgjs;
    private final boolean zzgjt = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcyc)).booleanValue();

    public zzcji(Context context, zzdnk zzdnkVar, zzcju zzcjuVar, zzdmt zzdmtVar, zzdmi zzdmiVar, zzcpy zzcpyVar) {
        this.context = context;
        this.zzgjr = zzdnkVar;
        this.zzdgu = zzcjuVar;
        this.zzexh = zzdmtVar;
        this.zzfpm = zzdmiVar;
        this.zzdgy = zzcpyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        if (this.zzfpm.zzhim) {
            zza(zzge("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        if (zzaqq() || this.zzfpm.zzhim) {
            zza(zzge("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzalb() {
        if (zzaqq()) {
            zzge("adapter_impression").zzaqv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzald() {
        if (zzaqq()) {
            zzge("adapter_shown").zzaqv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzl(zzvc zzvcVar) {
        if (this.zzgjt) {
            zzcjx zzge = zzge("ifts");
            zzge.zzr(ResTags.REASON, "adapter");
            int i = zzvcVar.errorCode;
            String str = zzvcVar.zzcgs;
            if (zzvcVar.zzcgt.equals(MobileAds.ERROR_DOMAIN) && zzvcVar.zzcgu != null && !zzvcVar.zzcgu.zzcgt.equals(MobileAds.ERROR_DOMAIN)) {
                i = zzvcVar.zzcgu.errorCode;
                str = zzvcVar.zzcgu.zzcgs;
            }
            if (i >= 0) {
                zzge.zzr("arec", String.valueOf(i));
            }
            String zzgt = this.zzgjr.zzgt(str);
            if (zzgt != null) {
                zzge.zzr("areec", zzgt);
            }
            zzge.zzaqv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(zzbzk zzbzkVar) {
        if (this.zzgjt) {
            zzcjx zzge = zzge("ifts");
            zzge.zzr(ResTags.REASON, "exception");
            if (!TextUtils.isEmpty(zzbzkVar.getMessage())) {
                zzge.zzr(NotificationCompat.CATEGORY_MESSAGE, zzbzkVar.getMessage());
            }
            zzge.zzaqv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzaln() {
        if (this.zzgjt) {
            zzcjx zzge = zzge("ifts");
            zzge.zzr(ResTags.REASON, "blocked");
            zzge.zzaqv();
        }
    }

    private final boolean zzaqq() {
        if (this.zzgjs == null) {
            synchronized (this) {
                if (this.zzgjs == null) {
                    String str = (String) zzwo.zzqq().zzd(zzabh.zzcqk);
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    this.zzgjs = Boolean.valueOf(zze(str, com.google.android.gms.ads.internal.util.zzm.zzaz(this.context)));
                }
            }
        }
        return this.zzgjs.booleanValue();
    }

    private static boolean zze(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final zzcjx zzge(String str) {
        zzcjx zzc = this.zzdgu.zzaqt().zza(this.zzexh.zzhiz.zzera).zzc(this.zzfpm);
        zzc.zzr("action", str);
        if (!this.zzfpm.zzhhu.isEmpty()) {
            zzc.zzr("ancn", this.zzfpm.zzhhu.get(0));
        }
        if (this.zzfpm.zzhim) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            zzc.zzr("device_connectivity", com.google.android.gms.ads.internal.util.zzm.zzbb(this.context) ? "online" : "offline");
            zzc.zzr("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
            zzc.zzr("offline_ad", InAppError.FAILED);
        }
        return zzc;
    }

    private final void zza(zzcjx zzcjxVar) {
        if (this.zzfpm.zzhim) {
            this.zzdgy.zza(new zzcqj(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis(), this.zzexh.zzhiz.zzera.zzbvf, zzcjxVar.zzaqw(), zzcpz.zzgqc));
            return;
        }
        zzcjxVar.zzaqv();
    }
}
