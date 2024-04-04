package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbdn implements zzdza<Map<String, String>> {
    private final /* synthetic */ Uri val$uri;
    private final /* synthetic */ zzbdg zzeps;
    private final /* synthetic */ List zzepv;
    private final /* synthetic */ String zzepw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdn(zzbdg zzbdgVar, List list, String str, Uri uri) {
        this.zzeps = zzbdgVar;
        this.zzepv = list;
        this.zzepw = str;
        this.val$uri = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        String valueOf = String.valueOf(this.val$uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Failed to parse gmsg params for: ");
        sb.append(valueOf);
        com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(Map<String, String> map) {
        zzbdg zzbdgVar = this.zzeps;
        List list = this.zzepv;
        zzbdgVar.zza((Map<String, String>) map, (List<zzahv<? super zzbdh>>) list, this.zzepw);
    }
}
