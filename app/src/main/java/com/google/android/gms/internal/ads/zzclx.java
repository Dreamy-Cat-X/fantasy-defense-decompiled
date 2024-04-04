package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzclx implements zzepq<ApplicationInfo> {
    private final zzeqd<Context> zzeuo;

    private zzclx(zzeqd<Context> zzeqdVar) {
        this.zzeuo = zzeqdVar;
    }

    public static zzclx zzab(zzeqd<Context> zzeqdVar) {
        return new zzclx(zzeqdVar);
    }

    public static ApplicationInfo zzch(Context context) {
        return (ApplicationInfo) zzepw.zza(context.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return zzch(this.zzeuo.get());
    }
}
