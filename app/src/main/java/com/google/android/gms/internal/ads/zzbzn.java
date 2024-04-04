package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.nonagon.transaction.omid.OmidMediaType;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzuc;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzn implements com.google.android.gms.ads.internal.overlay.zzp, zzbsg {
    private final Context context;
    private final zzayt zzbpd;
    private final zzbdh zzdhu;
    private final zzdmi zzeqz;
    private IObjectWrapper zzfty;
    private final zzuc.zza.EnumC0024zza zzfzw;

    public zzbzn(Context context, zzbdh zzbdhVar, zzdmi zzdmiVar, zzayt zzaytVar, zzuc.zza.EnumC0024zza enumC0024zza) {
        this.context = context;
        this.zzdhu = zzbdhVar;
        this.zzeqz = zzdmiVar;
        this.zzbpd = zzaytVar;
        this.zzfzw = enumC0024zza;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void onAdLoaded() {
        zzaqr zzaqrVar;
        zzaqr zzaqrVar2;
        zzaqp zzaqpVar;
        if ((this.zzfzw == zzuc.zza.EnumC0024zza.REWARD_BASED_VIDEO_AD || this.zzfzw == zzuc.zza.EnumC0024zza.INTERSTITIAL || this.zzfzw == zzuc.zza.EnumC0024zza.APP_OPEN) && this.zzeqz.zzdvb && this.zzdhu != null && com.google.android.gms.ads.internal.zzp.zzlf().zzm(this.context)) {
            int i = this.zzbpd.zzege;
            int i2 = this.zzbpd.zzegf;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String sb2 = sb.toString();
            String videoEventsOwner = this.zzeqz.zzhie.getVideoEventsOwner();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcus)).booleanValue()) {
                if (this.zzeqz.zzhie.getMediaType() == OmidMediaType.VIDEO) {
                    zzaqpVar = zzaqp.VIDEO;
                    zzaqrVar2 = zzaqr.DEFINED_BY_JAVASCRIPT;
                } else {
                    if (this.zzeqz.zzhif == 2) {
                        zzaqrVar = zzaqr.UNSPECIFIED;
                    } else {
                        zzaqrVar = zzaqr.BEGIN_TO_RENDER;
                    }
                    zzaqrVar2 = zzaqrVar;
                    zzaqpVar = zzaqp.HTML_DISPLAY;
                }
                this.zzfty = com.google.android.gms.ads.internal.zzp.zzlf().zza(sb2, this.zzdhu.getWebView(), "", "javascript", videoEventsOwner, zzaqrVar2, zzaqpVar, this.zzeqz.zzchd);
            } else {
                this.zzfty = com.google.android.gms.ads.internal.zzp.zzlf().zza(sb2, this.zzdhu.getWebView(), "", "javascript", videoEventsOwner);
            }
            if (this.zzfty == null || this.zzdhu.getView() == null) {
                return;
            }
            com.google.android.gms.ads.internal.zzp.zzlf().zza(this.zzfty, this.zzdhu.getView());
            this.zzdhu.zzaq(this.zzfty);
            com.google.android.gms.ads.internal.zzp.zzlf().zzab(this.zzfty);
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuv)).booleanValue()) {
                this.zzdhu.zza("onSdkLoaded", new ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzfty = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        zzbdh zzbdhVar;
        if (this.zzfty == null || (zzbdhVar = this.zzdhu) == null) {
            return;
        }
        zzbdhVar.zza("onSdkImpression", new ArrayMap());
    }
}
