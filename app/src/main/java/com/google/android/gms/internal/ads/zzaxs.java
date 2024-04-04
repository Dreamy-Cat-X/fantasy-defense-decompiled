package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzaxs {
    private Context context;
    private zzayt zzbpd;
    private zzdzl<ArrayList<String>> zzeao;
    private final Object lock = new Object();
    private final com.google.android.gms.ads.internal.util.zzi zzeai = new com.google.android.gms.ads.internal.util.zzi();
    private final zzayc zzeaa = new zzayc(zzwo.zzqr(), this.zzeai);
    private boolean zzze = false;
    private zzabo zzeaj = null;
    private Boolean zzeak = null;
    private final AtomicInteger zzeal = new AtomicInteger(0);
    private final zzaxx zzeam = new zzaxx(null);
    private final Object zzean = new Object();

    public final zzabo zzxk() {
        zzabo zzaboVar;
        synchronized (this.lock) {
            zzaboVar = this.zzeaj;
        }
        return zzaboVar;
    }

    public final void zza(Boolean bool) {
        synchronized (this.lock) {
            this.zzeak = bool;
        }
    }

    public final Boolean zzxl() {
        Boolean bool;
        synchronized (this.lock) {
            bool = this.zzeak;
        }
        return bool;
    }

    public final void zzxm() {
        this.zzeam.zzxm();
    }

    public final void zzd(Context context, zzayt zzaytVar) {
        zzabo zzaboVar;
        synchronized (this.lock) {
            if (!this.zzze) {
                this.context = context.getApplicationContext();
                this.zzbpd = zzaytVar;
                com.google.android.gms.ads.internal.zzp.zzkt().zza(this.zzeaa);
                this.zzeai.initialize(this.context);
                zzarw.zzc(this.context, this.zzbpd);
                com.google.android.gms.ads.internal.zzp.zzkz();
                if (!zzacx.zzdbz.get().booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzd.zzeb("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzaboVar = null;
                } else {
                    zzaboVar = new zzabo();
                }
                this.zzeaj = zzaboVar;
                if (zzaboVar != null) {
                    zzayy.zza(new zzaxu(this).zzyc(), "AppState.registerCsiReporter");
                }
                this.zzze = true;
                zzxr();
            }
        }
        com.google.android.gms.ads.internal.zzp.zzkq().zzq(context, zzaytVar.zzbrf);
    }

    public final Resources getResources() {
        if (this.zzbpd.zzegg) {
            return this.context.getResources();
        }
        try {
            zzayp.zzbu(this.context).getResources();
            return null;
        } catch (zzayr e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zza(Throwable th, String str) {
        zzarw.zzc(this.context, this.zzbpd).zza(th, str);
    }

    public final void zzb(Throwable th, String str) {
        zzarw.zzc(this.context, this.zzbpd).zza(th, str, zzadj.zzddr.get().floatValue());
    }

    public final void zzxn() {
        this.zzeal.incrementAndGet();
    }

    public final void zzxo() {
        this.zzeal.decrementAndGet();
    }

    public final int zzxp() {
        return this.zzeal.get();
    }

    public final com.google.android.gms.ads.internal.util.zzf zzxq() {
        com.google.android.gms.ads.internal.util.zzi zziVar;
        synchronized (this.lock) {
            zziVar = this.zzeai;
        }
        return zziVar;
    }

    public final Context getApplicationContext() {
        return this.context;
    }

    public final zzdzl<ArrayList<String>> zzxr() {
        if (PlatformVersion.isAtLeastJellyBean() && this.context != null) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcrk)).booleanValue()) {
                synchronized (this.zzean) {
                    if (this.zzeao != null) {
                        return this.zzeao;
                    }
                    zzdzl<ArrayList<String>> submit = zzayv.zzegi.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzaxv
                        private final zzaxs zzeax;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzeax = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzeax.zzxt();
                        }
                    });
                    this.zzeao = submit;
                    return submit;
                }
            }
        }
        return zzdyz.zzag(new ArrayList());
    }

    private static ArrayList<String> zzai(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final zzayc zzxs() {
        return this.zzeaa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzxt() throws Exception {
        return zzai(zzatp.zzy(this.context));
    }
}
