package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeji implements Comparator<zzejg> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzejg zzejgVar, zzejg zzejgVar2) {
        int zzb;
        int zzb2;
        zzejg zzejgVar3 = zzejgVar;
        zzejg zzejgVar4 = zzejgVar2;
        zzejl zzejlVar = (zzejl) zzejgVar3.iterator();
        zzejl zzejlVar2 = (zzejl) zzejgVar4.iterator();
        while (zzejlVar.hasNext() && zzejlVar2.hasNext()) {
            zzb = zzejg.zzb(zzejlVar.nextByte());
            zzb2 = zzejg.zzb(zzejlVar2.nextByte());
            int compare = Integer.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzejgVar3.size(), zzejgVar4.size());
    }
}
