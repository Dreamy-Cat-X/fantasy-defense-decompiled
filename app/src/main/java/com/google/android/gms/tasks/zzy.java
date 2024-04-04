package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@17.1.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzy implements Runnable {
    private final /* synthetic */ zzu zza;
    private final /* synthetic */ Callable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzu zzuVar, Callable callable) {
        this.zza = zzuVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zza((zzu) this.zzb.call());
        } catch (Exception e) {
            this.zza.zza(e);
        }
    }
}
