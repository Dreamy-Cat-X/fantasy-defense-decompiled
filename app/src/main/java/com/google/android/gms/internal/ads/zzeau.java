package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzega;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeau<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Class<P> zzhzs;
    private ConcurrentMap<String, List<zzeax<P>>> zzhzz = new ConcurrentHashMap();
    private zzeax<P> zziaa;

    public final zzeax<P> zzbau() {
        return this.zziaa;
    }

    private zzeau(Class<P> cls) {
        this.zzhzs = cls;
    }

    public static <P> zzeau<P> zza(Class<P> cls) {
        return new zzeau<>(cls);
    }

    public final void zza(zzeax<P> zzeaxVar) {
        if (zzeaxVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (zzeaxVar.zzbax() != zzeft.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        List<zzeax<P>> list = this.zzhzz.get(new String(zzeaxVar.zzbaz(), UTF_8));
        if (list == null) {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.zziaa = zzeaxVar;
    }

    public final zzeax<P> zza(P p, zzega.zzb zzbVar) throws GeneralSecurityException {
        byte[] array;
        if (zzbVar.zzbax() != zzeft.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int i = zzeag.zzhzp[zzbVar.zzbay().ordinal()];
        if (i == 1 || i == 2) {
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzbVar.zzbet()).array();
        } else if (i == 3) {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzbVar.zzbet()).array();
        } else if (i == 4) {
            array = zzeah.zzhzq;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzeax<P> zzeaxVar = new zzeax<>(p, array, zzbVar.zzbax(), zzbVar.zzbay(), zzbVar.zzbet());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzeaxVar);
        String str = new String(zzeaxVar.zzbaz(), UTF_8);
        List<zzeax<P>> put = this.zzhzz.put(str, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(zzeaxVar);
            this.zzhzz.put(str, Collections.unmodifiableList(arrayList2));
        }
        return zzeaxVar;
    }

    public final Class<P> zzbal() {
        return this.zzhzs;
    }
}
