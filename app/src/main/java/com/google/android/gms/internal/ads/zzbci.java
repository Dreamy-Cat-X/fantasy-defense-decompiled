package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbci implements Runnable {
    private final /* synthetic */ String zzeek;
    private final /* synthetic */ String zzenu;
    private final /* synthetic */ int zzenv;
    private final /* synthetic */ int zzenw;
    private final /* synthetic */ boolean zzenx = false;
    private final /* synthetic */ zzbcj zzeny;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbci(zzbcj zzbcjVar, String str, String str2, int i, int i2, boolean z) {
        this.zzeny = zzbcjVar;
        this.zzeek = str;
        this.zzenu = str2;
        this.zzenv = i;
        this.zzenw = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzeek);
        hashMap.put("cachedSrc", this.zzenu);
        hashMap.put("bytesLoaded", Integer.toString(this.zzenv));
        hashMap.put("totalBytes", Integer.toString(this.zzenw));
        hashMap.put("cacheReady", InAppError.SUCCESS);
        this.zzeny.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
