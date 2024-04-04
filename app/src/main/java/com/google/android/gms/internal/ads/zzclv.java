package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzclv implements zzepq<zzdzl<String>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdqy> zzftq;

    private zzclv(zzeqd<zzdqy> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        this.zzftq = zzeqdVar;
        this.zzeuo = zzeqdVar2;
    }

    public static zzclv zzaj(zzeqd<zzdqy> zzeqdVar, zzeqd<Context> zzeqdVar2) {
        return new zzclv(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzdqy zzdqyVar = this.zzftq.get();
        final CookieManager zzbg = com.google.android.gms.ads.internal.zzp.zzks().zzbg(this.zzeuo.get());
        return (zzdzl) zzepw.zza(zzdqyVar.zzt(zzdqz.WEBVIEW_COOKIE).zzc(new Callable(zzbg) { // from class: com.google.android.gms.internal.ads.zzclr
            private final CookieManager zzgmg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmg = zzbg;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.zzgmg;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzwo.zzqq().zzd(zzabh.zzcon));
            }
        }).zza(1L, TimeUnit.SECONDS).zza(Exception.class, zzclq.zzgmf).zzaxm(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
