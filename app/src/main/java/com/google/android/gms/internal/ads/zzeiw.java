package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeiv;
import com.google.android.gms.internal.ads.zzeiw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeiw<MessageType extends zzeiw<MessageType, BuilderType>, BuilderType extends zzeiv<MessageType, BuilderType>> implements zzemd {
    protected int zzijw = 0;

    @Override // com.google.android.gms.internal.ads.zzemd
    public final zzejg zzbgc() {
        try {
            zzejo zzgb = zzejg.zzgb(zzbin());
            zzb(zzgb.zzbgu());
            return zzgb.zzbgt();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemd
    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzbin()];
            zzeka zzv = zzeka.zzv(bArr);
            zzb(zzv);
            zzv.zzbhw();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzbgd() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzfv(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzeks.checkNotNull(iterable);
        if (iterable instanceof zzelk) {
            List<?> zzbjp = ((zzelk) iterable).zzbjp();
            zzelk zzelkVar = (zzelk) list;
            int size = list.size();
            for (Object obj : zzbjp) {
                if (obj == null) {
                    int size2 = zzelkVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = zzelkVar.size() - 1; size3 >= size; size3--) {
                        zzelkVar.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                }
                if (obj instanceof zzejg) {
                    zzelkVar.zzak((zzejg) obj);
                } else {
                    zzelkVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzemp) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t : iterable) {
            if (t == null) {
                int size5 = list.size() - size4;
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Element at index ");
                sb3.append(size5);
                sb3.append(" is null.");
                String sb4 = sb3.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(sb4);
            }
            list.add(t);
        }
    }
}
