package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzrt implements Comparator<zzrz> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrt(zzru zzruVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzrz zzrzVar, zzrz zzrzVar2) {
        zzrz zzrzVar3 = zzrzVar;
        zzrz zzrzVar4 = zzrzVar2;
        int i = zzrzVar3.zzbts - zzrzVar4.zzbts;
        return i != 0 ? i : (int) (zzrzVar3.value - zzrzVar4.value);
    }
}
