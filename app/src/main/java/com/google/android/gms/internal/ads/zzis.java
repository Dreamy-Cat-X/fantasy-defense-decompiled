package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import com.sncompany.newtower.GameRenderer;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzis {
    private static boolean zzajo = false;
    private static boolean zzajp = false;
    private int streamType;
    private zzhy zzaff;
    private int zzahm;
    private final zziz zzajr;
    private final zzji zzajs;
    private final zzii[] zzajt;
    private final zziy zzaju;
    private final long[] zzajw;
    private final zziu zzajx;
    private final LinkedList<zzix> zzajy;
    private AudioTrack zzajz;
    private int zzaka;
    private int zzakb;
    private int zzakc;
    private boolean zzakd;
    private int zzake;
    private long zzakf;
    private zzhy zzakg;
    private long zzakh;
    private long zzaki;
    private ByteBuffer zzakj;
    private int zzakk;
    private int zzakl;
    private int zzakm;
    private long zzakn;
    private long zzako;
    private boolean zzakp;
    private long zzakq;
    private Method zzakr;
    private int zzaks;
    private long zzakt;
    private long zzaku;
    private int zzakv;
    private long zzakw;
    private long zzakx;
    private int zzaky;
    private int zzakz;
    private long zzala;
    private long zzalb;
    private long zzalc;
    private zzii[] zzald;
    private ByteBuffer[] zzale;
    private ByteBuffer zzalf;
    private ByteBuffer zzalg;
    private byte[] zzalh;
    private int zzali;
    private int zzalj;
    private boolean zzalk;
    private boolean zzall;
    private int zzalm;
    private boolean zzaln;
    private boolean zzalo;
    private long zzalp;
    private float zzdg;
    private final zzif zzajq = null;
    private final ConditionVariable zzajv = new ConditionVariable(true);

    public zzis(zzif zzifVar, zzii[] zziiVarArr, zziy zziyVar) {
        zzir zzirVar = null;
        this.zzaju = zziyVar;
        if (zzps.SDK_INT >= 18) {
            try {
                this.zzakr = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzps.SDK_INT >= 19) {
            this.zzajx = new zzit();
        } else {
            this.zzajx = new zziu(zzirVar);
        }
        this.zzajr = new zziz();
        this.zzajs = new zzji();
        zzii[] zziiVarArr2 = new zzii[zziiVarArr.length + 3];
        this.zzajt = zziiVarArr2;
        zziiVarArr2[0] = new zzjg();
        zzii[] zziiVarArr3 = this.zzajt;
        zziiVarArr3[1] = this.zzajr;
        System.arraycopy(zziiVarArr, 0, zziiVarArr3, 2, zziiVarArr.length);
        this.zzajt[zziiVarArr.length + 2] = this.zzajs;
        this.zzajw = new long[10];
        this.zzdg = 1.0f;
        this.zzakz = 0;
        this.streamType = 3;
        this.zzalm = 0;
        this.zzaff = zzhy.zzahx;
        this.zzalj = -1;
        this.zzald = new zzii[0];
        this.zzale = new ByteBuffer[0];
        this.zzajy = new LinkedList<>();
    }

    public final long zzj(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        if (!(isInitialized() && this.zzakz != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.zzajz.getPlayState() == 3) {
            long zzgc = this.zzajx.zzgc();
            if (zzgc != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzako >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = this.zzajw;
                    int i = this.zzakl;
                    jArr[i] = zzgc - nanoTime;
                    this.zzakl = (i + 1) % 10;
                    int i2 = this.zzakm;
                    if (i2 < 10) {
                        this.zzakm = i2 + 1;
                    }
                    this.zzako = nanoTime;
                    this.zzakn = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzakm;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzakn += this.zzajw[i3] / i4;
                        i3++;
                    }
                }
                if (!zzfx() && nanoTime - this.zzakq >= 500000) {
                    boolean zzfy = this.zzajx.zzfy();
                    this.zzakp = zzfy;
                    if (zzfy) {
                        long zzfz = this.zzajx.zzfz() / 1000;
                        long zzga = this.zzajx.zzga();
                        if (zzfz < this.zzalb) {
                            this.zzakp = false;
                        } else if (Math.abs(zzfz - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzga);
                            sb.append(", ");
                            sb.append(zzfz);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(zzgc);
                            Log.w("AudioTrack", sb.toString());
                            this.zzakp = false;
                        } else if (Math.abs(zzdw(zzga) - zzgc) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzga);
                            sb2.append(", ");
                            sb2.append(zzfz);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(zzgc);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzakp = false;
                        }
                    }
                    if (this.zzakr != null && !this.zzakd) {
                        try {
                            long intValue = (((Integer) r1.invoke(this.zzajz, null)).intValue() * 1000) - this.zzakf;
                            this.zzalc = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzalc = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzalc = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzakr = null;
                        }
                    }
                    this.zzakq = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzakp) {
            j = zzdw(this.zzajx.zzga() + zzdx(nanoTime2 - (this.zzajx.zzfz() / 1000)));
        } else {
            if (this.zzakm == 0) {
                j = this.zzajx.zzgc();
            } else {
                j = nanoTime2 + this.zzakn;
            }
            if (!z) {
                j -= this.zzalc;
            }
        }
        long j5 = this.zzala;
        while (!this.zzajy.isEmpty() && j >= zzix.zzb(this.zzajy.getFirst())) {
            zzix remove = this.zzajy.remove();
            this.zzaff = zzix.zza(remove);
            this.zzaki = zzix.zzb(remove);
            this.zzakh = zzix.zzc(remove) - this.zzala;
        }
        if (this.zzaff.zzahy == 1.0f) {
            j4 = (j + this.zzakh) - this.zzaki;
        } else {
            if (this.zzajy.isEmpty() && this.zzajs.zzgl() >= 1024) {
                j2 = this.zzakh;
                j3 = zzps.zza(j - this.zzaki, this.zzajs.zzgk(), this.zzajs.zzgl());
            } else {
                j2 = this.zzakh;
                double d = this.zzaff.zzahy;
                double d2 = j - this.zzaki;
                Double.isNaN(d);
                Double.isNaN(d2);
                j3 = (long) (d * d2);
            }
            j4 = j3 + j2;
        }
        return j5 + j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(String str, int i, int i2, int i3, int i4, int[] iArr) throws zziw {
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int max;
        boolean z2 = !"audio/raw".equals(str);
        if (z2) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1095064472:
                    if (str.equals("audio/vnd.dts")) {
                        c = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1505942594:
                    if (str.equals("audio/vnd.dts.hd")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            i5 = c != 0 ? c != 1 ? c != 2 ? c != 3 ? 0 : 8 : 7 : 6 : 5;
        } else {
            i5 = i3;
        }
        int i9 = i;
        if (z2) {
            z = false;
        } else {
            this.zzaks = zzps.zzg(i3, i9);
            this.zzajr.zzb(iArr);
            z = false;
            for (zzii zziiVar : this.zzajt) {
                try {
                    z |= zziiVar.zzb(i2, i9, i5);
                    if (zziiVar.isActive()) {
                        i9 = zziiVar.zzfj();
                        i5 = zziiVar.zzfk();
                    }
                } catch (zzih e) {
                    throw new zziw(e);
                }
            }
            if (z) {
                zzfn();
            }
        }
        switch (i9) {
            case 1:
                i6 = 4;
                break;
            case 2:
                i6 = 12;
                break;
            case 3:
                i6 = 28;
                break;
            case 4:
                i6 = 204;
                break;
            case 5:
                i6 = GameRenderer.GAME_UPGRADE_HERO_SKILL_START_Y;
                break;
            case 6:
                i6 = 252;
                break;
            case 7:
                i6 = 1276;
                break;
            case 8:
                i6 = zzhe.CHANNEL_OUT_7POINT1_SURROUND;
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unsupported channel count: ");
                sb.append(i9);
                throw new zziw(sb.toString());
        }
        if (zzps.SDK_INT <= 23 && "foster".equals(zzps.DEVICE) && "NVIDIA".equals(zzps.MANUFACTURER)) {
            if (i9 == 3 || i9 == 5) {
                i7 = 252;
            } else if (i9 == 7) {
                i7 = zzhe.CHANNEL_OUT_7POINT1_SURROUND;
            }
            i8 = (zzps.SDK_INT > 25 && "fugu".equals(zzps.DEVICE) && z2 && i9 == 1) ? 12 : i7;
            if (z && isInitialized() && this.zzakb == i5 && this.zzahm == i2 && this.zzaka == i8) {
                return;
            }
            reset();
            this.zzakb = i5;
            this.zzakd = z2;
            this.zzahm = i2;
            this.zzaka = i8;
            if (!z2) {
                i5 = 2;
            }
            this.zzakc = i5;
            this.zzakv = zzps.zzg(2, i9);
            if (!z2) {
                int i10 = this.zzakc;
                max = (i10 == 5 || i10 == 6) ? 20480 : 49152;
            } else {
                int minBufferSize = AudioTrack.getMinBufferSize(i2, i8, this.zzakc);
                zzpf.checkState(minBufferSize != -2);
                int i11 = minBufferSize << 2;
                int zzdx = this.zzakv * ((int) zzdx(250000L));
                max = (int) Math.max(minBufferSize, zzdx(750000L) * this.zzakv);
                if (i11 < zzdx) {
                    max = zzdx;
                } else if (i11 <= max) {
                    max = i11;
                }
            }
            this.zzake = max;
            this.zzakf = !z2 ? -9223372036854775807L : zzdw(max / this.zzakv);
            zzb(this.zzaff);
        }
        i7 = i6;
        if (zzps.SDK_INT > 25) {
        }
        if (z) {
        }
        reset();
        this.zzakb = i5;
        this.zzakd = z2;
        this.zzahm = i2;
        this.zzaka = i8;
        if (!z2) {
        }
        this.zzakc = i5;
        this.zzakv = zzps.zzg(2, i9);
        if (!z2) {
        }
        this.zzake = max;
        this.zzakf = !z2 ? -9223372036854775807L : zzdw(max / this.zzakv);
        zzb(this.zzaff);
    }

    private final void zzfn() {
        ArrayList arrayList = new ArrayList();
        for (zzii zziiVar : this.zzajt) {
            if (zziiVar.isActive()) {
                arrayList.add(zziiVar);
            } else {
                zziiVar.flush();
            }
        }
        int size = arrayList.size();
        this.zzald = (zzii[]) arrayList.toArray(new zzii[size]);
        this.zzale = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzii zziiVar2 = this.zzald[i];
            zziiVar2.flush();
            this.zzale[i] = zziiVar2.zzfm();
        }
    }

    public final void play() {
        this.zzall = true;
        if (isInitialized()) {
            this.zzalb = System.nanoTime() / 1000;
            this.zzajz.play();
        }
    }

    public final void zzfo() {
        if (this.zzakz == 1) {
            this.zzakz = 2;
        }
    }

    public final boolean zzb(ByteBuffer byteBuffer, long j) throws zziv, zzja {
        int i;
        int zzo;
        ByteBuffer byteBuffer2 = this.zzalf;
        zzpf.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!isInitialized()) {
            this.zzajv.block();
            if (this.zzaln) {
                this.zzajz = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzaka).setEncoding(this.zzakc).setSampleRate(this.zzahm).build(), this.zzake, 1, this.zzalm);
            } else if (this.zzalm == 0) {
                this.zzajz = new AudioTrack(this.streamType, this.zzahm, this.zzaka, this.zzakc, this.zzake, 1);
            } else {
                this.zzajz = new AudioTrack(this.streamType, this.zzahm, this.zzaka, this.zzakc, this.zzake, 1, this.zzalm);
            }
            int state = this.zzajz.getState();
            if (state != 1) {
                try {
                    this.zzajz.release();
                } catch (Exception unused) {
                } finally {
                    this.zzajz = null;
                }
                throw new zziv(state, this.zzahm, this.zzaka, this.zzake);
            }
            int audioSessionId = this.zzajz.getAudioSessionId();
            if (this.zzalm != audioSessionId) {
                this.zzalm = audioSessionId;
                this.zzaju.zzx(audioSessionId);
            }
            this.zzajx.zza(this.zzajz, zzfx());
            zzfu();
            this.zzalo = false;
            if (this.zzall) {
                play();
            }
        }
        if (zzfx()) {
            if (this.zzajz.getPlayState() == 2) {
                this.zzalo = false;
                return false;
            }
            if (this.zzajz.getPlayState() == 1 && this.zzajx.zzgb() != 0) {
                return false;
            }
        }
        boolean z = this.zzalo;
        boolean zzfr = zzfr();
        this.zzalo = zzfr;
        if (z && !zzfr && this.zzajz.getPlayState() != 1) {
            this.zzaju.zzc(this.zzake, zzhe.zzdo(this.zzakf), SystemClock.elapsedRealtime() - this.zzalp);
        }
        if (this.zzalf == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzakd && this.zzaky == 0) {
                int i2 = this.zzakc;
                if (i2 == 7 || i2 == 8) {
                    zzo = zzjc.zzo(byteBuffer);
                } else if (i2 == 5) {
                    zzo = zzig.zzfi();
                } else if (i2 == 6) {
                    zzo = zzig.zzm(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzaky = zzo;
            }
            if (this.zzakg != null) {
                if (!zzfq()) {
                    return false;
                }
                this.zzajy.add(new zzix(this.zzakg, Math.max(0L, j), zzdw(zzfv()), null));
                this.zzakg = null;
                zzfn();
            }
            if (this.zzakz == 0) {
                this.zzala = Math.max(0L, j);
                this.zzakz = 1;
            } else {
                long zzdw = this.zzala + zzdw(this.zzakd ? this.zzaku : this.zzakt / this.zzaks);
                if (this.zzakz != 1 || Math.abs(zzdw - j) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzdw);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzakz = 2;
                }
                if (this.zzakz == i) {
                    this.zzala += j - zzdw;
                    this.zzakz = 1;
                    this.zzaju.zzek();
                }
            }
            if (this.zzakd) {
                this.zzaku += this.zzaky;
            } else {
                this.zzakt += byteBuffer.remaining();
            }
            this.zzalf = byteBuffer;
        }
        if (this.zzakd) {
            zzc(this.zzalf, j);
        } else {
            zzdv(j);
        }
        if (this.zzalf.hasRemaining()) {
            return false;
        }
        this.zzalf = null;
        return true;
    }

    private final void zzdv(long j) throws zzja {
        ByteBuffer byteBuffer;
        int length = this.zzald.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzale[i - 1];
            } else {
                byteBuffer = this.zzalf;
                if (byteBuffer == null) {
                    byteBuffer = zzii.zzaiz;
                }
            }
            if (i == length) {
                zzc(byteBuffer, j);
            } else {
                zzii zziiVar = this.zzald[i];
                zziiVar.zzn(byteBuffer);
                ByteBuffer zzfm = zziiVar.zzfm();
                this.zzale[i] = zzfm;
                if (zzfm.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        if (r11 < r10) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzc(ByteBuffer byteBuffer, long j) throws zzja {
        int write;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.zzalg;
        if (byteBuffer2 != null) {
            zzpf.checkArgument(byteBuffer2 == byteBuffer);
        } else {
            this.zzalg = byteBuffer;
            if (zzps.SDK_INT < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.zzalh;
                if (bArr == null || bArr.length < remaining) {
                    this.zzalh = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.zzalh, 0, remaining);
                byteBuffer.position(position);
                this.zzali = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (zzps.SDK_INT < 21) {
            int zzgb = this.zzake - ((int) (this.zzakw - (this.zzajx.zzgb() * this.zzakv)));
            if (zzgb > 0) {
                write = this.zzajz.write(this.zzalh, this.zzali, Math.min(remaining2, zzgb));
                if (write > 0) {
                    this.zzali += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            }
            write = 0;
        } else if (this.zzaln) {
            zzpf.checkState(j != -9223372036854775807L);
            AudioTrack audioTrack = this.zzajz;
            if (this.zzakj == null) {
                ByteBuffer allocate = ByteBuffer.allocate(16);
                this.zzakj = allocate;
                allocate.order(ByteOrder.BIG_ENDIAN);
                this.zzakj.putInt(1431633921);
            }
            if (this.zzakk == 0) {
                this.zzakj.putInt(4, remaining2);
                this.zzakj.putLong(8, j * 1000);
                this.zzakj.position(0);
                this.zzakk = remaining2;
            }
            int remaining3 = this.zzakj.remaining();
            if (remaining3 > 0) {
                int write2 = audioTrack.write(this.zzakj, remaining3, 1);
                if (write2 < 0) {
                    this.zzakk = 0;
                    write = write2;
                }
            }
            int write3 = audioTrack.write(byteBuffer, remaining2, 1);
            if (write3 < 0) {
                this.zzakk = 0;
            } else {
                this.zzakk -= write3;
            }
            write = write3;
        } else {
            write = this.zzajz.write(byteBuffer, remaining2, 1);
        }
        this.zzalp = SystemClock.elapsedRealtime();
        if (write < 0) {
            throw new zzja(write);
        }
        if (!this.zzakd) {
            this.zzakw += write;
        }
        if (write != remaining2) {
            return false;
        }
        if (this.zzakd) {
            this.zzakx += this.zzaky;
        }
        this.zzalg = null;
        return true;
    }

    public final void zzfp() throws zzja {
        if (!this.zzalk && isInitialized() && zzfq()) {
            this.zzajx.zzdy(zzfv());
            this.zzakk = 0;
            this.zzalk = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzfq() throws zzja {
        boolean z;
        int i;
        zzii[] zziiVarArr;
        if (this.zzalj == -1) {
            this.zzalj = this.zzakd ? this.zzald.length : 0;
            z = true;
            i = this.zzalj;
            zziiVarArr = this.zzald;
            if (i < zziiVarArr.length) {
                zzii zziiVar = zziiVarArr[i];
                if (z) {
                    zziiVar.zzfl();
                }
                zzdv(-9223372036854775807L);
                if (!zziiVar.zzfe()) {
                    return false;
                }
                this.zzalj++;
                z = true;
                i = this.zzalj;
                zziiVarArr = this.zzald;
                if (i < zziiVarArr.length) {
                    ByteBuffer byteBuffer = this.zzalg;
                    if (byteBuffer != null) {
                        zzc(byteBuffer, -9223372036854775807L);
                        if (this.zzalg != null) {
                            return false;
                        }
                    }
                    this.zzalj = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.zzalj;
            zziiVarArr = this.zzald;
            if (i < zziiVarArr.length) {
            }
        }
    }

    public final boolean zzfe() {
        if (isInitialized()) {
            return this.zzalk && !zzfr();
        }
        return true;
    }

    public final boolean zzfr() {
        if (isInitialized()) {
            if (zzfv() <= this.zzajx.zzgb()) {
                if (zzfx() && this.zzajz.getPlayState() == 2 && this.zzajz.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final zzhy zzb(zzhy zzhyVar) {
        if (this.zzakd) {
            zzhy zzhyVar2 = zzhy.zzahx;
            this.zzaff = zzhyVar2;
            return zzhyVar2;
        }
        zzhy zzhyVar3 = new zzhy(this.zzajs.zzb(zzhyVar.zzahy), this.zzajs.zzc(zzhyVar.zzahz));
        zzhy zzhyVar4 = this.zzakg;
        if (zzhyVar4 == null) {
            if (!this.zzajy.isEmpty()) {
                zzhyVar4 = zzix.zza(this.zzajy.getLast());
            } else {
                zzhyVar4 = this.zzaff;
            }
        }
        if (!zzhyVar3.equals(zzhyVar4)) {
            if (isInitialized()) {
                this.zzakg = zzhyVar3;
            } else {
                this.zzaff = zzhyVar3;
            }
        }
        return this.zzaff;
    }

    public final zzhy zzfs() {
        return this.zzaff;
    }

    public final void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        if (this.zzaln) {
            return;
        }
        reset();
        this.zzalm = 0;
    }

    public final void zzft() {
        if (this.zzaln) {
            this.zzaln = false;
            this.zzalm = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzdg != f) {
            this.zzdg = f;
            zzfu();
        }
    }

    private final void zzfu() {
        if (isInitialized()) {
            if (zzps.SDK_INT >= 21) {
                this.zzajz.setVolume(this.zzdg);
                return;
            }
            AudioTrack audioTrack = this.zzajz;
            float f = this.zzdg;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void pause() {
        this.zzall = false;
        if (isInitialized()) {
            zzfw();
            this.zzajx.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzakt = 0L;
            this.zzaku = 0L;
            this.zzakw = 0L;
            this.zzakx = 0L;
            this.zzaky = 0;
            zzhy zzhyVar = this.zzakg;
            if (zzhyVar != null) {
                this.zzaff = zzhyVar;
                this.zzakg = null;
            } else if (!this.zzajy.isEmpty()) {
                this.zzaff = zzix.zza(this.zzajy.getLast());
            }
            this.zzajy.clear();
            this.zzakh = 0L;
            this.zzaki = 0L;
            this.zzalf = null;
            this.zzalg = null;
            int i = 0;
            while (true) {
                zzii[] zziiVarArr = this.zzald;
                if (i >= zziiVarArr.length) {
                    break;
                }
                zzii zziiVar = zziiVarArr[i];
                zziiVar.flush();
                this.zzale[i] = zziiVar.zzfm();
                i++;
            }
            this.zzalk = false;
            this.zzalj = -1;
            this.zzakj = null;
            this.zzakk = 0;
            this.zzakz = 0;
            this.zzalc = 0L;
            zzfw();
            if (this.zzajz.getPlayState() == 3) {
                this.zzajz.pause();
            }
            AudioTrack audioTrack = this.zzajz;
            this.zzajz = null;
            this.zzajx.zza(null, false);
            this.zzajv.close();
            new zzir(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzii zziiVar : this.zzajt) {
            zziiVar.reset();
        }
        this.zzalm = 0;
        this.zzall = false;
    }

    private final boolean isInitialized() {
        return this.zzajz != null;
    }

    private final long zzdw(long j) {
        return (j * 1000000) / this.zzahm;
    }

    private final long zzdx(long j) {
        return (j * this.zzahm) / 1000000;
    }

    private final long zzfv() {
        return this.zzakd ? this.zzakx : this.zzakw / this.zzakv;
    }

    private final void zzfw() {
        this.zzakn = 0L;
        this.zzakm = 0;
        this.zzakl = 0;
        this.zzako = 0L;
        this.zzakp = false;
        this.zzakq = 0L;
    }

    private final boolean zzfx() {
        if (zzps.SDK_INT >= 23) {
            return false;
        }
        int i = this.zzakc;
        return i == 5 || i == 6;
    }
}
