package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeii extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        SecureRandom zzbfx;
        zzbfx = zzeij.zzbfx();
        return zzbfx;
    }
}
