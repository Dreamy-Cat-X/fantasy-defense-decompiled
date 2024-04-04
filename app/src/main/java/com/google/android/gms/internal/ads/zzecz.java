package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzecz {
    static final /* synthetic */ int[] zzicd;
    static final /* synthetic */ int[] zzice;
    static final /* synthetic */ int[] zzicf;

    static {
        int[] iArr = new int[zzeet.values().length];
        zzicf = iArr;
        try {
            iArr[zzeet.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzicf[zzeet.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzicf[zzeet.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzefh.values().length];
        zzice = iArr2;
        try {
            iArr2[zzefh.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzice[zzefh.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzice[zzefh.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzefi.values().length];
        zzicd = iArr3;
        try {
            iArr3[zzefi.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzicd[zzefi.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zzicd[zzefi.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
