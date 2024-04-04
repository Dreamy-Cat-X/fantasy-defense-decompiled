package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdag implements zzder<Bundle> {
    private final String zzacv;
    private final zzvp zzbpe;
    private final float zzbrt;
    private final boolean zzchs;
    private final int zzdoz;
    private final int zzdpa;
    private final String zzgyx;
    private final String zzgyy;
    private final boolean zzgyz;

    public zzdag(zzvp zzvpVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzvpVar, "the adSize must not be null");
        this.zzbpe = zzvpVar;
        this.zzacv = str;
        this.zzchs = z;
        this.zzgyx = str2;
        this.zzbrt = f;
        this.zzdoz = i;
        this.zzdpa = i2;
        this.zzgyy = str3;
        this.zzgyz = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdnl.zza(bundle2, "smart_w", "full", this.zzbpe.width == -1);
        zzdnl.zza(bundle2, "smart_h", "auto", this.zzbpe.height == -2);
        zzdnl.zza(bundle2, "ene", (Boolean) true, this.zzbpe.zzcht);
        zzdnl.zza(bundle2, "rafmt", "102", this.zzbpe.zzchw);
        zzdnl.zza(bundle2, "rafmt", "103", this.zzbpe.zzchx);
        zzdnl.zza(bundle2, "inline_adaptive_slot", (Boolean) true, this.zzgyz);
        zzdnl.zza(bundle2, "format", this.zzacv);
        zzdnl.zza(bundle2, "fluid", "height", this.zzchs);
        zzdnl.zza(bundle2, "sz", this.zzgyx, !TextUtils.isEmpty(r0));
        bundle2.putFloat("u_sd", this.zzbrt);
        bundle2.putInt("sw", this.zzdoz);
        bundle2.putInt("sh", this.zzdpa);
        String str = this.zzgyy;
        zzdnl.zza(bundle2, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (this.zzbpe.zzchr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.zzbpe.height);
            bundle3.putInt("width", this.zzbpe.width);
            bundle3.putBoolean("is_fluid_height", this.zzbpe.zzchs);
            arrayList.add(bundle3);
        } else {
            for (zzvp zzvpVar : this.zzbpe.zzchr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", zzvpVar.zzchs);
                bundle4.putInt("height", zzvpVar.height);
                bundle4.putInt("width", zzvpVar.width);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
