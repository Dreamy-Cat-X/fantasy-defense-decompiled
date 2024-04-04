package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxz {
    private final String zzebj;
    private final com.google.android.gms.ads.internal.util.zzf zzebk;
    private long zzebe = -1;
    private long zzebf = -1;
    private int zzebg = -1;
    int zzebh = -1;
    private long zzebi = 0;
    private final Object lock = new Object();
    private int zzebl = 0;
    private int zzebm = 0;

    public zzaxz(String str, com.google.android.gms.ads.internal.util.zzf zzfVar) {
        this.zzebj = str;
        this.zzebk = zzfVar;
    }

    public final void zzxh() {
        synchronized (this.lock) {
            this.zzebl++;
        }
    }

    public final void zzxg() {
        synchronized (this.lock) {
            this.zzebm++;
        }
    }

    public final void zza(zzvi zzviVar, long j) {
        synchronized (this.lock) {
            long zzym = this.zzebk.zzym();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
            if (this.zzebf == -1) {
                if (currentTimeMillis - zzym > ((Long) zzwo.zzqq().zzd(zzabh.zzcou)).longValue()) {
                    this.zzebh = -1;
                } else {
                    this.zzebh = this.zzebk.zzyn();
                }
                this.zzebf = j;
                this.zzebe = j;
            } else {
                this.zzebe = j;
            }
            if (zzviVar == null || zzviVar.extras == null || zzviVar.extras.getInt("gw", 2) != 1) {
                this.zzebg++;
                int i = this.zzebh + 1;
                this.zzebh = i;
                if (i == 0) {
                    this.zzebi = 0L;
                    this.zzebk.zzfa(currentTimeMillis);
                } else {
                    this.zzebi = currentTimeMillis - this.zzebk.zzyo();
                }
            }
        }
    }

    public final Bundle zzn(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzebk.zzys() ? "" : this.zzebj);
            bundle.putLong("basets", this.zzebf);
            bundle.putLong("currts", this.zzebe);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzebg);
            bundle.putInt("preqs_in_session", this.zzebh);
            bundle.putLong("time_in_session", this.zzebi);
            bundle.putInt("pclick", this.zzebl);
            bundle.putInt("pimp", this.zzebm);
            bundle.putBoolean("support_transparent_background", zzaj(context));
        }
        return bundle;
    }

    private static boolean zzaj(Context context) {
        Context zzy = zzatp.zzy(context);
        int identifier = zzy.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            com.google.android.gms.ads.internal.util.zzd.zzew("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzy.getPackageManager().getActivityInfo(new ComponentName(zzy.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            com.google.android.gms.ads.internal.util.zzd.zzew("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Fail to fetch AdActivity theme");
            com.google.android.gms.ads.internal.util.zzd.zzew("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
