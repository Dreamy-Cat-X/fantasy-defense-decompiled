package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzji implements zzii {
    private ByteBuffer zzalg;
    private ByteBuffer zzamh;
    private boolean zzami;
    private zzjf zzanp;
    private ShortBuffer zzanq;
    private long zzanr;
    private long zzans;
    private float zzahy = 1.0f;
    private float zzahz = 1.0f;
    private int zzahl = -1;
    private int zzamd = -1;

    public zzji() {
        ByteBuffer byteBuffer = zzaiz;
        this.zzamh = byteBuffer;
        this.zzanq = byteBuffer.asShortBuffer();
        this.zzalg = zzaiz;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzfk() {
        return 2;
    }

    public final float zzb(float f) {
        float zza = zzps.zza(f, 0.1f, 8.0f);
        this.zzahy = zza;
        return zza;
    }

    public final float zzc(float f) {
        this.zzahz = zzps.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzgk() {
        return this.zzanr;
    }

    public final long zzgl() {
        return this.zzans;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean zzb(int i, int i2, int i3) throws zzih {
        if (i3 != 2) {
            throw new zzih(i, i2, i3);
        }
        if (this.zzamd == i && this.zzahl == i2) {
            return false;
        }
        this.zzamd = i;
        this.zzahl = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean isActive() {
        return Math.abs(this.zzahy - 1.0f) >= 0.01f || Math.abs(this.zzahz - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final int zzfj() {
        return this.zzahl;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zzn(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzanr += remaining;
            this.zzanp.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzgf = (this.zzanp.zzgf() * this.zzahl) << 1;
        if (zzgf > 0) {
            if (this.zzamh.capacity() < zzgf) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzgf).order(ByteOrder.nativeOrder());
                this.zzamh = order;
                this.zzanq = order.asShortBuffer();
            } else {
                this.zzamh.clear();
                this.zzanq.clear();
            }
            this.zzanp.zzb(this.zzanq);
            this.zzans += zzgf;
            this.zzamh.limit(zzgf);
            this.zzalg = this.zzamh;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void zzfl() {
        this.zzanp.zzfl();
        this.zzami = true;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final ByteBuffer zzfm() {
        ByteBuffer byteBuffer = this.zzalg;
        this.zzalg = zzaiz;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final boolean zzfe() {
        if (!this.zzami) {
            return false;
        }
        zzjf zzjfVar = this.zzanp;
        return zzjfVar == null || zzjfVar.zzgf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void flush() {
        zzjf zzjfVar = new zzjf(this.zzamd, this.zzahl);
        this.zzanp = zzjfVar;
        zzjfVar.setSpeed(this.zzahy);
        this.zzanp.zza(this.zzahz);
        this.zzalg = zzaiz;
        this.zzanr = 0L;
        this.zzans = 0L;
        this.zzami = false;
    }

    @Override // com.google.android.gms.internal.ads.zzii
    public final void reset() {
        this.zzanp = null;
        ByteBuffer byteBuffer = zzaiz;
        this.zzamh = byteBuffer;
        this.zzanq = byteBuffer.asShortBuffer();
        this.zzalg = zzaiz;
        this.zzahl = -1;
        this.zzamd = -1;
        this.zzanr = 0L;
        this.zzans = 0L;
        this.zzami = false;
    }
}
