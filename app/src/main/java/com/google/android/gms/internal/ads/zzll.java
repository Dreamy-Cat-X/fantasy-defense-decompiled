package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzll {
    public final zzkg zzasm;
    public final zzlt zzazo = new zzlt();
    public zzlr zzazp;
    public zzlf zzazq;
    public int zzazr;
    public int zzazs;
    public int zzazt;
    public zzkj zzazu;
    public zzlq zzazv;

    public zzll(zzkg zzkgVar) {
        this.zzasm = zzkgVar;
    }

    public final void zza(zzlr zzlrVar, zzlf zzlfVar) {
        this.zzazp = (zzlr) zzpf.checkNotNull(zzlrVar);
        this.zzazq = (zzlf) zzpf.checkNotNull(zzlfVar);
        this.zzasm.zze(zzlrVar.zzahw);
        reset();
    }

    public final void reset() {
        zzlt zzltVar = this.zzazo;
        zzltVar.zzbap = 0;
        zzltVar.zzbbc = 0L;
        zzltVar.zzbaw = false;
        zzltVar.zzbbb = false;
        zzltVar.zzbay = null;
        this.zzazr = 0;
        this.zzazt = 0;
        this.zzazs = 0;
        this.zzazu = null;
        this.zzazv = null;
    }
}
