package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzri {
    private int zzbsn;
    private final Object lock = new Object();
    private List<zzrf> zzbso = new LinkedList();

    public final zzrf zzo(boolean z) {
        synchronized (this.lock) {
            zzrf zzrfVar = null;
            if (this.zzbso.size() == 0) {
                com.google.android.gms.ads.internal.util.zzd.zzdy("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzbso.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzrf zzrfVar2 : this.zzbso) {
                    int score = zzrfVar2.getScore();
                    if (score > i2) {
                        i = i3;
                        zzrfVar = zzrfVar2;
                        i2 = score;
                    }
                    i3++;
                }
                this.zzbso.remove(i);
                return zzrfVar;
            }
            zzrf zzrfVar3 = this.zzbso.get(0);
            if (z) {
                this.zzbso.remove(0);
            } else {
                zzrfVar3.zzmb();
            }
            return zzrfVar3;
        }
    }

    public final boolean zza(zzrf zzrfVar) {
        synchronized (this.lock) {
            return this.zzbso.contains(zzrfVar);
        }
    }

    public final boolean zzb(zzrf zzrfVar) {
        synchronized (this.lock) {
            Iterator<zzrf> it = this.zzbso.iterator();
            while (it.hasNext()) {
                zzrf next = it.next();
                if (!com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyg()) {
                    if (zzrfVar != next && next.zzly().equals(zzrfVar.zzly())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyi() && zzrfVar != next && next.zzma().equals(zzrfVar.zzma())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzrf zzrfVar) {
        synchronized (this.lock) {
            if (this.zzbso.size() >= 10) {
                int size = this.zzbso.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
                this.zzbso.remove(0);
            }
            int i = this.zzbsn;
            this.zzbsn = i + 1;
            zzrfVar.zzbt(i);
            zzrfVar.zzme();
            this.zzbso.add(zzrfVar);
        }
    }
}
