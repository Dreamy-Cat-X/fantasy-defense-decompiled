package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbv {
    zzafo zzgde;
    zzafj zzgdf;
    zzagc zzgdg;
    zzafx zzgdh;
    zzajp zzgdi;
    final SimpleArrayMap<String, zzafu> zzgdj = new SimpleArrayMap<>();
    final SimpleArrayMap<String, zzafp> zzgdk = new SimpleArrayMap<>();

    public final zzcbv zzb(zzafo zzafoVar) {
        this.zzgde = zzafoVar;
        return this;
    }

    public final zzcbv zzb(zzafj zzafjVar) {
        this.zzgdf = zzafjVar;
        return this;
    }

    public final zzcbv zzb(zzagc zzagcVar) {
        this.zzgdg = zzagcVar;
        return this;
    }

    public final zzcbv zza(zzafx zzafxVar) {
        this.zzgdh = zzafxVar;
        return this;
    }

    public final zzcbv zzb(zzajp zzajpVar) {
        this.zzgdi = zzajpVar;
        return this;
    }

    public final zzcbv zzb(String str, zzafu zzafuVar, zzafp zzafpVar) {
        this.zzgdj.put(str, zzafuVar);
        this.zzgdk.put(str, zzafpVar);
        return this;
    }

    public final zzcbt zzaop() {
        return new zzcbt(this);
    }
}
