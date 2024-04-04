package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class OfflinePingSender extends Worker {
    private final zzaqh zzdpd;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zzdpd = zzwo.zzqn().zzb(context, new zzamu());
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        try {
            this.zzdpd.zzvp();
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
