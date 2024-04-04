package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzemx {
    private final ArrayDeque<zzejg> zzism;

    private zzemx() {
        this.zzism = new ArrayDeque<>();
    }

    public final zzejg zzc(zzejg zzejgVar, zzejg zzejgVar2) {
        zzam(zzejgVar);
        zzam(zzejgVar2);
        zzejg pop = this.zzism.pop();
        while (!this.zzism.isEmpty()) {
            pop = new zzemv(this.zzism.pop(), pop, null);
        }
        return pop;
    }

    private final void zzam(zzejg zzejgVar) {
        zzemu zzemuVar;
        zzejg zzejgVar2;
        while (!zzejgVar.zzbgq()) {
            if (zzejgVar instanceof zzemv) {
                zzemv zzemvVar = (zzemv) zzejgVar;
                zzejgVar2 = zzemvVar.zzisg;
                zzam(zzejgVar2);
                zzejgVar = zzemvVar.zzish;
            } else {
                String valueOf = String.valueOf(zzejgVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int zzhs = zzhs(zzejgVar.size());
        int zzhr = zzemv.zzhr(zzhs + 1);
        if (this.zzism.isEmpty() || this.zzism.peek().size() >= zzhr) {
            this.zzism.push(zzejgVar);
            return;
        }
        int zzhr2 = zzemv.zzhr(zzhs);
        zzejg pop = this.zzism.pop();
        while (true) {
            zzemuVar = null;
            if (this.zzism.isEmpty() || this.zzism.peek().size() >= zzhr2) {
                break;
            } else {
                pop = new zzemv(this.zzism.pop(), pop, zzemuVar);
            }
        }
        zzemv zzemvVar2 = new zzemv(pop, zzejgVar, zzemuVar);
        while (!this.zzism.isEmpty()) {
            if (this.zzism.peek().size() >= zzemv.zzhr(zzhs(zzemvVar2.size()) + 1)) {
                break;
            } else {
                zzemvVar2 = new zzemv(this.zzism.pop(), zzemvVar2, zzemuVar);
            }
        }
        this.zzism.push(zzemvVar2);
    }

    private static int zzhs(int i) {
        int binarySearch = Arrays.binarySearch(zzemv.zzise, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzemx(zzemu zzemuVar) {
        this();
    }

    public static /* synthetic */ zzejg zza(zzemx zzemxVar, zzejg zzejgVar, zzejg zzejgVar2) {
        return zzemxVar.zzc(zzejgVar, zzejgVar2);
    }
}
