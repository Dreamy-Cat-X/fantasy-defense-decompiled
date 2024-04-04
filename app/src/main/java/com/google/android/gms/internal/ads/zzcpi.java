package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpi {
    private int responseCode = 0;
    private long zzgpa = 0;
    private long zzgpb = 0;
    private long zzgpc = 0;
    private final Object zzgpd = new Object();
    private final Object zzgpe = new Object();
    private final Object zzgpf = new Object();
    private final Object zzgpg = new Object();

    public final void zzeb(int i) {
        synchronized (this.zzgpd) {
            this.responseCode = i;
        }
    }

    public final int getResponseCode() {
        int i;
        synchronized (this.zzgpd) {
            i = this.responseCode;
        }
        return i;
    }

    public final void zzeo(long j) {
        synchronized (this.zzgpe) {
            this.zzgpa = j;
        }
    }

    public final long zzot() {
        long j;
        synchronized (this.zzgpe) {
            j = this.zzgpa;
        }
        return j;
    }

    public final synchronized void zzfe(long j) {
        synchronized (this.zzgpf) {
            this.zzgpb = j;
        }
    }

    public final synchronized long zzarw() {
        long j;
        synchronized (this.zzgpf) {
            j = this.zzgpb;
        }
        return j;
    }

    public final synchronized void zzep(long j) {
        synchronized (this.zzgpg) {
            this.zzgpc = j;
        }
    }

    public final synchronized long zzou() {
        long j;
        synchronized (this.zzgpg) {
            j = this.zzgpc;
        }
        return j;
    }
}
