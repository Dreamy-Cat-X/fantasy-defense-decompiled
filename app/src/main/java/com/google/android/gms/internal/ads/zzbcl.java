package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcl implements Runnable {
    private final /* synthetic */ String zzeek;
    private final /* synthetic */ String zzenu;
    private final /* synthetic */ boolean zzenx;
    private final /* synthetic */ zzbcj zzeny;
    private final /* synthetic */ long zzeoa;
    private final /* synthetic */ long zzeob;
    private final /* synthetic */ int zzeoc;
    private final /* synthetic */ int zzeod;
    private final /* synthetic */ long zzeoe;
    private final /* synthetic */ long zzeof;
    private final /* synthetic */ long zzeog;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcl(zzbcj zzbcjVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zzeny = zzbcjVar;
        this.zzeek = str;
        this.zzenu = str2;
        this.zzeoa = j;
        this.zzeob = j2;
        this.zzeoe = j3;
        this.zzeof = j4;
        this.zzeog = j5;
        this.zzenx = z;
        this.zzeoc = i;
        this.zzeod = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zzeek);
        hashMap.put("cachedSrc", this.zzenu);
        hashMap.put("bufferedDuration", Long.toString(this.zzeoa));
        hashMap.put("totalDuration", Long.toString(this.zzeob));
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.zzeoe));
            hashMap.put("qoeCachedBytes", Long.toString(this.zzeof));
            hashMap.put("totalBytes", Long.toString(this.zzeog));
            hashMap.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
        }
        hashMap.put("cacheReady", this.zzenx ? InAppError.FAILED : InAppError.SUCCESS);
        hashMap.put("playerCount", Integer.toString(this.zzeoc));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzeod));
        this.zzeny.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
