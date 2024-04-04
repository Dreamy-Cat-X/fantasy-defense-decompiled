package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdgr {
    private final zzasu zzgmy;
    private final int zzgok;

    public zzdgr(zzasu zzasuVar, int i) {
        this.zzgmy = zzasuVar;
        this.zzgok = i;
    }

    public final String zzatx() {
        return this.zzgmy.packageName;
    }

    public final String zzaty() {
        return this.zzgmy.zzdvn.getString("ms");
    }

    public final PackageInfo zzatz() {
        return this.zzgmy.zzdsj;
    }

    public final List<String> zzaua() {
        return this.zzgmy.zzdst;
    }

    public final String zzaub() {
        return this.zzgmy.zzdvo;
    }

    public final int zzauc() {
        return this.zzgok;
    }
}
