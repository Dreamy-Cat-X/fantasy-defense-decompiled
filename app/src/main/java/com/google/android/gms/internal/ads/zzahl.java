package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzahl implements zzahv<zzbdh> {
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        zzbdh zzbdhVar2 = zzbdhVar;
        if (zzbdhVar2.zzadw() != null) {
            zzbdhVar2.zzadw().zzms();
        }
        com.google.android.gms.ads.internal.overlay.zze zzade = zzbdhVar2.zzade();
        if (zzade != null) {
            zzade.close();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zze zzadf = zzbdhVar2.zzadf();
        if (zzadf != null) {
            zzadf.close();
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
