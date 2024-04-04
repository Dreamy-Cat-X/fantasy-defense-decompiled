package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzenr extends RuntimeException {
    private final List<String> zzitj;

    public zzenr(zzemd zzemdVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zzitj = null;
    }
}
