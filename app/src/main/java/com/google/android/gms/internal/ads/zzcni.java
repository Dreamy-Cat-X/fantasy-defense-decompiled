package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcni {
    private final zzdzk zzgfs;
    private final zzepk<zzcns> zzgmb;
    private final zzcmz zzgno;

    public zzcni(zzdzk zzdzkVar, zzcmz zzcmzVar, zzepk<zzcns> zzepkVar) {
        this.zzgfs = zzdzkVar;
        this.zzgno = zzcmzVar;
        this.zzgmb = zzepkVar;
    }

    private final <RetT> zzdzl<RetT> zza(final zzasu zzasuVar, zzcnt<InputStream> zzcntVar, final zzcnt<InputStream> zzcntVar2, final zzdyj<InputStream, RetT> zzdyjVar) {
        zzdzl zzb;
        String str = zzasuVar.packageName;
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (com.google.android.gms.ads.internal.util.zzm.zzek(str)) {
            zzb = zzdyz.immediateFailedFuture(new zzcnj(zzdnu.INTERNAL_ERROR));
        } else {
            zzb = zzdyz.zzb(zzcntVar.zzq(zzasuVar), ExecutionException.class, zzcnl.zzbon, this.zzgfs);
        }
        return zzdyu.zzg(zzb).zzb(zzdyjVar, this.zzgfs).zza(zzcnj.class, new zzdyj(this, zzcntVar2, zzasuVar, zzdyjVar) { // from class: com.google.android.gms.internal.ads.zzcnk
            private final zzcni zzgnp;
            private final zzcnt zzgnq;
            private final zzasu zzgnr;
            private final zzdyj zzgns;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnp = this;
                this.zzgnq = zzcntVar2;
                this.zzgnr = zzasuVar;
                this.zzgns = zzdyjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgnp.zza(this.zzgnq, this.zzgnr, this.zzgns, (zzcnj) obj);
            }
        }, this.zzgfs);
    }

    public final zzdzl<zzasu> zzl(final zzasu zzasuVar) {
        zzdyj zzdyjVar = new zzdyj(zzasuVar) { // from class: com.google.android.gms.internal.ads.zzcnn
            private final zzasu zzfxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxz = zzasuVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                zzasu zzasuVar2 = this.zzfxz;
                zzasuVar2.zzdvq = new String(zzdxr.toByteArray((InputStream) obj), zzdvm.UTF_8);
                return zzdyz.zzag(zzasuVar2);
            }
        };
        zzcmz zzcmzVar = this.zzgno;
        zzcmzVar.getClass();
        return zza(zzasuVar, zzcnm.zza(zzcmzVar), new zzcnt(this) { // from class: com.google.android.gms.internal.ads.zzcnp
            private final zzcni zzgnp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcnt
            public final zzdzl zzq(zzasu zzasuVar2) {
                return this.zzgnp.zzp(zzasuVar2);
            }
        }, zzdyjVar);
    }

    public final zzdzl<Void> zzm(zzasu zzasuVar) {
        if (zzfi.zzar(zzasuVar.zzdvq)) {
            return zzdyz.immediateFailedFuture(new zzcli(zzdnu.INVALID_REQUEST, "Pool key missing from removeUrl call."));
        }
        return zza(zzasuVar, new zzcnt(this) { // from class: com.google.android.gms.internal.ads.zzcnr
            private final zzcni zzgnp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcnt
            public final zzdzl zzq(zzasu zzasuVar2) {
                return this.zzgnp.zzo(zzasuVar2);
            }
        }, new zzcnt(this) { // from class: com.google.android.gms.internal.ads.zzcnq
            private final zzcni zzgnp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcnt
            public final zzdzl zzq(zzasu zzasuVar2) {
                return this.zzgnp.zzn(zzasuVar2);
            }
        }, zzcno.zzbon);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzn(zzasu zzasuVar) {
        return this.zzgmb.get().zzgj(zzasuVar.zzdvq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzo(zzasu zzasuVar) {
        return this.zzgno.zzgi(zzasuVar.zzdvq);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zzp(zzasu zzasuVar) {
        return this.zzgmb.get().zzc(zzasuVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(zzcnt zzcntVar, zzasu zzasuVar, zzdyj zzdyjVar, zzcnj zzcnjVar) throws Exception {
        return zzdyz.zzb(zzcntVar.zzq(zzasuVar), zzdyjVar, this.zzgfs);
    }
}
