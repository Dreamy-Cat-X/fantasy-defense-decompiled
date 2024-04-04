package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzcpf implements Callable {
    private final zzcpa zzgov;

    private zzcpf(zzcpa zzcpaVar) {
        this.zzgov = zzcpaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable zza(zzcpa zzcpaVar) {
        return new zzcpf(zzcpaVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zzgov.getWritableDatabase();
    }
}
