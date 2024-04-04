package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzahw implements zzahv<zzbdh> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        zzbdh zzbdhVar2 = zzbdhVar;
        WindowManager windowManager = (WindowManager) zzbdhVar2.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzp.zzkq();
        DisplayMetrics zza = com.google.android.gms.ads.internal.util.zzm.zza(windowManager);
        int i = zza.widthPixels;
        int i2 = zza.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzbdhVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzbdhVar2.zza("locationReady", hashMap);
        com.google.android.gms.ads.internal.util.zzd.zzex("GET LOCATION COMPILED");
    }
}
