package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcb {
    private long zzde;

    public final long zzq(ByteBuffer byteBuffer) {
        zzbu zzbuVar;
        zzbr zzbrVar;
        long j = this.zzde;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<zzbp> it = new zzbn(new zzbby(duplicate), zzbcd.zzenq).zzbmn().iterator();
            while (true) {
                zzbuVar = null;
                if (!it.hasNext()) {
                    zzbrVar = null;
                    break;
                }
                zzbp next = it.next();
                if (next instanceof zzbr) {
                    zzbrVar = (zzbr) next;
                    break;
                }
            }
            Iterator<zzbp> it2 = zzbrVar.zzbmn().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzbp next2 = it2.next();
                if (next2 instanceof zzbu) {
                    zzbuVar = (zzbu) next2;
                    break;
                }
            }
            long duration = (zzbuVar.getDuration() * 1000) / zzbuVar.zzr();
            this.zzde = duration;
            return duration;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
