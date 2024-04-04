package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmo implements zznp {
    private final zznp[] zzbdh;

    public zzmo(zznp[] zznpVarArr) {
        this.zzbdh = zznpVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final long zzhn() {
        long j = Long.MAX_VALUE;
        for (zznp zznpVar : this.zzbdh) {
            long zzhn = zznpVar.zzhn();
            if (zzhn != Long.MIN_VALUE) {
                j = Math.min(j, zzhn);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final boolean zzee(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zzhn = zzhn();
            if (zzhn == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zznp zznpVar : this.zzbdh) {
                if (zznpVar.zzhn() == zzhn) {
                    z |= zznpVar.zzee(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
