package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzejg implements Serializable, Iterable<Byte> {
    public static final zzejg zzikj = new zzejq(zzeks.zzikp);
    private static final zzejm zzikk;
    private static final Comparator<zzejg> zzikl;
    private int zzijp = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzejd zzejdVar) throws IOException;

    public abstract zzejg zzaa(int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract boolean zzbgm();

    public abstract zzejr zzbgn();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzbgp();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzbgq();

    public abstract byte zzfz(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzg(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzga(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzh(int i, int i2, int i3);

    @Override // java.lang.Iterable
    /* renamed from: zzbgk, reason: merged with bridge method [inline-methods] */
    public zzejl iterator() {
        return new zzejf(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public static zzejg zzi(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        return new zzejq(zzikk.zzj(bArr, i, i2));
    }

    public static zzejg zzt(byte[] bArr) {
        return zzi(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzejg zzu(byte[] bArr) {
        return new zzejq(bArr);
    }

    public static zzejg zzia(String str) {
        return new zzejq(str.getBytes(zzeks.UTF_8));
    }

    public static zzejg zzf(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            zzejg zzi = i2 == 0 ? null : zzi(bArr, 0, i2);
            if (zzi != null) {
                arrayList.add(zzi);
                i = Math.min(i << 1, 8192);
            } else {
                return zzl(arrayList);
            }
        }
    }

    public static zzejg zzl(Iterable<zzejg> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            size = 0;
            Iterator<zzejg> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return zzikj;
        }
        return zza(iterable.iterator(), size);
    }

    private static zzejg zza(Iterator<zzejg> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        zzejg zza = zza(it, i2);
        zzejg zza2 = zza(it, i - i2);
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - zza.size() < zza2.size()) {
            int size = zza.size();
            int size2 = zza2.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        return zzemv.zza(zza, zza2);
    }

    @Deprecated
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        zzi(i, i + i3, size());
        zzi(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zzb(bArr, i, i2, i3);
        }
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzeks.zzikp;
        }
        byte[] bArr = new byte[size];
        zzb(bArr, 0, 0, size);
        return bArr;
    }

    public final String zzbgl() {
        return size() == 0 ? "" : zza(zzeks.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzijp;
        if (i == 0) {
            int size = size();
            i = zzh(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzijp = i;
        }
        return i;
    }

    public static zzejp zzbgo() {
        return new zzejp(128);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzejo zzgb(int i) {
        return new zzejo(i, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzbgr() {
        return this.zzijp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzab(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? zzenm.zzan(this) : String.valueOf(zzenm.zzan(zzaa(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    static {
        zzejf zzejfVar = null;
        zzikk = zzeiz.zzbgf() ? new zzejs(zzejfVar) : new zzejk(zzejfVar);
        zzikl = new zzeji();
    }
}
