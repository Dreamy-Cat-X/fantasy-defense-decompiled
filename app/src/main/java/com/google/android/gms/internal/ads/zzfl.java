package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfl extends zzgo {
    private final Activity zzaap;
    private final View zzaaq;

    public zzfl(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2, View view, Activity activity) {
        super(zzezVar, str, str2, c0009zza, i, 62);
        this.zzaaq = view;
        this.zzaap = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzaaq == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcrg)).booleanValue();
        Object[] objArr = (Object[]) this.zzabj.invoke(null, this.zzaaq, this.zzaap, Boolean.valueOf(booleanValue));
        synchronized (this.zzaaz) {
            this.zzaaz.zzai(((Long) objArr[0]).longValue());
            this.zzaaz.zzaj(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zzaaz.zzaa((String) objArr[2]);
            }
        }
    }
}
