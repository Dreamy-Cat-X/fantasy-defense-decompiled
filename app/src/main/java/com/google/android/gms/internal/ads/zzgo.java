package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzgo implements Callable {
    private final String TAG = getClass().getSimpleName();
    private final String className;
    protected final zzcf.zza.C0009zza zzaaz;
    private final String zzabh;
    protected Method zzabj;
    private final int zzabn;
    private final int zzabo;
    protected final zzez zzvx;

    public zzgo(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        this.zzvx = zzezVar;
        this.className = str;
        this.zzabh = str2;
        this.zzaaz = c0009zza;
        this.zzabn = i;
        this.zzabo = i2;
    }

    protected abstract void zzcw() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: zzcy, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        long nanoTime;
        Method zza;
        try {
            nanoTime = System.nanoTime();
            zza = this.zzvx.zza(this.className, this.zzabh);
            this.zzabj = zza;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zza == null) {
            return null;
        }
        zzcw();
        zzdt zzcl = this.zzvx.zzcl();
        if (zzcl != null && this.zzabn != Integer.MIN_VALUE) {
            zzcl.zza(this.zzabo, this.zzabn, (System.nanoTime() - nanoTime) / 1000);
        }
        return null;
    }
}
