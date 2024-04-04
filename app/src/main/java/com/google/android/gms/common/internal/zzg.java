package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzg implements Handler.Callback {
    private final /* synthetic */ zzf zza;

    private zzg(zzf zzfVar) {
        this.zza = zzfVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.zza.zza;
            synchronized (hashMap) {
                GmsClientSupervisor.zza zzaVar = (GmsClientSupervisor.zza) message.obj;
                hashMap2 = this.zza.zza;
                zzh zzhVar = (zzh) hashMap2.get(zzaVar);
                if (zzhVar != null && zzhVar.zzc()) {
                    if (zzhVar.zza()) {
                        zzhVar.zzb("GmsClientSupervisor");
                    }
                    hashMap3 = this.zza.zza;
                    hashMap3.remove(zzaVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        hashMap4 = this.zza.zza;
        synchronized (hashMap4) {
            GmsClientSupervisor.zza zzaVar2 = (GmsClientSupervisor.zza) message.obj;
            hashMap5 = this.zza.zza;
            zzh zzhVar2 = (zzh) hashMap5.get(zzaVar2);
            if (zzhVar2 != null && zzhVar2.zzb() == 3) {
                String valueOf = String.valueOf(zzaVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName zze = zzhVar2.zze();
                if (zze == null) {
                    zze = zzaVar2.zzb();
                }
                if (zze == null) {
                    zze = new ComponentName((String) Preconditions.checkNotNull(zzaVar2.zza()), EnvironmentCompat.MEDIA_UNKNOWN);
                }
                zzhVar2.onServiceDisconnected(zze);
            }
        }
        return true;
    }
}
