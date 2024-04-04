package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzemj<T> implements zzemy<T> {
    private final zzemd zzirf;
    private final boolean zzirg;
    private final zzenq<?, ?> zzirp;
    private final zzekf<?> zzirq;

    private zzemj(zzenq<?, ?> zzenqVar, zzekf<?> zzekfVar, zzemd zzemdVar) {
        this.zzirp = zzenqVar;
        this.zzirg = zzekfVar.zzj(zzemdVar);
        this.zzirq = zzekfVar;
        this.zzirf = zzemdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzemj<T> zza(zzenq<?, ?> zzenqVar, zzekf<?> zzekfVar, zzemd zzemdVar) {
        return new zzemj<>(zzenqVar, zzekfVar, zzemdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final T newInstance() {
        return (T) this.zzirf.zzbis().zzbiy();
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final boolean equals(T t, T t2) {
        if (!this.zzirp.zzay(t).equals(this.zzirp.zzay(t2))) {
            return false;
        }
        if (this.zzirg) {
            return this.zzirq.zzai(t).equals(this.zzirq.zzai(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final int hashCode(T t) {
        int hashCode = this.zzirp.zzay(t).hashCode();
        return this.zzirg ? (hashCode * 53) + this.zzirq.zzai(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zzg(T t, T t2) {
        zzena.zza(this.zzirp, t, t2);
        if (this.zzirg) {
            zzena.zza(this.zzirq, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zza(T t, zzeon zzeonVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzirq.zzai(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzekl zzeklVar = (zzekl) next.getKey();
            if (zzeklVar.zzbih() != zzeok.MESSAGE || zzeklVar.zzbii() || zzeklVar.zzbij()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzelg) {
                zzeonVar.zzc(zzeklVar.zzv(), ((zzelg) next).zzbjo().zzbgc());
            } else {
                zzeonVar.zzc(zzeklVar.zzv(), next.getValue());
            }
        }
        zzenq<?, ?> zzenqVar = this.zzirp;
        zzenqVar.zzc(zzenqVar.zzay(t), zzeonVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzemy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzejb zzejbVar) throws IOException {
        zzekq zzekqVar = (zzekq) t;
        zzent zzentVar = zzekqVar.zziou;
        if (zzentVar == zzent.zzblc()) {
            zzentVar = zzent.zzbld();
            zzekqVar.zziou = zzentVar;
        }
        ((zzekq.zzd) t).zzbja();
        zzekq.zzf zzfVar = null;
        while (i < i2) {
            int zza = zzejc.zza(bArr, i, zzejbVar);
            int i3 = zzejbVar.zzikc;
            if (i3 == 11) {
                int i4 = 0;
                zzejg zzejgVar = null;
                while (zza < i2) {
                    zza = zzejc.zza(bArr, zza, zzejbVar);
                    int i5 = zzejbVar.zzikc;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zzfVar != null) {
                                zzemr.zzbki();
                                throw new NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                zza = zzejc.zze(bArr, zza, zzejbVar);
                                zzejgVar = (zzejg) zzejbVar.zzike;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            zza = zzejc.zza(i5, bArr, zza, i2, zzejbVar);
                        }
                    } else if (i7 == 0) {
                        zza = zzejc.zza(bArr, zza, zzejbVar);
                        i4 = zzejbVar.zzikc;
                        zzfVar = (zzekq.zzf) this.zzirq.zza(zzejbVar.zzikf, this.zzirf, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzejgVar != null) {
                    zzentVar.zzd((i4 << 3) | 2, zzejgVar);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                zzfVar = (zzekq.zzf) this.zzirq.zza(zzejbVar.zzikf, this.zzirf, i3 >>> 3);
                if (zzfVar != null) {
                    zzemr.zzbki();
                    throw new NoSuchMethodError();
                }
                i = zzejc.zza(i3, bArr, zza, i2, zzentVar, zzejbVar);
            } else {
                i = zzejc.zza(i3, bArr, zza, i2, zzejbVar);
            }
        }
        if (i != i2) {
            throw zzeld.zzbjk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zza(T t, zzems zzemsVar, zzekd zzekdVar) throws IOException {
        boolean z;
        zzenq<?, ?> zzenqVar = this.zzirp;
        zzekf<?> zzekfVar = this.zzirq;
        Object zzaz = zzenqVar.zzaz(t);
        zzekj<?> zzaj = zzekfVar.zzaj(t);
        do {
            try {
                if (zzemsVar.zzbht() == Integer.MAX_VALUE) {
                    return;
                }
                int tag = zzemsVar.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzejg zzejgVar = null;
                    while (zzemsVar.zzbht() != Integer.MAX_VALUE) {
                        int tag2 = zzemsVar.getTag();
                        if (tag2 == 16) {
                            i = zzemsVar.zzbhe();
                            obj = zzekfVar.zza(zzekdVar, this.zzirf, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzekfVar.zza(zzemsVar, obj, zzekdVar, zzaj);
                            } else {
                                zzejgVar = zzemsVar.zzbhd();
                            }
                        } else if (!zzemsVar.zzbhu()) {
                            break;
                        }
                    }
                    if (zzemsVar.getTag() != 12) {
                        throw zzeld.zzbjh();
                    }
                    if (zzejgVar != null) {
                        if (obj != null) {
                            zzekfVar.zza(zzejgVar, obj, zzekdVar, zzaj);
                        } else {
                            zzenqVar.zza((zzenq<?, ?>) zzaz, i, zzejgVar);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzekfVar.zza(zzekdVar, this.zzirf, tag >>> 3);
                    if (zza != null) {
                        zzekfVar.zza(zzemsVar, zza, zzekdVar, zzaj);
                    } else {
                        z = zzenqVar.zza((zzenq<?, ?>) zzaz, zzemsVar);
                    }
                } else {
                    z = zzemsVar.zzbhu();
                }
                z = true;
            } finally {
                zzenqVar.zzj(t, zzaz);
            }
        } while (z);
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final void zzak(T t) {
        this.zzirp.zzak(t);
        this.zzirq.zzak(t);
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final boolean zzaw(T t) {
        return this.zzirq.zzai(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.ads.zzemy
    public final int zzau(T t) {
        zzenq<?, ?> zzenqVar = this.zzirp;
        int zzba = zzenqVar.zzba(zzenqVar.zzay(t)) + 0;
        return this.zzirg ? zzba + this.zzirq.zzai(t).zzbif() : zzba;
    }
}
