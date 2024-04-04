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
public final class zzcom implements zzbqv, zzbrj, zzbuv, zzuz {
    private final Context context;
    private final zzdro zzdgv;
    private final zzcpy zzdgy;
    private final String zzdss;
    private final zzdmt zzexh;
    private final zzdmi zzfpm;
    private final zzdnk zzgjr;
    private Boolean zzgjs;
    private final boolean zzgjt = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcyc)).booleanValue();

    public zzcom(Context context, zzdnk zzdnkVar, zzdmt zzdmtVar, zzdmi zzdmiVar, zzcpy zzcpyVar, zzdro zzdroVar, String str) {
        this.context = context;
        this.zzgjr = zzdnkVar;
        this.zzexh = zzdmtVar;
        this.zzfpm = zzdmiVar;
        this.zzdgy = zzcpyVar;
        this.zzdgv = zzdroVar;
        this.zzdss = str;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        if (this.zzfpm.zzhim) {
            zza(zzgk("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        if (zzaqq() || this.zzfpm.zzhim) {
            zza(zzgk("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzalb() {
        if (zzaqq()) {
            this.zzdgv.zzb(zzgk("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzald() {
        if (zzaqq()) {
            this.zzdgv.zzb(zzgk("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzl(zzvc zzvcVar) {
        if (this.zzgjt) {
            int i = zzvcVar.errorCode;
            String str = zzvcVar.zzcgs;
            if (zzvcVar.zzcgt.equals(MobileAds.ERROR_DOMAIN) && zzvcVar.zzcgu != null && !zzvcVar.zzcgu.zzcgt.equals(MobileAds.ERROR_DOMAIN)) {
                i = zzvcVar.zzcgu.errorCode;
                str = zzvcVar.zzcgu.zzcgs;
            }
            String zzgt = this.zzgjr.zzgt(str);
            zzdrp zzu = zzgk("ifts").zzu(ResTags.REASON, "adapter");
            if (i >= 0) {
                zzu.zzu("arec", String.valueOf(i));
            }
            if (zzgt != null) {
                zzu.zzu("areec", zzgt);
            }
            this.zzdgv.zzb(zzu);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(zzbzk zzbzkVar) {
        if (this.zzgjt) {
            zzdrp zzu = zzgk("ifts").zzu(ResTags.REASON, "exception");
            if (!TextUtils.isEmpty(zzbzkVar.getMessage())) {
                zzu.zzu(NotificationCompat.CATEGORY_MESSAGE, zzbzkVar.getMessage());
            }
            this.zzdgv.zzb(zzu);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzaln() {
        if (this.zzgjt) {
            this.zzdgv.zzb(zzgk("ifts").zzu(ResTags.REASON, "blocked"));
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

    private final zzdrp zzgk(String str) {
        zzdrp zzu = zzdrp.zzgz(str).zza(this.zzexh, null).zzf(this.zzfpm).zzu("request_id", this.zzdss);
        if (!this.zzfpm.zzhhu.isEmpty()) {
            zzu.zzu("ancn", this.zzfpm.zzhhu.get(0));
        }
        if (this.zzfpm.zzhim) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            zzu.zzu("device_connectivity", com.google.android.gms.ads.internal.util.zzm.zzbb(this.context) ? "online" : "offline");
            zzu.zzu("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
            zzu.zzu("offline_ad", InAppError.FAILED);
        }
        return zzu;
    }

    private final void zza(zzdrp zzdrpVar) {
        if (this.zzfpm.zzhim) {
            this.zzdgy.zza(new zzcqj(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis(), this.zzexh.zzhiz.zzera.zzbvf, this.zzdgv.zzc(zzdrpVar), zzcpz.zzgqc));
            return;
        }
        this.zzdgv.zzb(zzdrpVar);
    }
}
