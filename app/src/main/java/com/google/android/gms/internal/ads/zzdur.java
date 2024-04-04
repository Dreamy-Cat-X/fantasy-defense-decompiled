package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdur {
    private static final HashMap<String, Class<?>> zzhth = new HashMap<>();
    private final Context context;
    private final zzduq zzhsu;
    private final zzdsm zzhti;
    private zzduf zzhtj;
    private final Object zzhtk = new Object();
    private final zzdsn zzvo;

    public zzdur(Context context, zzduq zzduqVar, zzdsn zzdsnVar, zzdsm zzdsmVar) {
        this.context = context;
        this.zzhsu = zzduqVar;
        this.zzvo = zzdsnVar;
        this.zzhti = zzdsmVar;
    }

    private final synchronized Class<?> zza(zzdue zzdueVar) throws zzduo {
        if (zzdueVar.zzayn() == null) {
            throw new zzduo(4010, "mc");
        }
        String zzdg = zzdueVar.zzayn().zzdg();
        Class<?> cls = zzhth.get(zzdg);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zzhti.zzb(zzdueVar.zzayo())) {
                throw new zzduo(2026, "VM did not pass signature verification");
            }
            try {
                File zzayp = zzdueVar.zzayp();
                if (!zzayp.exists()) {
                    zzayp.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(zzdueVar.zzayo().getAbsolutePath(), zzayp.getAbsolutePath(), null, this.context.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                zzhth.put(zzdg, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzduo(2008, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzduo(2026, e2);
        }
    }

    private final Object zza(Class<?> cls, zzdue zzdueVar) throws zzduo {
        try {
            return cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.context, "msa-r", zzdueVar.zzayq(), null, new Bundle(), 2);
        } catch (Exception e) {
            throw new zzduo(2004, e);
        }
    }

    public final void zzb(zzdue zzdueVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzduf zzdufVar = new zzduf(zza(zza(zzdueVar), zzdueVar), zzdueVar, this.zzhsu, this.zzvo);
            if (!zzdufVar.zzays()) {
                throw new zzduo(4000, "init failed");
            }
            int zzayt = zzdufVar.zzayt();
            if (zzayt != 0) {
                StringBuilder sb = new StringBuilder(15);
                sb.append("ci: ");
                sb.append(zzayt);
                throw new zzduo(4001, sb.toString());
            }
            synchronized (this.zzhtk) {
                if (this.zzhtj != null) {
                    try {
                        this.zzhtj.close();
                    } catch (zzduo e) {
                        this.zzvo.zza(e.zzayx(), -1L, e);
                    }
                }
                this.zzhtj = zzdufVar;
            }
            this.zzvo.zzh(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - currentTimeMillis);
        } catch (zzduo e2) {
            this.zzvo.zza(e2.zzayx(), System.currentTimeMillis() - currentTimeMillis, e2);
        } catch (Exception e3) {
            this.zzvo.zza(4010, System.currentTimeMillis() - currentTimeMillis, e3);
        }
    }

    public final zzdst zzayy() {
        zzduf zzdufVar;
        synchronized (this.zzhtk) {
            zzdufVar = this.zzhtj;
        }
        return zzdufVar;
    }

    public final zzdue zzayz() {
        synchronized (this.zzhtk) {
            if (this.zzhtj == null) {
                return null;
            }
            return this.zzhtj.zzayr();
        }
    }
}
