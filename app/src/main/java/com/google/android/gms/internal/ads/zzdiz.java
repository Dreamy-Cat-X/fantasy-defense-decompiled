package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbqb;
import com.google.android.gms.internal.ads.zzuc;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdiz<R extends zzbqb<AdT>, AdT extends zzbmz> implements zzdjv<R, AdT> {
    private final Executor executor;
    private final zzdjv<R, AdT> zzhdt;
    private final zzdjv<R, zzdjm<AdT>> zzhfc;
    private final zzdpj<AdT> zzhfd;
    private R zzhfe;

    public zzdiz(zzdjv<R, AdT> zzdjvVar, zzdjv<R, zzdjm<AdT>> zzdjvVar2, zzdpj<AdT> zzdpjVar, Executor executor) {
        this.zzhdt = zzdjvVar;
        this.zzhfc = zzdjvVar2;
        this.zzhfd = zzdpjVar;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdjv
    /* renamed from: zzauq, reason: merged with bridge method [inline-methods] */
    public final synchronized R zzaup() {
        return this.zzhfe;
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final synchronized zzdzl<AdT> zza(final zzdka zzdkaVar, final zzdjx<R> zzdjxVar) {
        final zzdjg zzdjgVar;
        zzdmx zzahb = zzdjxVar.zzc(zzdkaVar.zzhgb).zzagd().zzahb();
        zzdjgVar = new zzdjg(zzdjxVar, zzdkaVar, zzahb.zzhjd, zzahb.zzhje, this.executor, zzahb.zzhjh, null);
        return zzdyu.zzg(this.zzhfc.zza(zzdkaVar, zzdjxVar)).zzb(new zzdyj(this, zzdkaVar, zzdjgVar, zzdjxVar) { // from class: com.google.android.gms.internal.ads.zzdjc
            private final zzdiz zzhfh;
            private final zzdka zzhfi;
            private final zzdjg zzhfj;
            private final zzdjx zzhfk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhfh = this;
                this.zzhfi = zzdkaVar;
                this.zzhfj = zzdjgVar;
                this.zzhfk = zzdjxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzhfh.zza(this.zzhfi, this.zzhfj, this.zzhfk, (zzdjm) obj);
            }
        }, this.executor);
    }

    private final zzdzl<AdT> zza(zzdpb<AdT> zzdpbVar, zzdka zzdkaVar, zzdjx<R> zzdjxVar) {
        final zzbqa<R> zzc = zzdjxVar.zzc(zzdkaVar.zzhgb);
        if (zzdpbVar.zzhmt != null) {
            R zzagd = zzc.zzagd();
            if (zzagd.zzahc() != null) {
                zzdpbVar.zzhmt.zzakp().zzb(zzagd.zzahc());
            }
            return zzdyz.zzag(zzdpbVar.zzhmt);
        }
        zzc.zza(zzdpbVar.zzexh);
        zzdzl<AdT> zza = this.zzhdt.zza(zzdkaVar, new zzdjx(zzc) { // from class: com.google.android.gms.internal.ads.zzdjb
            private final zzbqa zzhfg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhfg = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzdjx
            public final zzbqa zzc(zzdjy zzdjyVar) {
                return this.zzhfg;
            }
        });
        this.zzhfe = this.zzhdt.zzaup();
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdjx zzdjxVar, zzdpn zzdpnVar) throws Exception {
        if (zzdpnVar != null && zzdpnVar.zzhfv != null && zzdpnVar.zzhnj != null) {
            zzdjg zzdjgVar = (zzdjg) zzdpnVar.zzhnj;
            zzdpnVar.zzhfv.zzhms.zzakz().zze((zzuc.zzb) ((zzekq) zzuc.zzb.zznm().zza(zzuc.zzb.zza.zznk().zzb(zzuc.zzb.zzc.IN_MEMORY).zza(zzuc.zzb.zzd.zzno())).zzbiz()));
            return zza(zzdpnVar.zzhfv, zzdjgVar.zzhfp, zzdjxVar);
        }
        throw new zzcli(zzdnu.INTERNAL_ERROR, "Empty prefetch");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzdka zzdkaVar, zzdjg zzdjgVar, final zzdjx zzdjxVar, zzdjm zzdjmVar) throws Exception {
        if (zzdjmVar != null) {
            zzdjg zzdjgVar2 = new zzdjg(zzdjgVar.zzhfo, zzdjgVar.zzhfp, zzdjgVar.zzdsi, zzdjgVar.zzbup, zzdjgVar.executor, zzdjgVar.zzgzi, zzdjmVar.zzhfq);
            if (zzdjmVar.zzhfv != null) {
                this.zzhfe = null;
                this.zzhfd.zzb(zzdjgVar2);
                return zza(zzdjmVar.zzhfv, zzdkaVar, zzdjxVar);
            }
            zzdzl<zzdpn<AdT>> zzc = this.zzhfd.zzc(zzdjgVar2);
            if (zzc != null) {
                this.zzhfe = (R) zzdjxVar.zzc(zzdkaVar.zzhgb).zzagd();
                return zzdyz.zzb(zzc, new zzdyj(this, zzdjxVar) { // from class: com.google.android.gms.internal.ads.zzdje
                    private final zzdiz zzhfh;
                    private final zzdjx zzhfm;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzhfh = this;
                        this.zzhfm = zzdjxVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdyj
                    public final zzdzl zzf(Object obj) {
                        return this.zzhfh.zza(this.zzhfm, (zzdpn) obj);
                    }
                }, this.executor);
            }
            this.zzhfd.zzb(zzdjgVar2);
            zzdkaVar = new zzdka(zzdkaVar.zzhgb, zzdjmVar.zzgmy);
        }
        zzdzl<AdT> zza = this.zzhdt.zza(zzdkaVar, zzdjxVar);
        this.zzhfe = this.zzhdt.zzaup();
        return zza;
    }
}
