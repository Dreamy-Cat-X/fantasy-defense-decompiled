package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaq extends zzag.zzb {
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaq(zzag zzagVar, long j) {
        super(zzagVar);
        this.zzd = zzagVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzag.zzb
    final void zza() throws RemoteException {
        zzv zzvVar;
        zzvVar = this.zzd.zzm;
        zzvVar.setMinimumSessionDuration(this.zzc);
    }
}
