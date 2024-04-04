package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcf;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtd {
    private final Context context;
    private final Executor executor;
    private final zzdtj zzhrm;
    private final zzdtj zzhrn;
    private Task<zzcf.zza> zzhro;
    private Task<zzcf.zza> zzhrp;
    private final zzdsn zzvo;
    private final zzdsr zzyo;

    private zzdtd(Context context, Executor executor, zzdsn zzdsnVar, zzdsr zzdsrVar, zzdth zzdthVar, zzdtg zzdtgVar) {
        this.context = context;
        this.executor = executor;
        this.zzvo = zzdsnVar;
        this.zzyo = zzdsrVar;
        this.zzhrm = zzdthVar;
        this.zzhrn = zzdtgVar;
    }

    public static zzdtd zza(Context context, Executor executor, zzdsn zzdsnVar, zzdsr zzdsrVar) {
        final zzdtd zzdtdVar = new zzdtd(context, executor, zzdsnVar, zzdsrVar, new zzdth(), new zzdtg());
        if (zzdtdVar.zzyo.zzaxt()) {
            zzdtdVar.zzhro = zzdtdVar.zzd(new Callable(zzdtdVar) { // from class: com.google.android.gms.internal.ads.zzdtc
                private final zzdtd zzhrl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhrl = zzdtdVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzhrl.zzayb();
                }
            });
        } else {
            zzdtdVar.zzhro = Tasks.forResult(zzdtdVar.zzhrm.zzayc());
        }
        zzdtdVar.zzhrp = zzdtdVar.zzd(new Callable(zzdtdVar) { // from class: com.google.android.gms.internal.ads.zzdtf
            private final zzdtd zzhrl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhrl = zzdtdVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhrl.zzaya();
            }
        });
        return zzdtdVar;
    }

    public final zzcf.zza zzaxz() {
        return zza(this.zzhro, this.zzhrm.zzayc());
    }

    public final zzcf.zza zzco() {
        return zza(this.zzhrp, this.zzhrn.zzayc());
    }

    private final Task<zzcf.zza> zzd(Callable<zzcf.zza> callable) {
        return Tasks.call(this.executor, callable).addOnFailureListener(this.executor, new OnFailureListener(this) { // from class: com.google.android.gms.internal.ads.zzdte
            private final zzdtd zzhrl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhrl = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zzhrl.zzc(exc);
            }
        });
    }

    private static zzcf.zza zza(Task<zzcf.zza> task, zzcf.zza zzaVar) {
        return !task.isSuccessful() ? zzaVar : task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzvo.zza(2025, -1L, exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza zzaya() throws Exception {
        return this.zzhrn.zzcl(this.context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza zzayb() throws Exception {
        return this.zzhrm.zzcl(this.context);
    }
}
