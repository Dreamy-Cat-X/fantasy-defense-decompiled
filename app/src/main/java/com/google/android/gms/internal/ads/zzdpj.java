package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmz;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpj<AdT extends zzbmz> {
    private final zzdor zzhft;
    private final zzdok zzhna;
    private zzdpp zzhnb;
    private zzdzt<zzdpb<AdT>> zzhnc;
    private zzdzl<zzdpb<AdT>> zzhnd;
    private final zzdpm<AdT> zzhnf;
    private int zzhne = zzdpo.zzhnk;
    private final zzdza<zzdpb<AdT>> zzhnh = new zzdpk(this);
    private final LinkedList<zzdpp> zzhng = new LinkedList<>();

    public zzdpj(zzdor zzdorVar, zzdok zzdokVar, zzdpm<AdT> zzdpmVar) {
        this.zzhft = zzdorVar;
        this.zzhna = zzdokVar;
        this.zzhnf = zzdpmVar;
        this.zzhna.zza(new zzdon(this) { // from class: com.google.android.gms.internal.ads.zzdpl
            private final zzdpj zzhmz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhmz = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdon
            public final void execute() {
                this.zzhmz.zzawo();
            }
        });
    }

    public final void zzb(zzdpp zzdppVar) {
        this.zzhng.add(zzdppVar);
    }

    public final synchronized zzdzl<zzdpn<AdT>> zzc(zzdpp zzdppVar) {
        if (zzawn()) {
            return null;
        }
        this.zzhne = zzdpo.zzhnm;
        if (this.zzhnb.zzaus() != null && zzdppVar.zzaus() != null && this.zzhnb.zzaus().equals(zzdppVar.zzaus())) {
            this.zzhne = zzdpo.zzhnl;
            return zzdyz.zzb(this.zzhnc, new zzdyj(this) { // from class: com.google.android.gms.internal.ads.zzdpi
                private final zzdpj zzhmz;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhmz = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdyj
                public final zzdzl zzf(Object obj) {
                    return this.zzhmz.zzc((zzdpb) obj);
                }
            }, zzdppVar.getExecutor());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(zzdpp zzdppVar) {
        while (zzawn()) {
            if (zzdppVar == null && this.zzhng.isEmpty()) {
                return;
            }
            if (zzdppVar == null) {
                zzdppVar = this.zzhng.remove();
            }
            if (zzdppVar.zzaus() != null && this.zzhft.zzb(zzdppVar.zzaus())) {
                this.zzhnb = zzdppVar.zzaut();
                this.zzhnc = zzdzt.zzbaj();
                zzdzl<zzdpb<AdT>> zza = this.zzhnf.zza(this.zzhnb);
                this.zzhnd = zza;
                zzdyz.zza(zza, this.zzhnh, zzdppVar.getExecutor());
                return;
            }
            zzdppVar = null;
        }
        if (zzdppVar != null) {
            this.zzhng.add(zzdppVar);
        }
    }

    private final boolean zzawn() {
        zzdzl<zzdpb<AdT>> zzdzlVar = this.zzhnd;
        return zzdzlVar == null || zzdzlVar.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzawo() {
        synchronized (this) {
            zzd(this.zzhnb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzc(zzdpb zzdpbVar) throws Exception {
        zzdzl zzag;
        synchronized (this) {
            zzag = zzdyz.zzag(new zzdpn(zzdpbVar, this.zzhnb));
        }
        return zzag;
    }
}
