package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzadj {
    public static zzacp<Long> zzddl = zzacp.zzb("gads:dynamite_load:fail:sample_rate", (long) WorkRequest.MIN_BACKOFF_MILLIS);
    public static zzacp<Boolean> zzddm = zzacp.zzg("gads:report_dynamite_crash_in_background_thread", false);
    public static zzacp<String> zzddn = zzacp.zzh("gads:public_beta:traffic_multiplier", "1.0");
    public static zzacp<String> zzddo = zzacp.zzh("gads:sdk_crash_report_class_prefix", "com.google.");
    public static zzacp<Boolean> zzddp = zzacp.zzg("gads:sdk_crash_report_enabled", false);
    public static zzacp<Boolean> zzddq = zzacp.zzg("gads:sdk_crash_report_full_stacktrace", false);
    public static zzacp<Double> zzddr = zzacp.zzb("gads:trapped_exception_sample_rate", 0.01d);
}
