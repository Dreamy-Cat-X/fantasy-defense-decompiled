package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzmg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzkw {
    private static final int zzawj = zzps.zzbh("vide");
    private static final int zzawk = zzps.zzbh("soun");
    private static final int zzawl = zzps.zzbh("text");
    private static final int zzawm = zzps.zzbh("sbtl");
    private static final int zzawn = zzps.zzbh("subt");
    private static final int zzawo = zzps.zzbh("clcp");
    private static final int zzawp = zzps.zzbh("cenc");
    private static final int zzavv = zzps.zzbh("meta");

    /* JADX WARN: Removed duplicated region for block: B:151:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0820 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzlr zza(zzku zzkuVar, zzkx zzkxVar, long j, zzjn zzjnVar, boolean z) throws zzhv {
        int i;
        boolean z2;
        long j2;
        zzkx zzkxVar2;
        long j3;
        int i2;
        int i3;
        int readInt;
        int i4;
        zzlb zzlbVar;
        zzku zzaq;
        zzlr zzlrVar;
        Pair create;
        int i5;
        zzkx zzap;
        int i6;
        int i7;
        zzlc zzlcVar;
        String str;
        Pair pair;
        int i8;
        int i9;
        zzpm zzpmVar;
        int i10;
        zzlb zzlbVar2;
        int i11;
        Object obj;
        byte[] bArr;
        List<byte[]> list;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int position;
        int i17;
        String str3;
        zzlb zzlbVar3;
        Pair pair2;
        zzpm zzpmVar2;
        int i18;
        int i19;
        String str4;
        int i20;
        zzlb zzlbVar4;
        int position2;
        String str5;
        String str6;
        int i21;
        int i22;
        String str7;
        List list2;
        long j4;
        zzjn zzjnVar2 = zzjnVar;
        zzku zzaq2 = zzkuVar.zzaq(zzkv.zzaty);
        zzpm zzpmVar3 = zzaq2.zzap(zzkv.zzaum).zzawq;
        zzpmVar3.zzbi(16);
        int readInt2 = zzpmVar3.readInt();
        if (readInt2 == zzawk) {
            i = 1;
        } else if (readInt2 == zzawj) {
            i = 2;
        } else if (readInt2 == zzawl || readInt2 == zzawm || readInt2 == zzawn || readInt2 == zzawo) {
            i = 3;
        } else {
            i = readInt2 == zzavv ? 4 : -1;
        }
        if (i == -1) {
            return null;
        }
        zzpm zzpmVar4 = zzkuVar.zzap(zzkv.zzaui).zzawq;
        zzpmVar4.zzbi(8);
        int zzar = zzkv.zzar(zzpmVar4.readInt());
        zzpmVar4.zzbj(zzar == 0 ? 8 : 16);
        int readInt3 = zzpmVar4.readInt();
        zzpmVar4.zzbj(4);
        int position3 = zzpmVar4.getPosition();
        int i23 = zzar == 0 ? 4 : 8;
        int i24 = 0;
        while (true) {
            if (i24 >= i23) {
                z2 = true;
                break;
            }
            if (zzpmVar4.data[position3 + i24] != -1) {
                z2 = false;
                break;
            }
            i24++;
        }
        if (z2) {
            zzpmVar4.zzbj(i23);
        } else {
            long zzix = zzar == 0 ? zzpmVar4.zzix() : zzpmVar4.zzjb();
            if (zzix != 0) {
                j2 = zzix;
                zzpmVar4.zzbj(16);
                int readInt4 = zzpmVar4.readInt();
                int readInt5 = zzpmVar4.readInt();
                zzpmVar4.zzbj(4);
                int readInt6 = zzpmVar4.readInt();
                int readInt7 = zzpmVar4.readInt();
                zzlc zzlcVar2 = new zzlc(readInt3, j2, (readInt4 != 0 && readInt5 == 65536 && readInt6 == -65536 && readInt7 == 0) ? 90 : (readInt4 != 0 && readInt5 == -65536 && readInt6 == 65536 && readInt7 == 0) ? 270 : (readInt4 != -65536 && readInt5 == 0 && readInt6 == 0 && readInt7 == -65536) ? 180 : 0);
                if (j != -9223372036854775807L) {
                    j4 = zzlcVar2.zzde;
                    j3 = j4;
                    zzkxVar2 = zzkxVar;
                } else {
                    zzkxVar2 = zzkxVar;
                    j3 = j;
                }
                zzpm zzpmVar5 = zzkxVar2.zzawq;
                zzpmVar5.zzbi(8);
                zzpmVar5.zzbj(zzkv.zzar(zzpmVar5.readInt()) != 0 ? 8 : 16);
                long zzix2 = zzpmVar5.zzix();
                long zza = j3 != -9223372036854775807L ? -9223372036854775807L : zzps.zza(j3, 1000000L, zzix2);
                zzku zzaq3 = zzaq2.zzaq(zzkv.zzatz).zzaq(zzkv.zzaua);
                zzpm zzpmVar6 = zzaq2.zzap(zzkv.zzaul).zzawq;
                zzpmVar6.zzbi(8);
                int zzar2 = zzkv.zzar(zzpmVar6.readInt());
                zzpmVar6.zzbj(zzar2 != 0 ? 8 : 16);
                long zzix3 = zzpmVar6.zzix();
                zzpmVar6.zzbj(zzar2 != 0 ? 4 : 8);
                int readUnsignedShort = zzpmVar6.readUnsignedShort();
                StringBuilder sb = new StringBuilder(3);
                sb.append((char) (((readUnsignedShort >> 10) & 31) + 96));
                sb.append((char) (((readUnsignedShort >> 5) & 31) + 96));
                sb.append((char) ((readUnsignedShort & 31) + 96));
                Pair create2 = Pair.create(Long.valueOf(zzix3), sb.toString());
                zzpm zzpmVar7 = zzaq3.zzap(zzkv.zzaun).zzawq;
                i2 = zzlcVar2.id;
                i3 = zzlcVar2.zzahg;
                String str8 = (String) create2.second;
                zzpmVar7.zzbi(12);
                readInt = zzpmVar7.readInt();
                zzlb zzlbVar5 = new zzlb(readInt);
                i4 = 0;
                while (i4 < readInt) {
                    int position4 = zzpmVar7.getPosition();
                    int readInt8 = zzpmVar7.readInt();
                    String str9 = "childAtomSize should be positive";
                    zzpf.checkArgument(readInt8 > 0, "childAtomSize should be positive");
                    int readInt9 = zzpmVar7.readInt();
                    if (readInt9 == zzkv.zzasv || readInt9 == zzkv.zzasw || readInt9 == zzkv.zzaut || readInt9 == zzkv.zzavf || readInt9 == zzkv.zzasx || readInt9 == zzkv.zzasy || readInt9 == zzkv.zzasz || readInt9 == zzkv.zzawe || readInt9 == zzkv.zzawf) {
                        int i25 = i4;
                        zzlb zzlbVar6 = zzlbVar5;
                        i6 = readInt;
                        i7 = i;
                        String str10 = str8;
                        Pair pair3 = create2;
                        zzlcVar = zzlcVar2;
                        zzpm zzpmVar8 = zzpmVar7;
                        Object obj2 = "childAtomSize should be positive";
                        zzpmVar8.zzbi(position4 + 8 + 8);
                        zzpmVar8.zzbj(16);
                        int readUnsignedShort2 = zzpmVar8.readUnsignedShort();
                        int readUnsignedShort3 = zzpmVar8.readUnsignedShort();
                        zzpmVar8.zzbj(50);
                        int position5 = zzpmVar8.getPosition();
                        if (readInt9 == zzkv.zzaut) {
                            readInt9 = zza(zzpmVar8, position4, readInt8, zzlbVar6, i25);
                            zzpmVar8.zzbi(position5);
                        }
                        String str11 = null;
                        boolean z3 = false;
                        List<byte[]> list3 = null;
                        float f = 1.0f;
                        byte[] bArr2 = null;
                        int i26 = -1;
                        while (position5 - position4 < readInt8) {
                            zzpmVar8.zzbi(position5);
                            int position6 = zzpmVar8.getPosition();
                            int readInt10 = zzpmVar8.readInt();
                            if (readInt10 == 0 && zzpmVar8.getPosition() - position4 == readInt8) {
                                break;
                            }
                            zzpf.checkArgument(readInt10 > 0, obj2);
                            int readInt11 = zzpmVar8.readInt();
                            String str12 = str10;
                            if (readInt11 == zzkv.zzaub) {
                                zzpf.checkState(str11 == null);
                                zzpmVar8.zzbi(position6 + 8);
                                zzpu zzg = zzpu.zzg(zzpmVar8);
                                list = zzg.zzahd;
                                zzlbVar6.zzasn = zzg.zzasn;
                                if (!z3) {
                                    f = zzg.zzbjv;
                                }
                                str2 = "video/avc";
                            } else if (readInt11 == zzkv.zzauc) {
                                zzpf.checkState(str11 == null);
                                zzpmVar8.zzbi(position6 + 8);
                                zzqa zzi = zzqa.zzi(zzpmVar8);
                                list = zzi.zzahd;
                                zzlbVar6.zzasn = zzi.zzasn;
                                str2 = "video/hevc";
                            } else {
                                if (readInt11 == zzkv.zzawg) {
                                    zzpf.checkState(str11 == null);
                                    str11 = readInt9 == zzkv.zzawe ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (readInt11 == zzkv.zzata) {
                                    zzpf.checkState(str11 == null);
                                    str11 = "video/3gpp";
                                } else if (readInt11 == zzkv.zzaud) {
                                    zzpf.checkState(str11 == null);
                                    Pair<String, byte[]> zzb = zzb(zzpmVar8, position6);
                                    str11 = (String) zzb.first;
                                    list3 = Collections.singletonList((byte[]) zzb.second);
                                } else if (readInt11 == zzkv.zzavc) {
                                    zzpmVar8.zzbi(position6 + 8);
                                    f = zzpmVar8.zzja() / zzpmVar8.zzja();
                                    i11 = readInt9;
                                    obj = obj2;
                                    z3 = true;
                                    position5 += readInt10;
                                    str10 = str12;
                                    readInt9 = i11;
                                    obj2 = obj;
                                } else {
                                    if (readInt11 == zzkv.zzawc) {
                                        int i27 = position6 + 8;
                                        while (true) {
                                            if (i27 - position6 >= readInt10) {
                                                i11 = readInt9;
                                                obj = obj2;
                                                bArr = null;
                                                break;
                                            }
                                            zzpmVar8.zzbi(i27);
                                            int readInt12 = zzpmVar8.readInt();
                                            i11 = readInt9;
                                            obj = obj2;
                                            if (zzpmVar8.readInt() == zzkv.zzawd) {
                                                bArr = Arrays.copyOfRange(zzpmVar8.data, i27, readInt12 + i27);
                                                break;
                                            }
                                            i27 += readInt12;
                                            readInt9 = i11;
                                            obj2 = obj;
                                        }
                                        bArr2 = bArr;
                                    } else {
                                        i11 = readInt9;
                                        obj = obj2;
                                        if (readInt11 == zzkv.zzawb) {
                                            int readUnsignedByte = zzpmVar8.readUnsignedByte();
                                            zzpmVar8.zzbj(3);
                                            if (readUnsignedByte == 0) {
                                                int readUnsignedByte2 = zzpmVar8.readUnsignedByte();
                                                if (readUnsignedByte2 == 0) {
                                                    i26 = 0;
                                                } else if (readUnsignedByte2 == 1) {
                                                    i26 = 1;
                                                } else if (readUnsignedByte2 == 2) {
                                                    i26 = 2;
                                                } else if (readUnsignedByte2 == 3) {
                                                    i26 = 3;
                                                }
                                            }
                                            position5 += readInt10;
                                            str10 = str12;
                                            readInt9 = i11;
                                            obj2 = obj;
                                        }
                                    }
                                    position5 += readInt10;
                                    str10 = str12;
                                    readInt9 = i11;
                                    obj2 = obj;
                                }
                                i11 = readInt9;
                                obj = obj2;
                                position5 += readInt10;
                                str10 = str12;
                                readInt9 = i11;
                                obj2 = obj;
                            }
                            i11 = readInt9;
                            list3 = list;
                            obj = obj2;
                            str11 = str2;
                            position5 += readInt10;
                            str10 = str12;
                            readInt9 = i11;
                            obj2 = obj;
                        }
                        str = str10;
                        if (str11 != null) {
                            i8 = i25;
                            float f2 = f;
                            i9 = position4;
                            pair = pair3;
                            i10 = readInt8;
                            zzpmVar = zzpmVar8;
                            zzlbVar2 = zzlbVar6;
                            zzlbVar2.zzahw = zzhs.zza(Integer.toString(i2), str11, null, -1, -1, readUnsignedShort2, readUnsignedShort3, -1.0f, list3, i3, f2, bArr2, i26, null, zzjnVar);
                            zzpm zzpmVar9 = zzpmVar;
                            zzpmVar9.zzbi(i9 + i10);
                            i4 = i8 + 1;
                            zzjnVar2 = zzjnVar;
                            zzlbVar5 = zzlbVar2;
                            zzpmVar7 = zzpmVar9;
                            zzlcVar2 = zzlcVar;
                            i = i7;
                            readInt = i6;
                            str8 = str;
                            create2 = pair;
                        } else {
                            pair = pair3;
                            i8 = i25;
                            i9 = position4;
                            zzpmVar = zzpmVar8;
                            i10 = readInt8;
                            zzlbVar2 = zzlbVar6;
                        }
                    } else {
                        if (readInt9 == zzkv.zzatc || readInt9 == zzkv.zzauu || readInt9 == zzkv.zzath || readInt9 == zzkv.zzatj || readInt9 == zzkv.zzatl || readInt9 == zzkv.zzato || readInt9 == zzkv.zzatm || readInt9 == zzkv.zzatn || readInt9 == zzkv.zzavs || readInt9 == zzkv.zzavt || readInt9 == zzkv.zzatf || readInt9 == zzkv.zzatg || readInt9 == zzkv.zzatd || readInt9 == zzkv.zzawi) {
                            i12 = i4;
                            i6 = readInt;
                            i7 = i;
                            String str13 = str8;
                            zzlcVar = zzlcVar2;
                            zzlb zzlbVar7 = zzlbVar5;
                            int i28 = position4;
                            zzpmVar7.zzbi(i28 + 8 + 8);
                            if (z) {
                                i13 = zzpmVar7.readUnsignedShort();
                                zzpmVar7.zzbj(6);
                            } else {
                                zzpmVar7.zzbj(8);
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                i14 = 1;
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        zzpmVar7.zzbj(16);
                                        i16 = (int) Math.round(Double.longBitsToDouble(zzpmVar7.readLong()));
                                        i15 = zzpmVar7.zzja();
                                        zzpmVar7.zzbj(20);
                                        position = zzpmVar7.getPosition();
                                        if (readInt9 != zzkv.zzauu) {
                                            i17 = i12;
                                            readInt9 = zza(zzpmVar7, i28, readInt8, zzlbVar7, i17);
                                            zzpmVar7.zzbi(position);
                                        } else {
                                            i17 = i12;
                                        }
                                        String str14 = "audio/raw";
                                        if (readInt9 != zzkv.zzath) {
                                            str3 = "audio/ac3";
                                        } else if (readInt9 == zzkv.zzatj) {
                                            str3 = "audio/eac3";
                                        } else if (readInt9 == zzkv.zzatl) {
                                            str3 = "audio/vnd.dts";
                                        } else if (readInt9 == zzkv.zzatm || readInt9 == zzkv.zzatn) {
                                            str3 = "audio/vnd.dts.hd";
                                        } else if (readInt9 == zzkv.zzato) {
                                            str3 = "audio/vnd.dts.hd;profile=lbr";
                                        } else if (readInt9 == zzkv.zzavs) {
                                            str3 = "audio/3gpp";
                                        } else if (readInt9 == zzkv.zzavt) {
                                            str3 = "audio/amr-wb";
                                        } else if (readInt9 == zzkv.zzatf || readInt9 == zzkv.zzatg) {
                                            str3 = "audio/raw";
                                        } else if (readInt9 == zzkv.zzatd) {
                                            str3 = "audio/mpeg";
                                        } else {
                                            str3 = readInt9 == zzkv.zzawi ? "audio/alac" : null;
                                        }
                                        String str15 = str3;
                                        int i29 = i16;
                                        int i30 = i15;
                                        byte[] bArr3 = null;
                                        while (position - i28 < readInt8) {
                                            zzpmVar7.zzbi(position);
                                            int readInt13 = zzpmVar7.readInt();
                                            zzpf.checkArgument(readInt13 > 0, str9);
                                            int readInt14 = zzpmVar7.readInt();
                                            if (readInt14 == zzkv.zzaud || (z && readInt14 == zzkv.zzate)) {
                                                String str16 = str9;
                                                i18 = readInt13;
                                                i19 = i17;
                                                String str17 = str15;
                                                str4 = str14;
                                                i20 = i28;
                                                zzlbVar4 = zzlbVar7;
                                                if (readInt14 != zzkv.zzaud) {
                                                    position2 = zzpmVar7.getPosition();
                                                    while (true) {
                                                        if (position2 - position >= i18) {
                                                            str5 = str16;
                                                            position2 = -1;
                                                            break;
                                                        }
                                                        zzpmVar7.zzbi(position2);
                                                        int readInt15 = zzpmVar7.readInt();
                                                        str5 = str16;
                                                        zzpf.checkArgument(readInt15 > 0, str5);
                                                        if (zzpmVar7.readInt() == zzkv.zzaud) {
                                                            break;
                                                        }
                                                        position2 += readInt15;
                                                        str16 = str5;
                                                    }
                                                } else {
                                                    position2 = position;
                                                    str5 = str16;
                                                }
                                                if (position2 != -1) {
                                                    Pair<String, byte[]> zzb2 = zzb(zzpmVar7, position2);
                                                    String str18 = (String) zzb2.first;
                                                    bArr3 = (byte[]) zzb2.second;
                                                    if ("audio/mp4a-latm".equals(str18)) {
                                                        Pair<Integer, Integer> zze = zzpe.zze(bArr3);
                                                        int intValue = ((Integer) zze.first).intValue();
                                                        i30 = ((Integer) zze.second).intValue();
                                                        str15 = str18;
                                                        i29 = intValue;
                                                    } else {
                                                        str15 = str18;
                                                    }
                                                } else {
                                                    str15 = str17;
                                                }
                                            } else {
                                                if (readInt14 == zzkv.zzati) {
                                                    zzpmVar7.zzbi(position + 8);
                                                    zzlbVar7.zzahw = zzig.zza(zzpmVar7, Integer.toString(i2), str13, zzjnVar2);
                                                } else if (readInt14 == zzkv.zzatk) {
                                                    zzpmVar7.zzbi(position + 8);
                                                    zzlbVar7.zzahw = zzig.zzb(zzpmVar7, Integer.toString(i2), str13, zzjnVar2);
                                                } else {
                                                    if (readInt14 == zzkv.zzatp) {
                                                        str6 = str9;
                                                        i21 = readInt13;
                                                        i22 = position;
                                                        i19 = i17;
                                                        str7 = str15;
                                                        str4 = str14;
                                                        i20 = i28;
                                                        zzlbVar4 = zzlbVar7;
                                                        zzlbVar4.zzahw = zzhs.zza(Integer.toString(i2), str15, null, -1, -1, i30, i29, null, zzjnVar, 0, str13);
                                                    } else {
                                                        str6 = str9;
                                                        i21 = readInt13;
                                                        i22 = position;
                                                        i19 = i17;
                                                        str7 = str15;
                                                        str4 = str14;
                                                        i20 = i28;
                                                        zzlbVar4 = zzlbVar7;
                                                        if (readInt14 == zzkv.zzawi) {
                                                            i18 = i21;
                                                            byte[] bArr4 = new byte[i18];
                                                            position = i22;
                                                            zzpmVar7.zzbi(position);
                                                            zzpmVar7.zze(bArr4, 0, i18);
                                                            bArr3 = bArr4;
                                                            str5 = str6;
                                                            str15 = str7;
                                                        }
                                                    }
                                                    i18 = i21;
                                                    position = i22;
                                                    str5 = str6;
                                                    str15 = str7;
                                                }
                                                str6 = str9;
                                                i18 = readInt13;
                                                i19 = i17;
                                                str7 = str15;
                                                str4 = str14;
                                                i20 = i28;
                                                zzlbVar4 = zzlbVar7;
                                                str5 = str6;
                                                str15 = str7;
                                            }
                                            position += i18;
                                            str9 = str5;
                                            zzlbVar7 = zzlbVar4;
                                            i17 = i19;
                                            str14 = str4;
                                            i28 = i20;
                                            zzjnVar2 = zzjnVar;
                                        }
                                        int i31 = i17;
                                        String str19 = str15;
                                        String str20 = str14;
                                        int i32 = i28;
                                        zzlbVar3 = zzlbVar7;
                                        if (zzlbVar3.zzahw == null || str19 == null) {
                                            pair2 = create2;
                                            zzpmVar2 = zzpmVar7;
                                        } else {
                                            pair2 = create2;
                                            zzpmVar2 = zzpmVar7;
                                            zzlbVar3.zzahw = zzhs.zza(Integer.toString(i2), str19, null, -1, -1, i30, i29, str20.equals(str19) ? 2 : -1, bArr3 == null ? null : Collections.singletonList(bArr3), zzjnVar, 0, str13);
                                        }
                                        pair = pair2;
                                        str = str13;
                                        zzpmVar = zzpmVar2;
                                        i10 = readInt8;
                                        zzlbVar2 = zzlbVar3;
                                        i8 = i31;
                                        i9 = i32;
                                    } else {
                                        str = str13;
                                        i9 = i28;
                                        zzlbVar2 = zzlbVar7;
                                        zzpmVar = zzpmVar7;
                                        pair = create2;
                                        i10 = readInt8;
                                    }
                                }
                            } else {
                                i14 = 1;
                            }
                            int readUnsignedShort4 = zzpmVar7.readUnsignedShort();
                            zzpmVar7.zzbj(6);
                            i16 = zzpmVar7.zziz();
                            if (i13 == i14) {
                                zzpmVar7.zzbj(16);
                            }
                            i15 = readUnsignedShort4;
                            position = zzpmVar7.getPosition();
                            if (readInt9 != zzkv.zzauu) {
                            }
                            String str142 = "audio/raw";
                            if (readInt9 != zzkv.zzath) {
                            }
                            String str152 = str3;
                            int i292 = i16;
                            int i302 = i15;
                            byte[] bArr32 = null;
                            while (position - i28 < readInt8) {
                            }
                            int i312 = i17;
                            String str192 = str152;
                            String str202 = str142;
                            int i322 = i28;
                            zzlbVar3 = zzlbVar7;
                            if (zzlbVar3.zzahw == null) {
                            }
                            pair2 = create2;
                            zzpmVar2 = zzpmVar7;
                            pair = pair2;
                            str = str13;
                            zzpmVar = zzpmVar2;
                            i10 = readInt8;
                            zzlbVar2 = zzlbVar3;
                            i8 = i312;
                            i9 = i322;
                        } else if (readInt9 == zzkv.zzavd || readInt9 == zzkv.zzavo || readInt9 == zzkv.zzavp || readInt9 == zzkv.zzavq || readInt9 == zzkv.zzavr) {
                            zzpmVar7.zzbi(position4 + 8 + 8);
                            long j5 = Long.MAX_VALUE;
                            String str21 = "application/ttml+xml";
                            if (readInt9 == zzkv.zzavd) {
                                list2 = null;
                            } else if (readInt9 == zzkv.zzavo) {
                                int i33 = (readInt8 - 8) - 8;
                                byte[] bArr5 = new byte[i33];
                                zzpmVar7.zze(bArr5, 0, i33);
                                list2 = Collections.singletonList(bArr5);
                                str21 = "application/x-quicktime-tx3g";
                            } else {
                                if (readInt9 == zzkv.zzavp) {
                                    str21 = "application/x-mp4-vtt";
                                } else if (readInt9 == zzkv.zzavq) {
                                    j5 = 0;
                                } else if (readInt9 == zzkv.zzavr) {
                                    zzlbVar5.zzaxb = 1;
                                    str21 = "application/x-mp4-cea-608";
                                    list2 = null;
                                } else {
                                    throw new IllegalStateException();
                                }
                                list2 = null;
                            }
                            zzlcVar = zzlcVar2;
                            i12 = i4;
                            zzlb zzlbVar8 = zzlbVar5;
                            i6 = readInt;
                            i7 = i;
                            zzlbVar8.zzahw = zzhs.zza(Integer.toString(i2), str21, null, -1, 0, str8, -1, zzjnVar, j5, list2);
                            str = str8;
                            zzlbVar2 = zzlbVar8;
                            zzpmVar = zzpmVar7;
                            pair = create2;
                            i10 = readInt8;
                            i9 = position4;
                        } else {
                            if (readInt9 == zzkv.zzawh) {
                                zzlbVar5.zzahw = zzhs.zza(Integer.toString(i2), "application/x-camera-motion", null, -1, zzjnVar2);
                            }
                            i10 = readInt8;
                            i9 = position4;
                            i8 = i4;
                            zzlbVar2 = zzlbVar5;
                            i6 = readInt;
                            i7 = i;
                            str = str8;
                            zzpmVar = zzpmVar7;
                            pair = create2;
                            zzlcVar = zzlcVar2;
                            zzpm zzpmVar92 = zzpmVar;
                            zzpmVar92.zzbi(i9 + i10);
                            i4 = i8 + 1;
                            zzjnVar2 = zzjnVar;
                            zzlbVar5 = zzlbVar2;
                            zzpmVar7 = zzpmVar92;
                            zzlcVar2 = zzlcVar;
                            i = i7;
                            readInt = i6;
                            str8 = str;
                            create2 = pair;
                        }
                        i8 = i12;
                        zzpm zzpmVar922 = zzpmVar;
                        zzpmVar922.zzbi(i9 + i10);
                        i4 = i8 + 1;
                        zzjnVar2 = zzjnVar;
                        zzlbVar5 = zzlbVar2;
                        zzpmVar7 = zzpmVar922;
                        zzlcVar2 = zzlcVar;
                        i = i7;
                        readInt = i6;
                        str8 = str;
                        create2 = pair;
                    }
                    zzpm zzpmVar9222 = zzpmVar;
                    zzpmVar9222.zzbi(i9 + i10);
                    i4 = i8 + 1;
                    zzjnVar2 = zzjnVar;
                    zzlbVar5 = zzlbVar2;
                    zzpmVar7 = zzpmVar9222;
                    zzlcVar2 = zzlcVar;
                    i = i7;
                    readInt = i6;
                    str8 = str;
                    create2 = pair;
                }
                zzlbVar = zzlbVar5;
                int i34 = i;
                Pair pair4 = create2;
                zzlc zzlcVar3 = zzlcVar2;
                zzaq = zzkuVar.zzaq(zzkv.zzauj);
                if (zzaq != null || (zzap = zzaq.zzap(zzkv.zzauk)) == null) {
                    zzlrVar = null;
                    create = Pair.create(null, null);
                } else {
                    zzpm zzpmVar10 = zzap.zzawq;
                    zzpmVar10.zzbi(8);
                    int zzar3 = zzkv.zzar(zzpmVar10.readInt());
                    int zzja = zzpmVar10.zzja();
                    long[] jArr = new long[zzja];
                    long[] jArr2 = new long[zzja];
                    for (int i35 = 0; i35 < zzja; i35++) {
                        jArr[i35] = zzar3 == 1 ? zzpmVar10.zzjb() : zzpmVar10.zzix();
                        jArr2[i35] = zzar3 == 1 ? zzpmVar10.readLong() : zzpmVar10.readInt();
                        if (zzpmVar10.readShort() != 1) {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                        zzpmVar10.zzbj(2);
                    }
                    create = Pair.create(jArr, jArr2);
                    zzlrVar = null;
                }
                if (zzlbVar.zzahw != null) {
                    return zzlrVar;
                }
                i5 = zzlcVar3.id;
                return new zzlr(i5, i34, ((Long) pair4.first).longValue(), zzix2, zza, zzlbVar.zzahw, zzlbVar.zzaxb, zzlbVar.zzaxa, zzlbVar.zzasn, (long[]) create.first, (long[]) create.second);
            }
        }
        j2 = -9223372036854775807L;
        zzpmVar4.zzbj(16);
        int readInt42 = zzpmVar4.readInt();
        int readInt52 = zzpmVar4.readInt();
        zzpmVar4.zzbj(4);
        int readInt62 = zzpmVar4.readInt();
        int readInt72 = zzpmVar4.readInt();
        zzlc zzlcVar22 = new zzlc(readInt3, j2, (readInt42 != 0 && readInt52 == 65536 && readInt62 == -65536 && readInt72 == 0) ? 90 : (readInt42 != 0 && readInt52 == -65536 && readInt62 == 65536 && readInt72 == 0) ? 270 : (readInt42 != -65536 && readInt52 == 0 && readInt62 == 0 && readInt72 == -65536) ? 180 : 0);
        if (j != -9223372036854775807L) {
        }
        zzpm zzpmVar52 = zzkxVar2.zzawq;
        zzpmVar52.zzbi(8);
        zzpmVar52.zzbj(zzkv.zzar(zzpmVar52.readInt()) != 0 ? 8 : 16);
        long zzix22 = zzpmVar52.zzix();
        if (j3 != -9223372036854775807L) {
        }
        zzku zzaq32 = zzaq2.zzaq(zzkv.zzatz).zzaq(zzkv.zzaua);
        zzpm zzpmVar62 = zzaq2.zzap(zzkv.zzaul).zzawq;
        zzpmVar62.zzbi(8);
        int zzar22 = zzkv.zzar(zzpmVar62.readInt());
        zzpmVar62.zzbj(zzar22 != 0 ? 8 : 16);
        long zzix32 = zzpmVar62.zzix();
        zzpmVar62.zzbj(zzar22 != 0 ? 4 : 8);
        int readUnsignedShort5 = zzpmVar62.readUnsignedShort();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((readUnsignedShort5 >> 10) & 31) + 96));
        sb2.append((char) (((readUnsignedShort5 >> 5) & 31) + 96));
        sb2.append((char) ((readUnsignedShort5 & 31) + 96));
        Pair create22 = Pair.create(Long.valueOf(zzix32), sb2.toString());
        zzpm zzpmVar72 = zzaq32.zzap(zzkv.zzaun).zzawq;
        i2 = zzlcVar22.id;
        i3 = zzlcVar22.zzahg;
        String str82 = (String) create22.second;
        zzpmVar72.zzbi(12);
        readInt = zzpmVar72.readInt();
        zzlb zzlbVar52 = new zzlb(readInt);
        i4 = 0;
        while (i4 < readInt) {
        }
        zzlbVar = zzlbVar52;
        int i342 = i;
        Pair pair42 = create22;
        zzlc zzlcVar32 = zzlcVar22;
        zzaq = zzkuVar.zzaq(zzkv.zzauj);
        if (zzaq != null) {
        }
        zzlrVar = null;
        create = Pair.create(null, null);
        if (zzlbVar.zzahw != null) {
        }
    }

    public static zzls zza(zzlr zzlrVar, zzku zzkuVar, zzkd zzkdVar) throws zzhv {
        zzky zzldVar;
        boolean z;
        int i;
        int i2;
        zzlr zzlrVar2;
        int i3;
        long[] jArr;
        int[] iArr;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long j;
        boolean z2;
        long[] jArr3;
        int[] iArr3;
        int i5;
        long[] jArr4;
        int[] iArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        zzkx zzap = zzkuVar.zzap(zzkv.zzavk);
        if (zzap != null) {
            zzldVar = new zzla(zzap);
        } else {
            zzkx zzap2 = zzkuVar.zzap(zzkv.zzavl);
            if (zzap2 == null) {
                throw new zzhv("Track has no sample table size information");
            }
            zzldVar = new zzld(zzap2);
        }
        int zzgx = zzldVar.zzgx();
        if (zzgx == 0) {
            return new zzls(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzkx zzap3 = zzkuVar.zzap(zzkv.zzavm);
        if (zzap3 == null) {
            zzap3 = zzkuVar.zzap(zzkv.zzavn);
            z = true;
        } else {
            z = false;
        }
        zzpm zzpmVar = zzap3.zzawq;
        zzpm zzpmVar2 = zzkuVar.zzap(zzkv.zzavj).zzawq;
        zzpm zzpmVar3 = zzkuVar.zzap(zzkv.zzavg).zzawq;
        zzkx zzap4 = zzkuVar.zzap(zzkv.zzavh);
        zzpm zzpmVar4 = null;
        zzpm zzpmVar5 = zzap4 != null ? zzap4.zzawq : null;
        zzkx zzap5 = zzkuVar.zzap(zzkv.zzavi);
        zzpm zzpmVar6 = zzap5 != null ? zzap5.zzawq : null;
        zzkz zzkzVar = new zzkz(zzpmVar2, zzpmVar, z);
        zzpmVar3.zzbi(12);
        int zzja = zzpmVar3.zzja() - 1;
        int zzja2 = zzpmVar3.zzja();
        int zzja3 = zzpmVar3.zzja();
        if (zzpmVar6 != null) {
            zzpmVar6.zzbi(12);
            i = zzpmVar6.zzja();
        } else {
            i = 0;
        }
        int i10 = -1;
        if (zzpmVar5 != null) {
            zzpmVar5.zzbi(12);
            i2 = zzpmVar5.zzja();
            if (i2 > 0) {
                i10 = zzpmVar5.zzja() - 1;
                zzpmVar4 = zzpmVar5;
            }
        } else {
            zzpmVar4 = zzpmVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzldVar.zzgz() && "audio/raw".equals(zzlrVar.zzahw.zzahb) && zzja == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[zzgx];
            iArr = new int[zzgx];
            jArr2 = new long[zzgx];
            int i11 = i2;
            iArr2 = new int[zzgx];
            int i12 = i10;
            long j3 = 0;
            j = 0;
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i;
            int i18 = zzja3;
            int i19 = zzja2;
            int i20 = zzja;
            int i21 = i11;
            while (i13 < zzgx) {
                while (i15 == 0) {
                    zzpf.checkState(zzkzVar.zzha());
                    j3 = zzkzVar.zzaws;
                    i15 = zzkzVar.zzawr;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (zzpmVar6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = zzpmVar6.zzja();
                        i16 = zzpmVar6.readInt();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j3;
                iArr[i13] = zzldVar.zzgy();
                if (iArr[i13] > i4) {
                    i4 = iArr[i13];
                }
                int i25 = zzgx;
                zzky zzkyVar = zzldVar;
                jArr2[i13] = j + i24;
                iArr2[i13] = zzpmVar4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = zzpmVar4.zzja() - 1;
                    }
                }
                long[] jArr6 = jArr5;
                j += i23;
                int i26 = i22 - 1;
                if (i26 != 0 || i20 <= 0) {
                    i8 = i23;
                    i9 = i26;
                } else {
                    i9 = zzpmVar3.zzja();
                    i8 = zzpmVar3.zzja();
                    i20--;
                }
                int i27 = i9;
                j3 += iArr[i13];
                i15--;
                i13++;
                zzgx = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i27;
                i18 = i8;
                zzldVar = zzkyVar;
            }
            i3 = zzgx;
            long[] jArr7 = jArr5;
            int i28 = i19;
            zzpf.checkArgument(i14 == 0);
            while (i17 > 0) {
                zzpf.checkArgument(zzpmVar6.zzja() == 0);
                zzpmVar6.readInt();
                i17--;
            }
            if (i21 == 0 && i28 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    zzlrVar2 = zzlrVar;
                    jArr = jArr7;
                }
            } else {
                i7 = i15;
            }
            zzlrVar2 = zzlrVar;
            int i29 = zzlrVar2.id;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i29);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i28);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i20);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr7;
        } else {
            zzlrVar2 = zzlrVar;
            i3 = zzgx;
            zzky zzkyVar2 = zzldVar;
            long[] jArr8 = new long[zzkzVar.length];
            int i30 = zzkzVar.length;
            int[] iArr5 = new int[i30];
            while (zzkzVar.zzha()) {
                jArr8[zzkzVar.index] = zzkzVar.zzaws;
                iArr5[zzkzVar.index] = zzkzVar.zzawr;
            }
            int zzgy = zzkyVar2.zzgy();
            long j4 = zzja3;
            int i31 = 8192 / zzgy;
            int i32 = 0;
            for (int i33 = 0; i33 < i30; i33++) {
                i32 += zzps.zzf(iArr5[i33], i31);
            }
            long[] jArr9 = new long[i32];
            int[] iArr6 = new int[i32];
            long[] jArr10 = new long[i32];
            int[] iArr7 = new int[i32];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i34 < i30) {
                int i38 = iArr5[i34];
                long j5 = jArr8[i34];
                long[] jArr11 = jArr8;
                int i39 = i38;
                while (i39 > 0) {
                    int min = Math.min(i31, i39);
                    jArr9[i36] = j5;
                    iArr6[i36] = zzgy * min;
                    i37 = Math.max(i37, iArr6[i36]);
                    jArr10[i36] = i35 * j4;
                    iArr7[i36] = 1;
                    j5 += iArr6[i36];
                    i35 += min;
                    i39 -= min;
                    i36++;
                    i30 = i30;
                    iArr5 = iArr5;
                }
                i34++;
                jArr8 = jArr11;
            }
            zzlh zzlhVar = new zzlh(jArr9, iArr6, i37, jArr10, iArr7);
            jArr = zzlhVar.zzaos;
            iArr = zzlhVar.zzaor;
            i4 = zzlhVar.zzayg;
            jArr2 = zzlhVar.zzayh;
            iArr2 = zzlhVar.zzayi;
            j = 0;
        }
        if (zzlrVar2.zzbai == null || zzkdVar.zzgt()) {
            zzps.zza(jArr2, 1000000L, zzlrVar2.zzdd);
            return new zzls(jArr, iArr, i4, jArr2, iArr2);
        }
        if (zzlrVar2.zzbai.length == 1 && zzlrVar2.type == 1 && jArr2.length >= 2) {
            long j6 = zzlrVar2.zzbaj[0];
            long zza = zzps.zza(zzlrVar2.zzbai[0], zzlrVar2.zzdd, zzlrVar2.zzbaf) + j6;
            if (jArr2[0] <= j6 && j6 < jArr2[1] && jArr2[jArr2.length - 1] < zza && zza <= j) {
                long j7 = j - zza;
                long zza2 = zzps.zza(j6 - jArr2[0], zzlrVar2.zzahw.zzahm, zzlrVar2.zzdd);
                long zza3 = zzps.zza(j7, zzlrVar2.zzahw.zzahm, zzlrVar2.zzdd);
                if ((zza2 != 0 || zza3 != 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    zzkdVar.zzaho = (int) zza2;
                    zzkdVar.zzahp = (int) zza3;
                    zzps.zza(jArr2, 1000000L, zzlrVar2.zzdd);
                    return new zzls(jArr, iArr, i4, jArr2, iArr2);
                }
            }
        }
        if (zzlrVar2.zzbai.length == 1) {
            char c = 0;
            if (zzlrVar2.zzbai[0] == 0) {
                int i40 = 0;
                while (i40 < jArr2.length) {
                    jArr2[i40] = zzps.zza(jArr2[i40] - zzlrVar2.zzbaj[c], 1000000L, zzlrVar2.zzdd);
                    i40++;
                    c = 0;
                }
                return new zzls(jArr, iArr, i4, jArr2, iArr2);
            }
        }
        boolean z3 = zzlrVar2.type == 1;
        boolean z4 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (i42 < zzlrVar2.zzbai.length) {
            long j8 = zzlrVar2.zzbaj[i42];
            if (j8 != -1) {
                i6 = i4;
                long zza4 = zzps.zza(zzlrVar2.zzbai[i42], zzlrVar2.zzdd, zzlrVar2.zzbaf);
                int zzb = zzps.zzb(jArr2, j8, true, true);
                int zzb2 = zzps.zzb(jArr2, j8 + zza4, z3, false);
                i41 += zzb2 - zzb;
                z4 |= i43 != zzb;
                i43 = zzb2;
            } else {
                i6 = i4;
            }
            i42++;
            i4 = i6;
        }
        int i44 = i4;
        boolean z5 = z4 | (i41 != i3);
        long[] jArr12 = z5 ? new long[i41] : jArr;
        int[] iArr8 = z5 ? new int[i41] : iArr;
        int i45 = z5 ? 0 : i44;
        int[] iArr9 = z5 ? new int[i41] : iArr2;
        long[] jArr13 = new long[i41];
        int i46 = i45;
        int i47 = 0;
        int i48 = 0;
        while (i47 < zzlrVar2.zzbai.length) {
            long j9 = zzlrVar2.zzbaj[i47];
            long j10 = zzlrVar2.zzbai[i47];
            if (j9 != -1) {
                int[] iArr10 = iArr9;
                i5 = i47;
                long[] jArr14 = jArr12;
                long[] jArr15 = jArr;
                long zza5 = zzps.zza(j10, zzlrVar2.zzdd, zzlrVar2.zzbaf) + j9;
                int zzb3 = zzps.zzb(jArr2, j9, true, true);
                int zzb4 = zzps.zzb(jArr2, zza5, z3, false);
                if (z5) {
                    int i49 = zzb4 - zzb3;
                    jArr3 = jArr14;
                    jArr4 = jArr15;
                    System.arraycopy(jArr4, zzb3, jArr3, i48, i49);
                    System.arraycopy(iArr, zzb3, iArr8, i48, i49);
                    z2 = z3;
                    iArr4 = iArr10;
                    System.arraycopy(iArr2, zzb3, iArr4, i48, i49);
                } else {
                    jArr3 = jArr14;
                    z2 = z3;
                    iArr4 = iArr10;
                    jArr4 = jArr15;
                }
                int i50 = i46;
                while (zzb3 < zzb4) {
                    int[] iArr11 = iArr4;
                    int i51 = zzb4;
                    long j11 = j9;
                    jArr13[i48] = zzps.zza(j2, 1000000L, zzlrVar2.zzbaf) + zzps.zza(jArr2[zzb3] - j9, 1000000L, zzlrVar2.zzdd);
                    if (z5 && iArr8[i48] > i50) {
                        i50 = iArr[zzb3];
                    }
                    i48++;
                    zzb3++;
                    j9 = j11;
                    zzb4 = i51;
                    iArr4 = iArr11;
                }
                iArr3 = iArr4;
                i46 = i50;
            } else {
                z2 = z3;
                jArr3 = jArr12;
                iArr3 = iArr9;
                i5 = i47;
                jArr4 = jArr;
            }
            j2 += j10;
            i47 = i5 + 1;
            jArr = jArr4;
            jArr12 = jArr3;
            z3 = z2;
            iArr9 = iArr3;
        }
        long[] jArr16 = jArr12;
        int[] iArr12 = iArr9;
        boolean z6 = false;
        for (int i52 = 0; i52 < iArr12.length && !z6; i52++) {
            z6 |= (iArr12[i52] & 1) != 0;
        }
        if (!z6) {
            throw new zzhv("The edited sample sequence does not contain a sync sample.");
        }
        return new zzls(jArr16, iArr8, i46, jArr13, iArr12);
    }

    public static zzmg zza(zzkx zzkxVar, boolean z) {
        if (z) {
            return null;
        }
        zzpm zzpmVar = zzkxVar.zzawq;
        zzpmVar.zzbi(8);
        while (zzpmVar.zziv() >= 8) {
            int position = zzpmVar.getPosition();
            int readInt = zzpmVar.readInt();
            if (zzpmVar.readInt() == zzkv.zzavv) {
                zzpmVar.zzbi(position);
                int i = position + readInt;
                zzpmVar.zzbj(12);
                while (true) {
                    if (zzpmVar.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzpmVar.getPosition();
                    int readInt2 = zzpmVar.readInt();
                    if (zzpmVar.readInt() == zzkv.zzavw) {
                        zzpmVar.zzbi(position2);
                        int i2 = position2 + readInt2;
                        zzpmVar.zzbj(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzpmVar.getPosition() < i2) {
                            zzmg.zza zzd = zzlk.zzd(zzpmVar);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzmg(arrayList);
                        }
                    } else {
                        zzpmVar.zzbj(readInt2 - 8);
                    }
                }
                return null;
            }
            zzpmVar.zzbj(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzpm zzpmVar, int i) {
        zzpmVar.zzbi(i + 8 + 4);
        zzpmVar.zzbj(1);
        zzc(zzpmVar);
        zzpmVar.zzbj(2);
        int readUnsignedByte = zzpmVar.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzpmVar.zzbj(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzpmVar.zzbj(zzpmVar.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzpmVar.zzbj(2);
        }
        zzpmVar.zzbj(1);
        zzc(zzpmVar);
        int readUnsignedByte2 = zzpmVar.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzpmVar.zzbj(12);
        zzpmVar.zzbj(1);
        int zzc = zzc(zzpmVar);
        byte[] bArr = new byte[zzc];
        zzpmVar.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzpm zzpmVar, int i, int i2, zzlb zzlbVar, int i3) {
        int position = zzpmVar.getPosition();
        while (true) {
            if (position - i >= i2) {
                return 0;
            }
            zzpmVar.zzbi(position);
            int readInt = zzpmVar.readInt();
            zzpf.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzpmVar.readInt() == zzkv.zzaup) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzlq zzlqVar = null;
                boolean z = false;
                while (i4 - position < readInt) {
                    zzpmVar.zzbi(i4);
                    int readInt2 = zzpmVar.readInt();
                    int readInt3 = zzpmVar.readInt();
                    if (readInt3 == zzkv.zzauv) {
                        num = Integer.valueOf(zzpmVar.readInt());
                    } else if (readInt3 == zzkv.zzauq) {
                        zzpmVar.zzbj(4);
                        z = zzpmVar.readInt() == zzawp;
                    } else if (readInt3 == zzkv.zzaur) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzlqVar = null;
                                break;
                            }
                            zzpmVar.zzbi(i5);
                            int readInt4 = zzpmVar.readInt();
                            if (zzpmVar.readInt() == zzkv.zzaus) {
                                zzpmVar.zzbj(6);
                                boolean z2 = zzpmVar.readUnsignedByte() == 1;
                                int readUnsignedByte = zzpmVar.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzpmVar.zze(bArr, 0, 16);
                                zzlqVar = new zzlq(z2, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                    }
                    i4 += readInt2;
                }
                if (z) {
                    zzpf.checkArgument(num != null, "frma atom is mandatory");
                    zzpf.checkArgument(zzlqVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzlqVar);
                }
                if (pair != null) {
                    zzlbVar.zzaxa[i3] = (zzlq) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            position += readInt;
        }
    }

    private static int zzc(zzpm zzpmVar) {
        int readUnsignedByte = zzpmVar.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzpmVar.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
