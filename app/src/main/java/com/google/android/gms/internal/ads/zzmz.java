package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzmz implements zznc, zznd {
    private final Uri uri;
    private final Handler zzaeq;
    private zzic zzafb;
    private final int zzbdj;
    private final zzmy zzbdk;
    private zznc zzbdl;
    private final zzop zzber;
    private final zzka zzbes;
    private final int zzbet;
    private boolean zzbeu;
    private final String zzbdn = null;
    private final zzie zzaeu = new zzie();

    public zzmz(Uri uri, zzop zzopVar, zzka zzkaVar, int i, Handler handler, zzmy zzmyVar, String str, int i2) {
        this.uri = uri;
        this.zzber = zzopVar;
        this.zzbes = zzkaVar;
        this.zzbdj = i;
        this.zzaeq = handler;
        this.zzbdk = zzmyVar;
        this.zzbet = i2;
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zzhz() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zza(zzhg zzhgVar, boolean z, zznc zzncVar) {
        this.zzbdl = zzncVar;
        zznr zznrVar = new zznr(-9223372036854775807L, false);
        this.zzafb = zznrVar;
        zzncVar.zzb(zznrVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final zznb zza(int i, zzok zzokVar) {
        zzpf.checkArgument(i == 0);
        return new zzmr(this.uri, this.zzber.zzip(), this.zzbes.zzgr(), this.zzbdj, this.zzaeq, this.zzbdk, this, zzokVar, null, this.zzbet);
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zzb(zznb zznbVar) {
        ((zzmr) zznbVar).release();
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zzia() {
        this.zzbdl = null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzb(zzic zzicVar, Object obj) {
        boolean z = zzicVar.zza(0, this.zzaeu, false).zzaim != -9223372036854775807L;
        if (!this.zzbeu || z) {
            this.zzafb = zzicVar;
            this.zzbeu = z;
            this.zzbdl.zzb(zzicVar, null);
        }
    }
}
