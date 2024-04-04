package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbuy extends zzbvk<AppEventListener> implements zzahe {
    public zzbuy(Set<zzbxf<AppEventListener>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final synchronized void onAppEvent(final String str, final String str2) {
        zza(new zzbvm(str, str2) { // from class: com.google.android.gms.internal.ads.zzbux
            private final String zzdhw;
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdhw = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((AppEventListener) obj).onAppEvent(this.zzdjy, this.zzdhw);
            }
        });
    }
}
