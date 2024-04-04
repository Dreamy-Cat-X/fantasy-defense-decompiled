package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeoz implements zzbp {
    private static zzepi zzcz = zzepi.zzn(zzeoz.class);
    private String type;
    private long zzaws;
    private zzbs zzizg;
    private ByteBuffer zzizk;
    private long zzizl;
    private zzepc zzizn;
    private long zzizm = -1;
    private ByteBuffer zzizo = null;
    private boolean zzizj = true;
    boolean zzizi = true;

    private final synchronized void zzbml() {
        if (!this.zzizj) {
            try {
                zzepi zzepiVar = zzcz;
                String valueOf = String.valueOf(this.type);
                zzepiVar.zziq(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.zzizk = this.zzizn.zzh(this.zzizl, this.zzizm);
                this.zzizj = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract void zzl(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzeoz(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzepc zzepcVar, ByteBuffer byteBuffer, long j, zzbo zzboVar) throws IOException {
        long position = zzepcVar.position();
        this.zzizl = position;
        this.zzaws = position - byteBuffer.remaining();
        this.zzizm = j;
        this.zzizn = zzepcVar;
        zzepcVar.zzfc(zzepcVar.position() + j);
        this.zzizj = false;
        this.zzizi = false;
        zzbmm();
    }

    public final synchronized void zzbmm() {
        zzbml();
        zzepi zzepiVar = zzcz;
        String valueOf = String.valueOf(this.type);
        zzepiVar.zziq(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.zzizk != null) {
            ByteBuffer byteBuffer = this.zzizk;
            this.zzizi = true;
            byteBuffer.rewind();
            zzl(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzizo = byteBuffer.slice();
            }
            this.zzizk = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbs zzbsVar) {
        this.zzizg = zzbsVar;
    }
}
