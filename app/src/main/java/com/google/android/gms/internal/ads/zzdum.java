package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.kt.olleh.inapp.net.InAppError;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdum {
    private static final Object zzhtb = new Object();
    private final Context context;
    private final SharedPreferences zzclm;
    private final String zzhsz;
    private final zzdtv zzhta;

    public zzdum(Context context, zzgq zzgqVar, zzdtv zzdtvVar) {
        this.context = context;
        this.zzhsz = Integer.toString(zzgqVar.zzv());
        this.zzclm = context.getSharedPreferences("pcvmspf", 0);
        this.zzhta = zzdtvVar;
    }

    public final zzdue zzp(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzhtb) {
            zzgt zzek = zzek(i);
            if (zzek == null) {
                zza(4022, currentTimeMillis);
                return null;
            }
            File zzhl = zzhl(zzek.zzdg());
            File file = new File(zzhl, "pcam.jar");
            if (!file.exists()) {
                file = new File(zzhl, "pcam");
            }
            File file2 = new File(zzhl, "pcbc");
            File file3 = new File(zzhl, "pcopt");
            zza(5016, currentTimeMillis);
            return new zzdue(zzek, file, file2, file3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1 A[Catch: all -> 0x018b, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x001c, B:8:0x0026, B:9:0x002b, B:12:0x002d, B:14:0x003e, B:17:0x004b, B:20:0x0056, B:23:0x00b1, B:25:0x00b3, B:27:0x00d3, B:28:0x00d8, B:30:0x00da, B:32:0x00e8, B:33:0x00ed, B:36:0x00f1, B:38:0x00f7, B:39:0x00ff, B:41:0x0101, B:43:0x0123, B:44:0x012a, B:46:0x0130, B:48:0x0137, B:50:0x0139, B:52:0x0146, B:53:0x014d, B:55:0x0155, B:56:0x015c, B:58:0x0172, B:60:0x017e, B:62:0x0181, B:65:0x0184, B:66:0x0189, B:70:0x0081, B:72:0x0087, B:75:0x0096, B:77:0x009c, B:78:0x00a6, B:79:0x00a1), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[Catch: all -> 0x018b, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x001c, B:8:0x0026, B:9:0x002b, B:12:0x002d, B:14:0x003e, B:17:0x004b, B:20:0x0056, B:23:0x00b1, B:25:0x00b3, B:27:0x00d3, B:28:0x00d8, B:30:0x00da, B:32:0x00e8, B:33:0x00ed, B:36:0x00f1, B:38:0x00f7, B:39:0x00ff, B:41:0x0101, B:43:0x0123, B:44:0x012a, B:46:0x0130, B:48:0x0137, B:50:0x0139, B:52:0x0146, B:53:0x014d, B:55:0x0155, B:56:0x015c, B:58:0x0172, B:60:0x017e, B:62:0x0181, B:65:0x0184, B:66:0x0189, B:70:0x0081, B:72:0x0087, B:75:0x0096, B:77:0x009c, B:78:0x00a6, B:79:0x00a1), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzgs zzgsVar, zzdun zzdunVar) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzhtb) {
            zzgt zzek = zzek(zzdup.zzhtd);
            String zzdg = zzgsVar.zzdc().zzdg();
            if (zzek != null && zzek.zzdg().equals(zzdg)) {
                zza(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zzhl = zzhl(zzdg);
            if (zzhl.exists()) {
                String str = zzhl.isDirectory() ? InAppError.FAILED : InAppError.SUCCESS;
                String str2 = zzhl.isFile() ? InAppError.FAILED : InAppError.SUCCESS;
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zza(4023, currentTimeMillis2, sb.toString());
                zza(4015, currentTimeMillis2);
            } else if (!zzhl.mkdirs()) {
                String str3 = zzhl.canWrite() ? InAppError.FAILED : InAppError.SUCCESS;
                zza(4024, currentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                zza(4015, currentTimeMillis2);
                z = false;
                if (z) {
                    return false;
                }
                File zzhl2 = zzhl(zzdg);
                File file = new File(zzhl2, "pcam.jar");
                File file2 = new File(zzhl2, "pcbc");
                if (!zzdug.zza(file, zzgsVar.zzdd().toByteArray())) {
                    zza(4016, currentTimeMillis);
                    return false;
                }
                if (!zzdug.zza(file2, zzgsVar.zzde().toByteArray())) {
                    zza(4017, currentTimeMillis);
                    return false;
                }
                if (zzdunVar != null && !zzdunVar.zzb(file)) {
                    zza(4018, currentTimeMillis);
                    zzdug.zze(zzhl2);
                    return false;
                }
                String zzb = zzb(zzgsVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzclm.getString(zzayw(), null);
                SharedPreferences.Editor edit = this.zzclm.edit();
                edit.putString(zzayw(), zzb);
                if (string != null) {
                    edit.putString(zzayv(), string);
                }
                boolean commit = edit.commit();
                if (!commit) {
                    zza(4019, currentTimeMillis3);
                }
                if (!commit) {
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzgt zzek2 = zzek(zzdup.zzhtd);
                if (zzek2 != null) {
                    hashSet.add(zzek2.zzdg());
                }
                zzgt zzek3 = zzek(zzdup.zzhte);
                if (zzek3 != null) {
                    hashSet.add(zzek3.zzdg());
                }
                for (File file3 : new File(this.context.getDir("pccache", 0), this.zzhsz).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzdug.zze(file3);
                    }
                }
                zza(5014, currentTimeMillis);
                return true;
            }
            z = true;
            if (z) {
            }
        }
    }

    public final boolean zza(zzgs zzgsVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzhtb) {
            if (!zzdug.zza(new File(zzhl(zzgsVar.zzdc().zzdg()), "pcbc"), zzgsVar.zzde().toByteArray())) {
                zza(4020, currentTimeMillis);
                return false;
            }
            String zzb = zzb(zzgsVar);
            SharedPreferences.Editor edit = this.zzclm.edit();
            edit.putString(zzayw(), zzb);
            boolean commit = edit.commit();
            if (commit) {
                zza(5015, currentTimeMillis);
            } else {
                zza(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    private final zzgt zzek(int i) {
        String string;
        if (i == zzdup.zzhtd) {
            string = this.zzclm.getString(zzayw(), null);
        } else {
            string = i == zzdup.zzhte ? this.zzclm.getString(zzayv(), null) : null;
        }
        if (string == null) {
            return null;
        }
        try {
            return zzgt.zzb(zzejg.zzt(Hex.stringToBytes(string)), zzekd.zzbia());
        } catch (zzeld unused) {
            return null;
        }
    }

    private final File zzhl(String str) {
        return new File(new File(this.context.getDir("pccache", 0), this.zzhsz), str);
    }

    private final String zzayv() {
        String valueOf = String.valueOf(this.zzhsz);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    private final String zzayw() {
        String valueOf = String.valueOf(this.zzhsz);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    private static String zzb(zzgs zzgsVar) {
        return Hex.bytesToStringLowercase(((zzgt) ((zzekq) zzgt.zzdl().zzav(zzgsVar.zzdc().zzdg()).zzaw(zzgsVar.zzdc().zzdh()).zzdk(zzgsVar.zzdc().zzdj()).zzdl(zzgsVar.zzdc().zzdk()).zzdj(zzgsVar.zzdc().zzdi()).zzbiz())).zzbgc().toByteArray());
    }

    private final void zza(int i, long j) {
        zzdtv zzdtvVar = this.zzhta;
        if (zzdtvVar != null) {
            zzdtvVar.zza(i, j);
        }
    }

    private final void zza(int i, long j, String str) {
        zzdtv zzdtvVar = this.zzhta;
        if (zzdtvVar != null) {
            zzdtvVar.zza(i, j, str);
        }
    }
}
