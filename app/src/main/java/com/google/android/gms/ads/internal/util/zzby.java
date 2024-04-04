package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzwo;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzby {
    private Context zzaaf;
    private boolean zzefh;
    private boolean zzze = false;
    private final Map<BroadcastReceiver, IntentFilter> zzefg = new WeakHashMap();
    private final BroadcastReceiver zzeff = new zzbx(this);

    public final synchronized void initialize(Context context) {
        if (this.zzze) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.zzaaf = applicationContext;
        if (applicationContext == null) {
            this.zzaaf = context;
        }
        zzabh.initialize(this.zzaaf);
        this.zzefh = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcsn)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.zzaaf.registerReceiver(this.zzeff, intentFilter);
        this.zzze = true;
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzefh) {
            this.zzefg.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzefh) {
            this.zzefg.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzc(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.zzefg.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                arrayList.add(entry.getKey());
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }
}
