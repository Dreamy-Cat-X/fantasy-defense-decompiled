package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbsf extends zzbvk<AdMetadataListener> implements zzahc {
    private Bundle zzfxt;

    public zzbsf(Set<zzbxf<AdMetadataListener>> set) {
        super(set);
        this.zzfxt = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzfxt.putAll(bundle);
        zza(zzbsi.zzfxn);
    }

    public final synchronized Bundle getAdMetadata() {
        return new Bundle(this.zzfxt);
    }
}
