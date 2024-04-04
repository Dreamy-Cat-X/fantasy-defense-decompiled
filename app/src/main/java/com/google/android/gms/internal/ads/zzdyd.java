package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdyd<InputT, OutputT> extends zzdyh<OutputT> {
    private static final Logger logger = Logger.getLogger(zzdyd.class.getName());

    @NullableDecl
    private zzdwn<? extends zzdzl<? extends InputT>> zzhyb;
    private final boolean zzhyc;
    private final boolean zzhyd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum zza {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyd(zzdwn<? extends zzdzl<? extends InputT>> zzdwnVar, boolean z, boolean z2) {
        super(zzdwnVar.size());
        this.zzhyb = (zzdwn) zzdwa.checkNotNull(zzdwnVar);
        this.zzhyc = z;
        this.zzhyd = z2;
    }

    abstract void zzb(int i, @NullableDecl InputT inputt);

    abstract void zzbaa();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final void afterDone() {
        super.afterDone();
        zzdwn<? extends zzdzl<? extends InputT>> zzdwnVar = this.zzhyb;
        zza(zza.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zzdwnVar != null)) {
            boolean wasInterrupted = wasInterrupted();
            zzdxp zzdxpVar = (zzdxp) zzdwnVar.iterator();
            while (zzdxpVar.hasNext()) {
                ((Future) zzdxpVar.next()).cancel(wasInterrupted);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final String pendingToString() {
        zzdwn<? extends zzdzl<? extends InputT>> zzdwnVar = this.zzhyb;
        if (zzdwnVar != null) {
            String valueOf = String.valueOf(zzdwnVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.pendingToString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzazz() {
        if (this.zzhyb.isEmpty()) {
            zzbaa();
            return;
        }
        if (this.zzhyc) {
            int i = 0;
            zzdxp zzdxpVar = (zzdxp) this.zzhyb.iterator();
            while (zzdxpVar.hasNext()) {
                zzdzl zzdzlVar = (zzdzl) zzdxpVar.next();
                zzdzlVar.addListener(new zzdyg(this, zzdzlVar, i), zzdys.INSTANCE);
                i++;
            }
            return;
        }
        zzdyf zzdyfVar = new zzdyf(this, this.zzhyd ? this.zzhyb : null);
        zzdxp zzdxpVar2 = (zzdxp) this.zzhyb.iterator();
        while (zzdxpVar2.hasNext()) {
            ((zzdzl) zzdxpVar2.next()).addListener(zzdyfVar, zzdys.INSTANCE);
        }
    }

    private final void handleException(Throwable th) {
        zzdwa.checkNotNull(th);
        if (this.zzhyc && !setException(th) && zza(zzbab(), th)) {
            zzk(th);
        } else if (th instanceof Error) {
            zzk(th);
        }
    }

    private static void zzk(Throwable th) {
        logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    @Override // com.google.android.gms.internal.ads.zzdyh
    final void zzh(Set<Throwable> set) {
        zzdwa.checkNotNull(set);
        if (isCancelled()) {
            return;
        }
        zza(set, zzazw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(int i, Future<? extends InputT> future) {
        try {
            zzb(i, (int) zzdyz.zza(future));
        } catch (ExecutionException e) {
            handleException(e.getCause());
        } catch (Throwable th) {
            handleException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(@NullableDecl zzdwn<? extends Future<? extends InputT>> zzdwnVar) {
        int zzbac = zzbac();
        int i = 0;
        if (!(zzbac >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        }
        if (zzbac == 0) {
            if (zzdwnVar != null) {
                zzdxp zzdxpVar = (zzdxp) zzdwnVar.iterator();
                while (zzdxpVar.hasNext()) {
                    Future<? extends InputT> future = (Future) zzdxpVar.next();
                    if (!future.isCancelled()) {
                        zza(i, future);
                    }
                    i++;
                }
            }
            zzbad();
            zzbaa();
            zza(zza.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zza(zza zzaVar) {
        zzdwa.checkNotNull(zzaVar);
        this.zzhyb = null;
    }

    private static boolean zza(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdwn zza(zzdyd zzdydVar, zzdwn zzdwnVar) {
        zzdydVar.zzhyb = null;
        return null;
    }
}
