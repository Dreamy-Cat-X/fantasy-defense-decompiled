package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzemv extends zzejg {
    static final int[] zzise = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
    private final int zzisf;
    private final zzejg zzisg;
    private final zzejg zzish;
    private final int zzisi;
    private final int zzisj;

    private zzemv(zzejg zzejgVar, zzejg zzejgVar2) {
        this.zzisg = zzejgVar;
        this.zzish = zzejgVar2;
        int size = zzejgVar.size();
        this.zzisi = size;
        this.zzisf = size + zzejgVar2.size();
        this.zzisj = Math.max(zzejgVar.zzbgp(), zzejgVar2.zzbgp()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzejg zza(zzejg zzejgVar, zzejg zzejgVar2) {
        if (zzejgVar2.size() == 0) {
            return zzejgVar;
        }
        if (zzejgVar.size() == 0) {
            return zzejgVar2;
        }
        int size = zzejgVar.size() + zzejgVar2.size();
        if (size < 128) {
            return zzb(zzejgVar, zzejgVar2);
        }
        if (zzejgVar instanceof zzemv) {
            zzemv zzemvVar = (zzemv) zzejgVar;
            if (zzemvVar.zzish.size() + zzejgVar2.size() < 128) {
                return new zzemv(zzemvVar.zzisg, zzb(zzemvVar.zzish, zzejgVar2));
            }
            if (zzemvVar.zzisg.zzbgp() > zzemvVar.zzish.zzbgp() && zzemvVar.zzbgp() > zzejgVar2.zzbgp()) {
                return new zzemv(zzemvVar.zzisg, new zzemv(zzemvVar.zzish, zzejgVar2));
            }
        }
        if (size >= zzhr(Math.max(zzejgVar.zzbgp(), zzejgVar2.zzbgp()) + 1)) {
            return new zzemv(zzejgVar, zzejgVar2);
        }
        return zzemx.zza(new zzemx(null), zzejgVar, zzejgVar2);
    }

    private static zzejg zzb(zzejg zzejgVar, zzejg zzejgVar2) {
        int size = zzejgVar.size();
        int size2 = zzejgVar2.size();
        byte[] bArr = new byte[size + size2];
        zzejgVar.zza(bArr, 0, 0, size);
        zzejgVar2.zza(bArr, 0, size, size2);
        return zzejg.zzu(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzhr(int i) {
        int[] iArr = zzise;
        return i >= iArr.length ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final byte zzfz(int i) {
        zzab(i, this.zzisf);
        return zzga(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final byte zzga(int i) {
        int i2 = this.zzisi;
        if (i < i2) {
            return this.zzisg.zzga(i);
        }
        return this.zzish.zzga(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final int size() {
        return this.zzisf;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    /* renamed from: zzbgk */
    public final zzejl iterator() {
        return new zzemu(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final int zzbgp() {
        return this.zzisj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zzbgq() {
        return this.zzisf >= zzhr(this.zzisj);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final zzejg zzaa(int i, int i2) {
        int zzi = zzi(i, i2, this.zzisf);
        if (zzi == 0) {
            return zzejg.zzikj;
        }
        if (zzi == this.zzisf) {
            return this;
        }
        int i3 = this.zzisi;
        if (i2 <= i3) {
            return this.zzisg.zzaa(i, i2);
        }
        if (i >= i3) {
            return this.zzish.zzaa(i - i3, i2 - i3);
        }
        zzejg zzejgVar = this.zzisg;
        return new zzemv(zzejgVar.zzaa(i, zzejgVar.size()), this.zzish.zzaa(0, i2 - this.zzisi));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzisi;
        if (i4 <= i5) {
            this.zzisg.zzb(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zzish.zzb(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzisg.zzb(bArr, i, i2, i6);
            this.zzish.zzb(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final void zza(zzejd zzejdVar) throws IOException {
        this.zzisg.zza(zzejdVar);
        this.zzish.zza(zzejdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    protected final String zza(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zzbgm() {
        int zzg = this.zzisg.zzg(0, 0, this.zzisi);
        zzejg zzejgVar = this.zzish;
        return zzejgVar.zzg(zzg, 0, zzejgVar.size()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final int zzg(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzisi;
        if (i4 <= i5) {
            return this.zzisg.zzg(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzish.zzg(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzish.zzg(this.zzisg.zzg(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean equals(Object obj) {
        boolean zza;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzejg)) {
            return false;
        }
        zzejg zzejgVar = (zzejg) obj;
        if (this.zzisf != zzejgVar.size()) {
            return false;
        }
        if (this.zzisf == 0) {
            return true;
        }
        int zzbgr = zzbgr();
        int zzbgr2 = zzejgVar.zzbgr();
        if (zzbgr != 0 && zzbgr2 != 0 && zzbgr != zzbgr2) {
            return false;
        }
        zzemu zzemuVar = null;
        zzemw zzemwVar = new zzemw(this, zzemuVar);
        zzejn next = zzemwVar.next();
        zzemw zzemwVar2 = new zzemw(zzejgVar, zzemuVar);
        zzejn next2 = zzemwVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                zza = next.zza(next2, i2, min);
            } else {
                zza = next2.zza(next, i, min);
            }
            if (!zza) {
                return false;
            }
            i3 += min;
            int i4 = this.zzisf;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = zzemwVar.next();
                i = 0;
            } else {
                i += min;
                next = next;
            }
            if (min == size2) {
                next2 = zzemwVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final int zzh(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzisi;
        if (i4 <= i5) {
            return this.zzisg.zzh(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzish.zzh(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzish.zzh(this.zzisg.zzh(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final zzejr zzbgn() {
        return new zzejw(new zzemz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzejg, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzemv(zzejg zzejgVar, zzejg zzejgVar2, zzemu zzemuVar) {
        this(zzejgVar, zzejgVar2);
    }
}
