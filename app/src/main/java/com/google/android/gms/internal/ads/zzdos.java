package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdos {
    private final zzdov zzhlm = new zzdov();
    private int zzhln;
    private int zzhlo;
    private int zzhlp;
    private int zzhlq;
    private int zzhlr;

    public final void zzawa() {
        this.zzhlp++;
    }

    public final void zzawb() {
        this.zzhlq++;
    }

    public final void zzawc() {
        this.zzhln++;
        this.zzhlm.zzhmg = true;
    }

    public final void zzawd() {
        this.zzhlo++;
        this.zzhlm.zzhmh = true;
    }

    public final void zzawe() {
        this.zzhlr++;
    }

    public final zzdov zzawf() {
        zzdov zzdovVar = (zzdov) this.zzhlm.clone();
        zzdov zzdovVar2 = this.zzhlm;
        zzdovVar2.zzhmg = false;
        zzdovVar2.zzhmh = false;
        return zzdovVar;
    }

    public final String zzawg() {
        return "\n\tPool does not exist: " + this.zzhlp + "\n\tNew pools created: " + this.zzhln + "\n\tPools removed: " + this.zzhlo + "\n\tEntries added: " + this.zzhlr + "\n\tNo entries retrieved: " + this.zzhlq + "\n";
    }
}
