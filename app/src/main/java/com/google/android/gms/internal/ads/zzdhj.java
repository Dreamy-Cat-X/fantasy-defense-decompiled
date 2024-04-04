package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdhj implements zzcyl<zzbki> {
    private final /* synthetic */ zzdhf zzhdp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhj(zzdhf zzdhfVar) {
        this.zzhdp = zzdhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void zzask() {
        this.zzhdp.zzhdk = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        if (r0.zzegf < ((java.lang.Integer) com.google.android.gms.internal.ads.zzwo.zzqq().zzd(com.google.android.gms.internal.ads.zzabh.zzcuz)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzcyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void onSuccess(zzbki zzbkiVar) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        com.google.android.gms.ads.internal.overlay.zzr zza;
        RelativeLayout.LayoutParams zzb;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        zzvp zzaue;
        ViewGroup viewGroup5;
        zzvp zzaue2;
        zzdht zzdhtVar;
        zzayt zzaytVar;
        zzbki zzbkiVar2 = zzbkiVar;
        if (this.zzhdp.zzhdk != null) {
            this.zzhdp.zzhdk.destroy();
        }
        this.zzhdp.zzhdk = zzbkiVar2;
        viewGroup = this.zzhdp.zzfsr;
        viewGroup.removeAllViews();
        viewGroup2 = this.zzhdp.zzfsr;
        viewGroup2.addView(zzbkiVar2.zzajo(), com.google.android.gms.ads.internal.zzp.zzks().zzzb());
        if (!zzbkiVar2.zzajf()) {
            zzaytVar = this.zzhdp.zzbos;
        }
        zza = this.zzhdp.zza(zzbkiVar2);
        zzb = zzdhf.zzb(zzbkiVar2);
        zza.zzal(zzbkiVar2.zzajp() && !zzbkiVar2.zzajg());
        viewGroup3 = this.zzhdp.zzfsr;
        viewGroup3.addView(zza, zzb);
        this.zzhdp.zzc(zzbkiVar2);
        viewGroup4 = this.zzhdp.zzfsr;
        zzaue = this.zzhdp.zzaue();
        viewGroup4.setMinimumHeight(zzaue.heightPixels);
        viewGroup5 = this.zzhdp.zzfsr;
        zzaue2 = this.zzhdp.zzaue();
        viewGroup5.setMinimumWidth(zzaue2.widthPixels);
        zzdhtVar = this.zzhdp.zzhdh;
        zzdhtVar.zzb(new zzbkx(zzbkiVar2, this.zzhdp));
        zzbkiVar2.zzajy();
    }
}
