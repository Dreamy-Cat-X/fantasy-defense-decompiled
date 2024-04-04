package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class StatsUtils {
    public static String getEventKey(Context context, Intent intent) {
        return String.valueOf(System.identityHashCode(intent) | (System.identityHashCode(context) << 32));
    }

    public static String getEventKey(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zza(List<String> list) {
        if (list != null && list.size() == 1 && "com.google.android.gms".equals(list.get(0))) {
            return null;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }
}
