package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzaol {
    private static final /* synthetic */ int[] zzdna;
    static final /* synthetic */ int[] zzdnb;

    static {
        int[] iArr = new int[AdRequest.ErrorCode.values().length];
        zzdnb = iArr;
        try {
            iArr[AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdnb[AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdnb[AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdnb[AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[AdRequest.Gender.values().length];
        zzdna = iArr2;
        try {
            iArr2[AdRequest.Gender.FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzdna[AdRequest.Gender.MALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zzdna[AdRequest.Gender.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
