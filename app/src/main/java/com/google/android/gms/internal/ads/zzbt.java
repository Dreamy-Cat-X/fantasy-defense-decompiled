package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbt extends zzeoz {
    private ByteBuffer zzda;

    public zzbt(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzeoz
    public final void zzl(ByteBuffer byteBuffer) {
        this.zzda = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
