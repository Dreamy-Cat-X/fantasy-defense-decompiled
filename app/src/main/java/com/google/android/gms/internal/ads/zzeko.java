package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekd;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeko<T extends zzekd> {
    private static final Logger logger = Logger.getLogger(zzeka.class.getName());
    private static String zzior = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzeko() {
    }

    protected abstract T zzbik();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzekd> T zzc(Class<T> cls) {
        String format;
        ClassLoader classLoader = zzeko.class.getClassLoader();
        if (cls.equals(zzekd.class)) {
            format = zzior;
        } else {
            if (!cls.getPackage().equals(zzeko.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((zzeko) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zzbik());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (InvocationTargetException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzeko.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzeko) it.next()).zzbik()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger2 = logger;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
