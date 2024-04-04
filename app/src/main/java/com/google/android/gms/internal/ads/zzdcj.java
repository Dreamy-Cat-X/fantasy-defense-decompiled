package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcj implements zzdeu<zzdck> {
    private final Context context;
    private final zzdzk zzgyp;
    private final Set<String> zzgzd;
    private final ViewGroup zzhai;

    public zzdcj(zzdzk zzdzkVar, ViewGroup viewGroup, Context context, Set<String> set) {
        this.zzgyp = zzdzkVar;
        this.zzgzd = set;
        this.zzhai = viewGroup;
        this.context = context;
    }

    private static Boolean zzl(Activity activity) {
        Window window = activity.getWindow();
        boolean z = true;
        if (window != null && (window.getAttributes().flags & 16777216) != 0) {
            return true;
        }
        try {
            if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdck> zzata() {
        return this.zzgyp.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcm
            private final zzdcj zzhal;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhal = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhal.zzati();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdck zzati() throws Exception {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwl)).booleanValue() && this.zzhai != null && this.zzgzd.contains("banner")) {
            return new zzdck(Boolean.valueOf(this.zzhai.isHardwareAccelerated()));
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcwm)).booleanValue() && this.zzgzd.contains("native") && (this.context instanceof Activity)) {
            return new zzdck(zzl((Activity) this.context));
        }
        return new zzdck(null);
    }
}
