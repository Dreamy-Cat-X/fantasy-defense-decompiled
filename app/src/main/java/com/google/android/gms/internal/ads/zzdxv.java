package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdxv<V, X extends Throwable, F, T> extends zzdyt<V> implements Runnable {

    @NullableDecl
    private zzdzl<? extends V> zzhxe;

    @NullableDecl
    private Class<X> zzhxf;

    @NullableDecl
    private F zzhxg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <X extends Throwable, V> zzdzl<V> zza(zzdzl<? extends V> zzdzlVar, Class<X> cls, zzdyj<? super X, ? extends V> zzdyjVar, Executor executor) {
        zzdxy zzdxyVar = new zzdxy(zzdzlVar, cls, zzdyjVar);
        zzdzlVar.addListener(zzdxyVar, zzdzn.zza(executor, zzdxyVar));
        return zzdxyVar;
    }

    abstract void setResult(@NullableDecl T t);

    @NullableDecl
    abstract T zza(F f, X x) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxv(zzdzl<? extends V> zzdzlVar, Class<X> cls, F f) {
        this.zzhxe = (zzdzl) zzdwa.checkNotNull(zzdzlVar);
        this.zzhxf = (Class) zzdwa.checkNotNull(cls);
        this.zzhxg = (F) zzdwa.checkNotNull(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        zzdzl<? extends V> zzdzlVar = this.zzhxe;
        Class<X> cls = this.zzhxf;
        F f = this.zzhxg;
        if (((f == null) || ((zzdzlVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.zzhxe = null;
        try {
            th = zzdzlVar instanceof zzead ? zzeac.zza((zzead) zzdzlVar) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String valueOf = String.valueOf(zzdzlVar.getClass());
                String valueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
                sb.append("Future type ");
                sb.append(valueOf);
                sb.append(" threw ");
                sb.append(valueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = zzdyz.zza(zzdzlVar);
            if (th != null) {
                set(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                setFuture(zzdzlVar);
                return;
            }
            try {
                Object zza = zza((zzdxv<V, X, F, T>) f, (F) th);
                this.zzhxf = null;
                this.zzhxg = null;
                setResult(zza);
                return;
            } catch (Throwable th2) {
                try {
                    setException(th2);
                    return;
                } finally {
                    this.zzhxf = null;
                    this.zzhxg = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final String pendingToString() {
        String str;
        zzdzl<? extends V> zzdzlVar = this.zzhxe;
        Class<X> cls = this.zzhxf;
        F f = this.zzhxg;
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
        if (cls == null || f == null) {
            if (pendingToString == null) {
                return null;
            }
            String valueOf2 = String.valueOf(str);
            String valueOf3 = String.valueOf(pendingToString);
            return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
        }
        String valueOf4 = String.valueOf(cls);
        String valueOf5 = String.valueOf(f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(valueOf4);
        sb2.append("], fallback=[");
        sb2.append(valueOf5);
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdxz
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhxe);
        this.zzhxe = null;
        this.zzhxf = null;
        this.zzhxg = null;
    }
}
