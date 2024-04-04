package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbqb;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdiy<R extends zzbqb<AdT>, AdT extends zzbmz> implements zzdjv<R, zzdpb<AdT>> {
    private final Executor executor = zzdzn.zzbai();
    private R zzhfb;

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final zzdzl<zzdpb<AdT>> zza(zzdka zzdkaVar, zzdjx<R> zzdjxVar) {
        zzdzl<zzdmt> zzakx;
        zzbqa<R> zzc = zzdjxVar.zzc(zzdkaVar.zzhgb);
        zzc.zza(new zzdkd(true));
        R zzagd = zzc.zzagd();
        this.zzhfb = zzagd;
        final zzbnw zzagu = zzagd.zzagu();
        final zzdpb zzdpbVar = new zzdpb();
        if (zzdkaVar.zzhga != null) {
            zzakx = zzagu.zza(zzdkaVar.zzhga);
        } else {
            zzakx = zzagu.zzakx();
        }
        return zzdyu.zzg(zzakx).zzb(new zzdyj(this, zzdpbVar, zzagu) { // from class: com.google.android.gms.internal.ads.zzdix
            private final zzdiy zzhey;
            private final zzdpb zzhez;
            private final zzbnw zzhfa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhey = this;
                this.zzhez = zzdpbVar;
                this.zzhfa = zzagu;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                zzdpb zzdpbVar2 = this.zzhez;
                zzbnw zzbnwVar = this.zzhfa;
                zzdmt zzdmtVar = (zzdmt) obj;
                zzdpbVar2.zzexh = zzdmtVar;
                Iterator<zzdmi> it = zzdmtVar.zzhiz.zzhiw.iterator();
                boolean z = false;
                boolean z2 = false;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    Iterator<String> it2 = it.next().zzhhk.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z2 = true;
                    }
                }
                if (!z) {
                    return zzdyz.zzag(null);
                }
                return zzbnwVar.zzb(zzdyz.zzag(zzdmtVar));
            }
        }, this.executor).zza(new zzdvo(zzdpbVar) { // from class: com.google.android.gms.internal.ads.zzdja
            private final zzdpb zzhff;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhff = zzdpbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                zzdpb zzdpbVar2 = this.zzhff;
                zzdpbVar2.zzhmt = (AdT) obj;
                return zzdpbVar2;
            }
        }, this.executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdjv
    public final /* synthetic */ Object zzaup() {
        return this.zzhfb;
    }
}
