package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdw implements Runnable {
    private final /* synthetic */ zzdt zzwd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdw(zzdt zzdtVar) {
        this.zzwd = zzdtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzez zzezVar;
        ConditionVariable conditionVariable2;
        if (this.zzwd.zzwa != null) {
            return;
        }
        conditionVariable = zzdt.zzvy;
        synchronized (conditionVariable) {
            if (this.zzwd.zzwa != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = zzabh.zzcrc.get().booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzezVar = this.zzwd.zzvx;
                    zzdt.zzvz = new zztz(zzezVar.context, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zzwd.zzwa = Boolean.valueOf(z2);
            conditionVariable2 = zzdt.zzvy;
            conditionVariable2.open();
        }
    }
}
