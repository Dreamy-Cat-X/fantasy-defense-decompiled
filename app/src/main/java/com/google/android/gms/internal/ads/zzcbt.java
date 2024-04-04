package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcbt {
    public static final zzcbt zzgdl = new zzcbv().zzaop();
    private final zzafo zzgde;
    private final zzafj zzgdf;
    private final zzagc zzgdg;
    private final zzafx zzgdh;
    private final zzajp zzgdi;
    private final SimpleArrayMap<String, zzafu> zzgdj;
    private final SimpleArrayMap<String, zzafp> zzgdk;

    public final zzafo zzaoh() {
        return this.zzgde;
    }

    public final zzafj zzaoi() {
        return this.zzgdf;
    }

    public final zzagc zzaoj() {
        return this.zzgdg;
    }

    public final zzafx zzaok() {
        return this.zzgdh;
    }

    public final zzajp zzaol() {
        return this.zzgdi;
    }

    public final zzafu zzga(String str) {
        return this.zzgdj.get(str);
    }

    public final zzafp zzgb(String str) {
        return this.zzgdk.get(str);
    }

    public final ArrayList<String> zzaom() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzgdg != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzgde != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzgdf != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.zzgdj.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzgdi != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzaon() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzgdj.size());
        for (int i = 0; i < this.zzgdj.size(); i++) {
            arrayList.add(this.zzgdj.keyAt(i));
        }
        return arrayList;
    }

    private zzcbt(zzcbv zzcbvVar) {
        this.zzgde = zzcbvVar.zzgde;
        this.zzgdf = zzcbvVar.zzgdf;
        this.zzgdg = zzcbvVar.zzgdg;
        this.zzgdj = new SimpleArrayMap<>(zzcbvVar.zzgdj);
        this.zzgdk = new SimpleArrayMap<>(zzcbvVar.zzgdk);
        this.zzgdh = zzcbvVar.zzgdh;
        this.zzgdi = zzcbvVar.zzgdi;
    }
}
