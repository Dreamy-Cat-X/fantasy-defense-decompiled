package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzbm implements zzbo {
    private static Logger zzcx = Logger.getLogger(zzbm.class.getName());
    private ThreadLocal<ByteBuffer> zzcy = new zzbl(this);

    public abstract zzbp zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzbo
    public final zzbp zza(zzepc zzepcVar, zzbs zzbsVar) throws IOException {
        int read;
        long size;
        long position = zzepcVar.position();
        this.zzcy.get().rewind().limit(8);
        do {
            read = zzepcVar.read(this.zzcy.get());
            if (read == 8) {
                this.zzcy.get().rewind();
                long zzf = zzbq.zzf(this.zzcy.get());
                byte[] bArr = null;
                if (zzf < 8 && zzf > 1) {
                    Logger logger = zzcx;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zzf);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String zzk = zzbq.zzk(this.zzcy.get());
                if (zzf == 1) {
                    this.zzcy.get().limit(16);
                    zzepcVar.read(this.zzcy.get());
                    this.zzcy.get().position(8);
                    size = zzbq.zzh(this.zzcy.get()) - 16;
                } else {
                    size = zzf == 0 ? zzepcVar.size() - zzepcVar.position() : zzf - 8;
                }
                if ("uuid".equals(zzk)) {
                    this.zzcy.get().limit(this.zzcy.get().limit() + 16);
                    zzepcVar.read(this.zzcy.get());
                    bArr = new byte[16];
                    for (int position2 = this.zzcy.get().position() - 16; position2 < this.zzcy.get().position(); position2++) {
                        bArr[position2 - (this.zzcy.get().position() - 16)] = this.zzcy.get().get(position2);
                    }
                    size -= 16;
                }
                long j = size;
                zzbp zza = zza(zzk, bArr, zzbsVar instanceof zzbp ? ((zzbp) zzbsVar).getType() : "");
                zza.zza(zzbsVar);
                this.zzcy.get().rewind();
                zza.zza(zzepcVar, this.zzcy.get(), j, this);
                return zza;
            }
        } while (read >= 0);
        zzepcVar.zzfc(position);
        throw new EOFException();
    }
}
