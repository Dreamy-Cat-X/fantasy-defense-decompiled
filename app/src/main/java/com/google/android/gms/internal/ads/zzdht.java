package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdht implements com.google.android.gms.ads.internal.overlay.zzp, zzbqw, zzbsl, zzdjw {
    private final zzdok zzhdz;
    private final AtomicReference<zzsm> zzhea = new AtomicReference<>();
    private final AtomicReference<zzsn> zzheb = new AtomicReference<>();
    private final AtomicReference<zzsr> zzhec = new AtomicReference<>();
    private final AtomicReference<zzbsl> zzhed = new AtomicReference<>();
    private final AtomicReference<com.google.android.gms.ads.internal.overlay.zzp> zzhee = new AtomicReference<>();
    private zzdht zzhef = null;

    public zzdht(zzdok zzdokVar) {
        this.zzhdz = zzdokVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onResume() {
    }

    public static zzdht zzb(zzdht zzdhtVar) {
        zzdht zzdhtVar2 = new zzdht(zzdhtVar.zzhdz);
        zzdhtVar2.zzb((zzdjw) zzdhtVar);
        return zzdhtVar2;
    }

    public final void zzb(zzsm zzsmVar) {
        this.zzhea.set(zzsmVar);
    }

    public final void zzb(zzsn zzsnVar) {
        this.zzheb.set(zzsnVar);
    }

    public final void zza(zzsr zzsrVar) {
        this.zzhec.set(zzsrVar);
    }

    public final void zza(zzbsl zzbslVar) {
        this.zzhed.set(zzbslVar);
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzp zzpVar) {
        this.zzhee.set(zzpVar);
    }

    public final void zzb(final zzsh zzshVar) {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdjl.zza(zzdhtVar.zzhea, new zzdjo(zzshVar) { // from class: com.google.android.gms.internal.ads.zzdhw
                    private final zzsh zzheg;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzheg = zzshVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzsm) obj).zza(this.zzheg);
                    }
                });
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(final zzvc zzvcVar) {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdjl.zza(zzdhtVar.zzhea, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzdhv
                    private final zzvc zzfxo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxo = zzvcVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzsm) obj).zza(this.zzfxo);
                    }
                });
                zzdjl.zza(zzdhtVar.zzhea, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzdhy
                    private final zzvc zzfxo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxo = zzvcVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((zzsm) obj).onAppOpenAdFailedToLoad(this.zzfxo.errorCode);
                    }
                });
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    public final void onAdClosed() {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdhtVar.zzhdz.onAdClosed();
                zzdjl.zza(zzdhtVar.zzheb, zzdhx.zzgwi);
                zzdjl.zza(zzdhtVar.zzhec, zzdia.zzgwi);
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzalo() {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdjl.zza(zzdhtVar.zzhed, zzdhz.zzgwi);
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzvn() {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdjl.zza(zzdhtVar.zzhee, zzdic.zzgwi);
                zzdjl.zza(zzdhtVar.zzhec, zzdib.zzgwi);
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zza(final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdjl.zza(zzdhtVar.zzhee, new zzdjo(zzlVar) { // from class: com.google.android.gms.internal.ads.zzdie
                    private final com.google.android.gms.ads.internal.overlay.zzl zzfxu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfxu = zzlVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdjo
                    public final void zzp(Object obj) {
                        ((com.google.android.gms.ads.internal.overlay.zzp) obj).zza(this.zzfxu);
                    }
                });
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void onUserLeaveHint() {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzhef;
            if (zzdhtVar2 == null) {
                zzdjl.zza(zzdhtVar.zzhee, zzdid.zzgwi);
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjw
    public final void zzb(zzdjw zzdjwVar) {
        this.zzhef = (zzdht) zzdjwVar;
    }
}
