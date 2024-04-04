package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public abstract class zzrr {
    private static MessageDigest zzbtq;
    protected Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] zzbp(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MessageDigest zzmm() {
        synchronized (this.mLock) {
            if (zzbtq != null) {
                return zzbtq;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzbtq = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzbtq;
        }
    }
}
