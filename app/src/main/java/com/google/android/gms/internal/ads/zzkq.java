package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzkq {
    public int height;
    public int number;
    public int type;
    public int width;
    public zzjn zzahe;
    public int zzahi;
    public byte[] zzahj;
    public int zzahl;
    public int zzahm;
    private String zzahs;
    public String zzari;
    public int zzarj;
    public boolean zzark;
    public byte[] zzarl;
    public zzkj zzarm;
    public byte[] zzarn;
    public int zzaro;
    public int zzarp;
    public int zzarq;
    public boolean zzarr;
    public int zzars;
    public int zzart;
    public int zzaru;
    public int zzarv;
    public int zzarw;
    public float zzarx;
    public float zzary;
    public float zzarz;
    public float zzasa;
    public float zzasb;
    public float zzasc;
    public float zzasd;
    public float zzase;
    public float zzasf;
    public float zzasg;
    public int zzash;
    public long zzasi;
    public long zzasj;
    public boolean zzask;
    public boolean zzasl;
    public zzkg zzasm;
    public int zzasn;

    private zzkq() {
        this.width = -1;
        this.height = -1;
        this.zzaro = -1;
        this.zzarp = -1;
        this.zzarq = 0;
        this.zzahj = null;
        this.zzahi = -1;
        this.zzarr = false;
        this.zzars = -1;
        this.zzart = -1;
        this.zzaru = -1;
        this.zzarv = 1000;
        this.zzarw = 200;
        this.zzarx = -1.0f;
        this.zzary = -1.0f;
        this.zzarz = -1.0f;
        this.zzasa = -1.0f;
        this.zzasb = -1.0f;
        this.zzasc = -1.0f;
        this.zzasd = -1.0f;
        this.zzase = -1.0f;
        this.zzasf = -1.0f;
        this.zzasg = -1.0f;
        this.zzahl = 1;
        this.zzash = -1;
        this.zzahm = 8000;
        this.zzasi = 0L;
        this.zzasj = 0L;
        this.zzasl = true;
        this.zzahs = "eng";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0167. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzkb zzkbVar, int i) throws zzhv {
        char c;
        String str;
        List<byte[]> singletonList;
        String str2;
        List<byte[]> list;
        int i2;
        int i3;
        List<byte[]> singletonList2;
        String str3;
        String str4;
        String str5;
        int zzbo;
        zzhs zza;
        int i4;
        zzpx zzpxVar;
        byte[] bArr;
        int i5;
        String str6 = this.zzari;
        switch (str6.hashCode()) {
            case -2095576542:
                if (str6.equals("V_MPEG4/ISO/AP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str6.equals("V_MPEG4/ISO/SP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str6.equals("A_MS/ACM")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str6.equals("A_TRUEHD")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str6.equals("A_VORBIS")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str6.equals("A_MPEG/L2")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str6.equals("A_MPEG/L3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str6.equals("V_MS/VFW/FOURCC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str6.equals("S_DVBSUB")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str6.equals("V_MPEG4/ISO/ASP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str6.equals("V_MPEG4/ISO/AVC")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str6.equals("S_VOBSUB")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str6.equals("A_DTS/LOSSLESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str6.equals("A_AAC")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str6.equals("A_AC3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str6.equals("A_DTS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str6.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str6.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str6.equals("S_HDMV/PGS")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str6.equals("V_THEORA")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str6.equals("A_DTS/EXPRESS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str6.equals("A_PCM/INT/LIT")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str6.equals("S_TEXT/UTF8")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str6.equals("V_MPEG2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str6.equals("A_EAC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str6.equals("A_FLAC")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str6.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                str = "video/x-vnd.on2.vp8";
                list = null;
                i2 = -1;
                i3 = -1;
                int i6 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                    zza = zzhs.zza(Integer.toString(i), str, null, -1, i3, this.zzahl, this.zzahm, i2, list, this.zzahe, i6, this.zzahs);
                    i4 = 1;
                } else if (zzpi.zzbd(str)) {
                    if (this.zzarq == 0) {
                        int i7 = this.zzaro;
                        if (i7 == -1) {
                            i7 = this.width;
                        }
                        this.zzaro = i7;
                        int i8 = this.zzarp;
                        if (i8 == -1) {
                            i8 = this.height;
                        }
                        this.zzarp = i8;
                    }
                    float f = (this.zzaro == -1 || (i5 = this.zzarp) == -1) ? -1.0f : (this.height * r2) / (this.width * i5);
                    if (this.zzarr) {
                        if (this.zzarx == -1.0f || this.zzary == -1.0f || this.zzarz == -1.0f || this.zzasa == -1.0f || this.zzasb == -1.0f || this.zzasc == -1.0f || this.zzasd == -1.0f || this.zzase == -1.0f || this.zzasf == -1.0f || this.zzasg == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.zzarx * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzary * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzarz * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzasa * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzasb * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzasc * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzasd * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.zzase * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.zzasf + 0.5f));
                            wrap.putShort((short) (this.zzasg + 0.5f));
                            wrap.putShort((short) this.zzarv);
                            wrap.putShort((short) this.zzarw);
                        }
                        zzpxVar = new zzpx(this.zzars, this.zzaru, this.zzart, bArr);
                    } else {
                        zzpxVar = null;
                    }
                    zza = zzhs.zza(Integer.toString(i), str, null, -1, i3, this.width, this.height, -1.0f, list, -1, f, this.zzahj, this.zzahi, zzpxVar, this.zzahe);
                    i4 = 2;
                } else {
                    if ("application/x-subrip".equals(str)) {
                        zza = zzhs.zza(Integer.toString(i), str, (String) null, -1, i6, this.zzahs, this.zzahe);
                    } else if ("application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
                        zza = zzhs.zza(Integer.toString(i), str, (String) null, -1, list, this.zzahs, this.zzahe);
                    } else {
                        throw new zzhv("Unexpected MIME type.");
                    }
                    i4 = 3;
                }
                zzkg zzc = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc;
                zzc.zze(zza);
                return;
            case 1:
                str = "video/x-vnd.on2.vp9";
                list = null;
                i2 = -1;
                i3 = -1;
                int i62 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2;
                zzc2.zze(zza);
                return;
            case 2:
                str = "video/mpeg2";
                list = null;
                i2 = -1;
                i3 = -1;
                int i622 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22;
                zzc22.zze(zza);
                return;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzarn;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = "video/mp4v-es";
                i2 = -1;
                i3 = -1;
                String str7 = str2;
                list = singletonList;
                str = str7;
                int i6222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222;
                zzc222.zze(zza);
                return;
            case 6:
                zzpu zzg = zzpu.zzg(new zzpm(this.zzarn));
                list = zzg.zzahd;
                this.zzasn = zzg.zzasn;
                str = "video/avc";
                i2 = -1;
                i3 = -1;
                int i62222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222;
                zzc2222.zze(zza);
                return;
            case 7:
                zzqa zzi = zzqa.zzi(new zzpm(this.zzarn));
                list = zzi.zzahd;
                this.zzasn = zzi.zzasn;
                str = "video/hevc";
                i2 = -1;
                i3 = -1;
                int i622222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222;
                zzc22222.zze(zza);
                return;
            case '\b':
                singletonList = zza(new zzpm(this.zzarn));
                if (singletonList == null) {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    list = singletonList;
                    str = "video/x-unknown";
                    i2 = -1;
                    i3 = -1;
                    int i6222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                    if (!zzpi.zzbc(str)) {
                    }
                    zzkg zzc222222 = zzkbVar.zzc(this.number, i4);
                    this.zzasm = zzc222222;
                    zzc222222.zze(zza);
                    return;
                }
                str2 = "video/wvc1";
                i2 = -1;
                i3 = -1;
                String str72 = str2;
                list = singletonList;
                str = str72;
                int i62222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222222;
                zzc2222222.zze(zza);
                return;
            case '\t':
                str = "video/x-unknown";
                list = null;
                i2 = -1;
                i3 = -1;
                int i622222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222222;
                zzc22222222.zze(zza);
                return;
            case '\n':
                singletonList = zzd(this.zzarn);
                str2 = "audio/vorbis";
                i2 = -1;
                i3 = 8192;
                String str722 = str2;
                list = singletonList;
                str = str722;
                int i6222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222;
                zzc222222222.zze(zza);
                return;
            case 11:
                singletonList = new ArrayList<>(3);
                singletonList.add(this.zzarn);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzasi).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzasj).array());
                str2 = "audio/opus";
                i2 = -1;
                i3 = 5760;
                String str7222 = str2;
                list = singletonList;
                str = str7222;
                int i62222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222222222;
                zzc2222222222.zze(zza);
                return;
            case '\f':
                singletonList2 = Collections.singletonList(this.zzarn);
                str3 = "audio/mp4a-latm";
                list = singletonList2;
                str = str3;
                i2 = -1;
                i3 = -1;
                int i622222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222222222;
                zzc22222222222.zze(zza);
                return;
            case '\r':
                str4 = "audio/mpeg-L2";
                str = str4;
                list = null;
                i2 = -1;
                i3 = 4096;
                int i6222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222222;
                zzc222222222222.zze(zza);
                return;
            case 14:
                str4 = "audio/mpeg";
                str = str4;
                list = null;
                i2 = -1;
                i3 = 4096;
                int i62222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222222222222;
                zzc2222222222222.zze(zza);
                return;
            case 15:
                str5 = "audio/ac3";
                str = str5;
                list = null;
                i2 = -1;
                i3 = -1;
                int i622222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222222222222;
                zzc22222222222222.zze(zza);
                return;
            case 16:
                str5 = "audio/eac3";
                str = str5;
                list = null;
                i2 = -1;
                i3 = -1;
                int i6222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222222222;
                zzc222222222222222.zze(zza);
                return;
            case 17:
                str5 = "audio/true-hd";
                str = str5;
                list = null;
                i2 = -1;
                i3 = -1;
                int i62222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222222222222222;
                zzc2222222222222222.zze(zza);
                return;
            case 18:
            case 19:
                str5 = "audio/vnd.dts";
                str = str5;
                list = null;
                i2 = -1;
                i3 = -1;
                int i622222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222222222222222;
                zzc22222222222222222.zze(zza);
                return;
            case 20:
                str5 = "audio/vnd.dts.hd";
                str = str5;
                list = null;
                i2 = -1;
                i3 = -1;
                int i6222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222222222222;
                zzc222222222222222222.zze(zza);
                return;
            case 21:
                singletonList2 = Collections.singletonList(this.zzarn);
                str3 = "audio/x-flac";
                list = singletonList2;
                str = str3;
                i2 = -1;
                i3 = -1;
                int i62222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222222222222222222;
                zzc2222222222222222222.zze(zza);
                return;
            case 22:
                if (zzb(new zzpm(this.zzarn))) {
                    zzbo = zzps.zzbo(this.zzash);
                    if (zzbo == 0) {
                        int i9 = this.zzash;
                        StringBuilder sb = new StringBuilder("audio/x-unknown".length() + 60);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i9);
                        sb.append(". Setting mimeType to ");
                        sb.append("audio/x-unknown");
                        Log.w("MatroskaExtractor", sb.toString());
                    }
                    i2 = zzbo;
                    str = "audio/raw";
                    list = null;
                    i3 = -1;
                    int i622222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                    if (!zzpi.zzbc(str)) {
                    }
                    zzkg zzc22222222222222222222 = zzkbVar.zzc(this.number, i4);
                    this.zzasm = zzc22222222222222222222;
                    zzc22222222222222222222.zze(zza);
                    return;
                }
                Log.w("MatroskaExtractor", "audio/x-unknown".length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown") : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                str = "audio/x-unknown";
                list = null;
                i2 = -1;
                i3 = -1;
                int i6222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222222222222222;
                zzc222222222222222222222.zze(zza);
                return;
            case 23:
                zzbo = zzps.zzbo(this.zzash);
                if (zzbo == 0) {
                    int i10 = this.zzash;
                    StringBuilder sb2 = new StringBuilder("audio/x-unknown".length() + 60);
                    sb2.append("Unsupported PCM bit depth: ");
                    sb2.append(i10);
                    sb2.append(". Setting mimeType to ");
                    sb2.append("audio/x-unknown");
                    Log.w("MatroskaExtractor", sb2.toString());
                    str = "audio/x-unknown";
                    list = null;
                    i2 = -1;
                    i3 = -1;
                    int i62222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                    if (!zzpi.zzbc(str)) {
                    }
                    zzkg zzc2222222222222222222222 = zzkbVar.zzc(this.number, i4);
                    this.zzasm = zzc2222222222222222222222;
                    zzc2222222222222222222222.zze(zza);
                    return;
                }
                i2 = zzbo;
                str = "audio/raw";
                list = null;
                i3 = -1;
                int i622222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222222222222222222222;
                zzc22222222222222222222222.zze(zza);
                return;
            case 24:
                str = "application/x-subrip";
                list = null;
                i2 = -1;
                i3 = -1;
                int i6222222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222222222222222222;
                zzc222222222222222222222222.zze(zza);
                return;
            case 25:
                list = Collections.singletonList(this.zzarn);
                str = "application/vobsub";
                i2 = -1;
                i3 = -1;
                int i62222222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc2222222222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc2222222222222222222222222;
                zzc2222222222222222222222222.zze(zza);
                return;
            case 26:
                str = "application/pgs";
                list = null;
                i2 = -1;
                i3 = -1;
                int i622222222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc22222222222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc22222222222222222222222222;
                zzc22222222222222222222222222.zze(zza);
                return;
            case 27:
                byte[] bArr3 = this.zzarn;
                list = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str = "application/dvbsubs";
                i2 = -1;
                i3 = -1;
                int i6222222222222222222222222222 = (this.zzasl ? 1 : 0) | 0 | (!this.zzask ? 2 : 0);
                if (!zzpi.zzbc(str)) {
                }
                zzkg zzc222222222222222222222222222 = zzkbVar.zzc(this.number, i4);
                this.zzasm = zzc222222222222222222222222222;
                zzc222222222222222222222222222.zze(zza);
                return;
            default:
                throw new zzhv("Unrecognized codec identifier.");
        }
    }

    private static List<byte[]> zza(zzpm zzpmVar) throws zzhv {
        try {
            zzpmVar.zzbj(16);
            if (zzpmVar.zziy() != 826496599) {
                return null;
            }
            byte[] bArr = zzpmVar.data;
            for (int position = zzpmVar.getPosition() + 20; position < bArr.length - 4; position++) {
                if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length));
                }
            }
            throw new zzhv("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzhv {
        try {
            if (bArr[0] != 2) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            int i = 1;
            int i2 = 0;
            while (bArr[i] == -1) {
                i2 += 255;
                i++;
            }
            int i3 = i + 1;
            int i4 = i2 + bArr[i];
            int i5 = 0;
            while (bArr[i3] == -1) {
                i5 += 255;
                i3++;
            }
            int i6 = i3 + 1;
            int i7 = i5 + bArr[i3];
            if (bArr[i6] != 1) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i6, bArr2, 0, i4);
            int i8 = i6 + i4;
            if (bArr[i8] != 3) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            int i9 = i8 + i7;
            if (bArr[i9] != 5) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i9];
            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhv("Error parsing vorbis codec private");
        }
    }

    private static boolean zzb(zzpm zzpmVar) throws zzhv {
        UUID uuid;
        UUID uuid2;
        try {
            int zziw = zzpmVar.zziw();
            if (zziw == 1) {
                return true;
            }
            if (zziw == 65534) {
                zzpmVar.zzbi(24);
                long readLong = zzpmVar.readLong();
                uuid = zzkp.zzapk;
                if (readLong == uuid.getMostSignificantBits()) {
                    long readLong2 = zzpmVar.readLong();
                    uuid2 = zzkp.zzapk;
                    if (readLong2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhv("Error parsing MS/ACM codec private");
        }
    }

    public /* synthetic */ zzkq(zzko zzkoVar) {
        this();
    }

    public static /* synthetic */ String zza(zzkq zzkqVar, String str) {
        zzkqVar.zzahs = str;
        return str;
    }
}
