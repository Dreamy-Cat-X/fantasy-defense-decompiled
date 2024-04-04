package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfn extends zzgo {
    private static zzgn<String> zzaar = new zzgn<>();
    private final Context zzaas;

    public zzfn(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2, Context context) {
        super(zzezVar, str, str2, c0009zza, i, 29);
        this.zzaas = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzaaz.zzw("E");
        AtomicReference<String> zzas = zzaar.zzas(this.zzaas.getPackageName());
        if (zzas.get() == null) {
            synchronized (zzas) {
                if (zzas.get() == null) {
                    zzas.set((String) this.zzabj.invoke(null, this.zzaas));
                }
            }
        }
        String str = zzas.get();
        synchronized (this.zzaaz) {
            this.zzaaz.zzw(zzcv.zza(str.getBytes(), true));
        }
    }
}
