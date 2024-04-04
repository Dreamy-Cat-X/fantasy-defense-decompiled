package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.common.zzn;
import com.google.android.gms.internal.common.zzo;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public class ConnectionTracker {
    private static volatile ConnectionTracker zzb;
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> zze = new ConcurrentHashMap<>();
    private static final Object zza = new Object();
    private static boolean zzc = false;
    private static zzo<Boolean> zzd = zzn.zza(zza.zza);

    public static ConnectionTracker getInstance() {
        if (zzb == null) {
            synchronized (zza) {
                if (zzb == null) {
                    zzb = new ConnectionTracker();
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ boolean zza() {
        return false;
    }

    private ConnectionTracker() {
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, str, intent, serviceConnection, i, true);
    }

    private final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : ClientLibraryUtils.zza(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (zza(serviceConnection)) {
            ServiceConnection putIfAbsent = this.zze.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean bindService = context.bindService(intent, serviceConnection, i);
                return !bindService ? bindService : bindService;
            } finally {
                this.zze.remove(serviceConnection, serviceConnection);
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        if (zza(serviceConnection) && this.zze.containsKey(serviceConnection)) {
            try {
                zza(context, this.zze.get(serviceConnection));
                return;
            } finally {
                this.zze.remove(serviceConnection);
            }
        }
        zza(context, serviceConnection);
    }

    private static boolean zza(ServiceConnection serviceConnection) {
        return zzd.zza().booleanValue() && !(serviceConnection instanceof zzj);
    }

    private static void zza(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", e);
        }
    }

    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException e) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", e);
        }
    }
}
