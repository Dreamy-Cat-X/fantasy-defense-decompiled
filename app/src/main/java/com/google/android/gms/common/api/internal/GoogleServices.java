package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzs;

/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class GoogleServices {
    private static final Object zza = new Object();
    private static GoogleServices zzb;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            this.zzf = !z2;
            z = z2;
        } else {
            this.zzf = false;
        }
        this.zze = z;
        String zza2 = zzs.zza(context);
        zza2 = zza2 == null ? new StringResourceValueReader(context).getString("google_app_id") : zza2;
        if (TextUtils.isEmpty(zza2)) {
            this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = zza2;
            this.zzd = Status.RESULT_SUCCESS;
        }
    }

    GoogleServices(String str, boolean z) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z;
        this.zzf = !z;
    }

    public static Status initialize(Context context, String str, boolean z) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            if (zzb != null) {
                return zzb.checkGoogleAppId(str);
            }
            GoogleServices googleServices = new GoogleServices(str, z);
            zzb = googleServices;
            return googleServices.zzd;
        }
    }

    final Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        if (str2 != null && !str2.equals(str)) {
            String str3 = this.zzc;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 97);
            sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
            sb.append(str3);
            sb.append("'.");
            return new Status(10, sb.toString());
        }
        return Status.RESULT_SUCCESS;
    }

    public static Status initialize(Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    public static boolean isMeasurementEnabled() {
        GoogleServices checkInitialized = checkInitialized("isMeasurementEnabled");
        return checkInitialized.zzd.isSuccess() && checkInitialized.zze;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (zza) {
            if (zzb == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            googleServices = zzb;
        }
        return googleServices;
    }
}
