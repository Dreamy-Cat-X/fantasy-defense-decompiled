package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzaca extends zzacb {
    private final com.google.android.gms.ads.internal.zzg zzdan;
    private final String zzdao;
    private final String zzdap;

    public zzaca(com.google.android.gms.ads.internal.zzg zzgVar, String str, String str2) {
        this.zzdan = zzgVar;
        this.zzdao = str;
        this.zzdap = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String zzsr() {
        return this.zzdao;
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String getContent() {
        return this.zzdap;
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void zzn(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zzdan.zzh((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void recordClick() {
        this.zzdan.zzkb();
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void recordImpression() {
        this.zzdan.zzkc();
    }
}
