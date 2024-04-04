package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcm implements Runnable {
    private final /* synthetic */ String zzeek;
    private final /* synthetic */ String zzenu;
    private final /* synthetic */ zzbcj zzeny;
    private final /* synthetic */ long zzeob;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcm(zzbcj zzbcjVar, String str, String str2, long j) {
        this.zzeny = zzbcjVar;
        this.zzeek = str;
        this.zzenu = str2;
        this.zzeob = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zzeek);
        hashMap.put("cachedSrc", this.zzenu);
        hashMap.put("totalDuration", Long.toString(this.zzeob));
        this.zzeny.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
