package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
@CheckReturnValue
/* loaded from: D:\decomp\classes.dex */
public class zzl {
    private static final zzl zzb = new zzl(true, null, null);
    final boolean zza;

    @Nullable
    private final String zzc;

    @Nullable
    private final Throwable zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzc = str;
        this.zzd = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzl zza() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzl zza(Callable<String> callable) {
        return new zzn(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzl zza(String str) {
        return new zzl(false, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzl zza(String str, Throwable th) {
        return new zzl(false, str, th);
    }

    @Nullable
    String zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzd != null) {
            Log.d("GoogleCertificatesRslt", zzb(), this.zzd);
        } else {
            Log.d("GoogleCertificatesRslt", zzb());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(String str, zzd zzdVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, Hex.bytesToStringLowercase(AndroidUtilsLight.zza("SHA-1").digest(zzdVar.zza())), Boolean.valueOf(z), "12451009.false");
    }
}
