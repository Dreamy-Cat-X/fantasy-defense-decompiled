package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzru {
    private final int zzbtt;
    private final zzrr zzbtv = new zzry();
    private final int zzbts = 6;
    private final int zzbtu = 0;

    public zzru(int i) {
        this.zzbtt = i;
    }

    public final String zza(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            String str = arrayList2.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return zzbq(sb.toString());
    }

    private final String zzbq(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        zzrw zzrwVar = new zzrw();
        PriorityQueue priorityQueue = new PriorityQueue(this.zzbtt, new zzrt(this));
        for (String str2 : split) {
            String[] zze = zzrv.zze(str2, false);
            if (zze.length != 0) {
                zzsa.zza(zze, this.zzbtt, this.zzbts, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzrwVar.write(this.zzbtv.zzbp(((zzrz) it.next()).zzbtz));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Error while writing hash to byteStream", e);
            }
        }
        return zzrwVar.toString();
    }
}
