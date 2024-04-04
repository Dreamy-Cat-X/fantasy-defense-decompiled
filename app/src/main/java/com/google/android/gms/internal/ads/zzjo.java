package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjo extends zzjh {
    public long zzaoi;
    public ByteBuffer zzda;
    public final zzjk zzaoh = new zzjk();
    private final int zzaoj = 0;

    public zzjo(int i) {
    }

    public final void zzad(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzda;
        if (byteBuffer == null) {
            this.zzda = zzae(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzda.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer zzae = zzae(i2);
        if (position > 0) {
            this.zzda.position(0);
            this.zzda.limit(position);
            zzae.put(this.zzda);
        }
        this.zzda = zzae;
    }

    public final boolean isEncrypted() {
        return zzab(1073741824);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.zzda;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    private final ByteBuffer zzae(int i) {
        ByteBuffer byteBuffer = this.zzda;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
