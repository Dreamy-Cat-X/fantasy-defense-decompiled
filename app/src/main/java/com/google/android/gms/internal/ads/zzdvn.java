package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdvn extends zzdvk {
    static final zzdvn zzhud = new zzdvn();

    private zzdvn() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final boolean zzc(char c) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final int zza(CharSequence charSequence, int i) {
        zzdwa.zzb(i, charSequence.length(), "index");
        return -1;
    }
}
