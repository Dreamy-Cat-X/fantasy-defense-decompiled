package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzalo implements zzaka, zzall {
    private final zzalm zzdjd;
    private final HashSet<AbstractMap.SimpleEntry<String, zzahv<? super zzalm>>> zzdje = new HashSet<>();

    public zzalo(zzalm zzalmVar) {
        this.zzdjd = zzalmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, Map map) {
        zzajz.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzaka, com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, JSONObject jSONObject) {
        zzajz.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzb(String str, JSONObject jSONObject) {
        zzajz.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzi(String str, String str2) {
        zzajz.zza(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzaka, com.google.android.gms.internal.ads.zzakl
    public final void zzcv(String str) {
        this.zzdjd.zzcv(str);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(String str, zzahv<? super zzalm> zzahvVar) {
        this.zzdjd.zza(str, zzahvVar);
        this.zzdje.add(new AbstractMap.SimpleEntry<>(str, zzahvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(String str, zzahv<? super zzalm> zzahvVar) {
        this.zzdjd.zzb(str, zzahvVar);
        this.zzdje.remove(new AbstractMap.SimpleEntry(str, zzahvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzall
    public final void zzup() {
        Iterator<AbstractMap.SimpleEntry<String, zzahv<? super zzalm>>> it = this.zzdje.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzahv<? super zzalm>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.zzdjd.zzb(next.getKey(), next.getValue());
        }
        this.zzdje.clear();
    }
}
