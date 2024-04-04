package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzabq {
    public static void zza(zzabo zzaboVar, zzabl zzablVar) {
        if (zzablVar.getContext() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzablVar.zzlv())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzaboVar.zza(zzablVar.getContext(), zzablVar.zzlv(), zzablVar.zzsf(), zzablVar.zzsg());
    }
}
