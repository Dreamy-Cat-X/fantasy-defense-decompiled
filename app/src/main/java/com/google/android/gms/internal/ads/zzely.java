package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzely {
    private static final zzelw zziqy = zzbka();
    private static final zzelw zziqz = new zzelz();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzelw zzbjy() {
        return zziqy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzelw zzbjz() {
        return zziqz;
    }

    private static zzelw zzbka() {
        try {
            return (zzelw) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
