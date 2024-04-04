package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbir implements zzbil {
    private final CookieManager zzfpj;

    public zzbir(Context context) {
        this.zzfpj = com.google.android.gms.ads.internal.zzp.zzks().zzbg(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbil
    public final void zzm(Map<String, String> map) {
        Object next;
        if (this.zzfpj == null) {
            return;
        }
        if (map.get("clear") != null) {
            String str = (String) zzwo.zzqq().zzd(zzabh.zzcon);
            String cookie = this.zzfpj.getCookie(str);
            if (cookie != null) {
                List<String> zzc = zzdvz.zza(zzdvj.zzb(';')).zzc(cookie);
                for (int i = 0; i < zzc.size(); i++) {
                    CookieManager cookieManager = this.zzfpj;
                    Iterable<String> zza = zzdvz.zza(zzdvj.zzb('=')).zza(zzc.get(i));
                    zzdwa.checkNotNull(zza);
                    if (zza instanceof List) {
                        next = ((List) zza).get(0);
                    } else {
                        Iterator<String> it = zza.iterator();
                        zzdwa.checkNotNull(it);
                        zzdwa.checkArgument(true, "numberToAdvance must be nonnegative");
                        if (!it.hasNext()) {
                            StringBuilder sb = new StringBuilder(91);
                            sb.append("position (0) must be less than the number of elements that remained (0");
                            sb.append(")");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        next = it.next();
                    }
                    String valueOf = String.valueOf((String) next);
                    String valueOf2 = String.valueOf((String) zzwo.zzqq().zzd(zzabh.zzcoc));
                    cookieManager.setCookie(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                }
                return;
            }
            return;
        }
        String str2 = map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zzfpj.setCookie((String) zzwo.zzqq().zzd(zzabh.zzcon), str2);
    }
}
