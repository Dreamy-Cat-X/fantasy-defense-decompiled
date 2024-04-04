package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzwo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzag {
    private final Context context;
    private Handler handler;
    private int state;
    private String zzbrf;
    private String zzbup;
    private String zzdrg;
    private String zzdux;
    private int zzedg;
    private PointF zzedh;
    private PointF zzedi;
    private Runnable zzedj;

    public zzag(Context context) {
        this.state = 0;
        this.zzedj = new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaf
            private final zzag zzedf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzedf = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzedf.zzzi();
            }
        };
        this.context = context;
        this.zzedg = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzp.zzle().zzzn();
        this.handler = com.google.android.gms.ads.internal.zzp.zzle().getHandler();
    }

    public zzag(Context context, String str) {
        this(context);
        this.zzdrg = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        boolean z = false;
        if (actionMasked == 0) {
            this.state = 0;
            this.zzedh = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.state;
        if (i == -1) {
            return;
        }
        if (i == 0 && actionMasked == 5) {
            this.state = 5;
            this.zzedi = new PointF(motionEvent.getX(1), motionEvent.getY(1));
            this.handler.postDelayed(this.zzedj, ((Long) zzwo.zzqq().zzd(zzabh.zzcty)).longValue());
            return;
        }
        if (this.state != 5) {
            return;
        }
        if (pointerCount == 2) {
            if (actionMasked == 2) {
                boolean z2 = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    if (!zza(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2))) {
                        z2 = true;
                    }
                }
                if (zza(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                    z = z2;
                }
            }
            if (z) {
                return;
            }
            this.state = -1;
            this.handler.removeCallbacks(this.zzedj);
            return;
        }
        z = true;
        if (z) {
        }
    }

    private final boolean zza(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzedh.x - f) < ((float) this.zzedg) && Math.abs(this.zzedh.y - f2) < ((float) this.zzedg) && Math.abs(this.zzedi.x - f3) < ((float) this.zzedg) && Math.abs(this.zzedi.y - f4) < ((float) this.zzedg);
    }

    public final void showDialog() {
        try {
            if (!(this.context instanceof Activity)) {
                zzd.zzew("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzp.zzla().zzzj()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = com.google.android.gms.ads.internal.zzp.zzla().zzzk() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            final int zza = zza((List<String>) arrayList, "Ad Information", true);
            final int zza2 = zza((List<String>) arrayList, str, true);
            final int zza3 = zza((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.context, com.google.android.gms.ads.internal.zzp.zzks().zzzd());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, zza, zza2, zza3) { // from class: com.google.android.gms.ads.internal.util.zzai
                private final zzag zzedf;
                private final int zzedk;
                private final int zzedl;
                private final int zzedm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzedf = this;
                    this.zzedk = zza;
                    this.zzedl = zza2;
                    this.zzedm = zza3;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zzedf.zza(this.zzedk, this.zzedl, this.zzedm, dialogInterface, i);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zzd.zza("", e);
        }
    }

    public final void setAdUnitId(String str) {
        this.zzbup = str;
    }

    public final void zzad(String str) {
        this.zzbrf = str;
    }

    public final void zzem(String str) {
        this.zzdrg = str;
    }

    public final void zzen(String str) {
        this.zzdux = str;
    }

    private static int zza(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzdrg);
        sb.append(",DebugSignal: ");
        sb.append(this.zzdux);
        sb.append(",AFMA Version: ");
        sb.append(this.zzbrf);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzbup);
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzzg() {
        com.google.android.gms.ads.internal.zzp.zzla().zza(this.context, this.zzbup, this.zzbrf, this.zzdux);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzzh() {
        com.google.android.gms.ads.internal.zzp.zzla().zze(this.context, this.zzbup, this.zzbrf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzm.zza(this.context, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zza(int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        final String str;
        if (i4 != i) {
            if (i4 == i2) {
                zzd.zzdy("Debug mode [Creative Preview] selected.");
                zzayv.zzegi.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzaj
                    private final zzag zzedf;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzedf = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzedf.zzzh();
                    }
                });
                return;
            } else {
                if (i4 == i3) {
                    zzd.zzdy("Debug mode [Troubleshooting] selected.");
                    zzayv.zzegi.execute(new Runnable(this) { // from class: com.google.android.gms.ads.internal.util.zzam
                        private final zzag zzedf;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzedf = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzedf.zzzg();
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (!(this.context instanceof Activity)) {
            zzd.zzew("Can not create dialog without Activity Context");
            return;
        }
        String str2 = this.zzdrg;
        if (!TextUtils.isEmpty(str2)) {
            Uri build = new Uri.Builder().encodedQuery(str2.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzp.zzkq();
            Map<String, String> zzg = zzm.zzg(build);
            for (String str3 : zzg.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append(zzg.get(str3));
                sb.append("\n\n");
            }
            str = sb.toString().trim();
        }
        str = "No debug information";
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setMessage(str);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new DialogInterface.OnClickListener(this, str) { // from class: com.google.android.gms.ads.internal.util.zzah
            private final String zzdhw;
            private final zzag zzedf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzedf = this;
                this.zzdhw = str;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i5) {
                this.zzedf.zza(this.zzdhw, dialogInterface2, i5);
            }
        });
        builder.setNegativeButton("Close", zzak.zzedn);
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzzi() {
        this.state = 4;
        showDialog();
    }
}
