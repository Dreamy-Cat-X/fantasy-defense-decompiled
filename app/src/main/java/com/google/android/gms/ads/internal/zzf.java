package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzcw;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzwo;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzf implements zzdv, Runnable {
    private Context context;
    private zzayt zzbos;
    private final int zzwo;
    private final List<Object[]> zzbop = new Vector();
    private final AtomicReference<zzdv> zzboq = new AtomicReference<>();
    private final AtomicReference<zzdv> zzbor = new AtomicReference<>();
    private CountDownLatch zzbot = new CountDownLatch(1);

    public zzf(Context context, zzayt zzaytVar) {
        this.context = context;
        this.zzbos = zzaytVar;
        int intValue = ((Integer) zzwo.zzqq().zzd(zzabh.zzcra)).intValue();
        if (intValue == 1) {
            this.zzwo = zzcw.zznh;
        } else if (intValue == 2) {
            this.zzwo = zzcw.zzni;
        } else {
            this.zzwo = zzcw.zzng;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcrp)).booleanValue()) {
            zzayv.zzegi.execute(this);
            return;
        }
        zzwo.zzqm();
        if (zzayd.zzzv()) {
            zzayv.zzegi.execute(this);
        } else {
            run();
        }
    }

    private final boolean zzjz() {
        try {
            this.zzbot.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzka() {
        zzdv zzca = zzca();
        if (this.zzbop.isEmpty() || zzca == null) {
            return;
        }
        for (Object[] objArr : this.zzbop) {
            if (objArr.length == 1) {
                zzca.zza((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                zzca.zza(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzbop.clear();
    }

    private static Context zze(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zzb(Context context) {
        zzdv zzdvVar;
        if (!zzjz()) {
            return "";
        }
        if (this.zzwo == zzcw.zznh || this.zzwo == zzcw.zzni) {
            zzdvVar = this.zzbor.get();
        } else {
            zzdvVar = this.zzboq.get();
        }
        if (zzdvVar == null) {
            return "";
        }
        zzka();
        return zzdvVar.zzb(zze(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, View view, Activity activity) {
        zzdv zzca = zzca();
        return zzca != null ? zzca.zza(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, String str, View view, Activity activity) {
        zzdv zzca;
        if (!zzjz() || (zzca = zzca()) == null) {
            return "";
        }
        zzka();
        return zzca.zza(zze(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zzb(View view) {
        zzdv zzca = zzca();
        if (zzca != null) {
            zzca.zzb(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zza(MotionEvent motionEvent) {
        zzdv zzca = zzca();
        if (zzca != null) {
            zzka();
            zzca.zza(motionEvent);
        } else {
            this.zzbop.add(new Object[]{motionEvent});
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zza(int i, int i2, int i3) {
        zzdv zzca = zzca();
        if (zzca != null) {
            zzka();
            zzca.zza(i, i2, i3);
        } else {
            this.zzbop.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzbos.zzegg;
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcox)).booleanValue() && z2) {
                z = true;
            }
            if (this.zzwo != zzcw.zznh) {
                this.zzboq.set(zzeg.zzb(this.zzbos.zzbrf, zze(this.context), z, this.zzwo));
            }
            if (this.zzwo != zzcw.zzng) {
                this.zzbor.set(zzdp.zza(this.zzbos.zzbrf, zze(this.context), z));
            }
        } finally {
            this.zzbot.countDown();
            this.context = null;
            this.zzbos = null;
        }
    }

    private final zzdv zzca() {
        if (this.zzwo == zzcw.zznh) {
            return this.zzbor.get();
        }
        return this.zzboq.get();
    }
}
