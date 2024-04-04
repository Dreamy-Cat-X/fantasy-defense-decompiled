package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzjb extends zzlu implements zzpj {
    private int zzahl;
    private int zzahn;
    private final zzij zzamj;
    private final zzis zzamk;
    private boolean zzaml;
    private boolean zzamm;
    private MediaFormat zzamn;
    private long zzamo;
    private boolean zzamp;

    public zzjb(zzlw zzlwVar, Handler handler, zzik zzikVar) {
        this(zzlwVar, null, true, handler, zzikVar);
    }

    private final boolean zzax(String str) {
        return false;
    }

    public static void zzb(int i, long j, long j2) {
    }

    public static void zzgd() {
    }

    public static void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzhc, com.google.android.gms.internal.ads.zzhx
    public final zzpj zzea() {
        return this;
    }

    private zzjb(zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z, Handler handler, zzik zzikVar) {
        this(zzlwVar, null, true, handler, zzikVar, null, new zzii[0]);
    }

    private zzjb(zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z, Handler handler, zzik zzikVar, zzif zzifVar, zzii... zziiVarArr) {
        super(1, zzlwVar, null, true);
        this.zzamk = new zzis(null, zziiVarArr, new zzjd(this));
        this.zzamj = new zzij(handler, zzikVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final int zza(zzlw zzlwVar, zzhs zzhsVar) throws zzmc {
        String str = zzhsVar.zzahb;
        boolean z = false;
        if (!zzpi.zzbc(str)) {
            return 0;
        }
        int i = zzps.SDK_INT >= 21 ? 16 : 0;
        if (zzax(str) && zzlwVar.zzhj() != null) {
            return i | 4 | 3;
        }
        zzlv zzc = zzlwVar.zzc(str, false);
        if (zzc == null) {
            return 1;
        }
        if (zzps.SDK_INT < 21 || ((zzhsVar.zzahm == -1 || zzc.zzaw(zzhsVar.zzahm)) && (zzhsVar.zzahl == -1 || zzc.zzax(zzhsVar.zzahl)))) {
            z = true;
        }
        return i | 4 | (z ? 3 : 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzlv zza(zzlw zzlwVar, zzhs zzhsVar, boolean z) throws zzmc {
        zzlv zzhj;
        if (zzax(zzhsVar.zzahb) && (zzhj = zzlwVar.zzhj()) != null) {
            this.zzaml = true;
            return zzhj;
        }
        this.zzaml = false;
        return super.zza(zzlwVar, zzhsVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zza(zzlv zzlvVar, MediaCodec mediaCodec, zzhs zzhsVar, MediaCrypto mediaCrypto) {
        this.zzamm = zzps.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(zzlvVar.name) && "samsung".equals(zzps.MANUFACTURER) && (zzps.DEVICE.startsWith("zeroflte") || zzps.DEVICE.startsWith("herolte") || zzps.DEVICE.startsWith("heroqlte"));
        if (this.zzaml) {
            MediaFormat zzfa = zzhsVar.zzfa();
            this.zzamn = zzfa;
            zzfa.setString("mime", "audio/raw");
            mediaCodec.configure(this.zzamn, (Surface) null, (MediaCrypto) null, 0);
            this.zzamn.setString("mime", zzhsVar.zzahb);
            return;
        }
        mediaCodec.configure(zzhsVar.zzfa(), (Surface) null, (MediaCrypto) null, 0);
        this.zzamn = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zzc(String str, long j, long j2) {
        this.zzamj.zza(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzd(zzhs zzhsVar) throws zzhd {
        super.zzd(zzhsVar);
        this.zzamj.zzb(zzhsVar);
        this.zzahn = "audio/raw".equals(zzhsVar.zzahb) ? zzhsVar.zzahn : 2;
        this.zzahl = zzhsVar.zzahl;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhd {
        int[] iArr;
        int i;
        boolean z = this.zzamn != null;
        String string = z ? this.zzamn.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.zzamn;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzamm && integer == 6 && (i = this.zzahl) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.zzahl; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.zzamk.zza(string, integer, integer2, this.zzahn, 0, iArr);
        } catch (zziw e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void zze(boolean z) throws zzhd {
        super.zze(z);
        this.zzamj.zza(this.zzbcn);
        int i = zzei().zzaic;
        this.zzamk.zzft();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void zza(long j, boolean z) throws zzhd {
        super.zza(j, z);
        this.zzamk.reset();
        this.zzamo = j;
        this.zzamp = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void onStarted() {
        super.onStarted();
        this.zzamk.play();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void onStopped() {
        this.zzamk.pause();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void zzeh() {
        try {
            this.zzamk.release();
            try {
                super.zzeh();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzeh();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhx
    public final boolean zzfe() {
        return super.zzfe() && this.zzamk.zzfe();
    }

    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhx
    public final boolean isReady() {
        return this.zzamk.zzfr() || super.isReady();
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final long zzgc() {
        long zzj = this.zzamk.zzj(zzfe());
        if (zzj != Long.MIN_VALUE) {
            if (!this.zzamp) {
                zzj = Math.max(this.zzamo, zzj);
            }
            this.zzamo = zzj;
            this.zzamp = false;
        }
        return this.zzamo;
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzhy zzb(zzhy zzhyVar) {
        return this.zzamk.zzb(zzhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpj
    public final zzhy zzfs() {
        return this.zzamk.zzfs();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhd {
        if (this.zzaml && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzbcn.zzaob++;
            this.zzamk.zzfo();
            return true;
        }
        try {
            if (!this.zzamk.zzb(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzbcn.zzaoa++;
            return true;
        } catch (zziv | zzja e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zzge() throws zzhd {
        try {
            this.zzamk.zzfp();
        } catch (zzja e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhc, com.google.android.gms.internal.ads.zzhi
    public final void zza(int i, Object obj) throws zzhd {
        if (i == 2) {
            this.zzamk.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzamk.setStreamType(((Integer) obj).intValue());
        } else {
            super.zza(i, obj);
        }
    }

    public static /* synthetic */ boolean zza(zzjb zzjbVar, boolean z) {
        zzjbVar.zzamp = true;
        return true;
    }
}
