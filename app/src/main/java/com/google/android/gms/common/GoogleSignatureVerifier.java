package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
@CheckReturnValue
/* loaded from: D:\decomp\classes.dex */
public class GoogleSignatureVerifier {

    @Nullable
    private static GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    private GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzc.zza(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    public boolean isUidGoogleSigned(int i) {
        zzl zza2;
        String[] zza3 = Wrappers.packageManager(this.zzb).zza(i);
        if (zza3 == null || zza3.length == 0) {
            zza2 = zzl.zza("no pkgs");
        } else {
            zza2 = null;
            int length = zza3.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    zza2 = zza(zza3[i2], i);
                    if (zza2.zza) {
                        break;
                    }
                    i2++;
                } else {
                    zza2 = (zzl) Preconditions.checkNotNull(zza2);
                    break;
                }
            }
        }
        zza2.zzc();
        return zza2.zza;
    }

    public boolean isPackageGoogleSigned(String str) {
        zzl zza2 = zza(str);
        zza2.zzc();
        return zza2.zza;
    }

    public static boolean zza(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? zza(packageInfo, zzi.zza) : zza(packageInfo, zzi.zza[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    private final zzl zza(String str, int i) {
        try {
            PackageInfo zza2 = Wrappers.packageManager(this.zzb).zza(str, 64, i);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
            if (zza2 == null) {
                return zzl.zza("null pkg");
            }
            if (zza2.signatures != null && zza2.signatures.length == 1) {
                zzg zzgVar = new zzg(zza2.signatures[0].toByteArray());
                String str2 = zza2.packageName;
                zzl zza3 = zzc.zza(str2, zzgVar, honorsDebugCertificates, false);
                return (!zza3.zza || zza2.applicationInfo == null || (zza2.applicationInfo.flags & 2) == 0 || !zzc.zza(str2, zzgVar, false, true).zza) ? zza3 : zzl.zza("debuggable release cert app rejected");
            }
            return zzl.zza("single cert required");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return zzl.zza(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    private final zzl zza(String str) {
        zzl zza2;
        if (str == null) {
            return zzl.zza("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzl.zza();
        }
        try {
            PackageInfo packageInfo = Wrappers.packageManager(this.zzb).getPackageInfo(str, 64);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
            if (packageInfo == null) {
                zza2 = zzl.zza("null pkg");
            } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                zza2 = zzl.zza("single cert required");
            } else {
                zzg zzgVar = new zzg(packageInfo.signatures[0].toByteArray());
                String str2 = packageInfo.packageName;
                zzl zza3 = zzc.zza(str2, zzgVar, honorsDebugCertificates, false);
                zza2 = (!zza3.zza || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !zzc.zza(str2, zzgVar, false, true).zza) ? zza3 : zzl.zza("debuggable release cert app rejected");
            }
            if (zza2.zza) {
                this.zzc = str;
            }
            return zza2;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return zzl.zza(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    @Nullable
    private static zzd zza(PackageInfo packageInfo, zzd... zzdVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzg zzgVar = new zzg(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzdVarArr.length; i++) {
            if (zzdVarArr[i].equals(zzgVar)) {
                return zzdVarArr[i];
            }
        }
        return null;
    }
}
