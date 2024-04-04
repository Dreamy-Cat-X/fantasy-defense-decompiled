package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzh implements ServiceConnection, zzj {
    private final Map<ServiceConnection, ServiceConnection> zza = new HashMap();
    private int zzb = 2;
    private boolean zzc;
    private IBinder zzd;
    private final GmsClientSupervisor.zza zze;
    private ComponentName zzf;
    private final /* synthetic */ zzf zzg;

    public zzh(zzf zzfVar, GmsClientSupervisor.zza zzaVar) {
        this.zzg = zzfVar;
        this.zze = zzaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.zzg.zza;
        synchronized (hashMap) {
            handler = this.zzg.zzc;
            handler.removeMessages(1, this.zze);
            this.zzd = iBinder;
            this.zzf = componentName;
            Iterator<ServiceConnection> it = this.zza.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.zzb = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.zzg.zza;
        synchronized (hashMap) {
            handler = this.zzg.zzc;
            handler.removeMessages(1, this.zze);
            this.zzd = null;
            this.zzf = componentName;
            Iterator<ServiceConnection> it = this.zza.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.zzb = 2;
        }
    }

    public final void zza(String str) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.zzb = 3;
        connectionTracker = this.zzg.zzd;
        context = this.zzg.zzb;
        GmsClientSupervisor.zza zzaVar = this.zze;
        context2 = this.zzg.zzb;
        boolean zza = connectionTracker.zza(context, str, zzaVar.zza(context2), this, this.zze.zzc());
        this.zzc = zza;
        if (!zza) {
            this.zzb = 2;
            try {
                connectionTracker2 = this.zzg.zzd;
                context3 = this.zzg.zzb;
                connectionTracker2.unbindService(context3, this);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
        handler = this.zzg.zzc;
        Message obtainMessage = handler.obtainMessage(1, this.zze);
        handler2 = this.zzg.zzc;
        j = this.zzg.zzf;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    public final void zzb(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        handler = this.zzg.zzc;
        handler.removeMessages(1, this.zze);
        connectionTracker = this.zzg.zzd;
        context = this.zzg.zzb;
        connectionTracker.unbindService(context, this);
        this.zzc = false;
        this.zzb = 2;
    }

    public final void zza(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zza.put(serviceConnection, serviceConnection2);
    }

    public final void zza(ServiceConnection serviceConnection, String str) {
        this.zza.remove(serviceConnection);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final boolean zza(ServiceConnection serviceConnection) {
        return this.zza.containsKey(serviceConnection);
    }

    public final boolean zzc() {
        return this.zza.isEmpty();
    }

    public final IBinder zzd() {
        return this.zzd;
    }

    public final ComponentName zze() {
        return this.zzf;
    }
}
