package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbew {
    public final int heightPixels;
    private final int type;
    public final int widthPixels;

    public static zzbew zzb(zzvp zzvpVar) {
        if (zzvpVar.zzchq) {
            return new zzbew(3, 0, 0);
        }
        if (zzvpVar.zzchs) {
            return new zzbew(2, 0, 0);
        }
        if (zzvpVar.zzbrh) {
            return zzaej();
        }
        return zzq(zzvpVar.widthPixels, zzvpVar.heightPixels);
    }

    public static zzbew zzaej() {
        return new zzbew(0, 0, 0);
    }

    public static zzbew zzq(int i, int i2) {
        return new zzbew(1, i, i2);
    }

    public static zzbew zzaek() {
        return new zzbew(4, 0, 0);
    }

    public static zzbew zzael() {
        return new zzbew(5, 0, 0);
    }

    private zzbew(int i, int i2, int i3) {
        this.type = i;
        this.widthPixels = i2;
        this.heightPixels = i3;
    }

    public final boolean isFluid() {
        return this.type == 2;
    }

    public final boolean zzaem() {
        return this.type == 3;
    }

    public final boolean zzaen() {
        return this.type == 0;
    }

    public final boolean zzaeo() {
        return this.type == 4;
    }

    public final boolean zzaep() {
        return this.type == 5;
    }
}
