package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzejq extends zzejn {
    protected final byte[] zziku;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejq(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zziku = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzbgs() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public byte zzfz(int i) {
        return this.zziku[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejg
    public byte zzga(int i) {
        return this.zziku[i];
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public int size() {
        return this.zziku.length;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final zzejg zzaa(int i, int i2) {
        int zzi = zzi(i, i2, size());
        if (zzi == 0) {
            return zzejg.zzikj;
        }
        return new zzejj(this.zziku, zzbgs() + i, zzi);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zziku, i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final void zza(zzejd zzejdVar) throws IOException {
        zzejdVar.zzh(this.zziku, zzbgs(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    protected final String zza(Charset charset) {
        return new String(this.zziku, zzbgs(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zzbgm() {
        int zzbgs = zzbgs();
        return zzenz.zzm(this.zziku, zzbgs, size() + zzbgs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final int zzg(int i, int i2, int i3) {
        int zzbgs = zzbgs() + i2;
        return zzenz.zzb(i, this.zziku, zzbgs, i3 + zzbgs);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzejg) || size() != ((zzejg) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof zzejq) {
            zzejq zzejqVar = (zzejq) obj;
            int zzbgr = zzbgr();
            int zzbgr2 = zzejqVar.zzbgr();
            if (zzbgr == 0 || zzbgr2 == 0 || zzbgr == zzbgr2) {
                return zza(zzejqVar, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.zzejn
    final boolean zza(zzejg zzejgVar, int i, int i2) {
        if (i2 > zzejgVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzejgVar.size()) {
            int size2 = zzejgVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (zzejgVar instanceof zzejq) {
            zzejq zzejqVar = (zzejq) zzejgVar;
            byte[] bArr = this.zziku;
            byte[] bArr2 = zzejqVar.zziku;
            int zzbgs = zzbgs() + i2;
            int zzbgs2 = zzbgs();
            int zzbgs3 = zzejqVar.zzbgs() + i;
            while (zzbgs2 < zzbgs) {
                if (bArr[zzbgs2] != bArr2[zzbgs3]) {
                    return false;
                }
                zzbgs2++;
                zzbgs3++;
            }
            return true;
        }
        return zzejgVar.zzaa(i, i3).equals(zzaa(0, i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzejg
    public final int zzh(int i, int i2, int i3) {
        return zzeks.zza(i, this.zziku, zzbgs() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final zzejr zzbgn() {
        return zzejr.zzb(this.zziku, zzbgs(), size(), true);
    }
}
