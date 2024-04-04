package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdzu<V> implements Runnable {

    @NullableDecl
    private zzdzs<V> zzhzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzu(zzdzs<V> zzdzsVar) {
        this.zzhzl = zzdzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r1 = ((com.google.android.gms.internal.ads.zzdzs) r0).zzhzj;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzdzl<? extends V> zzdzlVar;
        ScheduledFuture scheduledFuture;
        zzdzs<V> zzdzsVar = this.zzhzl;
        if (zzdzsVar == null || zzdzlVar == null) {
            return;
        }
        this.zzhzl = null;
        if (zzdzlVar.isDone()) {
            zzdzsVar.setFuture(zzdzlVar);
            return;
        }
        try {
            scheduledFuture = ((zzdzs) zzdzsVar).zzhzk;
            zzdzs.zza((zzdzs) zzdzsVar, (ScheduledFuture) null);
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder("Timed out".length() + 66);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    zzdzsVar.setException(new zzdzx(str));
                    throw th;
                }
            }
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(zzdzlVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            zzdzsVar.setException(new zzdzx(sb2.toString()));
        } finally {
            zzdzlVar.cancel(true);
        }
    }
}
