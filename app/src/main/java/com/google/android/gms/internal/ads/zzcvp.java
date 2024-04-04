package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbrz;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcvp<AdT, AdapterT, ListenerT extends zzbrz> implements zzcqq<AdT> {
    private final zzcqv<AdapterT, ListenerT> zzfop;
    private final zzdqy zzfvf;
    private final zzcqy<AdT, AdapterT, ListenerT> zzgup;
    private final zzdzk zzguq;

    public zzcvp(zzdqy zzdqyVar, zzdzk zzdzkVar, zzcqv<AdapterT, ListenerT> zzcqvVar, zzcqy<AdT, AdapterT, ListenerT> zzcqyVar) {
        this.zzfvf = zzdqyVar;
        this.zzguq = zzdzkVar;
        this.zzgup = zzcqyVar;
        this.zzfop = zzcqvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return !zzdmiVar.zzhhu.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<AdT> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        final zzcqs<AdapterT, ListenerT> zzcqsVar;
        Iterator<String> it = zzdmiVar.zzhhu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcqsVar = null;
                break;
            }
            try {
                zzcqsVar = this.zzfop.zzf(it.next(), zzdmiVar.zzhhw);
                break;
            } catch (zzdnf unused) {
            }
        }
        if (zzcqsVar == null) {
            return zzdyz.immediateFailedFuture(new zzctt("unable to instantiate mediation adapter class"));
        }
        zzazc zzazcVar = new zzazc();
        zzcqsVar.zzgrc.zza(new zzcvq(this, zzcqsVar, zzazcVar));
        if (zzdmiVar.zzdvy) {
            Bundle bundle = zzdmtVar.zzhiy.zzfve.zzhjd.zzche;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.zzfvf.zzt(zzdqz.ADAPTER_LOAD_AD_SYN).zza(new zzdqi(this, zzdmtVar, zzdmiVar, zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcvo
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcqs zzgud;
            private final zzcvp zzguo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguo = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
                this.zzgud = zzcqsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqi
            public final void run() {
                this.zzguo.zzd(this.zzggd, this.zzfti, this.zzgud);
            }
        }, this.zzguq).zzv(zzdqz.ADAPTER_LOAD_AD_ACK).zze(zzazcVar).zzv(zzdqz.ADAPTER_WRAP_ADAPTER).zzb(new zzdqj(this, zzdmtVar, zzdmiVar, zzcqsVar) { // from class: com.google.android.gms.internal.ads.zzcvr
            private final zzdmi zzfti;
            private final zzdmt zzggd;
            private final zzcqs zzgud;
            private final zzcvp zzguo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguo = this;
                this.zzggd = zzdmtVar;
                this.zzfti = zzdmiVar;
                this.zzgud = zzcqsVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final Object apply(Object obj) {
                return this.zzguo.zza(this.zzggd, this.zzfti, this.zzgud, (Void) obj);
            }
        }).zzaxm();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs zzcqsVar, Void r4) throws Exception {
        return this.zzgup.zzb(zzdmtVar, zzdmiVar, zzcqsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdmt zzdmtVar, zzdmi zzdmiVar, zzcqs zzcqsVar) throws Exception {
        this.zzgup.zza(zzdmtVar, zzdmiVar, zzcqsVar);
    }
}
