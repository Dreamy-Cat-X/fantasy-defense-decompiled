package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdas implements zzder<Bundle> {
    private final zzayt zzdsc;
    private final zzvu zzgzi;

    public zzdas(zzvu zzvuVar, zzayt zzaytVar) {
        this.zzgzi = zzvuVar;
        this.zzdsc = zzaytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        int intValue = ((Integer) zzwo.zzqq().zzd(zzabh.zzcva)).intValue();
        zzayt zzaytVar = this.zzdsc;
        if (zzaytVar != null && zzaytVar.zzegf >= intValue) {
            bundle2.putString("app_open_version", "2");
        }
        zzvu zzvuVar = this.zzgzi;
        if (zzvuVar != null) {
            if (zzvuVar.orientation == 1) {
                bundle2.putString("avo", "p");
            } else if (this.zzgzi.orientation == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
