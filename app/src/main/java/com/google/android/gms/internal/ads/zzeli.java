package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzeli {
    private static final zzekd zzijx = zzekd.zzbhz();
    private zzejg zziqf;
    private volatile zzemd zziqg;
    private volatile zzejg zziqh;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeli)) {
            return false;
        }
        zzeli zzeliVar = (zzeli) obj;
        zzemd zzemdVar = this.zziqg;
        zzemd zzemdVar2 = zzeliVar.zziqg;
        if (zzemdVar == null && zzemdVar2 == null) {
            return zzbgc().equals(zzeliVar.zzbgc());
        }
        if (zzemdVar != null && zzemdVar2 != null) {
            return zzemdVar.equals(zzemdVar2);
        }
        if (zzemdVar != null) {
            return zzemdVar.equals(zzeliVar.zzm(zzemdVar.zzbit()));
        }
        return zzm(zzemdVar2.zzbit()).equals(zzemdVar2);
    }

    private final zzemd zzm(zzemd zzemdVar) {
        if (this.zziqg == null) {
            synchronized (this) {
                if (this.zziqg == null) {
                    try {
                        this.zziqg = zzemdVar;
                        this.zziqh = zzejg.zzikj;
                    } catch (zzeld unused) {
                        this.zziqg = zzemdVar;
                        this.zziqh = zzejg.zzikj;
                    }
                }
            }
        }
        return this.zziqg;
    }

    public final zzemd zzn(zzemd zzemdVar) {
        zzemd zzemdVar2 = this.zziqg;
        this.zziqf = null;
        this.zziqh = null;
        this.zziqg = zzemdVar;
        return zzemdVar2;
    }

    public final int zzbin() {
        if (this.zziqh != null) {
            return this.zziqh.size();
        }
        if (this.zziqg != null) {
            return this.zziqg.zzbin();
        }
        return 0;
    }

    public final zzejg zzbgc() {
        if (this.zziqh != null) {
            return this.zziqh;
        }
        synchronized (this) {
            if (this.zziqh != null) {
                return this.zziqh;
            }
            if (this.zziqg == null) {
                this.zziqh = zzejg.zzikj;
            } else {
                this.zziqh = this.zziqg.zzbgc();
            }
            return this.zziqh;
        }
    }
}
