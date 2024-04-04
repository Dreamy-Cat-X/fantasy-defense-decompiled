package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@17.3.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzb implements DynamiteModule.VersionPolicy.zzb {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb
    public final int zza(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.zza(context, str, z);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.zzb
    public final int zza(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str);
    }
}
