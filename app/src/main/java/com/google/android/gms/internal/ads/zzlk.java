package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzmg;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzlk {
    private static final int zzayk = zzps.zzbh("nam");
    private static final int zzayl = zzps.zzbh("trk");
    private static final int zzaym = zzps.zzbh("cmt");
    private static final int zzayn = zzps.zzbh("day");
    private static final int zzayo = zzps.zzbh("ART");
    private static final int zzayp = zzps.zzbh("too");
    private static final int zzayq = zzps.zzbh("alb");
    private static final int zzayr = zzps.zzbh("com");
    private static final int zzays = zzps.zzbh("wrt");
    private static final int zzayt = zzps.zzbh("lyr");
    private static final int zzayu = zzps.zzbh("gen");
    private static final int zzayv = zzps.zzbh("covr");
    private static final int zzayw = zzps.zzbh("gnre");
    private static final int zzayx = zzps.zzbh("grp");
    private static final int zzayy = zzps.zzbh("disk");
    private static final int zzayz = zzps.zzbh("trkn");
    private static final int zzaza = zzps.zzbh("tmpo");
    private static final int zzazb = zzps.zzbh("cpil");
    private static final int zzazc = zzps.zzbh("aART");
    private static final int zzazd = zzps.zzbh("sonm");
    private static final int zzaze = zzps.zzbh("soal");
    private static final int zzazf = zzps.zzbh("soar");
    private static final int zzazg = zzps.zzbh("soaa");
    private static final int zzazh = zzps.zzbh("soco");
    private static final int zzazi = zzps.zzbh("rtng");
    private static final int zzazj = zzps.zzbh("pgap");
    private static final int zzazk = zzps.zzbh("sosn");
    private static final int zzazl = zzps.zzbh("tvsh");
    private static final int zzazm = zzps.zzbh("----");
    private static final String[] zzazn = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static zzmg.zza zzd(zzpm zzpmVar) {
        int position = zzpmVar.getPosition() + zzpmVar.readInt();
        int readInt = zzpmVar.readInt();
        int i = readInt >>> 24;
        zzmg.zza zzaVar = null;
        try {
            if (i == 169 || i == 65533) {
                int i2 = 16777215 & readInt;
                if (i2 == zzaym) {
                    int readInt2 = zzpmVar.readInt();
                    if (zzpmVar.readInt() == zzkv.zzavz) {
                        zzpmVar.zzbj(8);
                        String zzbk = zzpmVar.zzbk(readInt2 - 16);
                        zzaVar = new zzmi("und", zzbk, zzbk);
                    } else {
                        String valueOf = String.valueOf(zzkv.zzat(readInt));
                        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return zzaVar;
                }
                if (i2 != zzayk && i2 != zzayl) {
                    if (i2 != zzayr && i2 != zzays) {
                        if (i2 == zzayn) {
                            return zza(readInt, "TDRC", zzpmVar);
                        }
                        if (i2 == zzayo) {
                            return zza(readInt, "TPE1", zzpmVar);
                        }
                        if (i2 == zzayp) {
                            return zza(readInt, "TSSE", zzpmVar);
                        }
                        if (i2 == zzayq) {
                            return zza(readInt, "TALB", zzpmVar);
                        }
                        if (i2 == zzayt) {
                            return zza(readInt, "USLT", zzpmVar);
                        }
                        if (i2 == zzayu) {
                            return zza(readInt, "TCON", zzpmVar);
                        }
                        if (i2 == zzayx) {
                            return zza(readInt, "TIT1", zzpmVar);
                        }
                    }
                    return zza(readInt, "TCOM", zzpmVar);
                }
                return zza(readInt, "TIT2", zzpmVar);
            }
            if (readInt == zzayw) {
                int zze = zze(zzpmVar);
                String str = (zze <= 0 || zze > zzazn.length) ? null : zzazn[zze - 1];
                if (str != null) {
                    zzaVar = new zzmm("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zzaVar;
            }
            if (readInt == zzayy) {
                return zzb(readInt, "TPOS", zzpmVar);
            }
            if (readInt == zzayz) {
                return zzb(readInt, "TRCK", zzpmVar);
            }
            if (readInt == zzaza) {
                return zza(readInt, "TBPM", zzpmVar, true, false);
            }
            if (readInt == zzazb) {
                return zza(readInt, "TCMP", zzpmVar, true, true);
            }
            if (readInt == zzayv) {
                int readInt3 = zzpmVar.readInt();
                if (zzpmVar.readInt() == zzkv.zzavz) {
                    int zzas = zzkv.zzas(zzpmVar.readInt());
                    String str2 = zzas == 13 ? "image/jpeg" : zzas == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(zzas);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        zzpmVar.zzbj(4);
                        int i3 = readInt3 - 16;
                        byte[] bArr = new byte[i3];
                        zzpmVar.zze(bArr, 0, i3);
                        zzaVar = new zzmh(str2, null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                return zzaVar;
            }
            if (readInt == zzazc) {
                return zza(readInt, "TPE2", zzpmVar);
            }
            if (readInt == zzazd) {
                return zza(readInt, "TSOT", zzpmVar);
            }
            if (readInt == zzaze) {
                return zza(readInt, "TSO2", zzpmVar);
            }
            if (readInt == zzazf) {
                return zza(readInt, "TSOA", zzpmVar);
            }
            if (readInt == zzazg) {
                return zza(readInt, "TSOP", zzpmVar);
            }
            if (readInt == zzazh) {
                return zza(readInt, "TSOC", zzpmVar);
            }
            if (readInt == zzazi) {
                return zza(readInt, "ITUNESADVISORY", zzpmVar, false, false);
            }
            if (readInt == zzazj) {
                return zza(readInt, "ITUNESGAPLESS", zzpmVar, false, true);
            }
            if (readInt == zzazk) {
                return zza(readInt, "TVSHOWSORT", zzpmVar);
            }
            if (readInt == zzazl) {
                return zza(readInt, "TVSHOW", zzpmVar);
            }
            if (readInt == zzazm) {
                String str3 = null;
                String str4 = null;
                int i4 = -1;
                int i5 = -1;
                while (zzpmVar.getPosition() < position) {
                    int position2 = zzpmVar.getPosition();
                    int readInt4 = zzpmVar.readInt();
                    int readInt5 = zzpmVar.readInt();
                    zzpmVar.zzbj(4);
                    if (readInt5 == zzkv.zzavx) {
                        str3 = zzpmVar.zzbk(readInt4 - 12);
                    } else if (readInt5 == zzkv.zzavy) {
                        str4 = zzpmVar.zzbk(readInt4 - 12);
                    } else {
                        if (readInt5 == zzkv.zzavz) {
                            i4 = position2;
                            i5 = readInt4;
                        }
                        zzpmVar.zzbj(readInt4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4) && i4 != -1) {
                    zzpmVar.zzbi(i4);
                    zzpmVar.zzbj(16);
                    zzaVar = new zzmi("und", str4, zzpmVar.zzbk(i5 - 16));
                }
                return zzaVar;
            }
            String valueOf2 = String.valueOf(zzkv.zzat(readInt));
            Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            zzpmVar.zzbi(position);
        }
    }

    private static zzmm zza(int i, String str, zzpm zzpmVar) {
        int readInt = zzpmVar.readInt();
        if (zzpmVar.readInt() == zzkv.zzavz) {
            zzpmVar.zzbj(8);
            return new zzmm(str, null, zzpmVar.zzbk(readInt - 16));
        }
        String valueOf = String.valueOf(zzkv.zzat(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzmn zza(int i, String str, zzpm zzpmVar, boolean z, boolean z2) {
        int zze = zze(zzpmVar);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze >= 0) {
            if (z) {
                return new zzmm(str, null, Integer.toString(zze));
            }
            return new zzmi("und", str, Integer.toString(zze));
        }
        String valueOf = String.valueOf(zzkv.zzat(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static zzmm zzb(int i, String str, zzpm zzpmVar) {
        int readInt = zzpmVar.readInt();
        if (zzpmVar.readInt() == zzkv.zzavz && readInt >= 22) {
            zzpmVar.zzbj(10);
            int readUnsignedShort = zzpmVar.readUnsignedShort();
            if (readUnsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(readUnsignedShort);
                String sb2 = sb.toString();
                int readUnsignedShort2 = zzpmVar.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(readUnsignedShort2);
                    sb2 = sb3.toString();
                }
                return new zzmm(str, null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zzkv.zzat(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzpm zzpmVar) {
        zzpmVar.zzbj(4);
        if (zzpmVar.readInt() == zzkv.zzavz) {
            zzpmVar.zzbj(8);
            return zzpmVar.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
