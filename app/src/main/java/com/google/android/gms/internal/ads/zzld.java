package com.google.android.gms.internal.ads;

import com.sncompany.newtower.GameRenderer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzld implements zzky {
    private final zzpm zzawq;
    private final int zzawz;
    private final int zzaxc;
    private int zzaxd;
    private int zzaxe;

    public zzld(zzkx zzkxVar) {
        zzpm zzpmVar = zzkxVar.zzawq;
        this.zzawq = zzpmVar;
        zzpmVar.zzbi(12);
        this.zzaxc = this.zzawq.zzja() & 255;
        this.zzawz = this.zzawq.zzja();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final boolean zzgz() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgx() {
        return this.zzawz;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgy() {
        int i = this.zzaxc;
        if (i == 8) {
            return this.zzawq.readUnsignedByte();
        }
        if (i == 16) {
            return this.zzawq.readUnsignedShort();
        }
        int i2 = this.zzaxd;
        this.zzaxd = i2 + 1;
        if (i2 % 2 == 0) {
            int readUnsignedByte = this.zzawq.readUnsignedByte();
            this.zzaxe = readUnsignedByte;
            return (readUnsignedByte & GameRenderer.GAME_STAGE_CLEAR_HIGH_SCORE_COUNT) >> 4;
        }
        return this.zzaxe & 15;
    }
}
