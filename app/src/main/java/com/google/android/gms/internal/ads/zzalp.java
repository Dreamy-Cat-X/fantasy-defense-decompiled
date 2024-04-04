package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzalp {
    private final Object zzdjf = new Object();
    private final Object zzdjg = new Object();
    private zzaly zzdjh;
    private zzaly zzdji;

    public final zzaly zza(Context context, zzayt zzaytVar) {
        zzaly zzalyVar;
        synchronized (this.zzdjg) {
            if (this.zzdji == null) {
                this.zzdji = new zzaly(zzl(context), zzaytVar, zzadm.zzddw.get());
            }
            zzalyVar = this.zzdji;
        }
        return zzalyVar;
    }

    public final zzaly zzb(Context context, zzayt zzaytVar) {
        zzaly zzalyVar;
        synchronized (this.zzdjf) {
            if (this.zzdjh == null) {
                this.zzdjh = new zzaly(zzl(context), zzaytVar, (String) zzwo.zzqq().zzd(zzabh.zzclr));
            }
            zzalyVar = this.zzdjh;
        }
        return zzalyVar;
    }

    private static Context zzl(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
