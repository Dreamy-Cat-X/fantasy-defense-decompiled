package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzjn;
import com.sncompany.newtower.GameRenderer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzkp implements zzjz {
    private static final zzka zzaph = new zzko();
    private static final byte[] zzapi = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzapj = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzapk = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzaim;
    private final zzks zzaoz;
    private final zzkn zzapl;
    private final SparseArray<zzkq> zzapm;
    private final boolean zzapn;
    private final zzpm zzapo;
    private final zzpm zzapp;
    private final zzpm zzapq;
    private final zzpm zzapr;
    private final zzpm zzaps;
    private final zzpm zzapt;
    private final zzpm zzapu;
    private final zzpm zzapv;
    private final zzpm zzapw;
    private ByteBuffer zzapx;
    private long zzapy;
    private long zzapz;
    private long zzaqa;
    private long zzaqb;
    private zzkq zzaqc;
    private boolean zzaqd;
    private int zzaqe;
    private long zzaqf;
    private boolean zzaqg;
    private long zzaqh;
    private long zzaqi;
    private long zzaqj;
    private zzpg zzaqk;
    private zzpg zzaql;
    private boolean zzaqm;
    private int zzaqn;
    private long zzaqo;
    private long zzaqp;
    private int zzaqq;
    private int zzaqr;
    private int[] zzaqs;
    private int zzaqt;
    private int zzaqu;
    private int zzaqv;
    private int zzaqw;
    private boolean zzaqx;
    private boolean zzaqy;
    private boolean zzaqz;
    private boolean zzara;
    private byte zzarb;
    private int zzarc;
    private int zzard;
    private int zzare;
    private boolean zzarf;
    private boolean zzarg;
    private zzkb zzarh;

    public zzkp() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzal(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case GameRenderer.VOLUMEBAR_MUSIC_POS_Y /* 159 */:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case GameRenderer.GAME_SHOP_EQUIP_SKILL_START_Y /* 224 */:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzam(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void release() {
    }

    private zzkp(int i) {
        this(new zzki(), 0);
    }

    private zzkp(zzkn zzknVar, int i) {
        this.zzapz = -1L;
        this.zzaqa = -9223372036854775807L;
        this.zzaqb = -9223372036854775807L;
        this.zzaim = -9223372036854775807L;
        this.zzaqh = -1L;
        this.zzaqi = -1L;
        this.zzaqj = -9223372036854775807L;
        this.zzapl = zzknVar;
        zzknVar.zza(new zzkr(this, null));
        this.zzapn = true;
        this.zzaoz = new zzks();
        this.zzapm = new SparseArray<>();
        this.zzapq = new zzpm(4);
        this.zzapr = new zzpm(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzaps = new zzpm(4);
        this.zzapo = new zzpm(zzpl.zzbjq);
        this.zzapp = new zzpm(4);
        this.zzapt = new zzpm();
        this.zzapu = new zzpm();
        this.zzapv = new zzpm(8);
        this.zzapw = new zzpm();
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        return new zzkt().zza(zzjyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zza(zzkb zzkbVar) {
        this.zzarh = zzkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzc(long j, long j2) {
        this.zzaqj = -9223372036854775807L;
        this.zzaqn = 0;
        this.zzapl.reset();
        this.zzaoz.reset();
        zzgu();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzjy zzjyVar, zzkf zzkfVar) throws IOException, InterruptedException {
        boolean z;
        this.zzarf = false;
        boolean z2 = true;
        while (z2 && !this.zzarf) {
            z2 = this.zzapl.zzb(zzjyVar);
            if (z2) {
                long position = zzjyVar.getPosition();
                if (this.zzaqg) {
                    this.zzaqi = position;
                    zzkfVar.position = this.zzaqh;
                    this.zzaqg = false;
                } else {
                    if (this.zzaqd) {
                        long j = this.zzaqi;
                        if (j != -1) {
                            zzkfVar.position = j;
                            this.zzaqi = -1L;
                        }
                    }
                    z = false;
                    if (!z) {
                        return 1;
                    }
                }
                z = true;
                if (!z) {
                }
            }
        }
        return z2 ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzhv {
        if (i == 160) {
            this.zzarg = false;
            return;
        }
        if (i == 174) {
            this.zzaqc = new zzkq(null);
            return;
        }
        if (i == 187) {
            this.zzaqm = false;
            return;
        }
        if (i == 19899) {
            this.zzaqe = -1;
            this.zzaqf = -1L;
            return;
        }
        if (i == 20533) {
            this.zzaqc.zzark = true;
            return;
        }
        if (i == 21968) {
            this.zzaqc.zzarr = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzapz;
            if (j3 != -1 && j3 != j) {
                throw new zzhv("Multiple Segment elements not supported");
            }
            this.zzapz = j;
            this.zzapy = j2;
            return;
        }
        if (i == 475249515) {
            this.zzaqk = new zzpg();
            this.zzaql = new zzpg();
        } else if (i == 524531317 && !this.zzaqd) {
            if (this.zzapn && this.zzaqh != -1) {
                this.zzaqg = true;
            } else {
                this.zzarh.zza(new zzkh(this.zzaim));
                this.zzaqd = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzan(int i) throws zzhv {
        zzke zzkhVar;
        zzpg zzpgVar;
        zzpg zzpgVar2;
        int i2;
        if (i == 160) {
            if (this.zzaqn != 2) {
                return;
            }
            if (!this.zzarg) {
                this.zzaqv |= 1;
            }
            zza(this.zzapm.get(this.zzaqt), this.zzaqo);
            this.zzaqn = 0;
            return;
        }
        if (i == 174) {
            String str = this.zzaqc.zzari;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 0) != 0) {
                zzkq zzkqVar = this.zzaqc;
                zzkqVar.zza(this.zzarh, zzkqVar.number);
                this.zzapm.put(this.zzaqc.number, this.zzaqc);
            }
            this.zzaqc = null;
            return;
        }
        if (i == 19899) {
            int i3 = this.zzaqe;
            if (i3 != -1) {
                long j = this.zzaqf;
                if (j != -1) {
                    if (i3 == 475249515) {
                        this.zzaqh = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzhv("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == 25152) {
            if (this.zzaqc.zzark) {
                if (this.zzaqc.zzarm == null) {
                    throw new zzhv("Encrypted Track found but ContentEncKeyID was not found");
                }
                this.zzaqc.zzahe = new zzjn(new zzjn.zza(zzhe.UUID_NIL, "video/webm", this.zzaqc.zzarm.zzapf));
                return;
            }
            return;
        }
        if (i == 28032) {
            if (this.zzaqc.zzark && this.zzaqc.zzarl != null) {
                throw new zzhv("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.zzaqa == -9223372036854775807L) {
                this.zzaqa = 1000000L;
            }
            long j2 = this.zzaqb;
            if (j2 != -9223372036854775807L) {
                this.zzaim = zzea(j2);
                return;
            }
            return;
        }
        if (i != 374648427) {
            if (i == 475249515 && !this.zzaqd) {
                zzkb zzkbVar = this.zzarh;
                if (this.zzapz == -1 || this.zzaim == -9223372036854775807L || (zzpgVar = this.zzaqk) == null || zzpgVar.size() == 0 || (zzpgVar2 = this.zzaql) == null || zzpgVar2.size() != this.zzaqk.size()) {
                    this.zzaqk = null;
                    this.zzaql = null;
                    zzkhVar = new zzkh(this.zzaim);
                } else {
                    int size = this.zzaqk.size();
                    int[] iArr = new int[size];
                    long[] jArr = new long[size];
                    long[] jArr2 = new long[size];
                    long[] jArr3 = new long[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        jArr3[i4] = this.zzaqk.get(i4);
                        jArr[i4] = this.zzapz + this.zzaql.get(i4);
                    }
                    while (true) {
                        i2 = size - 1;
                        if (r1 >= i2) {
                            break;
                        }
                        int i5 = r1 + 1;
                        iArr[r1] = (int) (jArr[i5] - jArr[r1]);
                        jArr2[r1] = jArr3[i5] - jArr3[r1];
                        r1 = i5;
                    }
                    iArr[i2] = (int) ((this.zzapz + this.zzapy) - jArr[i2]);
                    jArr2[i2] = this.zzaim - jArr3[i2];
                    this.zzaqk = null;
                    this.zzaql = null;
                    zzkhVar = new zzjx(iArr, jArr, jArr2, jArr3);
                }
                zzkbVar.zza(zzkhVar);
                this.zzaqd = true;
                return;
            }
            return;
        }
        if (this.zzapm.size() == 0) {
            throw new zzhv("No valid tracks were found");
        }
        this.zzarh.zzgs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, long j) throws zzhv {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new zzhv(sb.toString());
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new zzhv(sb2.toString());
        }
        switch (i) {
            case 131:
                this.zzaqc.type = (int) j;
                return;
            case 136:
                this.zzaqc.zzask = j == 1;
                return;
            case 155:
                this.zzaqp = zzea(j);
                return;
            case GameRenderer.VOLUMEBAR_MUSIC_POS_Y /* 159 */:
                this.zzaqc.zzahl = (int) j;
                return;
            case 176:
                this.zzaqc.width = (int) j;
                return;
            case 179:
                this.zzaqk.add(zzea(j));
                return;
            case 186:
                this.zzaqc.height = (int) j;
                return;
            case 215:
                this.zzaqc.number = (int) j;
                return;
            case 231:
                this.zzaqj = zzea(j);
                return;
            case 241:
                if (this.zzaqm) {
                    return;
                }
                this.zzaql.add(j);
                this.zzaqm = true;
                return;
            case 251:
                this.zzarg = true;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j);
                sb3.append(" not supported");
                throw new zzhv(sb3.toString());
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new zzhv(sb4.toString());
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j);
                sb5.append(" not supported");
                throw new zzhv(sb5.toString());
            case 18401:
                if (j == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new zzhv(sb6.toString());
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j);
                sb7.append(" not supported");
                throw new zzhv(sb7.toString());
            case 21420:
                this.zzaqf = j + this.zzapz;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.zzaqc.zzahi = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzaqc.zzahi = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzaqc.zzahi = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzaqc.zzahi = 3;
                    return;
                }
            case 21680:
                this.zzaqc.zzaro = (int) j;
                return;
            case 21682:
                this.zzaqc.zzarq = (int) j;
                return;
            case 21690:
                this.zzaqc.zzarp = (int) j;
                return;
            case 21930:
                this.zzaqc.zzasl = j == 1;
                return;
            case 22186:
                this.zzaqc.zzasi = j;
                return;
            case 22203:
                this.zzaqc.zzasj = j;
                return;
            case 25188:
                this.zzaqc.zzash = (int) j;
                return;
            case 2352003:
                this.zzaqc.zzarj = (int) j;
                return;
            case 2807729:
                this.zzaqa = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i3 = (int) j;
                        if (i3 == 1) {
                            this.zzaqc.zzaru = 2;
                            return;
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            this.zzaqc.zzaru = 1;
                            return;
                        }
                    case 21946:
                        int i4 = (int) j;
                        if (i4 != 1) {
                            if (i4 == 16) {
                                this.zzaqc.zzart = 6;
                                return;
                            } else if (i4 == 18) {
                                this.zzaqc.zzart = 7;
                                return;
                            } else if (i4 != 6 && i4 != 7) {
                                return;
                            }
                        }
                        this.zzaqc.zzart = 3;
                        return;
                    case 21947:
                        this.zzaqc.zzarr = true;
                        int i5 = (int) j;
                        if (i5 == 1) {
                            this.zzaqc.zzars = 1;
                            return;
                        }
                        if (i5 == 9) {
                            this.zzaqc.zzars = 6;
                            return;
                        } else {
                            if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                this.zzaqc.zzars = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.zzaqc.zzarv = (int) j;
                        return;
                    case 21949:
                        this.zzaqc.zzarw = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzaqc.zzahm = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzaqb = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                this.zzaqc.zzarx = (float) d;
                return;
            case 21970:
                this.zzaqc.zzary = (float) d;
                return;
            case 21971:
                this.zzaqc.zzarz = (float) d;
                return;
            case 21972:
                this.zzaqc.zzasa = (float) d;
                return;
            case 21973:
                this.zzaqc.zzasb = (float) d;
                return;
            case 21974:
                this.zzaqc.zzasc = (float) d;
                return;
            case 21975:
                this.zzaqc.zzasd = (float) d;
                return;
            case 21976:
                this.zzaqc.zzase = (float) d;
                return;
            case 21977:
                this.zzaqc.zzasf = (float) d;
                return;
            case 21978:
                this.zzaqc.zzasg = (float) d;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzhv {
        if (i == 134) {
            this.zzaqc.zzari = str;
            return;
        }
        if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            zzkq.zza(this.zzaqc, str);
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhv(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fd, code lost:
    
        throw new com.google.android.gms.internal.ads.zzhv("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(int i, int i2, zzjy zzjyVar) throws IOException, InterruptedException {
        int i3;
        int i4;
        int[] iArr;
        int i5 = 0;
        int i6 = 1;
        if (i != 161 && i != 163) {
            if (i == 16981) {
                this.zzaqc.zzarl = new byte[i2];
                zzjyVar.readFully(this.zzaqc.zzarl, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr = new byte[i2];
                zzjyVar.readFully(bArr, 0, i2);
                this.zzaqc.zzarm = new zzkj(1, bArr);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.zzaps.data, (byte) 0);
                zzjyVar.readFully(this.zzaps.data, 4 - i2, i2);
                this.zzaps.zzbi(0);
                this.zzaqe = (int) this.zzaps.zzix();
                return;
            }
            if (i == 25506) {
                this.zzaqc.zzarn = new byte[i2];
                zzjyVar.readFully(this.zzaqc.zzarn, 0, i2);
                return;
            } else if (i == 30322) {
                this.zzaqc.zzahj = new byte[i2];
                zzjyVar.readFully(this.zzaqc.zzahj, 0, i2);
                return;
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i);
                throw new zzhv(sb.toString());
            }
        }
        if (this.zzaqn == 0) {
            this.zzaqt = (int) this.zzaoz.zza(zzjyVar, false, true, 8);
            this.zzaqu = this.zzaoz.zzgw();
            this.zzaqp = -9223372036854775807L;
            this.zzaqn = 1;
            this.zzapq.reset();
        }
        zzkq zzkqVar = this.zzapm.get(this.zzaqt);
        if (zzkqVar == null) {
            zzjyVar.zzag(i2 - this.zzaqu);
            this.zzaqn = 0;
            return;
        }
        if (this.zzaqn == 1) {
            zzb(zzjyVar, 3);
            int i7 = (this.zzapq.data[2] & 6) >> 1;
            byte b = 255;
            if (i7 == 0) {
                this.zzaqr = 1;
                int[] zza = zza(this.zzaqs, 1);
                this.zzaqs = zza;
                zza[0] = (i2 - this.zzaqu) - 3;
            } else {
                if (i != 163) {
                    throw new zzhv("Lacing only supported in SimpleBlocks.");
                }
                int i8 = 4;
                zzb(zzjyVar, 4);
                int i9 = (this.zzapq.data[3] & 255) + 1;
                this.zzaqr = i9;
                int[] zza2 = zza(this.zzaqs, i9);
                this.zzaqs = zza2;
                if (i7 == 2) {
                    int i10 = (i2 - this.zzaqu) - 4;
                    int i11 = this.zzaqr;
                    Arrays.fill(zza2, 0, i11, i10 / i11);
                } else if (i7 == 1) {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        i3 = this.zzaqr;
                        if (i12 >= i3 - 1) {
                            break;
                        }
                        this.zzaqs[i12] = 0;
                        do {
                            i8++;
                            zzb(zzjyVar, i8);
                            i4 = this.zzapq.data[i8 - 1] & 255;
                            iArr = this.zzaqs;
                            iArr[i12] = iArr[i12] + i4;
                        } while (i4 == 255);
                        i13 += iArr[i12];
                        i12++;
                    }
                    this.zzaqs[i3 - 1] = ((i2 - this.zzaqu) - i8) - i13;
                } else {
                    if (i7 != 3) {
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append("Unexpected lacing value: ");
                        sb2.append(i7);
                        throw new zzhv(sb2.toString());
                    }
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        int i16 = this.zzaqr;
                        if (i14 < i16 - 1) {
                            this.zzaqs[i14] = i5;
                            i8++;
                            zzb(zzjyVar, i8);
                            int i17 = i8 - 1;
                            if (this.zzapq.data[i17] == 0) {
                                throw new zzhv("No valid varint length mask found");
                            }
                            long j = 0;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= 8) {
                                    break;
                                }
                                int i19 = i6 << (7 - i18);
                                if ((this.zzapq.data[i17] & i19) != 0) {
                                    i8 += i18;
                                    zzb(zzjyVar, i8);
                                    long j2 = this.zzapq.data[i17] & b & (i19 ^ (-1));
                                    int i20 = i17 + 1;
                                    while (true) {
                                        j = j2;
                                        if (i20 >= i8) {
                                            break;
                                        }
                                        j2 = (j << 8) | (this.zzapq.data[i20] & b);
                                        i20++;
                                        b = 255;
                                    }
                                    if (i14 > 0) {
                                        j -= (1 << ((i18 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i18++;
                                    i6 = 1;
                                    b = 255;
                                }
                            }
                            long j3 = j;
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i21 = (int) j3;
                            int[] iArr2 = this.zzaqs;
                            if (i14 != 0) {
                                i21 += iArr2[i14 - 1];
                            }
                            iArr2[i14] = i21;
                            i15 += this.zzaqs[i14];
                            i14++;
                            i5 = 0;
                            i6 = 1;
                            b = 255;
                        } else {
                            this.zzaqs[i16 - 1] = ((i2 - this.zzaqu) - i8) - i15;
                            break;
                        }
                    }
                }
            }
            this.zzaqo = this.zzaqj + zzea((this.zzapq.data[0] << 8) | (this.zzapq.data[1] & 255));
            this.zzaqv = ((this.zzapq.data[2] & 8) == 8 ? Integer.MIN_VALUE : 0) | ((zzkqVar.type == 2 || (i == 163 && (this.zzapq.data[2] & 128) == 128)) ? 1 : 0);
            this.zzaqn = 2;
            this.zzaqq = 0;
        }
        if (i != 163) {
            zza(zzjyVar, zzkqVar, this.zzaqs[0]);
            return;
        }
        while (true) {
            int i22 = this.zzaqq;
            if (i22 < this.zzaqr) {
                zza(zzjyVar, zzkqVar, this.zzaqs[i22]);
                zza(zzkqVar, this.zzaqo + ((this.zzaqq * zzkqVar.zzarj) / 1000));
                this.zzaqq++;
            } else {
                this.zzaqn = 0;
                return;
            }
        }
    }

    private final void zza(zzkq zzkqVar, long j) {
        byte[] zzbg;
        if ("S_TEXT/UTF8".equals(zzkqVar.zzari)) {
            byte[] bArr = this.zzapu.data;
            long j2 = this.zzaqp;
            if (j2 == -9223372036854775807L) {
                zzbg = zzapj;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (i * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i2);
                zzbg = zzps.zzbg(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * r4)) / 1000))));
            }
            System.arraycopy(zzbg, 0, bArr, 19, 12);
            zzkg zzkgVar = zzkqVar.zzasm;
            zzpm zzpmVar = this.zzapu;
            zzkgVar.zza(zzpmVar, zzpmVar.limit());
            this.zzare += this.zzapu.limit();
        }
        zzkqVar.zzasm.zza(j, this.zzaqv, this.zzare, 0, zzkqVar.zzarm);
        this.zzarf = true;
        zzgu();
    }

    private final void zzgu() {
        this.zzaqw = 0;
        this.zzare = 0;
        this.zzard = 0;
        this.zzaqx = false;
        this.zzaqy = false;
        this.zzara = false;
        this.zzarc = 0;
        this.zzarb = (byte) 0;
        this.zzaqz = false;
        this.zzapt.reset();
    }

    private final void zzb(zzjy zzjyVar, int i) throws IOException, InterruptedException {
        if (this.zzapq.limit() >= i) {
            return;
        }
        if (this.zzapq.capacity() < i) {
            zzpm zzpmVar = this.zzapq;
            zzpmVar.zzc(Arrays.copyOf(zzpmVar.data, Math.max(this.zzapq.data.length << 1, i)), this.zzapq.limit());
        }
        zzjyVar.readFully(this.zzapq.data, this.zzapq.limit(), i - this.zzapq.limit());
        this.zzapq.zzbh(i);
    }

    private final void zza(zzjy zzjyVar, zzkq zzkqVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzkqVar.zzari)) {
            int length = zzapi.length + i;
            if (this.zzapu.capacity() < length) {
                this.zzapu.data = Arrays.copyOf(zzapi, length + i);
            }
            zzjyVar.readFully(this.zzapu.data, zzapi.length, i);
            this.zzapu.zzbi(0);
            this.zzapu.zzbh(length);
            return;
        }
        zzkg zzkgVar = zzkqVar.zzasm;
        if (!this.zzaqx) {
            if (zzkqVar.zzark) {
                this.zzaqv &= -1073741825;
                if (!this.zzaqy) {
                    zzjyVar.readFully(this.zzapq.data, 0, 1);
                    this.zzaqw++;
                    if ((this.zzapq.data[0] & 128) == 128) {
                        throw new zzhv("Extension bit is set in signal byte");
                    }
                    this.zzarb = this.zzapq.data[0];
                    this.zzaqy = true;
                }
                byte b = this.zzarb;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzaqv |= 1073741824;
                    if (!this.zzaqz) {
                        zzjyVar.readFully(this.zzapv.data, 0, 8);
                        this.zzaqw += 8;
                        this.zzaqz = true;
                        this.zzapq.data[0] = (byte) ((z ? 128 : 0) | 8);
                        this.zzapq.zzbi(0);
                        zzkgVar.zza(this.zzapq, 1);
                        this.zzare++;
                        this.zzapv.zzbi(0);
                        zzkgVar.zza(this.zzapv, 8);
                        this.zzare += 8;
                    }
                    if (z) {
                        if (!this.zzara) {
                            zzjyVar.readFully(this.zzapq.data, 0, 1);
                            this.zzaqw++;
                            this.zzapq.zzbi(0);
                            this.zzarc = this.zzapq.readUnsignedByte();
                            this.zzara = true;
                        }
                        int i3 = this.zzarc << 2;
                        this.zzapq.reset(i3);
                        zzjyVar.readFully(this.zzapq.data, 0, i3);
                        this.zzaqw += i3;
                        short s = (short) ((this.zzarc / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzapx;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.zzapx = ByteBuffer.allocate(i4);
                        }
                        this.zzapx.position(0);
                        this.zzapx.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.zzarc;
                            if (i5 >= i2) {
                                break;
                            }
                            int zzja = this.zzapq.zzja();
                            if (i5 % 2 == 0) {
                                this.zzapx.putShort((short) (zzja - i6));
                            } else {
                                this.zzapx.putInt(zzja - i6);
                            }
                            i5++;
                            i6 = zzja;
                        }
                        int i7 = (i - this.zzaqw) - i6;
                        if (i2 % 2 == 1) {
                            this.zzapx.putInt(i7);
                        } else {
                            this.zzapx.putShort((short) i7);
                            this.zzapx.putInt(0);
                        }
                        this.zzapw.zzc(this.zzapx.array(), i4);
                        zzkgVar.zza(this.zzapw, i4);
                        this.zzare += i4;
                    }
                }
            } else if (zzkqVar.zzarl != null) {
                this.zzapt.zzc(zzkqVar.zzarl, zzkqVar.zzarl.length);
            }
            this.zzaqx = true;
        }
        int limit = i + this.zzapt.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzkqVar.zzari) && !"V_MPEGH/ISO/HEVC".equals(zzkqVar.zzari)) {
            while (true) {
                int i8 = this.zzaqw;
                if (i8 >= limit) {
                    break;
                } else {
                    zza(zzjyVar, zzkgVar, limit - i8);
                }
            }
        } else {
            byte[] bArr = this.zzapp.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = zzkqVar.zzasn;
            int i10 = 4 - zzkqVar.zzasn;
            while (this.zzaqw < limit) {
                int i11 = this.zzard;
                if (i11 == 0) {
                    int min = Math.min(i9, this.zzapt.zziv());
                    zzjyVar.readFully(bArr, i10 + min, i9 - min);
                    if (min > 0) {
                        this.zzapt.zze(bArr, i10, min);
                    }
                    this.zzaqw += i9;
                    this.zzapp.zzbi(0);
                    this.zzard = this.zzapp.zzja();
                    this.zzapo.zzbi(0);
                    zzkgVar.zza(this.zzapo, 4);
                    this.zzare += 4;
                } else {
                    this.zzard = i11 - zza(zzjyVar, zzkgVar, i11);
                }
            }
        }
        if ("A_VORBIS".equals(zzkqVar.zzari)) {
            this.zzapr.zzbi(0);
            zzkgVar.zza(this.zzapr, 4);
            this.zzare += 4;
        }
    }

    private final int zza(zzjy zzjyVar, zzkg zzkgVar, int i) throws IOException, InterruptedException {
        int zza;
        int zziv = this.zzapt.zziv();
        if (zziv > 0) {
            zza = Math.min(i, zziv);
            zzkgVar.zza(this.zzapt, zza);
        } else {
            zza = zzkgVar.zza(zzjyVar, i, false);
        }
        this.zzaqw += zza;
        this.zzare += zza;
        return zza;
    }

    private final long zzea(long j) throws zzhv {
        long j2 = this.zzaqa;
        if (j2 == -9223372036854775807L) {
            throw new zzhv("Can't scale timecode prior to timecodeScale being set.");
        }
        return zzps.zza(j, j2, 1000L);
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }
}
