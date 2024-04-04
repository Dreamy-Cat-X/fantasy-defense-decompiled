package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbck implements Runnable {
    private final /* synthetic */ String zzeek;
    private final /* synthetic */ String zzenu;
    private final /* synthetic */ int zzenv;
    private final /* synthetic */ int zzenw;
    private final /* synthetic */ boolean zzenx;
    private final /* synthetic */ zzbcj zzeny;
    private final /* synthetic */ long zzeoa;
    private final /* synthetic */ long zzeob;
    private final /* synthetic */ int zzeoc;
    private final /* synthetic */ int zzeod;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbck(zzbcj zzbcjVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zzeny = zzbcjVar;
        this.zzeek = str;
        this.zzenu = str2;
        this.zzenv = i;
        this.zzenw = i2;
        this.zzeoa = j;
        this.zzeob = j2;
        this.zzenx = z;
        this.zzeoc = i3;
        this.zzeod = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzeek);
        hashMap.put("cachedSrc", this.zzenu);
        hashMap.put("bytesLoaded", Integer.toString(this.zzenv));
        hashMap.put("totalBytes", Integer.toString(this.zzenw));
        hashMap.put("bufferedDuration", Long.toString(this.zzeoa));
        hashMap.put("totalDuration", Long.toString(this.zzeob));
        hashMap.put("cacheReady", this.zzenx ? InAppError.FAILED : InAppError.SUCCESS);
        hashMap.put("playerCount", Integer.toString(this.zzeoc));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzeod));
        this.zzeny.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
