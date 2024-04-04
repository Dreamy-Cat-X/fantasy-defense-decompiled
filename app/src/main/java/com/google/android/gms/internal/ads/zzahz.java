package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.zzbcw;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbec;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbeo;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzuz;
import com.kt.olleh.inapp.net.InAppError;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzahz<T extends zzuz & zzbcw & zzbdh & zzbec & zzbej & zzben & zzbeo & zzbeq> implements zzahv<T> {
    private final com.google.android.gms.ads.internal.zza zzdgt;
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzayq zzdgw = new zzayq();
    private final zzapv zzdgx;
    private final zzcpy zzdgy;

    public zzahz(com.google.android.gms.ads.internal.zza zzaVar, zzapv zzapvVar, zzcpy zzcpyVar, zzcju zzcjuVar, zzdro zzdroVar) {
        this.zzdgt = zzaVar;
        this.zzdgx = zzapvVar;
        this.zzdgy = zzcpyVar;
        this.zzdgu = zzcjuVar;
        this.zzdgv = zzdroVar;
    }

    private final boolean zza(T t, Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        boolean zzbb = com.google.android.gms.ads.internal.util.zzm.zzbb(context);
        com.google.android.gms.ads.internal.zzp.zzkq();
        com.google.android.gms.ads.internal.util.zzbf zzbe = com.google.android.gms.ads.internal.util.zzm.zzbe(context);
        zzcju zzcjuVar = this.zzdgu;
        if (zzcjuVar != null) {
            zzcqi.zza(context, zzcjuVar, this.zzdgv, this.zzdgy, str2, "offline_open");
        }
        T t2 = t;
        boolean z = t2.zzadg().zzaem() && !(t2.zzaba() instanceof Activity);
        if (zzbb) {
            this.zzdgy.zzb(this.zzdgw, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzbd(context) && zzbe != null && !z) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczh)).booleanValue()) {
                if (t2.zzadg().zzaem()) {
                    zzcqi.zza(t2.zzaba(), null, zzbe, this.zzdgy, this.zzdgu, this.zzdgv, str2, str);
                } else {
                    t.zza(zzbe, this.zzdgy, this.zzdgu, this.zzdgv, str2, str, com.google.android.gms.ads.internal.zzp.zzks().zzza());
                }
                zzcju zzcjuVar2 = this.zzdgu;
                if (zzcjuVar2 != null) {
                    zzcqi.zza(context, zzcjuVar2, this.zzdgv, this.zzdgy, str2, "dialog_impression");
                }
                t.onAdClicked();
                return true;
            }
        }
        this.zzdgy.zzgm(str2);
        if (this.zzdgu != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzp.zzkq();
            if (!com.google.android.gms.ads.internal.util.zzm.zzbd(context)) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzbe == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzczh)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzcqi.zza(context, this.zzdgu, this.zzdgv, this.zzdgy, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    private final void zzda(int i) {
        if (this.zzdgu == null) {
            return;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            this.zzdgv.zzb(zzdrp.zzgz("cct_action").zzu("cct_open_status", zzacj.zzdbc[i - 1]));
        } else {
            this.zzdgu.zzaqt().zzr("action", "cct_action").zzr("cct_open_status", zzacj.zzdbc[i - 1]).zzaqv();
        }
    }

    private static boolean zzc(Map<String, String> map) {
        return InAppError.FAILED.equals(map.get("custom_close"));
    }

    private static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("c".equalsIgnoreCase(str)) {
            return com.google.android.gms.ads.internal.zzp.zzks().zzza();
        }
        return -1;
    }

    private final void zzab(boolean z) {
        zzapv zzapvVar = this.zzdgx;
        if (zzapvVar != null) {
            zzapvVar.zzac(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zza(Context context, zzef zzefVar, Uri uri, View view, Activity activity) {
        if (zzefVar == null) {
            return uri;
        }
        try {
            return zzefVar.zzc(uri) ? zzefVar.zza(uri, context, view, activity) : uri;
        } catch (zzei unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            com.google.android.gms.ads.internal.util.zzd.zzc(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(Object obj, Map map) {
        String str;
        boolean z;
        zzuz zzuzVar = (zzuz) obj;
        zzbdh zzbdhVar = (zzbdh) zzuzVar;
        String zzc = zzawy.zzc((String) map.get("u"), zzbdhVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zza zzaVar = this.zzdgt;
        if (zzaVar != null && !zzaVar.zzjy()) {
            this.zzdgt.zzbk(zzc);
            return;
        }
        zzdmi zzacn = zzbdhVar.zzacn();
        zzdmj zzady = zzbdhVar.zzady();
        if (zzacn == null || zzady == null) {
            str = "";
            z = false;
        } else {
            z = zzacn.zzhim;
            str = zzady.zzbvf;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzbdhVar.zzadn()) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzab(false);
                ((zzben) zzuzVar).zzb(zzc(map), zzd(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzab(false);
            if (zzc != null) {
                ((zzben) zzuzVar).zza(zzc(map), zzd(map), zzc);
                return;
            } else {
                ((zzben) zzuzVar).zza(zzc(map), zzd(map), (String) map.get("html"), (String) map.get("baseurl"));
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctw)).booleanValue()) {
                zzab(true);
                if (TextUtils.isEmpty(zzc)) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Cannot open browser with null or empty url");
                    zzda(zzacj.zzdaz);
                    return;
                }
                Uri zze = zze(zza(zzbdhVar.getContext(), zzbdhVar.zzadl(), Uri.parse(zzc), zzbdhVar.getView(), zzbdhVar.zzaba()));
                if (z && this.zzdgy != null && zza(zzuzVar, zzbdhVar.getContext(), zze.toString(), str)) {
                    return;
                }
                try {
                    try {
                        zzda(com.google.android.gms.ads.internal.zzp.zzkq().zza(((zzbdh) zzuzVar).zzaba(), zze));
                        return;
                    } catch (ActivityNotFoundException e) {
                        com.google.android.gms.ads.internal.util.zzd.zzex(e.getMessage());
                        zzda(5);
                        return;
                    }
                } catch (Throwable th) {
                    zzda(7);
                    throw th;
                }
            }
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzab(true);
            Intent zze2 = new zzaic(zzbdhVar.getContext(), zzbdhVar.zzadl(), zzbdhVar.getView()).zze(map);
            if (!z || this.zzdgy == null || zze2 == null || !zza(zzuzVar, zzbdhVar.getContext(), zze2.getData().toString(), str)) {
                try {
                    ((zzben) zzuzVar).zza(new com.google.android.gms.ads.internal.overlay.zzb(zze2));
                    return;
                } catch (ActivityNotFoundException e2) {
                    com.google.android.gms.ads.internal.util.zzd.zzex(e2.getMessage());
                    return;
                }
            }
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcyz)).booleanValue()) {
                zzab(true);
                String str3 = (String) map.get("p");
                if (str3 == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzdgy != null && zza(zzuzVar, zzbdhVar.getContext(), str3, str)) {
                    return;
                }
                PackageManager packageManager = zzbdhVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str3);
                if (launchIntentForPackage != null) {
                    ((zzben) zzuzVar).zza(new com.google.android.gms.ads.internal.overlay.zzb(launchIntentForPackage));
                    return;
                }
                return;
            }
            return;
        }
        zzab(true);
        String str4 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str4)) {
            try {
                intent = Intent.parseUri(str4, 0);
            } catch (URISyntaxException e3) {
                String valueOf = String.valueOf(str4);
                com.google.android.gms.ads.internal.util.zzd.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e3);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zze3 = zze(zza(zzbdhVar.getContext(), zzbdhVar.zzadl(), data, zzbdhVar.getView(), zzbdhVar.zzaba()));
                if (!TextUtils.isEmpty(intent.getType())) {
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcza)).booleanValue()) {
                        intent.setDataAndType(zze3, intent.getType());
                    }
                }
                intent.setData(zze3);
            }
        }
        if (intent != null) {
            if (z && this.zzdgy != null && zza(zzuzVar, zzbdhVar.getContext(), intent.getData().toString(), str)) {
                return;
            }
            ((zzben) zzuzVar).zza(new com.google.android.gms.ads.internal.overlay.zzb(intent));
            return;
        }
        if (!TextUtils.isEmpty(zzc)) {
            zzc = zze(zza(zzbdhVar.getContext(), zzbdhVar.zzadl(), Uri.parse(zzc), zzbdhVar.getView(), zzbdhVar.zzaba())).toString();
        }
        String str5 = zzc;
        if (z && this.zzdgy != null && zza(zzuzVar, zzbdhVar.getContext(), str5, str)) {
            return;
        }
        ((zzben) zzuzVar).zza(new com.google.android.gms.ads.internal.overlay.zzb((String) map.get("i"), str5, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
    }
}
