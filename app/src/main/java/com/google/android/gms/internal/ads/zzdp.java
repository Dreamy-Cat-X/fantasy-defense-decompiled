package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.kt.olleh.inapp.net.InAppError;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdp implements zzdv {
    private static zzdp zzvj;
    private final Context context;
    private final zzduh zzvk;
    private final zzdum zzvl;
    private final zzdur zzvm;
    private final zzey zzvn;
    private final zzdsn zzvo;
    private final Executor zzvp;
    private final zzgq zzvq;
    private final zzdun zzvr;
    private volatile long zzvs = 0;
    private final Object zzvt = new Object();
    private volatile boolean zzvu;

    public static synchronized zzdp zza(String str, Context context, boolean z) {
        zzdp zzdpVar;
        synchronized (zzdp.class) {
            if (zzvj == null) {
                zzdsr zzaxr = zzdsr.zzaxu().zzhg(str).zzbn(z).zzaxr();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                zzdp zza = zza(context, zzdsn.zza(context, newCachedThreadPool), zzaxr, newCachedThreadPool);
                zzvj = zza;
                zza.zzbq();
                zzvj.zzbt();
            }
            zzdpVar = zzvj;
        }
        return zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zza(int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdp zza(Context context, zzdsn zzdsnVar, zzdsr zzdsrVar) {
        return zza(context, zzdsnVar, zzdsrVar, Executors.newCachedThreadPool());
    }

    private static zzdp zza(Context context, zzdsn zzdsnVar, zzdsr zzdsrVar, Executor executor) {
        zzdtd zza = zzdtd.zza(context, executor, zzdsnVar, zzdsrVar);
        zzex zzexVar = new zzex(context);
        zzey zzeyVar = new zzey(zzdsrVar, zza, new zzfk(context, zzexVar), zzexVar);
        zzgq zzayj = new zzdtt(context, zzdsnVar).zzayj();
        zzdsm zzdsmVar = new zzdsm();
        return new zzdp(context, zzdsnVar, new zzduh(context, zzayj), new zzdum(context, zzayj, new zzds(zzdsnVar)), new zzdur(context, zzeyVar, zzdsnVar, zzdsmVar), zzeyVar, executor, zzdsmVar, zzayj);
    }

    private zzdp(Context context, zzdsn zzdsnVar, zzduh zzduhVar, zzdum zzdumVar, zzdur zzdurVar, zzey zzeyVar, Executor executor, zzdsm zzdsmVar, zzgq zzgqVar) {
        this.context = context;
        this.zzvo = zzdsnVar;
        this.zzvk = zzduhVar;
        this.zzvl = zzdumVar;
        this.zzvm = zzdurVar;
        this.zzvn = zzeyVar;
        this.zzvp = executor;
        this.zzvq = zzgqVar;
        this.zzvr = new zzdr(this, zzdsmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzbq() {
        long currentTimeMillis = System.currentTimeMillis();
        zzdue zzp = zzp(zzdup.zzhtd);
        if (zzp != null) {
            this.zzvm.zzb(zzp);
        } else {
            this.zzvo.zzh(4013, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public final void zzbr() {
        if (zzdtt.zza(this.zzvq)) {
            this.zzvp.execute(new zzdu(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[Catch: zzeld -> 0x011a, TryCatch #0 {zzeld -> 0x011a, blocks: (B:5:0x0022, B:7:0x0033, B:10:0x003a, B:12:0x0058, B:14:0x0066, B:17:0x0072, B:21:0x00aa, B:24:0x00b7, B:28:0x00d0, B:30:0x00e9, B:32:0x00f6, B:34:0x00fe, B:39:0x00da, B:40:0x00e1, B:41:0x007b, B:44:0x0082, B:46:0x0094, B:50:0x010d), top: B:4:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: zzeld -> 0x011a, TryCatch #0 {zzeld -> 0x011a, blocks: (B:5:0x0022, B:7:0x0033, B:10:0x003a, B:12:0x0058, B:14:0x0066, B:17:0x0072, B:21:0x00aa, B:24:0x00b7, B:28:0x00d0, B:30:0x00e9, B:32:0x00f6, B:34:0x00fe, B:39:0x00da, B:40:0x00e1, B:41:0x007b, B:44:0x0082, B:46:0x0094, B:50:0x010d), top: B:4:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzbs() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        zzdue zzp = zzp(zzdup.zzhtd);
        if (zzp != null) {
            String zzdg = zzp.zzayn().zzdg();
            str2 = zzp.zzayn().zzdh();
            str = zzdg;
        } else {
            str = null;
            str2 = null;
        }
        try {
            zzdul zza = zzdsz.zza(this.context, 1, this.zzvq, str, str2, InAppError.FAILED, this.zzvo);
            if (zza.zzhsy != null && zza.zzhsy.length != 0) {
                zzgs zza2 = zzgs.zza(zzejg.zzt(zza.zzhsy), zzekd.zzbia());
                boolean z = true;
                boolean z2 = false;
                if (!zza2.zzdc().zzdg().isEmpty()) {
                    if (!zza2.zzdc().zzdh().isEmpty()) {
                        if (zza2.zzde().toByteArray().length != 0) {
                            zzdue zzp2 = zzp(zzdup.zzhtd);
                            if (zzp2 != null) {
                                zzgt zzayn = zzp2.zzayn();
                                if (zzayn != null) {
                                    if (zza2.zzdc().zzdg().equals(zzayn.zzdg())) {
                                        if (!zza2.zzdc().zzdh().equals(zzayn.zzdh())) {
                                        }
                                    }
                                }
                            }
                            if (z) {
                                this.zzvo.zzh(5010, System.currentTimeMillis() - currentTimeMillis);
                                return;
                            }
                            zzdun zzdunVar = this.zzvr;
                            int i = zza.status;
                            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcqz)).booleanValue()) {
                                z2 = this.zzvk.zza(zza2, zzdunVar);
                            } else if (i == 3) {
                                z2 = this.zzvl.zza(zza2);
                            } else if (i == 4) {
                                z2 = this.zzvl.zza(zza2, zzdunVar);
                            }
                            if (!z2) {
                                this.zzvo.zzh(4009, System.currentTimeMillis() - currentTimeMillis);
                                return;
                            }
                            zzdue zzp3 = zzp(zzdup.zzhtd);
                            if (zzp3 != null) {
                                this.zzvm.zzb(zzp3);
                                this.zzvs = System.currentTimeMillis() / 1000;
                                return;
                            }
                            return;
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
            this.zzvo.zzh(5009, System.currentTimeMillis() - currentTimeMillis);
        } catch (zzeld e) {
            this.zzvo.zza(4002, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zza(MotionEvent motionEvent) {
        zzdst zzayy = this.zzvm.zzayy();
        if (zzayy != null) {
            try {
                zzayy.zza(null, motionEvent);
            } catch (zzduo e) {
                this.zzvo.zza(e.zzayx(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, String str, View view, Activity activity) {
        zzbt();
        zzdst zzayy = this.zzvm.zzayy();
        if (zzayy == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzayy.zza(context, null, str, view, activity);
        this.zzvo.zza(5000, System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final void zzb(View view) {
        this.zzvn.zzc(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zza(Context context, View view, Activity activity) {
        zzbt();
        zzdst zzayy = this.zzvm.zzayy();
        if (zzayy == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb = zzayy.zzb(context, null, view, activity);
        this.zzvo.zza(5002, System.currentTimeMillis() - currentTimeMillis, zzb, null);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdv
    public final String zzb(Context context) {
        zzbt();
        zzdst zzayy = this.zzvm.zzayy();
        if (zzayy == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzt = zzayy.zzt(context, null);
        this.zzvo.zza(5001, System.currentTimeMillis() - currentTimeMillis, zzt, null);
        return zzt;
    }

    private final void zzbt() {
        if (this.zzvu) {
            return;
        }
        synchronized (this.zzvt) {
            if (!this.zzvu) {
                if ((System.currentTimeMillis() / 1000) - this.zzvs < 3600) {
                    return;
                }
                zzdue zzayz = this.zzvm.zzayz();
                if (zzayz == null || zzayz.zzff(3600L)) {
                    zzbr();
                }
            }
        }
    }

    private final zzdue zzp(int i) {
        if (!zzdtt.zza(this.zzvq)) {
            return null;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqz)).booleanValue()) {
            return this.zzvl.zzp(i);
        }
        return this.zzvk.zzp(i);
    }
}
