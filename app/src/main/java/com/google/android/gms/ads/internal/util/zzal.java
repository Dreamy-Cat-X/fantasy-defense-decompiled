package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzwo;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzal {
    private final Object lock = new Object();
    private String zzedo = "";
    private String zzedp = "";
    private boolean zzedq = false;
    private String zzedr = "";

    public final void zze(Context context, String str, String str2) {
        if (!zzf(context, str, str2)) {
            zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(this.zzedr)) {
            zzd.zzdy("Creative is not pushed for this device.");
            zza(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (InAppError.FAILED.equals(this.zzedr)) {
            zzd.zzdy("The app is not linked for creative preview.");
            zzi(context, str, str2);
        } else if (InAppError.SUCCESS.equals(this.zzedr)) {
            zzd.zzdy("Device is linked for in app preview.");
            zza(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zza(Context context, String str, String str2, String str3) {
        boolean zzzk = zzzk();
        if (zzg(context, str, str2)) {
            if (!zzzk && !TextUtils.isEmpty(str3)) {
                zzc(context, str2, str3, str);
            }
            zzd.zzdy("Device is linked for debug signals.");
            zza(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzi(context, str, str2);
    }

    private final boolean zzf(Context context, String str, String str2) {
        String zzh = zzh(context, zzd(context, (String) zzwo.zzqq().zzd(zzabh.zzcua), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzh)) {
            zzd.zzdy("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzh.trim());
            String optString = jSONObject.optString("gct");
            this.zzedr = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            synchronized (this.lock) {
                this.zzedp = optString;
            }
            return true;
        } catch (JSONException e) {
            zzd.zzd("Fail to get in app preview response json.", e);
            return false;
        }
    }

    private final boolean zzg(Context context, String str, String str2) {
        String zzh = zzh(context, zzd(context, (String) zzwo.zzqq().zzd(zzabh.zzcub), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzh)) {
            zzd.zzdy("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = InAppError.FAILED.equals(new JSONObject(zzh.trim()).optString("debug_mode"));
            synchronized (this.lock) {
                this.zzedq = equals;
            }
            return equals;
        } catch (JSONException e) {
            zzd.zzd("Fail to get debug mode response json.", e);
            return false;
        }
    }

    private static String zzh(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzp.zzkq().zzq(context, str2));
        zzdzl<String> zzb = new zzax(context).zzb(str, hashMap);
        try {
            return zzb.get(((Integer) zzwo.zzqq().zzd(zzabh.zzcud)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            zzd.zzc(valueOf.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf) : new String("Interrupted while retriving a response from: "), e);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String valueOf2 = String.valueOf(str);
            zzd.zzc(valueOf2.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf2) : new String("Timeout while retriving a response from: "), e2);
            zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            zzd.zzc(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    private final void zzi(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzm.zzb(context, zzd(context, (String) zzwo.zzqq().zzd(zzabh.zzctz), str, str2));
    }

    public final boolean zzb(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !com.google.android.gms.ads.internal.zzp.zzla().zzzk()) {
            return false;
        }
        zzd.zzdy("Sending troubleshooting signals to the server.");
        zzc(context, str, str2, str3);
        return true;
    }

    private final void zzc(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzd(context, (String) zzwo.zzqq().zzd(zzabh.zzcuc), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzm.zzb(context, str, buildUpon.build().toString());
    }

    private final Uri zzd(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzbi(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final String zzbi(Context context) {
        String str;
        synchronized (this.lock) {
            if (TextUtils.isEmpty(this.zzedo)) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                String zzr = zzm.zzr(context, "debug_signals_id.txt");
                this.zzedo = zzr;
                if (TextUtils.isEmpty(zzr)) {
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    this.zzedo = zzm.zzyw();
                    com.google.android.gms.ads.internal.zzp.zzkq();
                    zzm.zzc(context, "debug_signals_id.txt", this.zzedo);
                }
            }
            str = this.zzedo;
        }
        return str;
    }

    public final String zzzj() {
        String str;
        synchronized (this.lock) {
            str = this.zzedp;
        }
        return str;
    }

    public final boolean zzzk() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzedq;
        }
        return z;
    }

    private final void zza(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zzd.zzew("Can not create dialog without Activity Context");
        } else {
            zzm.zzecu.post(new zzao(this, context, str, z, z2));
        }
    }
}
