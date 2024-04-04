package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzens extends zzenq<zzent, zzent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final boolean zza(zzems zzemsVar) {
        return false;
    }

    private static void zza(Object obj, zzent zzentVar) {
        ((zzekq) obj).zziou = zzentVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final void zzak(Object obj) {
        ((zzekq) obj).zziou.zzbgi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ int zzau(zzent zzentVar) {
        return zzentVar.zzbin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ int zzba(zzent zzentVar) {
        return zzentVar.zzble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ zzent zzk(zzent zzentVar, zzent zzentVar2) {
        zzent zzentVar3 = zzentVar;
        zzent zzentVar4 = zzentVar2;
        return zzentVar4.equals(zzent.zzblc()) ? zzentVar3 : zzent.zza(zzentVar3, zzentVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ void zzc(zzent zzentVar, zzeon zzeonVar) throws IOException {
        zzentVar.zza(zzeonVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ void zza(zzent zzentVar, zzeon zzeonVar) throws IOException {
        zzentVar.zzb(zzeonVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ void zzj(Object obj, zzent zzentVar) {
        zza(obj, zzentVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ zzent zzaz(Object obj) {
        zzent zzentVar = ((zzekq) obj).zziou;
        if (zzentVar != zzent.zzblc()) {
            return zzentVar;
        }
        zzent zzbld = zzent.zzbld();
        zza(obj, zzbld);
        return zzbld;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ zzent zzay(Object obj) {
        return ((zzekq) obj).zziou;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ void zzi(Object obj, zzent zzentVar) {
        zza(obj, zzentVar);
    }

    @Override // com.google.android.gms.internal.ads.zzenq
    final /* synthetic */ zzent zzaq(zzent zzentVar) {
        zzent zzentVar2 = zzentVar;
        zzentVar2.zzbgi();
        return zzentVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ zzent zzblb() {
        return zzent.zzbld();
    }

    @Override // com.google.android.gms.internal.ads.zzenq
    final /* synthetic */ void zza(zzent zzentVar, int i, zzent zzentVar2) {
        zzentVar.zzd((i << 3) | 3, zzentVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ void zza(zzent zzentVar, int i, zzejg zzejgVar) {
        zzentVar.zzd((i << 3) | 2, zzejgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzenq
    final /* synthetic */ void zzb(zzent zzentVar, int i, long j) {
        zzentVar.zzd((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzenq
    final /* synthetic */ void zzc(zzent zzentVar, int i, int i2) {
        zzentVar.zzd((i << 3) | 5, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzenq
    public final /* synthetic */ void zza(zzent zzentVar, int i, long j) {
        zzentVar.zzd(i << 3, Long.valueOf(j));
    }
}
