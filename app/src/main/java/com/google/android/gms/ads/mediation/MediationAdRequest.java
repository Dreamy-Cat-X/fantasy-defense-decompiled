package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface MediationAdRequest {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    Date getBirthday();

    @Deprecated
    int getGender();

    Set<String> getKeywords();

    Location getLocation();

    @Deprecated
    boolean isDesignedForFamilies();

    boolean isTesting();

    int taggedForChildDirectedTreatment();
}
