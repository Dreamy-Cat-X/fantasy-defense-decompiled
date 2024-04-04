package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.sncompany.newtower.Texture2D;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzqd extends zzlu {
    private static final int[] zzbla = {1920, 1600, 1440, 1280, 960, 854, 640, 540, Texture2D.SCRHEIGHT_480};
    private final Context context;
    private int zzaic;
    private boolean zzaln;
    private final zzqh zzblb;
    private final zzqi zzblc;
    private final long zzbld;
    private final int zzble;
    private final boolean zzblf;
    private final long[] zzblg;
    private zzhs[] zzblh;
    private zzqf zzbli;
    private Surface zzblj;
    private Surface zzblk;
    private int zzbll;
    private boolean zzblm;
    private long zzbln;
    private long zzblo;
    private int zzblp;
    private int zzblq;
    private int zzblr;
    private float zzbls;
    private int zzblt;
    private int zzblu;
    private int zzblv;
    private float zzblw;
    private int zzblx;
    private int zzbly;
    private int zzblz;
    private float zzbma;
    zzqe zzbmb;
    private long zzbmc;
    private int zzbmd;

    public zzqd(Context context, zzlw zzlwVar, long j, Handler handler, zzqj zzqjVar, int i) {
        this(context, zzlwVar, 0L, null, false, handler, zzqjVar, -1);
    }

    private static boolean zzem(long j) {
        return j < -30000;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzqd(Context context, zzlw zzlwVar, long j, zzjs<zzju> zzjsVar, boolean z, Handler handler, zzqj zzqjVar, int i) {
        super(2, zzlwVar, null, false);
        boolean z2 = false;
        this.zzbld = 0L;
        this.zzble = -1;
        this.context = context.getApplicationContext();
        this.zzblb = new zzqh(context);
        this.zzblc = new zzqi(handler, zzqjVar);
        if (zzps.SDK_INT <= 22 && "foster".equals(zzps.DEVICE) && "NVIDIA".equals(zzps.MANUFACTURER)) {
            z2 = true;
        }
        this.zzblf = z2;
        this.zzblg = new long[10];
        this.zzbmc = -9223372036854775807L;
        this.zzbln = -9223372036854775807L;
        this.zzblt = -1;
        this.zzblu = -1;
        this.zzblw = -1.0f;
        this.zzbls = -1.0f;
        this.zzbll = 1;
        zzjl();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final int zza(zzlw zzlwVar, zzhs zzhsVar) throws zzmc {
        boolean z;
        String str = zzhsVar.zzahb;
        if (!zzpi.zzbd(str)) {
            return 0;
        }
        zzjn zzjnVar = zzhsVar.zzahe;
        if (zzjnVar != null) {
            z = false;
            for (int i = 0; i < zzjnVar.zzaog; i++) {
                z |= zzjnVar.zzac(i).zzaok;
            }
        } else {
            z = false;
        }
        zzlv zzc = zzlwVar.zzc(str, z);
        if (zzc == null) {
            return 1;
        }
        boolean zzaz = zzc.zzaz(zzhsVar.zzagy);
        if (zzaz && zzhsVar.width > 0 && zzhsVar.height > 0) {
            if (zzps.SDK_INT >= 21) {
                zzaz = zzc.zza(zzhsVar.width, zzhsVar.height, zzhsVar.zzahf);
            } else {
                boolean z2 = zzhsVar.width * zzhsVar.height <= zzly.zzhk();
                if (!z2) {
                    int i2 = zzhsVar.width;
                    int i3 = zzhsVar.height;
                    String str2 = zzps.zzbkk;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(i3);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                zzaz = z2;
            }
        }
        return (zzaz ? 3 : 2) | (zzc.zzbco ? 8 : 4) | (zzc.zzaln ? 16 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void zze(boolean z) throws zzhd {
        super.zze(z);
        int i = zzei().zzaic;
        this.zzaic = i;
        this.zzaln = i != 0;
        this.zzblc.zza(this.zzbcn);
        this.zzblb.enable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhc
    public final void zza(zzhs[] zzhsVarArr, long j) throws zzhd {
        this.zzblh = zzhsVarArr;
        if (this.zzbmc == -9223372036854775807L) {
            this.zzbmc = j;
        } else {
            int i = this.zzbmd;
            long[] jArr = this.zzblg;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zzbmd = i + 1;
            }
            this.zzblg[this.zzbmd - 1] = j;
        }
        super.zza(zzhsVarArr, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void zza(long j, boolean z) throws zzhd {
        super.zza(j, z);
        zzjj();
        this.zzblq = 0;
        int i = this.zzbmd;
        if (i != 0) {
            this.zzbmc = this.zzblg[i - 1];
            this.zzbmd = 0;
        }
        if (z) {
            zzji();
        } else {
            this.zzbln = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhx
    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.zzblm || (((surface = this.zzblk) != null && this.zzblj == surface) || zzhd() == null))) {
            this.zzbln = -9223372036854775807L;
            return true;
        }
        if (this.zzbln == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzbln) {
            return true;
        }
        this.zzbln = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void onStarted() {
        super.onStarted();
        this.zzblp = 0;
        this.zzblo = SystemClock.elapsedRealtime();
        this.zzbln = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void onStopped() {
        zzjo();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhc
    public final void zzeh() {
        this.zzblt = -1;
        this.zzblu = -1;
        this.zzblw = -1.0f;
        this.zzbls = -1.0f;
        this.zzbmc = -9223372036854775807L;
        this.zzbmd = 0;
        zzjl();
        zzjj();
        this.zzblb.disable();
        this.zzbmb = null;
        this.zzaln = false;
        try {
            super.zzeh();
        } finally {
            this.zzbcn.zzgn();
            this.zzblc.zzb(this.zzbcn);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhc, com.google.android.gms.internal.ads.zzhi
    public final void zza(int i, Object obj) throws zzhd {
        if (i != 1) {
            if (i == 4) {
                this.zzbll = ((Integer) obj).intValue();
                MediaCodec zzhd = zzhd();
                if (zzhd != null) {
                    zzhd.setVideoScalingMode(this.zzbll);
                    return;
                }
                return;
            }
            super.zza(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.zzblk;
            if (surface2 != null) {
                surface = surface2;
            } else {
                zzlv zzhe = zzhe();
                if (zzhe != null && zzn(zzhe.zzbcp)) {
                    surface = zzpz.zzc(this.context, zzhe.zzbcp);
                    this.zzblk = surface;
                }
            }
        }
        if (this.zzblj != surface) {
            this.zzblj = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec zzhd2 = zzhd();
                if (zzps.SDK_INT >= 23 && zzhd2 != null && surface != null) {
                    zzhd2.setOutputSurface(surface);
                } else {
                    zzhf();
                    zzhc();
                }
            }
            if (surface != null && surface != this.zzblk) {
                zzjn();
                zzjj();
                if (state == 2) {
                    zzji();
                    return;
                }
                return;
            }
            zzjl();
            zzjj();
            return;
        }
        if (surface == null || surface == this.zzblk) {
            return;
        }
        zzjn();
        if (this.zzblm) {
            this.zzblc.zza(this.zzblj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(zzlv zzlvVar) {
        return this.zzblj != null || zzn(zzlvVar.zzbcp);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zza(zzlv zzlvVar, MediaCodec mediaCodec, zzhs zzhsVar, MediaCrypto mediaCrypto) throws zzmc {
        zzqf zzqfVar;
        Point point;
        zzhs[] zzhsVarArr = this.zzblh;
        int i = zzhsVar.width;
        int i2 = zzhsVar.height;
        int zzi = zzi(zzhsVar);
        if (zzhsVarArr.length == 1) {
            zzqfVar = new zzqf(i, i2, zzi);
        } else {
            boolean z = false;
            for (zzhs zzhsVar2 : zzhsVarArr) {
                if (zza(zzlvVar.zzbco, zzhsVar, zzhsVar2)) {
                    z |= zzhsVar2.width == -1 || zzhsVar2.height == -1;
                    i = Math.max(i, zzhsVar2.width);
                    i2 = Math.max(i2, zzhsVar2.height);
                    zzi = Math.max(zzi, zzi(zzhsVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzhsVar.height > zzhsVar.width;
                int i3 = z2 ? zzhsVar.height : zzhsVar.width;
                int i4 = z2 ? zzhsVar.width : zzhsVar.height;
                float f = i4 / i3;
                int[] iArr = zzbla;
                int length = iArr.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (i7 * f);
                    if (i7 <= i3 || i8 <= i4) {
                        break;
                    }
                    int i9 = i3;
                    int i10 = i4;
                    if (zzps.SDK_INT >= 21) {
                        int i11 = z2 ? i8 : i7;
                        if (!z2) {
                            i7 = i8;
                        }
                        Point zzd = zzlvVar.zzd(i11, i7);
                        if (zzlvVar.zza(zzd.x, zzd.y, zzhsVar.zzahf)) {
                            point = zzd;
                            break;
                        }
                        i5++;
                        length = i6;
                        iArr = iArr2;
                        i3 = i9;
                        i4 = i10;
                    } else {
                        int zzf = zzps.zzf(i7, 16) << 4;
                        int zzf2 = zzps.zzf(i8, 16) << 4;
                        if (zzf * zzf2 <= zzly.zzhk()) {
                            int i12 = z2 ? zzf2 : zzf;
                            if (!z2) {
                                zzf = zzf2;
                            }
                            point = new Point(i12, zzf);
                        } else {
                            i5++;
                            length = i6;
                            iArr = iArr2;
                            i3 = i9;
                            i4 = i10;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzi = Math.max(zzi, zza(zzhsVar.zzahb, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzqfVar = new zzqf(i, i2, zzi);
        }
        this.zzbli = zzqfVar;
        boolean z3 = this.zzblf;
        int i13 = this.zzaic;
        MediaFormat zzfa = zzhsVar.zzfa();
        zzfa.setInteger("max-width", zzqfVar.width);
        zzfa.setInteger("max-height", zzqfVar.height);
        if (zzqfVar.zzbmf != -1) {
            zzfa.setInteger("max-input-size", zzqfVar.zzbmf);
        }
        if (z3) {
            zzfa.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            zzfa.setFeatureEnabled("tunneled-playback", true);
            zzfa.setInteger("audio-session-id", i13);
        }
        if (this.zzblj == null) {
            zzpf.checkState(zzn(zzlvVar.zzbcp));
            if (this.zzblk == null) {
                this.zzblk = zzpz.zzc(this.context, zzlvVar.zzbcp);
            }
            this.zzblj = this.zzblk;
        }
        mediaCodec.configure(zzfa, this.zzblj, (MediaCrypto) null, 0);
        if (zzps.SDK_INT < 23 || !this.zzaln) {
            return;
        }
        this.zzbmb = new zzqe(this, mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzhf() {
        try {
            super.zzhf();
        } finally {
            Surface surface = this.zzblk;
            if (surface != null) {
                if (this.zzblj == surface) {
                    this.zzblj = null;
                }
                this.zzblk.release();
                this.zzblk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zzc(String str, long j, long j2) {
        this.zzblc.zza(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzd(zzhs zzhsVar) throws zzhd {
        super.zzd(zzhsVar);
        this.zzblc.zzb(zzhsVar);
        this.zzbls = zzhsVar.zzahh == -1.0f ? 1.0f : zzhsVar.zzahh;
        this.zzblr = zzj(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zza(zzjo zzjoVar) {
        if (zzps.SDK_INT >= 23 || !this.zzaln) {
            return;
        }
        zzjk();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzblt = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzblu = integer2;
        this.zzblw = this.zzbls;
        if (zzps.SDK_INT >= 21) {
            int i = this.zzblr;
            if (i == 90 || i == 270) {
                int i2 = this.zzblt;
                this.zzblt = this.zzblu;
                this.zzblu = i2;
                this.zzblw = 1.0f / this.zzblw;
            }
        } else {
            this.zzblv = this.zzblr;
        }
        mediaCodec.setVideoScalingMode(this.zzbll);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(MediaCodec mediaCodec, boolean z, zzhs zzhsVar, zzhs zzhsVar2) {
        return zza(z, zzhsVar, zzhsVar2) && zzhsVar2.width <= this.zzbli.width && zzhsVar2.height <= this.zzbli.height && zzhsVar2.zzahc <= this.zzbli.zzbmf;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzbmd;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzblg;
            if (j3 < jArr[0]) {
                break;
            }
            this.zzbmc = jArr[0];
            int i4 = i3 - 1;
            this.zzbmd = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j4 = j3 - this.zzbmc;
        if (z) {
            zza(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.zzblj == this.zzblk) {
            if (!zzem(j5)) {
                return false;
            }
            zza(mediaCodec, i, j4);
            return true;
        }
        if (!this.zzblm) {
            if (zzps.SDK_INT >= 21) {
                zza(mediaCodec, i, j4, System.nanoTime());
            } else {
                zzb(mediaCodec, i, j4);
            }
            return true;
        }
        if (getState() != 2) {
            return false;
        }
        long elapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long nanoTime = System.nanoTime();
        long zzf = this.zzblb.zzf(j3, (elapsedRealtime * 1000) + nanoTime);
        long j6 = (zzf - nanoTime) / 1000;
        if (zzem(j6)) {
            zzpt.beginSection("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            zzpt.endSection();
            this.zzbcn.zzaoc++;
            this.zzblp++;
            this.zzblq++;
            this.zzbcn.zzaod = Math.max(this.zzblq, this.zzbcn.zzaod);
            if (this.zzblp == this.zzble) {
                zzjo();
            }
            return true;
        }
        if (zzps.SDK_INT >= 21) {
            if (j6 < 50000) {
                zza(mediaCodec, i, j4, zzf);
                return true;
            }
        } else if (j6 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            if (j6 > 11000) {
                try {
                    Thread.sleep((j6 - WorkRequest.MIN_BACKOFF_MILLIS) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            zzb(mediaCodec, i, j4);
            return true;
        }
        return false;
    }

    private final void zza(MediaCodec mediaCodec, int i, long j) {
        zzpt.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzpt.endSection();
        this.zzbcn.zzaob++;
    }

    private final void zzb(MediaCodec mediaCodec, int i, long j) {
        zzjm();
        zzpt.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzpt.endSection();
        this.zzbcn.zzaoa++;
        this.zzblq = 0;
        zzjk();
    }

    private final void zza(MediaCodec mediaCodec, int i, long j, long j2) {
        zzjm();
        zzpt.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzpt.endSection();
        this.zzbcn.zzaoa++;
        this.zzblq = 0;
        zzjk();
    }

    private final boolean zzn(boolean z) {
        if (zzps.SDK_INT < 23 || this.zzaln) {
            return false;
        }
        return !z || zzpz.zzc(this.context);
    }

    private final void zzji() {
        this.zzbln = -9223372036854775807L;
    }

    private final void zzjj() {
        MediaCodec zzhd;
        this.zzblm = false;
        if (zzps.SDK_INT < 23 || !this.zzaln || (zzhd = zzhd()) == null) {
            return;
        }
        this.zzbmb = new zzqe(this, zzhd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzjk() {
        if (this.zzblm) {
            return;
        }
        this.zzblm = true;
        this.zzblc.zza(this.zzblj);
    }

    private final void zzjl() {
        this.zzblx = -1;
        this.zzbly = -1;
        this.zzbma = -1.0f;
        this.zzblz = -1;
    }

    private final void zzjm() {
        if (this.zzblx == this.zzblt && this.zzbly == this.zzblu && this.zzblz == this.zzblv && this.zzbma == this.zzblw) {
            return;
        }
        this.zzblc.zza(this.zzblt, this.zzblu, this.zzblv, this.zzblw);
        this.zzblx = this.zzblt;
        this.zzbly = this.zzblu;
        this.zzblz = this.zzblv;
        this.zzbma = this.zzblw;
    }

    private final void zzjn() {
        if (this.zzblx == -1 && this.zzbly == -1) {
            return;
        }
        this.zzblc.zza(this.zzblt, this.zzblu, this.zzblv, this.zzblw);
    }

    private final void zzjo() {
        if (this.zzblp > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzblc.zzf(this.zzblp, elapsedRealtime - this.zzblo);
            this.zzblp = 0;
            this.zzblo = elapsedRealtime;
        }
    }

    private static int zzi(zzhs zzhsVar) {
        if (zzhsVar.zzahc != -1) {
            return zzhsVar.zzahc;
        }
        return zza(zzhsVar.zzahb, zzhsVar.width, zzhsVar.height);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zza(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                if ("BRAVIA 4K 2015".equals(zzps.MODEL)) {
                    return -1;
                }
                i3 = ((zzps.zzf(i, 16) * zzps.zzf(i2, 16)) << 4) << 4;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            }
            if (c != 3) {
                if (c != 4 && c != 5) {
                    return -1;
                }
                i3 = i * i2;
                return (i3 * 3) / (i4 * 2);
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private static boolean zza(boolean z, zzhs zzhsVar, zzhs zzhsVar2) {
        if (!zzhsVar.zzahb.equals(zzhsVar2.zzahb) || zzj(zzhsVar) != zzj(zzhsVar2)) {
            return false;
        }
        if (z) {
            return true;
        }
        return zzhsVar.width == zzhsVar2.width && zzhsVar.height == zzhsVar2.height;
    }

    private static int zzj(zzhs zzhsVar) {
        if (zzhsVar.zzahg == -1) {
            return 0;
        }
        return zzhsVar.zzahg;
    }
}
