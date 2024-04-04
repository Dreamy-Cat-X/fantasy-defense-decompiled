package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqh {
    private final zzqg zzbml;
    private final boolean zzbmm;
    private final long zzbmn;
    private final long zzbmo;
    private long zzbmp;
    private long zzbmq;
    private long zzbmr;
    private boolean zzbms;
    private long zzbmt;
    private long zzbmu;
    private long zzbmv;

    public zzqh() {
        this(-1.0d);
    }

    public zzqh(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r3.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private zzqh(double d) {
        boolean z = d != -1.0d;
        this.zzbmm = z;
        if (z) {
            this.zzbml = zzqg.zzjp();
            long j = (long) (1.0E9d / d);
            this.zzbmn = j;
            this.zzbmo = (j * 80) / 100;
            return;
        }
        this.zzbml = null;
        this.zzbmn = -1L;
        this.zzbmo = -1L;
    }

    public final void enable() {
        this.zzbms = false;
        if (this.zzbmm) {
            this.zzbml.zzjq();
        }
    }

    public final void disable() {
        if (this.zzbmm) {
            this.zzbml.removeObserver();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(long j, long j2) {
        long j3;
        long j4;
        zzqg zzqgVar;
        long j5;
        long j6 = 1000 * j;
        if (this.zzbms) {
            if (j != this.zzbmp) {
                this.zzbmv++;
                this.zzbmq = this.zzbmr;
            }
            long j7 = this.zzbmv;
            if (j7 >= 6) {
                j4 = this.zzbmq + ((j6 - this.zzbmu) / j7);
                if (zzg(j4, j2)) {
                    this.zzbms = false;
                } else {
                    j3 = (this.zzbmt + j4) - this.zzbmu;
                    if (!this.zzbms) {
                        this.zzbmu = j6;
                        this.zzbmt = j2;
                        this.zzbmv = 0L;
                        this.zzbms = true;
                    }
                    this.zzbmp = j;
                    this.zzbmr = j4;
                    zzqgVar = this.zzbml;
                    if (zzqgVar != null || zzqgVar.zzbmg == 0) {
                        return j3;
                    }
                    long j8 = this.zzbml.zzbmg;
                    long j9 = this.zzbmn;
                    long j10 = j8 + (((j3 - j8) / j9) * j9);
                    if (j3 <= j10) {
                        j5 = j10 - j9;
                    } else {
                        j10 = j9 + j10;
                        j5 = j10;
                    }
                    if (j10 - j3 >= j3 - j5) {
                        j10 = j5;
                    }
                    return j10 - this.zzbmo;
                }
            } else if (zzg(j6, j2)) {
                this.zzbms = false;
            }
        }
        j3 = j2;
        j4 = j6;
        if (!this.zzbms) {
        }
        this.zzbmp = j;
        this.zzbmr = j4;
        zzqgVar = this.zzbml;
        if (zzqgVar != null) {
        }
        return j3;
    }

    private final boolean zzg(long j, long j2) {
        return Math.abs((j2 - this.zzbmt) - (j - this.zzbmu)) > 20000000;
    }
}
