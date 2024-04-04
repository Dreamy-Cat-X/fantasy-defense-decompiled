package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzadn {
    private static zzacp<Long> zzddy = zzacp.zzb("gads:ad_loader:timeout_ms", 60000L);
    public static zzacp<Long> zzddz = zzacp.zzb("gads:rendering:timeout_ms", 60000L);
    private static zzacp<Long> zzdea = zzacp.zzb("gads:resolve_future:default_timeout_ms", (long) WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
}
