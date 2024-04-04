package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzeoy extends zzepa implements zzbp {
    private String type;
    private long zzaws;
    private zzbs zzizg;
    private boolean zzizh;

    public zzeoy(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbs zzbsVar) {
        this.zzizg = zzbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzepc zzepcVar, ByteBuffer byteBuffer, long j, zzbo zzboVar) throws IOException {
        this.zzaws = zzepcVar.position() - byteBuffer.remaining();
        this.zzizh = byteBuffer.remaining() == 16;
        zza(zzepcVar, j, zzboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public final void zza(zzepc zzepcVar, long j, zzbo zzboVar) throws IOException {
        this.zzizn = zzepcVar;
        this.zzizs = zzepcVar.position();
        this.zzbfx = this.zzizs - ((this.zzizh || 8 + j >= 4294967296L) ? 16 : 8);
        zzepcVar.zzfc(zzepcVar.position() + j);
        this.zzasr = zzepcVar.position();
        this.zzizq = zzboVar;
    }
}
