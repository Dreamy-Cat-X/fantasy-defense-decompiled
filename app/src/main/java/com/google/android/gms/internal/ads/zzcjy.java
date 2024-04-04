package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcjy implements zzdre {
    private final Clock zzbpw;
    private final zzcjs zzgke;
    private final Map<zzdqz, Long> zzgkd = new HashMap();
    private final Map<zzdqz, zzckb> zzgkf = new HashMap();

    public zzcjy(zzcjs zzcjsVar, Set<zzckb> set, Clock clock) {
        zzdqz zzdqzVar;
        this.zzgke = zzcjsVar;
        for (zzckb zzckbVar : set) {
            Map<zzdqz, zzckb> map = this.zzgkf;
            zzdqzVar = zzckbVar.zzgkj;
            map.put(zzdqzVar, zzckbVar);
        }
        this.zzbpw = clock;
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzb(zzdqz zzdqzVar, String str) {
        this.zzgkd.put(zzdqzVar, Long.valueOf(this.zzbpw.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str, Throwable th) {
        if (this.zzgkd.containsKey(zzdqzVar)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgkd.get(zzdqzVar).longValue();
            Map<String, String> zzsq = this.zzgke.zzsq();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzsq.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzgkf.containsKey(zzdqzVar)) {
            zza(zzdqzVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzc(zzdqz zzdqzVar, String str) {
        if (this.zzgkd.containsKey(zzdqzVar)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgkd.get(zzdqzVar).longValue();
            Map<String, String> zzsq = this.zzgke.zzsq();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzsq.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzgkf.containsKey(zzdqzVar)) {
            zza(zzdqzVar, true);
        }
    }

    private final void zza(zzdqz zzdqzVar, boolean z) {
        zzdqz zzdqzVar2;
        String str;
        zzdqzVar2 = this.zzgkf.get(zzdqzVar).zzgki;
        String str2 = z ? "s." : "f.";
        if (this.zzgkd.containsKey(zzdqzVar2)) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime() - this.zzgkd.get(zzdqzVar2).longValue();
            Map<String, String> zzsq = this.zzgke.zzsq();
            str = this.zzgkf.get(zzdqzVar).label;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzsq.put(concat, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }
}
