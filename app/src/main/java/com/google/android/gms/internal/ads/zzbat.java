package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbat {
    private final Context context;
    private final zzayt zzdsc;
    private final String zzdss;
    private final zzaby zzeie;
    private boolean zzeii;
    private final zzabw zzekv;
    private final long[] zzekx;
    private final String[] zzeky;
    private zzbab zzeld;
    private boolean zzele;
    private boolean zzelf;
    private final com.google.android.gms.ads.internal.util.zzat zzekw = new com.google.android.gms.ads.internal.util.zzay().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzzm();
    private boolean zzekz = false;
    private boolean zzela = false;
    private boolean zzelb = false;
    private boolean zzelc = false;
    private long zzelg = -1;

    public zzbat(Context context, zzayt zzaytVar, String str, zzaby zzabyVar, zzabw zzabwVar) {
        this.context = context;
        this.zzdsc = zzaytVar;
        this.zzdss = str;
        this.zzeie = zzabyVar;
        this.zzekv = zzabwVar;
        String str2 = (String) zzwo.zzqq().zzd(zzabh.zzcml);
        if (str2 == null) {
            this.zzeky = new String[0];
            this.zzekx = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzeky = new String[split.length];
        this.zzekx = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzekx[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Unable to parse frame hash target time number.", e);
                this.zzekx[i] = -1;
            }
        }
    }

    public final void zzb(zzbab zzbabVar) {
        zzabp.zza(this.zzeie, this.zzekv, "vpc2");
        this.zzekz = true;
        zzaby zzabyVar = this.zzeie;
        if (zzabyVar != null) {
            zzabyVar.zzg("vpn", zzbabVar.zzaab());
        }
        this.zzeld = zzbabVar;
    }

    public final void zzfb() {
        if (!this.zzekz || this.zzela) {
            return;
        }
        zzabp.zza(this.zzeie, this.zzekv, "vfr2");
        this.zzela = true;
    }

    public final void onStop() {
        if (!zzadq.zzdec.get().booleanValue() || this.zzele) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzdss);
        bundle.putString("player", this.zzeld.zzaab());
        for (com.google.android.gms.ads.internal.util.zzav zzavVar : this.zzekw.zzzl()) {
            String valueOf = String.valueOf(zzavVar.name);
            bundle.putString(valueOf.length() != 0 ? "fps_c_".concat(valueOf) : new String("fps_c_"), Integer.toString(zzavVar.count));
            String valueOf2 = String.valueOf(zzavVar.name);
            bundle.putString(valueOf2.length() != 0 ? "fps_p_".concat(valueOf2) : new String("fps_p_"), Double.toString(zzavVar.zzeed));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzekx;
            if (i < jArr.length) {
                String str = this.zzeky[i];
                if (str != null) {
                    String valueOf3 = String.valueOf(Long.valueOf(jArr[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf3);
                    bundle.putString(sb.toString(), str);
                }
                i++;
            } else {
                com.google.android.gms.ads.internal.zzp.zzkq().zza(this.context, this.zzdsc.zzbrf, "gmob-apps", bundle, true);
                this.zzele = true;
                return;
            }
        }
    }

    public final void zzc(zzbab zzbabVar) {
        if (this.zzelb && !this.zzelc) {
            if (com.google.android.gms.ads.internal.util.zzd.zzye() && !this.zzelc) {
                com.google.android.gms.ads.internal.util.zzd.zzeb("VideoMetricsMixin first frame");
            }
            zzabp.zza(this.zzeie, this.zzekv, "vff2");
            this.zzelc = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzp.zzkx().nanoTime();
        if (this.zzeii && this.zzelf && this.zzelg != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            double d = nanoTime - this.zzelg;
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.zzekw.zza(nanos / d);
        }
        this.zzelf = this.zzeii;
        this.zzelg = nanoTime;
        long longValue = ((Long) zzwo.zzqq().zzd(zzabh.zzcmm)).longValue();
        long currentPosition = zzbabVar.getCurrentPosition();
        int i = 0;
        while (true) {
            String[] strArr = this.zzeky;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > Math.abs(currentPosition - this.zzekx[i])) {
                String[] strArr2 = this.zzeky;
                int i2 = 8;
                Bitmap bitmap = zzbabVar.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        i4++;
                        j--;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr2[i] = String.format("%016X", Long.valueOf(j2));
                return;
            }
            i++;
        }
    }

    public final void zzabk() {
        this.zzeii = true;
        if (!this.zzela || this.zzelb) {
            return;
        }
        zzabp.zza(this.zzeie, this.zzekv, "vfp2");
        this.zzelb = true;
    }

    public final void zzabl() {
        this.zzeii = false;
    }
}
