package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcwo {
    private final zzchu zzgle;
    private final ConcurrentHashMap<String, zzaoz> zzgvp = new ConcurrentHashMap<>();

    public zzcwo(zzchu zzchuVar) {
        this.zzgle = zzchuVar;
    }

    public final void zzgn(String str) {
        try {
            this.zzgvp.put(str, this.zzgle.zzdf(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final zzaoz zzgo(String str) {
        if (this.zzgvp.containsKey(str)) {
            return this.zzgvp.get(str);
        }
        return null;
    }
}
