package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzejr {
    int zzikv;
    int zzikw;
    int zzikx;
    zzejy zziky;
    private boolean zzikz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzejr zzb(byte[] bArr, int i, int i2, boolean z) {
        zzejt zzejtVar = new zzejt(bArr, i, i2, z);
        try {
            zzejtVar.zzgf(i2);
            return zzejtVar;
        } catch (zzeld e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static long zzfg(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zzgh(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double readDouble() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract String readString() throws IOException;

    public abstract int zzbgv() throws IOException;

    public abstract long zzbgw() throws IOException;

    public abstract long zzbgx() throws IOException;

    public abstract int zzbgy() throws IOException;

    public abstract long zzbgz() throws IOException;

    public abstract int zzbha() throws IOException;

    public abstract boolean zzbhb() throws IOException;

    public abstract String zzbhc() throws IOException;

    public abstract zzejg zzbhd() throws IOException;

    public abstract int zzbhe() throws IOException;

    public abstract int zzbhf() throws IOException;

    public abstract int zzbhg() throws IOException;

    public abstract long zzbhh() throws IOException;

    public abstract int zzbhi() throws IOException;

    public abstract long zzbhj() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long zzbhk() throws IOException;

    public abstract boolean zzbhl() throws IOException;

    public abstract int zzbhm();

    public abstract void zzgd(int i) throws zzeld;

    public abstract boolean zzge(int i) throws IOException;

    public abstract int zzgf(int i) throws zzeld;

    public abstract void zzgg(int i);

    private zzejr() {
        this.zzikw = 100;
        this.zzikx = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzikz = false;
    }
}
