package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdqq<O> {
    private final E zzhof;
    private final String zzhog;
    private final List<zzdzl<?>> zzhoi;
    final /* synthetic */ zzdqk zzhoj;
    private final zzdzl<?> zzhok;
    private final zzdzl<O> zzhol;

    private zzdqq(zzdqk zzdqkVar, E e, String str, zzdzl<?> zzdzlVar, List<zzdzl<?>> list, zzdzl<O> zzdzlVar2) {
        this.zzhoj = zzdqkVar;
        this.zzhof = e;
        this.zzhog = str;
        this.zzhok = zzdzlVar;
        this.zzhoi = list;
        this.zzhol = zzdzlVar2;
    }

    public final zzdqq<O> zzgw(String str) {
        return new zzdqq<>(this.zzhoj, this.zzhof, str, this.zzhok, this.zzhoi, this.zzhol);
    }

    public final <O2> zzdqq<O2> zzb(final zzdqj<O, O2> zzdqjVar) {
        return zza(new zzdyj(zzdqjVar) { // from class: com.google.android.gms.internal.ads.zzdqt
            private final zzdqj zzhon;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhon = zzdqjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return zzdyz.zzag(this.zzhon.apply(obj));
            }
        });
    }

    public final <O2> zzdqq<O2> zza(zzdyj<O, O2> zzdyjVar) {
        return zza(zzdyjVar, zzdqk.zza(this.zzhoj));
    }

    private final <O2> zzdqq<O2> zza(zzdyj<O, O2> zzdyjVar, Executor executor) {
        return new zzdqq<>(this.zzhoj, this.zzhof, this.zzhog, this.zzhok, this.zzhoi, zzdyz.zzb(this.zzhol, zzdyjVar, executor));
    }

    public final <O2> zzdqq<O2> zze(final zzdzl<O2> zzdzlVar) {
        return zza(new zzdyj(zzdzlVar) { // from class: com.google.android.gms.internal.ads.zzdqs
            private final zzdzl zzggn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggn = zzdzlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzggn;
            }
        }, zzayv.zzegn);
    }

    public final <T extends Throwable> zzdqq<O> zza(Class<T> cls, final zzdqj<T, O> zzdqjVar) {
        return zza(cls, new zzdyj(zzdqjVar) { // from class: com.google.android.gms.internal.ads.zzdqv
            private final zzdqj zzhon;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhon = zzdqjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return zzdyz.zzag(this.zzhon.apply((Throwable) obj));
            }
        });
    }

    public final <T extends Throwable> zzdqq<O> zza(Class<T> cls, zzdyj<T, O> zzdyjVar) {
        zzdqk zzdqkVar = this.zzhoj;
        return new zzdqq<>(zzdqkVar, this.zzhof, this.zzhog, this.zzhok, this.zzhoi, zzdyz.zzb(this.zzhol, cls, zzdyjVar, zzdqk.zza(zzdqkVar)));
    }

    public final zzdqq<O> zza(long j, TimeUnit timeUnit) {
        zzdqk zzdqkVar = this.zzhoj;
        return new zzdqq<>(zzdqkVar, this.zzhof, this.zzhog, this.zzhok, this.zzhoi, zzdyz.zza(this.zzhol, j, timeUnit, zzdqk.zzb(zzdqkVar)));
    }

    public final zzdql<E, O> zzaxm() {
        E e = this.zzhof;
        String str = this.zzhog;
        if (str == null) {
            str = this.zzhoj.zzu(e);
        }
        final zzdql<E, O> zzdqlVar = new zzdql<>(e, str, this.zzhol);
        zzdqk.zzc(this.zzhoj).zza(zzdqlVar);
        this.zzhok.addListener(new Runnable(this, zzdqlVar) { // from class: com.google.android.gms.internal.ads.zzdqu
            private final zzdqq zzhoo;
            private final zzdql zzhop;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhoo = this;
                this.zzhop = zzdqlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdqq zzdqqVar = this.zzhoo;
                zzdqk.zzc(zzdqqVar.zzhoj).zzb(this.zzhop);
            }
        }, zzayv.zzegn);
        zzdyz.zza(zzdqlVar, new zzdqx(this, zzdqlVar), zzayv.zzegn);
        return zzdqlVar;
    }

    public final zzdqq<O> zzv(E e) {
        return this.zzhoj.zza((zzdqk) e, (zzdzl) zzaxm());
    }
}
