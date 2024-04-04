package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.nonagon.transaction.omid.OmidMediaType;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbmo implements zzbrj, zzbsg {
    private final Context context;
    private final zzayt zzbpd;
    private final zzbdh zzdhu;
    private final zzdmi zzeqz;
    private IObjectWrapper zzfty;
    private boolean zzftz;

    public zzbmo(Context context, zzbdh zzbdhVar, zzdmi zzdmiVar, zzayt zzaytVar) {
        this.context = context;
        this.zzdhu = zzbdhVar;
        this.zzeqz = zzdmiVar;
        this.zzbpd = zzaytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final synchronized void onAdLoaded() {
        if (this.zzftz) {
            return;
        }
        zzakk();
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final synchronized void onAdImpression() {
        if (!this.zzftz) {
            zzakk();
        }
        if (this.zzeqz.zzdvb && this.zzfty != null && this.zzdhu != null) {
            this.zzdhu.zza("onSdkImpression", new ArrayMap());
        }
    }

    private final synchronized void zzakk() {
        zzaqp zzaqpVar;
        zzaqr zzaqrVar;
        if (this.zzeqz.zzdvb) {
            if (this.zzdhu == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzp.zzlf().zzm(this.context)) {
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
                        zzaqrVar = zzaqr.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzaqpVar = zzaqp.HTML_DISPLAY;
                        if (this.zzeqz.zzhhm == 1) {
                            zzaqrVar = zzaqr.ONE_PIXEL;
                        } else {
                            zzaqrVar = zzaqr.BEGIN_TO_RENDER;
                        }
                    }
                    this.zzfty = com.google.android.gms.ads.internal.zzp.zzlf().zza(sb2, this.zzdhu.getWebView(), "", "javascript", videoEventsOwner, zzaqrVar, zzaqpVar, this.zzeqz.zzchd);
                } else {
                    this.zzfty = com.google.android.gms.ads.internal.zzp.zzlf().zza(sb2, this.zzdhu.getWebView(), "", "javascript", videoEventsOwner);
                }
                View view = this.zzdhu.getView();
                if (this.zzfty != null && view != null) {
                    com.google.android.gms.ads.internal.zzp.zzlf().zza(this.zzfty, view);
                    this.zzdhu.zzaq(this.zzfty);
                    com.google.android.gms.ads.internal.zzp.zzlf().zzab(this.zzfty);
                    this.zzftz = true;
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuv)).booleanValue()) {
                        this.zzdhu.zza("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }
}
