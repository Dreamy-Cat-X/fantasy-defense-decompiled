package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzccy implements zzahv {
    static final zzahv zzdfy = new zzccy();

    private zzccy() {
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zzd.zzdy("Show native ad policy validator overlay.");
        ((zzbdh) obj).getView().setVisibility(0);
    }
}
