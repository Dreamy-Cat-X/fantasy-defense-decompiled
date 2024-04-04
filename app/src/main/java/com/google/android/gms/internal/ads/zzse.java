package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzse implements Comparator<zzrs> {
    public zzse(zzsb zzsbVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzrs zzrsVar, zzrs zzrsVar2) {
        zzrs zzrsVar3 = zzrsVar;
        zzrs zzrsVar4 = zzrsVar2;
        if (zzrsVar3.zzmo() < zzrsVar4.zzmo()) {
            return -1;
        }
        if (zzrsVar3.zzmo() > zzrsVar4.zzmo()) {
            return 1;
        }
        if (zzrsVar3.zzmn() < zzrsVar4.zzmn()) {
            return -1;
        }
        if (zzrsVar3.zzmn() > zzrsVar4.zzmn()) {
            return 1;
        }
        float zzmq = (zzrsVar3.zzmq() - zzrsVar3.zzmo()) * (zzrsVar3.zzmp() - zzrsVar3.zzmn());
        float zzmq2 = (zzrsVar4.zzmq() - zzrsVar4.zzmo()) * (zzrsVar4.zzmp() - zzrsVar4.zzmn());
        if (zzmq > zzmq2) {
            return -1;
        }
        return zzmq < zzmq2 ? 1 : 0;
    }
}
