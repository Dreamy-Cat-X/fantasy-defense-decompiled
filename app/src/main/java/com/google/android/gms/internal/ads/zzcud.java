package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcud {
    private final Clock zzbpw;
    private final zzcqx zzfvn;
    private final zzcuf zzgto;
    private final List<String> zzgtp = Collections.synchronizedList(new ArrayList());
    private final boolean zzgtq = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcyd)).booleanValue();

    public zzcud(Clock clock, zzcuf zzcufVar, zzcqx zzcqxVar) {
        this.zzbpw = clock;
        this.zzgto = zzcufVar;
        this.zzfvn = zzcqxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> zzdzl<T> zza(zzdmj zzdmjVar, zzdmi zzdmiVar, zzdzl<T> zzdzlVar) {
        long elapsedRealtime = this.zzbpw.elapsedRealtime();
        String str = zzdmiVar.zzdkl;
        if (str != null) {
            zzdyz.zza(zzdzlVar, new zzcuc(this, elapsedRealtime, str, zzdmiVar, zzdmjVar), zzayv.zzegn);
        }
        return zzdzlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.zzgtp.add(sb2);
    }

    public final String zzase() {
        return TextUtils.join("_", this.zzgtp);
    }
}
