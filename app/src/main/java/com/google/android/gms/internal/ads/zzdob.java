package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdob implements zzaxy, zzbqw {
    private final Context context;
    private final zzayc zzeaa;
    private final HashSet<zzaxr> zzhks = new HashSet<>();

    public zzdob(Context context, zzayc zzaycVar) {
        this.context = context;
        this.zzeaa = zzaycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final synchronized void zzd(zzvc zzvcVar) {
        if (zzvcVar.errorCode != 3) {
            this.zzeaa.zzb(this.zzhks);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final synchronized void zza(HashSet<zzaxr> hashSet) {
        this.zzhks.clear();
        this.zzhks.addAll(hashSet);
    }

    public final Bundle zzavp() {
        return this.zzeaa.zza(this.context, this);
    }
}
