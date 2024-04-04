package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdoo {
    private final int maxEntries;
    private final int zzhlg;
    private final LinkedList<zzdpb<?>> zzhlf = new LinkedList<>();
    private final zzdpr zzhlh = new zzdpr();

    public zzdoo(int i, int i2) {
        this.maxEntries = i;
        this.zzhlg = i2;
    }

    public final boolean zzb(zzdpb<?> zzdpbVar) {
        this.zzhlh.zzawq();
        zzavx();
        if (this.zzhlf.size() == this.maxEntries) {
            return false;
        }
        this.zzhlf.add(zzdpbVar);
        return true;
    }

    public final zzdpb<?> zzavs() {
        this.zzhlh.zzawq();
        zzavx();
        if (this.zzhlf.isEmpty()) {
            return null;
        }
        zzdpb<?> remove = this.zzhlf.remove();
        if (remove != null) {
            this.zzhlh.zzawr();
        }
        return remove;
    }

    public final int size() {
        zzavx();
        return this.zzhlf.size();
    }

    public final long getCreationTimeMillis() {
        return this.zzhlh.getCreationTimeMillis();
    }

    public final long zzavt() {
        return this.zzhlh.zzavt();
    }

    public final int zzavu() {
        return this.zzhlh.zzavu();
    }

    public final String zzavv() {
        return this.zzhlh.zzawg();
    }

    public final zzdpq zzavw() {
        return this.zzhlh.zzawt();
    }

    private final void zzavx() {
        while (!this.zzhlf.isEmpty()) {
            if (!(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis() - this.zzhlf.getFirst().zzhmu >= ((long) this.zzhlg))) {
                return;
            }
            this.zzhlh.zzaws();
            this.zzhlf.remove();
        }
    }
}
