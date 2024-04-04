package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcz implements Runnable {
    private zzcz() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzcx.zza(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            zzcx.zzno.countDown();
        }
    }
}
