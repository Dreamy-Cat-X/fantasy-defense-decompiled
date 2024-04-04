package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.kt.olleh.inapp.net.InAppError;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzly {
    private static final SparseIntArray zzbcy;
    private static final SparseIntArray zzbcz;
    private static final Map<String, Integer> zzbda;
    private static final zzlv zzbcv = zzlv.zzay("OMX.google.raw.decoder");
    private static final Pattern zzbcw = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zza, List<zzlv>> zzbcx = new HashMap<>();
    private static int zzbdb = -1;

    public static zzlv zzhj() {
        return zzbcv;
    }

    public static zzlv zzc(String str, boolean z) throws zzmc {
        List<zzlv> zzd = zzd(str, z);
        if (zzd.isEmpty()) {
            return null;
        }
        return zzd.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza {
        public final String mimeType;
        public final boolean zzbcp;

        public zza(String str, boolean z) {
            this.mimeType = str;
            this.zzbcp = z;
        }

        public final int hashCode() {
            String str = this.mimeType;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.zzbcp ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == zza.class) {
                zza zzaVar = (zza) obj;
                if (TextUtils.equals(this.mimeType, zzaVar.mimeType) && this.zzbcp == zzaVar.zzbcp) {
                    return true;
                }
            }
            return false;
        }
    }

    private static synchronized List<zzlv> zzd(String str, boolean z) throws zzmc {
        synchronized (zzly.class) {
            zza zzaVar = new zza(str, z);
            List<zzlv> list = zzbcx.get(zzaVar);
            if (list != null) {
                return list;
            }
            List<zzlv> zza2 = zza(zzaVar, zzps.SDK_INT >= 21 ? new zzmd(z) : new zzme());
            if (z && zza2.isEmpty() && 21 <= zzps.SDK_INT && zzps.SDK_INT <= 23) {
                zza2 = zza(zzaVar, new zzme());
                if (!zza2.isEmpty()) {
                    String str2 = zza2.get(0).name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzlv> unmodifiableList = Collections.unmodifiableList(zza2);
            zzbcx.put(zzaVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int zzhk() throws zzmc {
        if (zzbdb == -1) {
            int i = 0;
            zzlv zzc = zzc("video/avc", false);
            if (zzc != null) {
                MediaCodecInfo.CodecProfileLevel[] zzhi = zzc.zzhi();
                int length = zzhi.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = zzhi[i].level;
                    int i4 = 9437184;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, zzps.SDK_INT >= 21 ? 345600 : 172800);
            }
            zzbdb = i;
        }
        return zzbdb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0029, code lost:
    
        if (r3.equals("hev1") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> zzbb(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        char c = 0;
        String str2 = split[0];
        int i = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2 || c == 3) {
                return zza(str, split);
            }
            return null;
        }
        if (split.length < 4) {
            String valueOf = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        Matcher matcher = zzbcw.matcher(split[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (InAppError.FAILED.equals(group)) {
            i = 1;
        } else if (!"2".equals(group)) {
            String valueOf3 = String.valueOf(group);
            Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
            return null;
        }
        Integer num = zzbda.get(split[3]);
        if (num == null) {
            String valueOf4 = String.valueOf(matcher.group(1));
            Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
            return null;
        }
        return new Pair<>(Integer.valueOf(i), num);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zzmc.<init>(java.lang.Throwable, com.google.android.gms.internal.ads.zzma):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b2 A[Catch: Exception -> 0x02ae, TryCatch #1 {Exception -> 0x02ae, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:27:0x0068, B:29:0x006e, B:32:0x0078, B:34:0x007c, B:36:0x0084, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:45:0x00a8, B:47:0x00b2, B:49:0x00bc, B:51:0x00c6, B:53:0x00d0, B:55:0x00da, B:57:0x00e4, B:59:0x00ee, B:61:0x00f8, B:63:0x0102, B:65:0x010c, B:68:0x0118, B:70:0x011c, B:72:0x0124, B:74:0x012e, B:76:0x0138, B:78:0x0142, B:81:0x014d, B:84:0x0155, B:86:0x015d, B:88:0x0167, B:90:0x0171, B:92:0x017b, B:94:0x0183, B:96:0x018d, B:99:0x0198, B:101:0x019c, B:103:0x01a4, B:108:0x01b2, B:110:0x01ba, B:143:0x0232, B:146:0x023a, B:148:0x0240, B:151:0x0264, B:152:0x0298), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fd A[Catch: Exception -> 0x01f8, TryCatch #3 {Exception -> 0x01f8, blocks: (B:158:0x01d2, B:160:0x01dc, B:162:0x01e6, B:164:0x01ee, B:121:0x01fd, B:125:0x020b, B:128:0x0206, B:134:0x0219), top: B:157:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.List<com.google.android.gms.internal.ads.zzlv> zza(com.google.android.gms.internal.ads.zzly.zza r17, com.google.android.gms.internal.ads.zzmb r18) throws com.google.android.gms.internal.ads.zzmc {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzly.zza(com.google.android.gms.internal.ads.zzly$zza, com.google.android.gms.internal.ads.zzmb):java.util.List");
    }

    private static Pair<Integer, Integer> zza(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            String valueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf3;
            } else {
                String valueOf4 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf4) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf5 = Integer.valueOf(zzbcy.get(num.intValue()));
            if (valueOf5 == null) {
                String valueOf6 = String.valueOf(num);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf6).length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(valueOf6);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer valueOf7 = Integer.valueOf(zzbcz.get(valueOf.intValue()));
            if (valueOf7 == null) {
                String valueOf8 = String.valueOf(valueOf);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf8).length() + 19);
                sb2.append("Unknown AVC level: ");
                sb2.append(valueOf8);
                Log.w("MediaCodecUtil", sb2.toString());
                return null;
            }
            return new Pair<>(valueOf5, valueOf7);
        } catch (NumberFormatException unused) {
            String valueOf9 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf9.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf9) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzbcy = sparseIntArray;
        sparseIntArray.put(66, 1);
        zzbcy.put(77, 2);
        zzbcy.put(88, 4);
        zzbcy.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zzbcz = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        zzbcz.put(11, 4);
        zzbcz.put(12, 8);
        zzbcz.put(13, 16);
        zzbcz.put(20, 32);
        zzbcz.put(21, 64);
        zzbcz.put(22, 128);
        zzbcz.put(30, 256);
        zzbcz.put(31, 512);
        zzbcz.put(32, 1024);
        zzbcz.put(40, 2048);
        zzbcz.put(41, 4096);
        zzbcz.put(42, 8192);
        zzbcz.put(50, 16384);
        zzbcz.put(51, 32768);
        zzbcz.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzbda = hashMap;
        hashMap.put("L30", 1);
        zzbda.put("L60", 4);
        zzbda.put("L63", 16);
        zzbda.put("L90", 64);
        zzbda.put("L93", 256);
        zzbda.put("L120", 1024);
        zzbda.put("L123", 4096);
        zzbda.put("L150", 16384);
        zzbda.put("L153", 65536);
        zzbda.put("L156", 262144);
        zzbda.put("L180", 1048576);
        zzbda.put("L183", 4194304);
        zzbda.put("L186", 16777216);
        zzbda.put("H30", 2);
        zzbda.put("H60", 8);
        zzbda.put("H63", 32);
        zzbda.put("H90", 128);
        zzbda.put("H93", 512);
        zzbda.put("H120", 2048);
        zzbda.put("H123", 8192);
        zzbda.put("H150", 32768);
        zzbda.put("H153", 131072);
        zzbda.put("H156", 524288);
        zzbda.put("H180", 2097152);
        zzbda.put("H183", 8388608);
        zzbda.put("H186", 33554432);
    }
}
