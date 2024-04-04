package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzekg {
    private static final zzekf<?> zzilw = new zzekh();
    private static final zzekf<?> zzilx = zzbib();

    private static zzekf<?> zzbib() {
        try {
            return (zzekf) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzekf<?> zzbic() {
        return zzilw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzekf<?> zzbid() {
        zzekf<?> zzekfVar = zzilx;
        if (zzekfVar != null) {
            return zzekfVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
