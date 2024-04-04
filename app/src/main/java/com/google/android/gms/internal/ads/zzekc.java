package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzekc implements zzeon {
    private final zzeka zziko;

    public static zzekc zza(zzeka zzekaVar) {
        if (zzekaVar.zziln != null) {
            return zzekaVar.zziln;
        }
        return new zzekc(zzekaVar);
    }

    private zzekc(zzeka zzekaVar) {
        zzeka zzekaVar2 = (zzeka) zzeks.zza(zzekaVar, "output");
        this.zziko = zzekaVar2;
        zzekaVar2.zziln = this;
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final int zzbhy() {
        return zzeom.zzivr;
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzam(int i, int i2) throws IOException {
        this.zziko.zzaf(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzq(int i, long j) throws IOException {
        this.zziko.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzr(int i, long j) throws IOException {
        this.zziko.zzk(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zza(int i, float f) throws IOException {
        this.zziko.zza(i, f);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzb(int i, double d) throws IOException {
        this.zziko.zzb(i, d);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzan(int i, int i2) throws IOException {
        this.zziko.zzac(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzi(int i, long j) throws IOException {
        this.zziko.zzi(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzac(int i, int i2) throws IOException {
        this.zziko.zzac(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzk(int i, long j) throws IOException {
        this.zziko.zzk(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzaf(int i, int i2) throws IOException {
        this.zziko.zzaf(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzh(int i, boolean z) throws IOException {
        this.zziko.zzh(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzi(int i, String str) throws IOException {
        this.zziko.zzi(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zza(int i, zzejg zzejgVar) throws IOException {
        this.zziko.zza(i, zzejgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzad(int i, int i2) throws IOException {
        this.zziko.zzad(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzae(int i, int i2) throws IOException {
        this.zziko.zzae(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzj(int i, long j) throws IOException {
        this.zziko.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zza(int i, Object obj, zzemy zzemyVar) throws IOException {
        this.zziko.zza(i, (zzemd) obj, zzemyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzb(int i, Object obj, zzemy zzemyVar) throws IOException {
        zzeka zzekaVar = this.zziko;
        zzekaVar.writeTag(i, 3);
        zzemyVar.zza((zzemd) obj, zzekaVar.zziln);
        zzekaVar.writeTag(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzhe(int i) throws IOException {
        this.zziko.writeTag(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzhf(int i) throws IOException {
        this.zziko.writeTag(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzc(int i, Object obj) throws IOException {
        if (obj instanceof zzejg) {
            this.zziko.zzb(i, (zzejg) obj);
        } else {
            this.zziko.zza(i, (zzemd) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzgw(list.get(i4).intValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzgr(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzac(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzgz(list.get(i4).intValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzgu(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzaf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzfk(list.get(i4).longValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzfh(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzi(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzfl(list.get(i4).longValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzfh(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzi(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzfn(list.get(i4).longValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzfj(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzk(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzg(list.get(i4).floatValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzf(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzd(list.get(i4).doubleValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzc(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzb(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzhb(list.get(i4).intValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzgr(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzac(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzbr(list.get(i4).booleanValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzbq(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzh(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzelk) {
            zzelk zzelkVar = (zzelk) list;
            while (i2 < list.size()) {
                Object zzhj = zzelkVar.zzhj(i2);
                if (zzhj instanceof String) {
                    this.zziko.zzi(i, (String) zzhj);
                } else {
                    this.zziko.zza(i, (zzejg) zzhj);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzi(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzb(int i, List<zzejg> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zziko.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzgx(list.get(i4).intValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzgs(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzad(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzha(list.get(i4).intValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzgu(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzaf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzfo(list.get(i4).longValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzfj(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzk(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzgy(list.get(i4).intValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzgt(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzae(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zziko.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzeka.zzfm(list.get(i4).longValue());
            }
            this.zziko.zzgs(i3);
            while (i2 < list.size()) {
                this.zziko.zzfi(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zziko.zzj(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zza(int i, List<?> list, zzemy zzemyVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzemyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final void zzb(int i, List<?> list, zzemy zzemyVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzemyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeon
    public final <K, V> void zza(int i, zzelu<K, V> zzeluVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zziko.writeTag(i, 2);
            this.zziko.zzgs(zzelv.zza(zzeluVar, entry.getKey(), entry.getValue()));
            zzelv.zza(this.zziko, zzeluVar, entry.getKey(), entry.getValue());
        }
    }
}
