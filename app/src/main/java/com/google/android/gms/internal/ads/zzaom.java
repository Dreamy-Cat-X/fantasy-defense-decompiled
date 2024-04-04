package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaom {
    public static int zza(AdRequest.ErrorCode errorCode) {
        int i = zzaol.zzdnb[errorCode.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static MediationAdRequest zza(zzvi zzviVar, boolean z) {
        AdRequest.Gender gender;
        HashSet hashSet = zzviVar.zzcgz != null ? new HashSet(zzviVar.zzcgz) : null;
        Date date = new Date(zzviVar.zzcgx);
        int i = zzviVar.zzcgy;
        if (i == 1) {
            gender = AdRequest.Gender.MALE;
        } else if (i == 2) {
            gender = AdRequest.Gender.FEMALE;
        } else {
            gender = AdRequest.Gender.UNKNOWN;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzviVar.zzmy);
    }
}
