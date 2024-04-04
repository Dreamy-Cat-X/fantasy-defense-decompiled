package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbw;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzdt {
    private static final ConditionVariable zzvy = new ConditionVariable();
    protected static volatile zztz zzvz = null;
    private static volatile Random zzwb = null;
    private zzez zzvx;
    protected volatile Boolean zzwa;

    public zzdt(zzez zzezVar) {
        this.zzvx = zzezVar;
        zzezVar.zzcg().execute(new zzdw(this));
    }

    public final void zza(int i, int i2, long j) {
        zza(i, i2, j, null, null);
    }

    public final void zza(int i, int i2, long j, String str) {
        zza(i, -1, j, str, null);
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzvy.block();
            if (!this.zzwa.booleanValue() || zzvz == null) {
                return;
            }
            zzbw.zza.C0006zza zzc = zzbw.zza.zzs().zzj(this.zzvx.context.getPackageName()).zzc(j);
            if (str != null) {
                zzc.zzm(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzeip.zza(exc, new PrintWriter(stringWriter));
                zzc.zzk(stringWriter.toString()).zzl(exc.getClass().getName());
            }
            zzud zzf = zzvz.zzf(((zzbw.zza) ((zzekq) zzc.zzbiz())).toByteArray());
            zzf.zzbv(i);
            if (i2 != -1) {
                zzf.zzbu(i2);
            }
            zzf.log();
        } catch (Exception unused) {
        }
    }

    public static int zzbu() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return zzbv().nextInt();
        } catch (RuntimeException unused) {
            return zzbv().nextInt();
        }
    }

    private static Random zzbv() {
        if (zzwb == null) {
            synchronized (zzdt.class) {
                if (zzwb == null) {
                    zzwb = new Random();
                }
            }
        }
        return zzwb;
    }
}
