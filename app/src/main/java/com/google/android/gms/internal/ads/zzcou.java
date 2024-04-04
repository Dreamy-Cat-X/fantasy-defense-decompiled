package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcou implements zzdre {
    private final zzdrp zzgon;
    private final Map<zzdqz, String> zzgop = new HashMap();
    private final Map<zzdqz, String> zzgoq = new HashMap();

    public zzcou(Set<zzcox> set, zzdrp zzdrpVar) {
        zzdqz zzdqzVar;
        String str;
        zzdqz zzdqzVar2;
        String str2;
        this.zzgon = zzdrpVar;
        for (zzcox zzcoxVar : set) {
            Map<zzdqz, String> map = this.zzgop;
            zzdqzVar = zzcoxVar.zzgki;
            str = zzcoxVar.label;
            map.put(zzdqzVar, str);
            Map<zzdqz, String> map2 = this.zzgoq;
            zzdqzVar2 = zzcoxVar.zzgkj;
            str2 = zzcoxVar.label;
            map2.put(zzdqzVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzb(zzdqz zzdqzVar, String str) {
        zzdrp zzdrpVar = this.zzgon;
        String valueOf = String.valueOf(str);
        zzdrpVar.zzhb(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.zzgop.containsKey(zzdqzVar)) {
            zzdrp zzdrpVar2 = this.zzgon;
            String valueOf2 = String.valueOf(this.zzgop.get(zzdqzVar));
            zzdrpVar2.zzhb(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zza(zzdqz zzdqzVar, String str, Throwable th) {
        zzdrp zzdrpVar = this.zzgon;
        String valueOf = String.valueOf(str);
        zzdrpVar.zzv(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.zzgoq.containsKey(zzdqzVar)) {
            zzdrp zzdrpVar2 = this.zzgon;
            String valueOf2 = String.valueOf(this.zzgoq.get(zzdqzVar));
            zzdrpVar2.zzv(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    public final void zzc(zzdqz zzdqzVar, String str) {
        zzdrp zzdrpVar = this.zzgon;
        String valueOf = String.valueOf(str);
        zzdrpVar.zzv(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.zzgoq.containsKey(zzdqzVar)) {
            zzdrp zzdrpVar2 = this.zzgon;
            String valueOf2 = String.valueOf(this.zzgoq.get(zzdqzVar));
            zzdrpVar2.zzv(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }
}
