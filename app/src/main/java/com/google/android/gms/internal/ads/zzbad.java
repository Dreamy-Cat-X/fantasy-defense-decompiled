package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzbad extends FrameLayout implements zzazy {
    private final zzbaq zzehb;
    private final FrameLayout zzeid;
    private final zzaby zzeie;
    private final zzbas zzeif;
    private final long zzeig;
    private zzbab zzeih;
    private boolean zzeii;
    private boolean zzeij;
    private boolean zzeik;
    private boolean zzeil;
    private long zzeim;
    private long zzein;
    private String zzeio;
    private String[] zzeip;
    private Bitmap zzeiq;
    private ImageView zzeir;
    private boolean zzeis;

    public static void zzb(zzbaq zzbaqVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzbaqVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzbaq zzbaqVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbaqVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzbaq zzbaqVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzbaqVar.zza("onVideoEvent", hashMap);
    }

    public zzbad(Context context, zzbaq zzbaqVar, int i, boolean z, zzaby zzabyVar, zzbar zzbarVar) {
        super(context);
        this.zzehb = zzbaqVar;
        this.zzeie = zzabyVar;
        this.zzeid = new FrameLayout(context);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcmw)).booleanValue()) {
            this.zzeid.setBackgroundResource(R.color.black);
        }
        addView(this.zzeid, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzbaqVar.zzabb());
        zzbab zza = zzbaqVar.zzabb().zzboi.zza(context, zzbaqVar, i, z, zzabyVar, zzbarVar);
        this.zzeih = zza;
        if (zza != null) {
            this.zzeid.addView(zza, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcmn)).booleanValue()) {
                zzaap();
            }
        }
        this.zzeir = new ImageView(context);
        this.zzeig = ((Long) zzwo.zzqq().zzd(zzabh.zzcmr)).longValue();
        boolean booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcmp)).booleanValue();
        this.zzeil = booleanValue;
        zzaby zzabyVar2 = this.zzeie;
        if (zzabyVar2 != null) {
            zzabyVar2.zzg("spinner_used", booleanValue ? InAppError.FAILED : InAppError.SUCCESS);
        }
        this.zzeif = new zzbas(this);
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar != null) {
            zzbabVar.zza(this);
        }
        if (this.zzeih == null) {
            zzl("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzeid.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzc(String str, String[] strArr) {
        this.zzeio = str;
        this.zzeip = strArr;
    }

    public final void zza(float f, float f2) {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar != null) {
            zzbabVar.zza(f, f2);
        }
    }

    public final void zzhy() {
        if (this.zzeih == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzeio)) {
            this.zzeih.zzb(this.zzeio, this.zzeip);
        } else {
            zzd("no_src", new String[0]);
        }
    }

    public final void pause() {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.pause();
    }

    public final void play() {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.play();
    }

    public final void seekTo(int i) {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.seekTo(i);
    }

    public final void zzaan() {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.zzeib.setMuted(true);
        zzbabVar.zzaah();
    }

    public final void zzaao() {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.zzeib.setMuted(false);
        zzbabVar.zzaah();
    }

    public final void setVolume(float f) {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.zzeib.setVolume(f);
        zzbabVar.zzaah();
    }

    public final void zzdl(int i) {
        this.zzeih.zzdl(i);
    }

    public final void zzdm(int i) {
        this.zzeih.zzdm(i);
    }

    public final void zzdn(int i) {
        this.zzeih.zzdn(i);
    }

    public final void zzdo(int i) {
        this.zzeih.zzdo(i);
    }

    public final void zzdp(int i) {
        this.zzeih.zzdp(i);
    }

    public final void zze(MotionEvent motionEvent) {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        zzbabVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzaap() {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        TextView textView = new TextView(zzbabVar.getContext());
        String valueOf = String.valueOf(this.zzeih.zzaab());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzeid.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzeid.bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzaai() {
        this.zzeif.resume();
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzbae(this));
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzfb() {
        if (this.zzeih != null && this.zzein == 0) {
            zzd("canplaythrough", "duration", String.valueOf(r0.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.zzeih.getVideoWidth()), "videoHeight", String.valueOf(this.zzeih.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzaaj() {
        if (this.zzehb.zzaba() != null && !this.zzeij) {
            boolean z = (this.zzehb.zzaba().getWindow().getAttributes().flags & 128) != 0;
            this.zzeik = z;
            if (!z) {
                this.zzehb.zzaba().getWindow().addFlags(128);
                this.zzeij = true;
            }
        }
        this.zzeii = true;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void onPaused() {
        zzd("pause", new String[0]);
        zzaas();
        this.zzeii = false;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzaak() {
        zzd("ended", new String[0]);
        zzaas();
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzl(String str, String str2) {
        zzd("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzaal() {
        if (this.zzeis && this.zzeiq != null && !zzaar()) {
            this.zzeir.setImageBitmap(this.zzeiq);
            this.zzeir.invalidate();
            this.zzeid.addView(this.zzeir, new FrameLayout.LayoutParams(-1, -1));
            this.zzeid.bringChildToFront(this.zzeir);
        }
        this.zzeif.pause();
        this.zzein = this.zzeim;
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzbah(this));
    }

    public final void destroy() {
        this.zzeif.pause();
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar != null) {
            zzbabVar.stop();
        }
        zzaas();
    }

    public final void finalize() throws Throwable {
        try {
            this.zzeif.pause();
            if (this.zzeih != null) {
                zzbab zzbabVar = this.zzeih;
                zzdzk zzdzkVar = zzayv.zzegm;
                zzbabVar.getClass();
                zzdzkVar.execute(zzbac.zza(zzbabVar));
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaaq() {
        zzbab zzbabVar = this.zzeih;
        if (zzbabVar == null) {
            return;
        }
        long currentPosition = zzbabVar.getCurrentPosition();
        if (this.zzeim == currentPosition || currentPosition <= 0) {
            return;
        }
        float f = ((float) currentPosition) / 1000.0f;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue()) {
            zzd("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzeih.getTotalBytes()), "qoeCachedBytes", String.valueOf(this.zzeih.zzna()), "qoeLoadedBytes", String.valueOf(this.zzeih.zzaaf()), "droppedFrames", String.valueOf(this.zzeih.zzaag()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
        } else {
            zzd("timeupdate", "time", String.valueOf(f));
        }
        this.zzeim = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzaam() {
        if (this.zzeii && zzaar()) {
            this.zzeid.removeView(this.zzeir);
        }
        if (this.zzeiq != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
            if (this.zzeih.getBitmap(this.zzeiq) != null) {
                this.zzeis = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
            if (com.google.android.gms.ads.internal.util.zzd.zzye()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
            }
            if (elapsedRealtime2 > this.zzeig) {
                com.google.android.gms.ads.internal.util.zzd.zzex("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzeil = false;
                this.zzeiq = null;
                zzaby zzabyVar = this.zzeie;
                if (zzabyVar != null) {
                    zzabyVar.zzg("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzk(int i, int i2) {
        if (this.zzeil) {
            int max = Math.max(i / ((Integer) zzwo.zzqq().zzd(zzabh.zzcmq)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzwo.zzqq().zzd(zzabh.zzcmq)).intValue(), 1);
            Bitmap bitmap = this.zzeiq;
            if (bitmap != null && bitmap.getWidth() == max && this.zzeiq.getHeight() == max2) {
                return;
            }
            this.zzeiq = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzeis = false;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zzeif.resume();
        } else {
            this.zzeif.pause();
            this.zzein = this.zzeim;
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzbaf
            private final zzbad zzeiu;
            private final boolean zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiu = this;
                this.zzeiv = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiu.zzau(this.zzeiv);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzazy
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zzeif.resume();
            z = true;
        } else {
            this.zzeif.pause();
            this.zzein = this.zzeim;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzbag(this, z));
    }

    private final boolean zzaar() {
        return this.zzeir.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzehb.zza("onVideoEvent", hashMap);
    }

    private final void zzaas() {
        if (this.zzehb.zzaba() == null || !this.zzeij || this.zzeik) {
            return;
        }
        this.zzehb.zzaba().getWindow().clearFlags(128);
        this.zzeij = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzau(boolean z) {
        zzd("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
