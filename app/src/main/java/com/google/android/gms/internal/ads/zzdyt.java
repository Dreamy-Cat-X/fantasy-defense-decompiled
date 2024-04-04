package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxz;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzdyt<V> extends zzdyu<V> implements zzdxz.zzi<V> {
    @Override // com.google.android.gms.internal.ads.zzdxz, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (V) super.get(j, timeUnit);
    }
}
