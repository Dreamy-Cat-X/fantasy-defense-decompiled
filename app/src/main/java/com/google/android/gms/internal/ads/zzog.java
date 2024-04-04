package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzog {
    private zzoj zzbhs;

    public abstract zzoi zza(zzia[] zziaVarArr, zznt zzntVar) throws zzhd;

    public abstract void zzd(Object obj);

    public final void zza(zzoj zzojVar) {
        this.zzbhs = zzojVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void invalidate() {
        zzoj zzojVar = this.zzbhs;
        if (zzojVar != null) {
            zzojVar.zzep();
        }
    }
}
