package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import com.sncompany.newtower.GameThread;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdy implements zzdv {
    protected static volatile zzez zzvx;
    protected MotionEvent zzwp;
    protected double zzwy;
    private double zzwz;
    private double zzxa;
    protected float zzxb;
    protected float zzxc;
    protected float zzxd;
    protected float zzxe;
    protected DisplayMetrics zzxh;
    protected LinkedList<MotionEvent> zzwq = new LinkedList<>();
    protected long zzwr = 0;
    protected long zzws = 0;
    protected long zzwt = 0;
    protected long zzwu = 0;
    protected long zzwv = 0;
    protected long zzww = 0;
    protected long zzwx = 0;
    private boolean zzxf = false;
    protected boolean zzxg = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdy(Context context) {
        try {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrn)).booleanValue()) {
                zzcx.zzbo();
            } else {
                zzfg.zzb(zzvx);
            }
            this.zzxh = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzew;

    protected abstract zzcf.zza.C0009zza zza(Context context, zzby.zza zzaVar);

    protected abstract zzcf.zza.C0009zza zzb(Context context, View view, Activity activity);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzff zzb(MotionEvent motionEvent) throws zzew;

    @Override // com.google.android.gms.internal.ads.zzdv
    public void zzb(View view) {
    }

    protected abstract zzcf.zza.C0009zza zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzdv
    public String zzb(Context context) {
        if (zzfi.isMainThread()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zza(context, null, zzet.zzyg, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public String zza(Context context, View view, Activity activity) {
        return zza(context, null, zzet.zzyh, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public String zza(Context context, String str, View view, Activity activity) {
        return zza(context, str, zzet.zzyi, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.zzxf) {
            zzbz();
            this.zzxf = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzwy = 0.0d;
            this.zzwz = motionEvent.getRawX();
            this.zzxa = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = this.zzwz;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.zzxa;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.zzwy += Math.sqrt((d2 * d2) + (d4 * d4));
            this.zzwz = rawX;
            this.zzxa = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzwp = obtain;
                    this.zzwq.add(obtain);
                    if (this.zzwq.size() > 6) {
                        this.zzwq.remove().recycle();
                    }
                    this.zzwt++;
                    this.zzwv = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zzws += motionEvent.getHistorySize() + 1;
                    zzff zzb = zzb(motionEvent);
                    if ((zzb == null || zzb.zzzp == null || zzb.zzzs == null) ? false : true) {
                        this.zzww += zzb.zzzp.longValue() + zzb.zzzs.longValue();
                    }
                    if (this.zzxh != null && zzb != null && zzb.zzzq != null && zzb.zzzt != null) {
                        z = true;
                    }
                    if (z) {
                        this.zzwx += zzb.zzzq.longValue() + zzb.zzzt.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzwu++;
                }
            } catch (zzew unused) {
            }
        } else {
            this.zzxb = motionEvent.getX();
            this.zzxc = motionEvent.getY();
            this.zzxd = motionEvent.getRawX();
            this.zzxe = motionEvent.getRawY();
            this.zzwr++;
        }
        this.zzxg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public void zza(int i, int i2, int i3) {
        if (this.zzwp != null) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrb)).booleanValue()) {
                zzbz();
            } else {
                this.zzwp.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzxh;
        if (displayMetrics != null) {
            this.zzwp = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzxh.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzwp = null;
        }
        this.zzxg = false;
    }

    private final void zzbz() {
        this.zzwv = 0L;
        this.zzwr = 0L;
        this.zzws = 0L;
        this.zzwt = 0L;
        this.zzwu = 0L;
        this.zzww = 0L;
        this.zzwx = 0L;
        if (this.zzwq.size() > 0) {
            Iterator<MotionEvent> it = this.zzwq.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.zzwq.clear();
        } else {
            MotionEvent motionEvent = this.zzwp;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzwp = null;
    }

    private final String zza(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzdt zzdtVar;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcrd)).booleanValue();
        zzcf.zza.C0009zza c0009zza = null;
        if (booleanValue) {
            zzdtVar = zzvx != null ? zzvx.zzcl() : null;
            str2 = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcrn)).booleanValue() ? "be" : "te";
        } else {
            zzdtVar = null;
            str2 = null;
        }
        try {
            if (i == zzet.zzyi) {
                c0009zza = zzc(context, view, activity);
                this.zzxf = true;
                i5 = 1002;
            } else if (i == zzet.zzyh) {
                c0009zza = zzb(context, view, activity);
                i5 = 1008;
            } else {
                c0009zza = zza(context, null);
                i5 = 1000;
            }
            if (booleanValue && zzdtVar != null) {
                zzdtVar.zza(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2);
            }
        } catch (Exception e) {
            if (booleanValue && zzdtVar != null) {
                if (i == zzet.zzyi) {
                    i2 = 1003;
                } else if (i == zzet.zzyh) {
                    i2 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                } else {
                    i2 = i == zzet.zzyg ? 1001 : -1;
                }
                zzdtVar.zza(i2, -1, System.currentTimeMillis() - currentTimeMillis, str2, e);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (c0009zza != null) {
            try {
                if (((zzcf.zza) ((zzekq) c0009zza.zzbiz())).zzbin() != 0) {
                    String zzj = zzcx.zzj((zzcf.zza) ((zzekq) c0009zza.zzbiz()), str);
                    if (!booleanValue || zzdtVar == null) {
                        return zzj;
                    }
                    if (i == zzet.zzyi) {
                        i4 = 1006;
                    } else if (i == zzet.zzyh) {
                        i4 = PointerIconCompat.TYPE_ALIAS;
                    } else {
                        i4 = i == zzet.zzyg ? 1004 : -1;
                    }
                    zzdtVar.zza(i4, -1, System.currentTimeMillis() - currentTimeMillis2, str2);
                    return zzj;
                }
            } catch (Exception e2) {
                String num = Integer.toString(7);
                if (!booleanValue || zzdtVar == null) {
                    return num;
                }
                if (i == zzet.zzyi) {
                    i3 = 1007;
                } else if (i == zzet.zzyh) {
                    i3 = PointerIconCompat.TYPE_COPY;
                } else {
                    i3 = i == zzet.zzyg ? GameThread.GAME_PLAY2_IMAGE_LOAD : -1;
                }
                zzdtVar.zza(i3, -1, System.currentTimeMillis() - currentTimeMillis2, str2, e2);
                return num;
            }
        }
        return Integer.toString(5);
    }
}
