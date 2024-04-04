package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzgd<MessageType extends zzgd<MessageType, BuilderType>, BuilderType extends zzgf<MessageType, BuilderType>> implements zzjg {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.measurement.zzjg
    public final zzgm zzbj() {
        try {
            zzgu zzc = zzgm.zzc(zzbp());
            zza(zzc.zzb());
            return zzc.zza();
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

    public final byte[] zzbk() {
        try {
            byte[] bArr = new byte[zzbp()];
            zzhf zza = zzhf.zza(bArr);
            zza(zza);
            zza.zzb();
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
    public int zzbl() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzc(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzhx.zza(iterable);
        if (iterable instanceof zzin) {
            List<?> zzb = ((zzin) iterable).zzb();
            zzin zzinVar = (zzin) list;
            int size = list.size();
            for (Object obj : zzb) {
                if (obj == null) {
                    int size2 = zzinVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = zzinVar.size() - 1; size3 >= size; size3--) {
                        zzinVar.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                }
                if (obj instanceof zzgm) {
                    zzinVar.zza((zzgm) obj);
                } else {
                    zzinVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzjs) {
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
