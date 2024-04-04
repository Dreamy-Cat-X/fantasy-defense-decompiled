package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzkh implements zzke {
    private final long zzaim;

    public zzkh(long j) {
        this.zzaim = j;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final boolean isSeekable() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long zzdz(long j) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long getDurationUs() {
        return this.zzaim;
    }
}
