package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayp {
    public static <T> T zza(Context context, String str, zzayo<IBinder, T> zzayoVar) throws zzayr {
        try {
            return zzayoVar.apply(zzbv(context).instantiate(str));
        } catch (Exception e) {
            throw new zzayr(e);
        }
    }

    public static Context zzbu(Context context) throws zzayr {
        return zzbv(context).getModuleContext();
    }

    private static DynamiteModule zzbv(Context context) throws zzayr {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzayr(e);
        }
    }
}
