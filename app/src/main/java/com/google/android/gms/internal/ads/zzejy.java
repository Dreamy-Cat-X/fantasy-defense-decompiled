package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzejy implements zzems {
    private int tag;
    private final zzejr zzilj;
    private int zzilk;
    private int zzill = 0;

    public static zzejy zza(zzejr zzejrVar) {
        if (zzejrVar.zziky != null) {
            return zzejrVar.zziky;
        }
        return new zzejy(zzejrVar);
    }

    private zzejy(zzejr zzejrVar) {
        zzejr zzejrVar2 = (zzejr) zzeks.zza(zzejrVar, "input");
        this.zzilj = zzejrVar2;
        zzejrVar2.zziky = this;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbht() throws IOException {
        int i = this.zzill;
        if (i != 0) {
            this.tag = i;
            this.zzill = 0;
        } else {
            this.tag = this.zzilj.zzbgv();
        }
        int i2 = this.tag;
        return (i2 == 0 || i2 == this.zzilk) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zzbhu() throws IOException {
        int i;
        if (this.zzilj.zzbhl() || (i = this.tag) == this.zzilk) {
            return false;
        }
        return this.zzilj.zzge(i);
    }

    private final void zzgn(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzeld.zzbji();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final double readDouble() throws IOException {
        zzgn(1);
        return this.zzilj.readDouble();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final float readFloat() throws IOException {
        zzgn(5);
        return this.zzilj.readFloat();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final long zzbgw() throws IOException {
        zzgn(0);
        return this.zzilj.zzbgw();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final long zzbgx() throws IOException {
        zzgn(0);
        return this.zzilj.zzbgx();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbgy() throws IOException {
        zzgn(0);
        return this.zzilj.zzbgy();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final long zzbgz() throws IOException {
        zzgn(1);
        return this.zzilj.zzbgz();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbha() throws IOException {
        zzgn(5);
        return this.zzilj.zzbha();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final boolean zzbhb() throws IOException {
        zzgn(0);
        return this.zzilj.zzbhb();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final String readString() throws IOException {
        zzgn(2);
        return this.zzilj.readString();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final String zzbhc() throws IOException {
        zzgn(2);
        return this.zzilj.zzbhc();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final <T> T zza(zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException {
        zzgn(2);
        return (T) zzc(zzemyVar, zzekdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final <T> T zzb(zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException {
        zzgn(3);
        return (T) zzd(zzemyVar, zzekdVar);
    }

    private final <T> T zzc(zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException {
        int zzbhe = this.zzilj.zzbhe();
        if (this.zzilj.zzikv >= this.zzilj.zzikw) {
            throw new zzeld("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzgf = this.zzilj.zzgf(zzbhe);
        T newInstance = zzemyVar.newInstance();
        this.zzilj.zzikv++;
        zzemyVar.zza(newInstance, this, zzekdVar);
        zzemyVar.zzak(newInstance);
        this.zzilj.zzgd(0);
        zzejr zzejrVar = this.zzilj;
        zzejrVar.zzikv--;
        this.zzilj.zzgg(zzgf);
        return newInstance;
    }

    private final <T> T zzd(zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException {
        int i = this.zzilk;
        this.zzilk = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzemyVar.newInstance();
            zzemyVar.zza(newInstance, this, zzekdVar);
            zzemyVar.zzak(newInstance);
            if (this.tag == this.zzilk) {
                return newInstance;
            }
            throw zzeld.zzbjk();
        } finally {
            this.zzilk = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzejg zzbhd() throws IOException {
        zzgn(2);
        return this.zzilj.zzbhd();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbhe() throws IOException {
        zzgn(0);
        return this.zzilj.zzbhe();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbhf() throws IOException {
        zzgn(0);
        return this.zzilj.zzbhf();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbhg() throws IOException {
        zzgn(5);
        return this.zzilj.zzbhg();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final long zzbhh() throws IOException {
        zzgn(1);
        return this.zzilj.zzbhh();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final int zzbhi() throws IOException {
        zzgn(0);
        return this.zzilj.zzbhi();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final long zzbhj() throws IOException {
        zzgn(0);
        return this.zzilj.zzbhj();
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzm(List<Double> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekb) {
            zzekb zzekbVar = (zzekb) list;
            int i = this.tag & 7;
            if (i != 1) {
                if (i == 2) {
                    int zzbhe = this.zzilj.zzbhe();
                    zzgo(zzbhe);
                    int zzbhm = this.zzilj.zzbhm() + zzbhe;
                    do {
                        zzekbVar.zze(this.zzilj.readDouble());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzekbVar.zze(this.zzilj.readDouble());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzbhe2 = this.zzilj.zzbhe();
                zzgo(zzbhe2);
                int zzbhm2 = this.zzilj.zzbhm() + zzbhe2;
                do {
                    list.add(Double.valueOf(this.zzilj.readDouble()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Double.valueOf(this.zzilj.readDouble()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzn(List<Float> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekp) {
            zzekp zzekpVar = (zzekp) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbhe = this.zzilj.zzbhe();
                zzgp(zzbhe);
                int zzbhm = this.zzilj.zzbhm() + zzbhe;
                do {
                    zzekpVar.zzh(this.zzilj.readFloat());
                } while (this.zzilj.zzbhm() < zzbhm);
                return;
            }
            if (i != 5) {
                throw zzeld.zzbji();
            }
            do {
                zzekpVar.zzh(this.zzilj.readFloat());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbhe2 = this.zzilj.zzbhe();
            zzgp(zzbhe2);
            int zzbhm2 = this.zzilj.zzbhm() + zzbhe2;
            do {
                list.add(Float.valueOf(this.zzilj.readFloat()));
            } while (this.zzilj.zzbhm() < zzbhm2);
            return;
        }
        if (i2 != 5) {
            throw zzeld.zzbji();
        }
        do {
            list.add(Float.valueOf(this.zzilj.readFloat()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzo(List<Long> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzelrVar.zzfr(this.zzilj.zzbgw());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzelrVar.zzfr(this.zzilj.zzbgw());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Long.valueOf(this.zzilj.zzbgw()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Long.valueOf(this.zzilj.zzbgw()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzp(List<Long> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzelrVar.zzfr(this.zzilj.zzbgx());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzelrVar.zzfr(this.zzilj.zzbgx());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Long.valueOf(this.zzilj.zzbgx()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Long.valueOf(this.zzilj.zzbgx()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzq(List<Integer> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzektVar.zzhh(this.zzilj.zzbgy());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzektVar.zzhh(this.zzilj.zzbgy());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Integer.valueOf(this.zzilj.zzbgy()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Integer.valueOf(this.zzilj.zzbgy()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzr(List<Long> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            int i = this.tag & 7;
            if (i != 1) {
                if (i == 2) {
                    int zzbhe = this.zzilj.zzbhe();
                    zzgo(zzbhe);
                    int zzbhm = this.zzilj.zzbhm() + zzbhe;
                    do {
                        zzelrVar.zzfr(this.zzilj.zzbgz());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzelrVar.zzfr(this.zzilj.zzbgz());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzbhe2 = this.zzilj.zzbhe();
                zzgo(zzbhe2);
                int zzbhm2 = this.zzilj.zzbhm() + zzbhe2;
                do {
                    list.add(Long.valueOf(this.zzilj.zzbgz()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Long.valueOf(this.zzilj.zzbgz()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzs(List<Integer> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbhe = this.zzilj.zzbhe();
                zzgp(zzbhe);
                int zzbhm = this.zzilj.zzbhm() + zzbhe;
                do {
                    zzektVar.zzhh(this.zzilj.zzbha());
                } while (this.zzilj.zzbhm() < zzbhm);
                return;
            }
            if (i != 5) {
                throw zzeld.zzbji();
            }
            do {
                zzektVar.zzhh(this.zzilj.zzbha());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbhe2 = this.zzilj.zzbhe();
            zzgp(zzbhe2);
            int zzbhm2 = this.zzilj.zzbhm() + zzbhe2;
            do {
                list.add(Integer.valueOf(this.zzilj.zzbha()));
            } while (this.zzilj.zzbhm() < zzbhm2);
            return;
        }
        if (i2 != 5) {
            throw zzeld.zzbji();
        }
        do {
            list.add(Integer.valueOf(this.zzilj.zzbha()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzt(List<Boolean> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzeje) {
            zzeje zzejeVar = (zzeje) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzejeVar.addBoolean(this.zzilj.zzbhb());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzejeVar.addBoolean(this.zzilj.zzbhb());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Boolean.valueOf(this.zzilj.zzbhb()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Boolean.valueOf(this.zzilj.zzbhb()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzu(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzbgv;
        int zzbgv2;
        if ((this.tag & 7) != 2) {
            throw zzeld.zzbji();
        }
        if ((list instanceof zzelk) && !z) {
            zzelk zzelkVar = (zzelk) list;
            do {
                zzelkVar.zzak(zzbhd());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        do {
            list.add(z ? zzbhc() : readString());
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzems
    public final <T> void zza(List<T> list, zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException {
        int zzbgv;
        int i = this.tag;
        if ((i & 7) != 2) {
            throw zzeld.zzbji();
        }
        do {
            list.add(zzc(zzemyVar, zzekdVar));
            if (this.zzilj.zzbhl() || this.zzill != 0) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == i);
        this.zzill = zzbgv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzems
    public final <T> void zzb(List<T> list, zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException {
        int zzbgv;
        int i = this.tag;
        if ((i & 7) != 3) {
            throw zzeld.zzbji();
        }
        do {
            list.add(zzd(zzemyVar, zzekdVar));
            if (this.zzilj.zzbhl() || this.zzill != 0) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == i);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzv(List<zzejg> list) throws IOException {
        int zzbgv;
        if ((this.tag & 7) != 2) {
            throw zzeld.zzbji();
        }
        do {
            list.add(zzbhd());
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzw(List<Integer> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzektVar.zzhh(this.zzilj.zzbhe());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzektVar.zzhh(this.zzilj.zzbhe());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Integer.valueOf(this.zzilj.zzbhe()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Integer.valueOf(this.zzilj.zzbhe()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzx(List<Integer> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzektVar.zzhh(this.zzilj.zzbhf());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzektVar.zzhh(this.zzilj.zzbhf());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Integer.valueOf(this.zzilj.zzbhf()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Integer.valueOf(this.zzilj.zzbhf()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzy(List<Integer> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzbhe = this.zzilj.zzbhe();
                zzgp(zzbhe);
                int zzbhm = this.zzilj.zzbhm() + zzbhe;
                do {
                    zzektVar.zzhh(this.zzilj.zzbhg());
                } while (this.zzilj.zzbhm() < zzbhm);
                return;
            }
            if (i != 5) {
                throw zzeld.zzbji();
            }
            do {
                zzektVar.zzhh(this.zzilj.zzbhg());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 == 2) {
            int zzbhe2 = this.zzilj.zzbhe();
            zzgp(zzbhe2);
            int zzbhm2 = this.zzilj.zzbhm() + zzbhe2;
            do {
                list.add(Integer.valueOf(this.zzilj.zzbhg()));
            } while (this.zzilj.zzbhm() < zzbhm2);
            return;
        }
        if (i2 != 5) {
            throw zzeld.zzbji();
        }
        do {
            list.add(Integer.valueOf(this.zzilj.zzbhg()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzz(List<Long> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            int i = this.tag & 7;
            if (i != 1) {
                if (i == 2) {
                    int zzbhe = this.zzilj.zzbhe();
                    zzgo(zzbhe);
                    int zzbhm = this.zzilj.zzbhm() + zzbhe;
                    do {
                        zzelrVar.zzfr(this.zzilj.zzbhh());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzelrVar.zzfr(this.zzilj.zzbhh());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzbhe2 = this.zzilj.zzbhe();
                zzgo(zzbhe2);
                int zzbhm2 = this.zzilj.zzbhm() + zzbhe2;
                do {
                    list.add(Long.valueOf(this.zzilj.zzbhh()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Long.valueOf(this.zzilj.zzbhh()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzaa(List<Integer> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzekt) {
            zzekt zzektVar = (zzekt) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzektVar.zzhh(this.zzilj.zzbhi());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzektVar.zzhh(this.zzilj.zzbhi());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Integer.valueOf(this.zzilj.zzbhi()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Integer.valueOf(this.zzilj.zzbhi()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzab(List<Long> list) throws IOException {
        int zzbgv;
        int zzbgv2;
        if (list instanceof zzelr) {
            zzelr zzelrVar = (zzelr) list;
            int i = this.tag & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzbhm = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                    do {
                        zzelrVar.zzfr(this.zzilj.zzbhj());
                    } while (this.zzilj.zzbhm() < zzbhm);
                    zzgq(zzbhm);
                    return;
                }
                throw zzeld.zzbji();
            }
            do {
                zzelrVar.zzfr(this.zzilj.zzbhj());
                if (this.zzilj.zzbhl()) {
                    return;
                } else {
                    zzbgv2 = this.zzilj.zzbgv();
                }
            } while (zzbgv2 == this.tag);
            this.zzill = zzbgv2;
            return;
        }
        int i2 = this.tag & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzbhm2 = this.zzilj.zzbhm() + this.zzilj.zzbhe();
                do {
                    list.add(Long.valueOf(this.zzilj.zzbhj()));
                } while (this.zzilj.zzbhm() < zzbhm2);
                zzgq(zzbhm2);
                return;
            }
            throw zzeld.zzbji();
        }
        do {
            list.add(Long.valueOf(this.zzilj.zzbhj()));
            if (this.zzilj.zzbhl()) {
                return;
            } else {
                zzbgv = this.zzilj.zzbgv();
            }
        } while (zzbgv == this.tag);
        this.zzill = zzbgv;
    }

    private static void zzgo(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzeld.zzbjk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzems
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void zza(Map<K, V> map, zzelu<K, V> zzeluVar, zzekd zzekdVar) throws IOException {
        zzgn(2);
        int zzgf = this.zzilj.zzgf(this.zzilj.zzbhe());
        Object obj = zzeluVar.zziqv;
        Object obj2 = zzeluVar.zzclf;
        while (true) {
            try {
                int zzbht = zzbht();
                if (zzbht == Integer.MAX_VALUE || this.zzilj.zzbhl()) {
                    break;
                }
                if (zzbht == 1) {
                    obj = zza(zzeluVar.zziqu, (Class<?>) null, (zzekd) null);
                } else if (zzbht == 2) {
                    obj2 = zza(zzeluVar.zziqw, zzeluVar.zzclf.getClass(), zzekdVar);
                } else {
                    try {
                        if (!zzbhu()) {
                            throw new zzeld("Unable to parse map entry.");
                            break;
                        }
                    } catch (zzelc unused) {
                        if (!zzbhu()) {
                            throw new zzeld("Unable to parse map entry.");
                        }
                    }
                }
            } finally {
                this.zzilj.zzgg(zzgf);
            }
        }
    }

    private final Object zza(zzeoh zzeohVar, Class<?> cls, zzekd zzekdVar) throws IOException {
        switch (zzejx.zzili[zzeohVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzbhb());
            case 2:
                return zzbhd();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzbhf());
            case 5:
                return Integer.valueOf(zzbha());
            case 6:
                return Long.valueOf(zzbgz());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzbgy());
            case 9:
                return Long.valueOf(zzbgx());
            case 10:
                zzgn(2);
                return zzc(zzemr.zzbki().zzh(cls), zzekdVar);
            case 11:
                return Integer.valueOf(zzbhg());
            case 12:
                return Long.valueOf(zzbhh());
            case 13:
                return Integer.valueOf(zzbhi());
            case 14:
                return Long.valueOf(zzbhj());
            case 15:
                return zzbhc();
            case 16:
                return Integer.valueOf(zzbhe());
            case 17:
                return Long.valueOf(zzbgw());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzgp(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzeld.zzbjk();
        }
    }

    private final void zzgq(int i) throws IOException {
        if (this.zzilj.zzbhm() != i) {
            throw zzeld.zzbjd();
        }
    }
}
