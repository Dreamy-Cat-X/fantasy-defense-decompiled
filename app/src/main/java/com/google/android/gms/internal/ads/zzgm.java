package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzgm {
    private static final String TAG = zzgm.class.getSimpleName();
    private final String className;
    private final String zzabh;
    private final Class<?>[] zzabk;
    private final zzez zzvx;
    private final int zzabi = 2;
    private volatile Method zzabj = null;
    private CountDownLatch zzabl = new CountDownLatch(1);

    public zzgm(zzez zzezVar, String str, String str2, Class<?>... clsArr) {
        this.zzvx = zzezVar;
        this.className = str;
        this.zzabh = str2;
        this.zzabk = clsArr;
        zzezVar.zzcg().submit(new zzgl(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzda() {
        try {
            Class loadClass = this.zzvx.zzch().loadClass(zzb(this.zzvx.zzcj(), this.className));
            if (loadClass == null) {
                return;
            }
            this.zzabj = loadClass.getMethod(zzb(this.zzvx.zzcj(), this.zzabh), this.zzabk);
            if (this.zzabj == null) {
            }
        } catch (zzek unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.zzabl.countDown();
        }
    }

    private final String zzb(byte[] bArr, String str) throws zzek, UnsupportedEncodingException {
        return new String(this.zzvx.zzci().zza(bArr, str), "UTF-8");
    }

    public final Method zzdb() {
        if (this.zzabj != null) {
            return this.zzabj;
        }
        try {
            if (this.zzabl.await(2L, TimeUnit.SECONDS)) {
                return this.zzabj;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
