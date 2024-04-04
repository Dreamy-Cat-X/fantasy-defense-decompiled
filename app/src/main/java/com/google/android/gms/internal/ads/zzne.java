package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzne implements zznd {
    private final zznd[] zzbev;
    private final ArrayList<zznd> zzbew;
    private zznc zzbex;
    private zzic zzbey;
    private Object zzbez;
    private zzng zzbfb;
    private final zzid zzaet = new zzid();
    private int zzbfa = -1;

    public zzne(zznd... zzndVarArr) {
        this.zzbev = zzndVarArr;
        this.zzbew = new ArrayList<>(Arrays.asList(zzndVarArr));
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zza(zzhg zzhgVar, boolean z, zznc zzncVar) {
        this.zzbex = zzncVar;
        int i = 0;
        while (true) {
            zznd[] zzndVarArr = this.zzbev;
            if (i >= zzndVarArr.length) {
                return;
            }
            zzndVarArr[i].zza(zzhgVar, false, new zznh(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zzhz() throws IOException {
        zzng zzngVar = this.zzbfb;
        if (zzngVar != null) {
            throw zzngVar;
        }
        for (zznd zzndVar : this.zzbev) {
            zzndVar.zzhz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final zznb zza(int i, zzok zzokVar) {
        int length = this.zzbev.length;
        zznb[] zznbVarArr = new zznb[length];
        for (int i2 = 0; i2 < length; i2++) {
            zznbVarArr[i2] = this.zzbev[i2].zza(i, zzokVar);
        }
        return new zznf(zznbVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zzb(zznb zznbVar) {
        zznf zznfVar = (zznf) zznbVar;
        int i = 0;
        while (true) {
            zznd[] zzndVarArr = this.zzbev;
            if (i >= zzndVarArr.length) {
                return;
            }
            zzndVarArr[i].zzb(zznfVar.zzbfc[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zzia() {
        for (zznd zzndVar : this.zzbev) {
            zzndVar.zzia();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, zzic zzicVar, Object obj) {
        zzng zzngVar;
        if (this.zzbfb == null) {
            int zzff = zzicVar.zzff();
            for (int i2 = 0; i2 < zzff; i2++) {
                zzicVar.zza(i2, this.zzaet, false);
            }
            if (this.zzbfa == -1) {
                this.zzbfa = zzicVar.zzfg();
            } else if (zzicVar.zzfg() != this.zzbfa) {
                zzngVar = new zzng(1);
                this.zzbfb = zzngVar;
            }
            zzngVar = null;
            this.zzbfb = zzngVar;
        }
        if (this.zzbfb != null) {
            return;
        }
        this.zzbew.remove(this.zzbev[i]);
        if (i == 0) {
            this.zzbey = zzicVar;
            this.zzbez = obj;
        }
        if (this.zzbew.isEmpty()) {
            this.zzbex.zzb(this.zzbey, this.zzbez);
        }
    }
}
