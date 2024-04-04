package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaip implements zzx {
    private final Context context;
    private volatile zzaii zzdhh;

    public zzaip(Context context) {
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzx
    public final zzy zzc(zzaa<?> zzaaVar) throws zzao {
        zzaih zzh = zzaih.zzh(zzaaVar);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
        try {
            zzazc zzazcVar = new zzazc();
            this.zzdhh = new zzaii(this.context, com.google.android.gms.ads.internal.zzp.zzle().zzzn(), new zzait(this, zzazcVar), new zzaiw(this, zzazcVar));
            this.zzdhh.checkAvailabilityAndConnect();
            zzdzl zza = zzdyz.zza(zzdyz.zzb(zzazcVar, new zzais(this, zzh), zzayv.zzegi), ((Integer) zzwo.zzqq().zzd(zzabh.zzctt)).intValue(), TimeUnit.MILLISECONDS, zzayv.zzegl);
            zza.addListener(new zzaiu(this), zzayv.zzegi);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zza.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
            zzaij zzaijVar = (zzaij) new zzast(parcelFileDescriptor).zza(zzaij.CREATOR);
            if (zzaijVar == null) {
                return null;
            }
            if (zzaijVar.zzdhg) {
                throw new zzao(zzaijVar.zzcgs);
            }
            if (zzaijVar.zzdhe.length != zzaijVar.zzdhf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < zzaijVar.zzdhe.length; i++) {
                hashMap.put(zzaijVar.zzdhe[i], zzaijVar.zzdhf[i]);
            }
            return new zzy(zzaijVar.statusCode, zzaijVar.data, hashMap, zzaijVar.zzam, zzaijVar.zzan);
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zzd.zzeb(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zzd.zzeb(sb3.toString());
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        if (this.zzdhh == null) {
            return;
        }
        this.zzdhh.disconnect();
        Binder.flushPendingCommands();
    }
}
