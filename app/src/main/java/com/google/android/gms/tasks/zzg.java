package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@17.1.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzg implements Runnable {
    private final /* synthetic */ zzh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCanceledListener onCanceledListener;
        OnCanceledListener onCanceledListener2;
        obj = this.zza.zzb;
        synchronized (obj) {
            onCanceledListener = this.zza.zzc;
            if (onCanceledListener != null) {
                onCanceledListener2 = this.zza.zzc;
                onCanceledListener2.onCanceled();
            }
        }
    }
}
