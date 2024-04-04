package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzku extends zzkv {
    public final long zzasr;
    public final List<zzkx> zzass;
    public final List<zzku> zzast;

    public zzku(int i, long j) {
        super(i);
        this.zzasr = j;
        this.zzass = new ArrayList();
        this.zzast = new ArrayList();
    }

    public final void zza(zzkx zzkxVar) {
        this.zzass.add(zzkxVar);
    }

    public final void zza(zzku zzkuVar) {
        this.zzast.add(zzkuVar);
    }

    public final zzkx zzap(int i) {
        int size = this.zzass.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzkx zzkxVar = this.zzass.get(i2);
            if (zzkxVar.type == i) {
                return zzkxVar;
            }
        }
        return null;
    }

    public final zzku zzaq(int i) {
        int size = this.zzast.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzku zzkuVar = this.zzast.get(i2);
            if (zzkuVar.type == i) {
                return zzkuVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzkv
    public final String toString() {
        String zzat = zzat(this.type);
        String arrays = Arrays.toString(this.zzass.toArray());
        String arrays2 = Arrays.toString(this.zzast.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(zzat).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzat);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
