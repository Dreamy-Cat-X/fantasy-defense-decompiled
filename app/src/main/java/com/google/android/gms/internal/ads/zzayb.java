package com.google.android.gms.internal.ads;

import com.kt.olleh.inapp.net.InAppError;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzayb {
    private BigInteger zzebn = BigInteger.ONE;
    private String zzdsl = InAppError.SUCCESS;

    public final synchronized String zzya() {
        String bigInteger;
        bigInteger = this.zzebn.toString();
        this.zzebn = this.zzebn.add(BigInteger.ONE);
        this.zzdsl = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzyb() {
        return this.zzdsl;
    }
}
