package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@17.1.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzs implements OnTokenCanceledListener {
    private final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        zzu zzuVar;
        zzuVar = this.zza.zza;
        zzuVar.zza();
    }
}
