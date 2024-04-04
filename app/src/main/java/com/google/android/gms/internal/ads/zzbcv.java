package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcv extends zzbcj implements zzpc<zzom> {
    private String url;
    private ByteBuffer zzamh;
    private final String zzbvf;
    private final int zzbvg;
    private final zzbar zzelm;
    private boolean zzeok;
    private final zzbcs zzeoq;
    private final zzbcb zzeor;
    private boolean zzeos;
    private final Object zzeot;
    private boolean zzeou;

    public zzbcv(zzbaq zzbaqVar, zzbar zzbarVar) {
        super(zzbaqVar);
        this.zzelm = zzbarVar;
        this.zzeoq = new zzbcs();
        this.zzeor = new zzbcb();
        this.zzeot = new Object();
        this.zzbvf = zzbaqVar != null ? zzbaqVar.zzabc() : "";
        this.zzbvg = zzbaqVar != null ? zzbaqVar.zzabd() : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final /* bridge */ /* synthetic */ void zzc(zzom zzomVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final /* bridge */ /* synthetic */ void zze(zzom zzomVar) {
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzacm() {
        return this.zzeou;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbcj
    public final String zzfh(String str) {
        String valueOf = String.valueOf(super.zzfh(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzaaq() {
        int zzack = (int) this.zzeoq.zzack();
        int zzq = (int) this.zzeor.zzq(this.zzamh);
        int position = this.zzamh.position();
        int round = Math.round(zzq * (position / zzack));
        boolean z = round > 0;
        int zzach = zzbbm.zzach();
        int zzaci = zzbbm.zzaci();
        String str = this.url;
        zza(str, zzfh(str), position, zzack, round, zzq, z, zzach, zzaci);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:? -> B:50:0x0141). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbcj
    public final boolean zzfg(String str) {
        String str2;
        this.url = str;
        String zzfh = zzfh(str);
        String str3 = "error";
        int i = 0;
        try {
            zzom zzotVar = new zzot(this.zzefc, null, this, this.zzelm.zzekn, this.zzelm.zzekp, true, null);
            if (this.zzelm.zzekt) {
                try {
                    zzotVar = new zzbbi(this.mContext, zzotVar, this.zzbvf, this.zzbvg, null, null);
                } catch (Exception e) {
                    e = e;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                    sb.append(canonicalName);
                    sb.append(":");
                    sb.append(message);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb2).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(str);
                    sb3.append(" Exception: ");
                    sb3.append(sb2);
                    com.google.android.gms.ads.internal.util.zzd.zzex(sb3.toString());
                    zza(str, zzfh, str3, sb2);
                    return false;
                }
            }
            zzotVar.zza(new zzor(Uri.parse(str)));
            zzbaq zzbaqVar = this.zzenz.get();
            if (zzbaqVar != null) {
                zzbaqVar.zza(zzfh, this);
            }
            Clock zzkx = com.google.android.gms.ads.internal.zzp.zzkx();
            long currentTimeMillis = zzkx.currentTimeMillis();
            long longValue = ((Long) zzwo.zzqq().zzd(zzabh.zzcmj)).longValue();
            long longValue2 = ((Long) zzwo.zzqq().zzd(zzabh.zzcmi)).longValue();
            this.zzamh = ByteBuffer.allocate(this.zzelm.zzekm);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int read = zzotVar.read(bArr, i, Math.min(this.zzamh.remaining(), i2));
                if (read == -1) {
                    this.zzeou = true;
                    zzc(str, zzfh, (int) this.zzeor.zzq(this.zzamh));
                    return true;
                }
                synchronized (this.zzeot) {
                    try {
                        if (this.zzeok) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                this.zzamh.put(bArr, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzamh.remaining() <= 0) {
                                zzaaq();
                                return true;
                            }
                            if (this.zzeok) {
                                int limit = this.zzamh.limit();
                                StringBuilder sb4 = new StringBuilder(35);
                                sb4.append("Precache abort at ");
                                sb4.append(limit);
                                sb4.append(" bytes");
                                throw new IOException(sb4.toString());
                            }
                            long currentTimeMillis2 = zzkx.currentTimeMillis();
                            if (currentTimeMillis2 - j >= longValue) {
                                zzaaq();
                                j = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                StringBuilder sb5 = new StringBuilder(49);
                                sb5.append("Timeout exceeded. Limit: ");
                                sb5.append(longValue2);
                                sb5.append(" sec");
                                throw new IOException(sb5.toString());
                            }
                            str3 = str2;
                            i2 = 8192;
                            i = 0;
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb6.append(canonicalName2);
                            sb6.append(":");
                            sb6.append(message2);
                            String sb22 = sb6.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb22).length());
                            sb32.append("Failed to preload url ");
                            sb32.append(str);
                            sb32.append(" Exception: ");
                            sb32.append(sb22);
                            com.google.android.gms.ads.internal.util.zzd.zzex(sb32.toString());
                            zza(str, zzfh, str3, sb22);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void abort() {
        this.zzeok = true;
    }

    public final ByteBuffer getByteBuffer() {
        synchronized (this.zzeot) {
            if (this.zzamh != null && !this.zzeos) {
                this.zzamh.flip();
                this.zzeos = true;
            }
            this.zzeok = true;
        }
        return this.zzamh;
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final /* synthetic */ void zza(zzom zzomVar, zzor zzorVar) {
        zzom zzomVar2 = zzomVar;
        if (zzomVar2 instanceof zzot) {
            this.zzeoq.zza((zzot) zzomVar2);
        }
    }
}
