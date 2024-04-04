package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdyc<I, O, F, T> extends zzdyt<O> implements Runnable {

    @NullableDecl
    private zzdzl<? extends I> zzhxe;

    @NullableDecl
    private F zzhya;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzdzl<O> zza(zzdzl<I> zzdzlVar, zzdyj<? super I, ? extends O> zzdyjVar, Executor executor) {
        zzdwa.checkNotNull(executor);
        zzdyb zzdybVar = new zzdyb(zzdzlVar, zzdyjVar);
        zzdzlVar.addListener(zzdybVar, zzdzn.zza(executor, zzdybVar));
        return zzdybVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zzd(F f, @NullableDecl I i) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <I, O> zzdzl<O> zza(zzdzl<I> zzdzlVar, zzdvo<? super I, ? extends O> zzdvoVar, Executor executor) {
        zzdwa.checkNotNull(zzdvoVar);
        zzdye zzdyeVar = new zzdye(zzdzlVar, zzdvoVar);
        zzdzlVar.addListener(zzdyeVar, zzdzn.zza(executor, zzdyeVar));
        return zzdyeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyc(zzdzl<? extends I> zzdzlVar, F f) {
        this.zzhxe = (zzdzl) zzdwa.checkNotNull(zzdzlVar);
        this.zzhya = (F) zzdwa.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzdzl<? extends I> zzdzlVar = this.zzhxe;
        F f = this.zzhya;
        if ((isCancelled() | (zzdzlVar == null)) || (f == null)) {
            return;
        }
        this.zzhxe = null;
        if (zzdzlVar.isCancelled()) {
            setFuture(zzdzlVar);
            return;
        }
        try {
            try {
                Object zzd = zzd(f, zzdyz.zza(zzdzlVar));
                this.zzhya = null;
                setResult(zzd);
            } catch (Throwable th) {
                try {
                    setException(th);
                } finally {
                    this.zzhya = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            setException(e2);
        } catch (ExecutionException e3) {
            setException(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhxe);
        this.zzhxe = null;
        this.zzhya = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final String pendingToString() {
        String str;
        zzdzl<? extends I> zzdzlVar = this.zzhxe;
        F f = this.zzhya;
        String pendingToString = super.pendingToString();
        if (zzdzlVar != null) {
            String valueOf = String.valueOf(zzdzlVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f == null) {
            if (pendingToString == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            String valueOf3 = String.valueOf(pendingToString);
            return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
        }
        String valueOf4 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf4).length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(valueOf4);
        sb2.append("]");
        return sb2.toString();
    }
}
