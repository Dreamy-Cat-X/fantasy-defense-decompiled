package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdns {
    public static zzvc zza(zzdnu zzdnuVar, zzvc zzvcVar) {
        if (zzdnuVar.equals(zzdnu.MEDIATION_SHOW_ERROR)) {
            if (((Integer) zzwo.zzqq().zzd(zzabh.zzczb)).intValue() > 0) {
                return zzvcVar;
            }
        }
        return zza(zzdnuVar, null, zzvcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0052. Please report as an issue. */
    public static zzvc zza(zzdnu zzdnuVar, String str, zzvc zzvcVar) {
        if (str == null) {
            switch (zzdnv.zzhkp[zzdnuVar.ordinal()]) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 3:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "No fill.";
                    break;
                case 6:
                    str = "App ID missing.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) zzwo.zzqq().zzd(zzabh.zzczf)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    str = "No fill.";
                    break;
            }
        }
        String str2 = str;
        int i = 0;
        switch (zzdnv.zzhkp[zzdnuVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 9:
                i = 1;
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            case 4:
            case 8:
                i = 2;
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            case 5:
            case 10:
                i = 3;
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            case 6:
                i = 8;
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            case 7:
                i = 4;
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            case 11:
            case 13:
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            case 12:
                if (((Integer) zzwo.zzqq().zzd(zzabh.zzczf)).intValue() <= 0) {
                    i = 9;
                    return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
                }
                i = 3;
                return new zzvc(i, str2, MobileAds.ERROR_DOMAIN, zzvcVar, null);
            default:
                String valueOf = String.valueOf(zzdnuVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unknown SdkError: ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
        }
    }

    public static zzvc zzh(Throwable th) {
        if (th instanceof zzcqu) {
            zzcqu zzcquVar = (zzcqu) th;
            return zza(zzcquVar.zzarj(), zzcquVar.zzasa());
        }
        if (th instanceof zzcli) {
            if (th.getMessage() == null) {
                return zza(((zzcli) th).zzarj(), null, null);
            }
            return zza(((zzcli) th).zzarj(), th.getMessage(), null);
        }
        if (th instanceof com.google.android.gms.ads.internal.util.zzas) {
            com.google.android.gms.ads.internal.util.zzas zzasVar = (com.google.android.gms.ads.internal.util.zzas) th;
            return new zzvc(zzasVar.getErrorCode(), zzdwi.zzho(zzasVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        }
        return zza(zzdnu.INTERNAL_ERROR, null, null);
    }

    public static zzvc zza(Throwable th, zzcqx zzcqxVar) {
        zzvc zzh = zzh(th);
        if ((zzh.errorCode == 3 || zzh.errorCode == 0) && zzh.zzcgu != null && !zzh.zzcgu.zzcgt.equals(MobileAds.ERROR_DOMAIN)) {
            zzh.zzcgu = null;
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcze)).booleanValue() && zzcqxVar != null) {
            zzh.zzcgv = zzcqxVar.zzasc();
        }
        return zzh;
    }
}
