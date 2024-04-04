package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzacv {
    private static zzacp<Boolean> zzdbr = zzacu.zzg("gads:consent:gmscore:dsid:enabled", true);
    private static zzacp<Boolean> zzdbs = zzacu.zzg("gads:consent:gmscore:lat:enabled", true);
    private static zzacp<String> zzdbt = new zzacu("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", zzacr.zzdbk);
    private static zzacp<Long> zzdbu = new zzacu("gads:consent:gmscore:time_out", Long.valueOf((long) WorkRequest.MIN_BACKOFF_MILLIS), zzacr.zzdbi);
    private static zzacp<Boolean> zzdbv = zzacu.zzg("gads:consent:gmscore:enabled", true);

    public static final void zza(zzadr zzadrVar) {
    }
}
