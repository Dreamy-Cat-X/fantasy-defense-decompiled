package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdwb extends zzdwd {
    private final /* synthetic */ zzdwc zzhum;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdwb(zzdwc zzdwcVar, zzdvz zzdvzVar, CharSequence charSequence) {
        super(zzdvzVar, charSequence);
        this.zzhum = zzdwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwd
    final int zzeo(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdwd
    final int zzen(int i) {
        return this.zzhum.zzhun.zza(this.zzhuo, i);
    }
}
