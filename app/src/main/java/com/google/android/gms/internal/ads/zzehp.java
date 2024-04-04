package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzehp {
    static final /* synthetic */ int[] zziig;
    static final /* synthetic */ int[] zziih;

    static {
        int[] iArr = new int[zzeho.values().length];
        zziih = iArr;
        try {
            iArr[zzeho.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zziih[zzeho.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zziih[zzeho.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzehr.values().length];
        zziig = iArr2;
        try {
            iArr2[zzehr.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zziig[zzehr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zziig[zzehr.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
