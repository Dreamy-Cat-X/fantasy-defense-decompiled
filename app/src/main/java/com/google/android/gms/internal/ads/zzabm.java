package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzabm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zzsh() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzacp.zzh("gad:dynamite_module:experiment_id", ""));
        zza(arrayList, zzadc.zzdcp);
        zza(arrayList, zzadc.zzdcq);
        zza(arrayList, zzadc.zzdcr);
        zza(arrayList, zzadc.zzdcs);
        zza(arrayList, zzadc.zzdct);
        zza(arrayList, zzadc.zzdcz);
        zza(arrayList, zzadc.zzdcu);
        zza(arrayList, zzadc.zzdcv);
        zza(arrayList, zzadc.zzdcw);
        zza(arrayList, zzadc.zzdcx);
        zza(arrayList, zzadc.zzdcy);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zzsi() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzadl.zzddu);
        return arrayList;
    }

    private static void zza(List<String> list, zzacp<String> zzacpVar) {
        String str = zzacpVar.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
