package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzi extends PathClassLoader {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
