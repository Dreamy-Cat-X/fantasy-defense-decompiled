package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.kt.olleh.inapp.net.ResTags;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcp implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzeek;
    private final /* synthetic */ String zzenu;
    private final /* synthetic */ zzbcj zzeny;
    private final /* synthetic */ String zzeoh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcp(zzbcj zzbcjVar, String str, String str2, String str3, String str4) {
        this.zzeny = zzbcjVar;
        this.zzeek = str;
        this.zzenu = str2;
        this.zzeoh = str3;
        this.val$message = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzfi;
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zzeek);
        if (!TextUtils.isEmpty(this.zzenu)) {
            hashMap.put("cachedSrc", this.zzenu);
        }
        zzbcj zzbcjVar = this.zzeny;
        zzfi = zzbcj.zzfi(this.zzeoh);
        hashMap.put("type", zzfi);
        hashMap.put(ResTags.REASON, this.zzeoh);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzeny.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
