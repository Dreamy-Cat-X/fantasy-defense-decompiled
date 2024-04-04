package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdwk {

    @NullableDecl
    private static final Object zzhvu;

    @NullableDecl
    private static final Method zzhvv;

    @NullableDecl
    private static final Method zzhvw;

    public static void zzi(Throwable th) {
        zzdwa.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException zzj(Throwable th) {
        zzi(th);
        throw new RuntimeException(th);
    }

    public static String zza(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzeip.zza(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    private static Object zzazg() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method zzazh() {
        try {
            Method zza = zza("getStackTraceDepth", Throwable.class);
            if (zza == null) {
                return null;
            }
            zza.invoke(zzazg(), new Throwable());
            return zza;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method zza(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Object zzazg = zzazg();
        zzhvu = zzazg;
        zzhvv = zzazg == null ? null : zza("getStackTraceElement", Throwable.class, Integer.TYPE);
        zzhvw = zzhvu != null ? zzazh() : null;
    }
}
