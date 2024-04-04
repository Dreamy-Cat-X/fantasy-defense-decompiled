package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnd {
    public static zzdmh zza(List<zzdmh> list, zzdmh zzdmhVar) {
        return list.get(0);
    }

    public static zzvp zzb(Context context, List<zzdmh> list) {
        ArrayList arrayList = new ArrayList();
        for (zzdmh zzdmhVar : list) {
            if (zzdmhVar.zzhhj) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzdmhVar.width, zzdmhVar.height));
            }
        }
        return new zzvp(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzdmh zzh(zzvp zzvpVar) {
        if (zzvpVar.zzchs) {
            return new zzdmh(-3, 0, true);
        }
        return new zzdmh(zzvpVar.width, zzvpVar.height, false);
    }
}
