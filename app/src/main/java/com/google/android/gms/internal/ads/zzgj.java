package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgj extends zzgo {
    private final View zzaaq;

    public zzgj(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2, View view) {
        super(zzezVar, str, str2, c0009zza, i, 57);
        this.zzaaq = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzaaq != null) {
            Boolean bool = (Boolean) zzwo.zzqq().zzd(zzabh.zzcrt);
            zzfh zzfhVar = new zzfh((String) this.zzabj.invoke(null, this.zzaaq, this.zzvx.getContext().getResources().getDisplayMetrics(), bool));
            zzcf.zza.zzf.C0011zza zzax = zzcf.zza.zzf.zzax();
            zzax.zzcy(zzfhVar.zzzy.longValue()).zzcz(zzfhVar.zzzz.longValue()).zzda(zzfhVar.zzaaa.longValue());
            if (bool.booleanValue()) {
                zzax.zzdb(zzfhVar.zzaab.longValue());
            }
            this.zzaaz.zza((zzcf.zza.zzf) ((zzekq) zzax.zzbiz()));
        }
    }
}
