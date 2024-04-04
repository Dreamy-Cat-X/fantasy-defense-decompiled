package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzlu extends zzhc {
    private static final byte[] zzbbd = zzps.zzbi("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzhs zzahw;
    private ByteBuffer[] zzale;
    private final zzlw zzbbe;
    private final zzjs<zzju> zzbbf;
    private final boolean zzbbg;
    private final zzjo zzbbh;
    private final zzjo zzbbi;
    private final zzhu zzbbj;
    private final List<Long> zzbbk;
    private final MediaCodec.BufferInfo zzbbl;
    private zzjq<zzju> zzbbm;
    private zzjq<zzju> zzbbn;
    private MediaCodec zzbbo;
    private zzlv zzbbp;
    private boolean zzbbq;
    private boolean zzbbr;
    private boolean zzbbs;
    private boolean zzbbt;
    private boolean zzbbu;
    private boolean zzbbv;
    private boolean zzbbw;
    private boolean zzbbx;
    private boolean zzbby;
    private ByteBuffer[] zzbbz;
    private long zzbca;
    private int zzbcb;
    private int zzbcc;
    private boolean zzbcd;
    private boolean zzbce;
    private int zzbcf;
    private int zzbcg;
    private boolean zzbch;
    private boolean zzbci;
    private boolean zzbcj;
    private boolean zzbck;
    private boolean zzbcl;
    private boolean zzbcm;
    protected zzjl zzbcn;

    public zzlu(int i, zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z) {
        super(i);
        zzpf.checkState(zzps.SDK_INT >= 16);
        this.zzbbe = (zzlw) zzpf.checkNotNull(zzlwVar);
        this.zzbbf = null;
        this.zzbbg = z;
        this.zzbbh = new zzjo(0);
        this.zzbbi = new zzjo(0);
        this.zzbbj = new zzhu();
        this.zzbbk = new ArrayList();
        this.zzbbl = new MediaCodec.BufferInfo();
        this.zzbcf = 0;
        this.zzbcg = 0;
    }

    protected void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhd {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhc
    public void onStarted() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhc
    public void onStopped() {
    }

    protected abstract int zza(zzlw zzlwVar, zzhs zzhsVar) throws zzmc;

    protected void zza(zzjo zzjoVar) {
    }

    protected abstract void zza(zzlv zzlvVar, MediaCodec mediaCodec, zzhs zzhsVar, MediaCrypto mediaCrypto) throws zzmc;

    protected abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhd;

    protected boolean zza(MediaCodec mediaCodec, boolean z, zzhs zzhsVar, zzhs zzhsVar2) {
        return false;
    }

    protected boolean zza(zzlv zzlvVar) {
        return true;
    }

    protected void zzc(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhc, com.google.android.gms.internal.ads.zzia
    public final int zzeg() {
        return 4;
    }

    protected void zzge() throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public final int zza(zzhs zzhsVar) throws zzhd {
        try {
            return zza(this.zzbbe, zzhsVar);
        } catch (zzmc e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzlv zza(zzlw zzlwVar, zzhs zzhsVar, boolean z) throws zzmc {
        return zzlwVar.zzc(zzhsVar.zzahb, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzhc() throws zzhd {
        zzhs zzhsVar;
        if (this.zzbbo != null || (zzhsVar = this.zzahw) == null) {
            return;
        }
        this.zzbbm = this.zzbbn;
        String str = zzhsVar.zzahb;
        zzjq<zzju> zzjqVar = this.zzbbm;
        if (zzjqVar != null) {
            int state = zzjqVar.getState();
            if (state == 0) {
                throw zzhd.zza(this.zzbbm.zzgp(), getIndex());
            }
            if (state == 3 || state == 4) {
                this.zzbbm.zzgo();
                throw new NoSuchMethodError();
            }
            return;
        }
        if (this.zzbbp == null) {
            try {
                this.zzbbp = zza(this.zzbbe, this.zzahw, false);
            } catch (zzmc e) {
                zza(new zzlx(this.zzahw, (Throwable) e, false, -49998));
            }
            if (this.zzbbp == null) {
                zza(new zzlx(this.zzahw, (Throwable) null, false, -49999));
            }
        }
        if (zza(this.zzbbp)) {
            String str2 = this.zzbbp.name;
            this.zzbbq = zzps.SDK_INT < 21 && this.zzahw.zzahd.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.zzbbr = zzps.SDK_INT < 18 || (zzps.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzps.SDK_INT == 19 && zzps.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.zzbbs = zzps.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzps.DEVICE) || "flounder_lte".equals(zzps.DEVICE) || "grouper".equals(zzps.DEVICE) || "tilapia".equals(zzps.DEVICE));
            this.zzbbt = zzps.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.zzbbu = (zzps.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzps.SDK_INT <= 19 && "hb2000".equals(zzps.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.zzbbv = zzps.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
            this.zzbbw = zzps.SDK_INT <= 18 && this.zzahw.zzahl == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String valueOf = String.valueOf(str2);
                zzpt.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                this.zzbbo = MediaCodec.createByCodecName(str2);
                zzpt.endSection();
                zzpt.beginSection("configureCodec");
                zza(this.zzbbp, this.zzbbo, this.zzahw, (MediaCrypto) null);
                zzpt.endSection();
                zzpt.beginSection("startCodec");
                this.zzbbo.start();
                zzpt.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.zzbbz = this.zzbbo.getInputBuffers();
                this.zzale = this.zzbbo.getOutputBuffers();
            } catch (Exception e2) {
                zza(new zzlx(this.zzahw, (Throwable) e2, false, str2));
            }
            this.zzbca = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.zzbcb = -1;
            this.zzbcc = -1;
            this.zzbcm = true;
            this.zzbcn.zzanx++;
        }
    }

    private final void zza(zzlx zzlxVar) throws zzhd {
        throw zzhd.zza(zzlxVar, getIndex());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec zzhd() {
        return this.zzbbo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlv zzhe() {
        return this.zzbbp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhc
    public void zze(boolean z) throws zzhd {
        this.zzbcn = new zzjl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhc
    public void zza(long j, boolean z) throws zzhd {
        this.zzbcj = false;
        this.zzbck = false;
        if (this.zzbbo != null) {
            this.zzbca = -9223372036854775807L;
            this.zzbcb = -1;
            this.zzbcc = -1;
            this.zzbcm = true;
            this.zzbcl = false;
            this.zzbcd = false;
            this.zzbbk.clear();
            this.zzbbx = false;
            this.zzbby = false;
            if (this.zzbbr || (this.zzbbu && this.zzbci)) {
                zzhf();
                zzhc();
            } else if (this.zzbcg != 0) {
                zzhf();
                zzhc();
            } else {
                this.zzbbo.flush();
                this.zzbch = false;
            }
            if (!this.zzbce || this.zzahw == null) {
                return;
            }
            this.zzbcf = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhc
    public void zzeh() {
        this.zzahw = null;
        try {
            zzhf();
            try {
                if (this.zzbbm != null) {
                    this.zzbbf.zza(this.zzbbm);
                }
                try {
                    if (this.zzbbn != null && this.zzbbn != this.zzbbm) {
                        this.zzbbf.zza(this.zzbbn);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.zzbbn != null && this.zzbbn != this.zzbbm) {
                        this.zzbbf.zza(this.zzbbn);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.zzbbm != null) {
                    this.zzbbf.zza(this.zzbbm);
                }
                try {
                    if (this.zzbbn != null && this.zzbbn != this.zzbbm) {
                        this.zzbbf.zza(this.zzbbn);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.zzbbn != null && this.zzbbn != this.zzbbm) {
                        this.zzbbf.zza(this.zzbbn);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzhf() {
        this.zzbca = -9223372036854775807L;
        this.zzbcb = -1;
        this.zzbcc = -1;
        this.zzbcl = false;
        this.zzbcd = false;
        this.zzbbk.clear();
        this.zzbbz = null;
        this.zzale = null;
        this.zzbbp = null;
        this.zzbce = false;
        this.zzbch = false;
        this.zzbbq = false;
        this.zzbbr = false;
        this.zzbbs = false;
        this.zzbbt = false;
        this.zzbbu = false;
        this.zzbbw = false;
        this.zzbbx = false;
        this.zzbby = false;
        this.zzbci = false;
        this.zzbcf = 0;
        this.zzbcg = 0;
        this.zzbbh.zzda = null;
        if (this.zzbbo != null) {
            this.zzbcn.zzany++;
            try {
                this.zzbbo.stop();
                try {
                    this.zzbbo.release();
                    this.zzbbo = null;
                    zzjq<zzju> zzjqVar = this.zzbbm;
                    if (zzjqVar == null || this.zzbbn == zzjqVar) {
                        return;
                    }
                    try {
                        this.zzbbf.zza(zzjqVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.zzbbo = null;
                    zzjq<zzju> zzjqVar2 = this.zzbbm;
                    if (zzjqVar2 != null && this.zzbbn != zzjqVar2) {
                        try {
                            this.zzbbf.zza(zzjqVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.zzbbo.release();
                    this.zzbbo = null;
                    zzjq<zzju> zzjqVar3 = this.zzbbm;
                    if (zzjqVar3 != null && this.zzbbn != zzjqVar3) {
                        try {
                            this.zzbbf.zza(zzjqVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.zzbbo = null;
                    zzjq<zzju> zzjqVar4 = this.zzbbm;
                    if (zzjqVar4 != null && this.zzbbn != zzjqVar4) {
                        try {
                            this.zzbbf.zza(zzjqVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzb(long j, long j2) throws zzhd {
        if (this.zzbck) {
            zzge();
            return;
        }
        if (this.zzahw == null) {
            this.zzbbi.clear();
            int zza = zza(this.zzbbj, this.zzbbi, true);
            if (zza != -5) {
                if (zza == -4) {
                    zzpf.checkState(this.zzbbi.zzgi());
                    this.zzbcj = true;
                    zzhh();
                    return;
                }
                return;
            }
            zzd(this.zzbbj.zzahw);
        }
        zzhc();
        if (this.zzbbo != null) {
            zzpt.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzhg());
            zzpt.endSection();
        } else {
            zzdn(j);
            this.zzbbi.clear();
            int zza2 = zza(this.zzbbj, this.zzbbi, false);
            if (zza2 == -5) {
                zzd(this.zzbbj.zzahw);
            } else if (zza2 == -4) {
                zzpf.checkState(this.zzbbi.zzgi());
                this.zzbcj = true;
                zzhh();
            }
        }
        this.zzbcn.zzgn();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzhg() throws zzhd {
        int position;
        int zza;
        boolean z;
        MediaCodec mediaCodec = this.zzbbo;
        if (mediaCodec == null || this.zzbcg == 2 || this.zzbcj) {
            return false;
        }
        if (this.zzbcb < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzbcb = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.zzbbh.zzda = this.zzbbz[dequeueInputBuffer];
            this.zzbbh.clear();
        }
        if (this.zzbcg == 1) {
            if (!this.zzbbt) {
                this.zzbci = true;
                this.zzbbo.queueInputBuffer(this.zzbcb, 0, 0, 0L, 4);
                this.zzbcb = -1;
            }
            this.zzbcg = 2;
            return false;
        }
        if (this.zzbbx) {
            this.zzbbx = false;
            this.zzbbh.zzda.put(zzbbd);
            this.zzbbo.queueInputBuffer(this.zzbcb, 0, zzbbd.length, 0L, 0);
            this.zzbcb = -1;
            this.zzbch = true;
            return true;
        }
        if (this.zzbcl) {
            zza = -4;
            position = 0;
        } else {
            if (this.zzbcf == 1) {
                for (int i = 0; i < this.zzahw.zzahd.size(); i++) {
                    this.zzbbh.zzda.put(this.zzahw.zzahd.get(i));
                }
                this.zzbcf = 2;
            }
            position = this.zzbbh.zzda.position();
            zza = zza(this.zzbbj, this.zzbbh, false);
        }
        if (zza == -3) {
            return false;
        }
        if (zza == -5) {
            if (this.zzbcf == 2) {
                this.zzbbh.clear();
                this.zzbcf = 1;
            }
            zzd(this.zzbbj.zzahw);
            return true;
        }
        if (this.zzbbh.zzgi()) {
            if (this.zzbcf == 2) {
                this.zzbbh.clear();
                this.zzbcf = 1;
            }
            this.zzbcj = true;
            if (!this.zzbch) {
                zzhh();
                return false;
            }
            try {
                if (!this.zzbbt) {
                    this.zzbci = true;
                    this.zzbbo.queueInputBuffer(this.zzbcb, 0, 0, 0L, 4);
                    this.zzbcb = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw zzhd.zza(e, getIndex());
            }
        }
        if (this.zzbcm && !this.zzbbh.zzgj()) {
            this.zzbbh.clear();
            if (this.zzbcf == 2) {
                this.zzbcf = 1;
            }
            return true;
        }
        this.zzbcm = false;
        boolean isEncrypted = this.zzbbh.isEncrypted();
        zzjq<zzju> zzjqVar = this.zzbbm;
        if (zzjqVar != null) {
            int state = zzjqVar.getState();
            if (state == 0) {
                throw zzhd.zza(this.zzbbm.zzgp(), getIndex());
            }
            if (state != 4 && (isEncrypted || !this.zzbbg)) {
                z = true;
                this.zzbcl = z;
                if (!z) {
                    return false;
                }
                if (this.zzbbq && !isEncrypted) {
                    zzpl.zzp(this.zzbbh.zzda);
                    if (this.zzbbh.zzda.position() == 0) {
                        return true;
                    }
                    this.zzbbq = false;
                }
                try {
                    long j = this.zzbbh.zzaoi;
                    if (this.zzbbh.zzgh()) {
                        this.zzbbk.add(Long.valueOf(j));
                    }
                    this.zzbbh.zzda.flip();
                    zza(this.zzbbh);
                    if (isEncrypted) {
                        MediaCodec.CryptoInfo zzgm = this.zzbbh.zzaoh.zzgm();
                        if (position != 0) {
                            if (zzgm.numBytesOfClearData == null) {
                                zzgm.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = zzgm.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.zzbbo.queueSecureInputBuffer(this.zzbcb, 0, zzgm, j, 0);
                    } else {
                        this.zzbbo.queueInputBuffer(this.zzbcb, 0, this.zzbbh.zzda.limit(), j, 0);
                    }
                    this.zzbcb = -1;
                    this.zzbch = true;
                    this.zzbcf = 0;
                    this.zzbcn.zzanz++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzhd.zza(e2, getIndex());
                }
            }
        }
        z = false;
        this.zzbcl = z;
        if (!z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzd(zzhs zzhsVar) throws zzhd {
        MediaCodec mediaCodec;
        zzhs zzhsVar2 = this.zzahw;
        this.zzahw = zzhsVar;
        if ((!zzps.zza(zzhsVar.zzahe, zzhsVar2 == null ? null : zzhsVar2.zzahe)) != false) {
            if (this.zzahw.zzahe != null) {
                zzjs<zzju> zzjsVar = this.zzbbf;
                if (zzjsVar == null) {
                    throw zzhd.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
                zzjq<zzju> zza = zzjsVar.zza(Looper.myLooper(), this.zzahw.zzahe);
                this.zzbbn = zza;
                if (zza == this.zzbbm) {
                    this.zzbbf.zza(zza);
                }
            } else {
                this.zzbbn = null;
            }
        }
        if (this.zzbbn == this.zzbbm && (mediaCodec = this.zzbbo) != null && zza(mediaCodec, this.zzbbp.zzbco, zzhsVar2, this.zzahw)) {
            this.zzbce = true;
            this.zzbcf = 1;
            this.zzbbx = this.zzbbs && this.zzahw.width == zzhsVar2.width && this.zzahw.height == zzhsVar2.height;
        } else if (this.zzbch) {
            this.zzbcg = 1;
        } else {
            zzhf();
            zzhc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public boolean zzfe() {
        return this.zzbck;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public boolean isReady() {
        if (this.zzahw == null || this.zzbcl) {
            return false;
        }
        if (zzej() || this.zzbcc >= 0) {
            return true;
        }
        return this.zzbca != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzbca;
    }

    private final boolean zzd(long j, long j2) throws zzhd {
        boolean zza;
        boolean z;
        if (this.zzbcc < 0) {
            if (this.zzbbv && this.zzbci) {
                try {
                    this.zzbcc = this.zzbbo.dequeueOutputBuffer(this.zzbbl, 0L);
                } catch (IllegalStateException unused) {
                    zzhh();
                    if (this.zzbck) {
                        zzhf();
                    }
                    return false;
                }
            } else {
                this.zzbcc = this.zzbbo.dequeueOutputBuffer(this.zzbbl, 0L);
            }
            int i = this.zzbcc;
            if (i < 0) {
                if (i != -2) {
                    if (i == -3) {
                        this.zzale = this.zzbbo.getOutputBuffers();
                        return true;
                    }
                    if (this.zzbbt && (this.zzbcj || this.zzbcg == 2)) {
                        zzhh();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.zzbbo.getOutputFormat();
                if (this.zzbbs && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzbby = true;
                } else {
                    if (this.zzbbw) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzbbo, outputFormat);
                }
                return true;
            }
            if (this.zzbby) {
                this.zzbby = false;
                this.zzbbo.releaseOutputBuffer(i, false);
                this.zzbcc = -1;
                return true;
            }
            if ((this.zzbbl.flags & 4) != 0) {
                zzhh();
                this.zzbcc = -1;
                return false;
            }
            ByteBuffer byteBuffer = this.zzale[this.zzbcc];
            if (byteBuffer != null) {
                byteBuffer.position(this.zzbbl.offset);
                byteBuffer.limit(this.zzbbl.offset + this.zzbbl.size);
            }
            long j3 = this.zzbbl.presentationTimeUs;
            int size = this.zzbbk.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                if (this.zzbbk.get(i2).longValue() == j3) {
                    this.zzbbk.remove(i2);
                    z = true;
                    break;
                }
                i2++;
            }
            this.zzbcd = z;
        }
        if (this.zzbbv && this.zzbci) {
            try {
                zza = zza(j, j2, this.zzbbo, this.zzale[this.zzbcc], this.zzbcc, this.zzbbl.flags, this.zzbbl.presentationTimeUs, this.zzbcd);
            } catch (IllegalStateException unused2) {
                zzhh();
                if (this.zzbck) {
                    zzhf();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.zzbbo;
            ByteBuffer[] byteBufferArr = this.zzale;
            int i3 = this.zzbcc;
            zza = zza(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzbbl.flags, this.zzbbl.presentationTimeUs, this.zzbcd);
        }
        if (!zza) {
            return false;
        }
        long j4 = this.zzbbl.presentationTimeUs;
        this.zzbcc = -1;
        return true;
    }

    private final void zzhh() throws zzhd {
        if (this.zzbcg == 2) {
            zzhf();
            zzhc();
        } else {
            this.zzbck = true;
            zzge();
        }
    }
}
