package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfg {
    static zzeai zzzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(zzez zzezVar) throws IllegalAccessException, InvocationTargetException {
        Method zza;
        zzeai zza2;
        if (zzzx != null) {
            return true;
        }
        String str = (String) zzwo.zzqq().zzd(zzabh.zzcrm);
        if (str == null || str.length() == 0) {
            str = (zzezVar == null || (zza = zzezVar.zza("LSN2SsuAiZt66Ly6gZRukDC2DTjf04tC/Nsuivd3hcf60QwmLtKfA3vzupcozm4l", "5ygsPobYt1X5WrczOXkjmvRKWvB07MQMJHpWX2yDXBY=")) == null) ? null : (String) zza.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            zzear zzl = zzeav.zzl(zzcv.zzb(str, true));
            for (zzefz zzefzVar : zzecr.zzibb.zzbfm()) {
                if (zzefzVar.zzbea().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzefzVar.zzbei().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzefzVar.zzbel().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzefzVar.zzbel().equals("TinkAead") && !zzefzVar.zzbel().equals("TinkMac") && !zzefzVar.zzbel().equals("TinkHybridDecrypt") && !zzefzVar.zzbel().equals("TinkHybridEncrypt") && !zzefzVar.zzbel().equals("TinkPublicKeySign") && !zzefzVar.zzbel().equals("TinkPublicKeyVerify") && !zzefzVar.zzbel().equals("TinkStreamingAead") && !zzefzVar.zzbel().equals("TinkDeterministicAead")) {
                    zzeae<?> zzht = zzebb.zzht(zzefzVar.zzbel());
                    zzebb.zza(zzht.zzbak());
                    zzebb.zza(zzht.zzb(zzefzVar.zzbea(), zzefzVar.zzbei(), zzefzVar.zzbej()), zzefzVar.zzbek());
                }
            }
            zza2 = zzecv.zza(zzl, null);
            zzzx = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
