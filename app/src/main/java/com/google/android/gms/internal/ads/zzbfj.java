package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbfj implements zzepq<WeakReference<Context>> {
    private final zzbfh zzeuh;

    public zzbfj(zzbfh zzbfhVar) {
        this.zzeuh = zzbfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return (WeakReference) zzepw.zza(this.zzeuh.zzafp(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
