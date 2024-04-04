package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbl extends ThreadLocal<ByteBuffer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbl(zzbm zzbmVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
