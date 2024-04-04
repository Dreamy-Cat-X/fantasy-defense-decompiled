package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzddb implements zzder<Bundle> {
    private final String zzhaq;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    public zzddb(String str) {
        this.zzhaq = str;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        zzdnl.zza(bundle, "omid_v", this.zzhaq);
    }
}
