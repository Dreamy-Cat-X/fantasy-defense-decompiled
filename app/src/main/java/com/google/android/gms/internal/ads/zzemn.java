package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzemn {
    private static final zzeml zzirs = zzbkg();
    private static final zzeml zzirt = new zzemk();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeml zzbke() {
        return zzirs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeml zzbkf() {
        return zzirt;
    }

    private static zzeml zzbkg() {
        try {
            return (zzeml) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
