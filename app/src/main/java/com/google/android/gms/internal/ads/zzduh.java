package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzduh {
    private final SharedPreferences zzclm;
    private final File zzhsv;
    private final File zzhsw;
    private final zzgq zzvq;

    public zzduh(Context context, zzgq zzgqVar) {
        this.zzclm = context.getSharedPreferences("pcvmspf", 0);
        this.zzhsv = zzdug.zza(context.getDir("pccache", 0), false);
        this.zzhsw = zzdug.zza(context.getDir("tmppccache", 0), true);
        this.zzvq = zzgqVar;
    }

    public final zzdue zzp(int i) {
        zzgt zzek = zzek(i);
        if (zzek == null) {
            return null;
        }
        String zzdg = zzek.zzdg();
        File zza = zzdug.zza(zzdg, "pcam.jar", zzayu());
        if (!zza.exists()) {
            zza = zzdug.zza(zzdg, "pcam", zzayu());
        }
        return new zzdue(zzek, zza, zzdug.zza(zzdg, "pcbc", zzayu()), zzdug.zza(zzdg, "pcopt", zzayu()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0140, code lost:
    
        if (r0.commit() != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzgs zzgsVar, zzdun zzdunVar) {
        boolean z;
        boolean z2;
        zzgt zzek;
        zzgt zzek2;
        String zzdg = zzgsVar.zzdc().zzdg();
        byte[] byteArray = zzgsVar.zzdd().toByteArray();
        byte[] byteArray2 = zzgsVar.zzde().toByteArray();
        if (!TextUtils.isEmpty(zzdg) && byteArray2 != null && byteArray2.length != 0) {
            zzdug.zze(this.zzhsw);
            this.zzhsw.mkdirs();
            zzdug.zza(zzdg, this.zzhsw).mkdirs();
            File zza = zzdug.zza(zzdg, "pcam.jar", this.zzhsw);
            if (byteArray == null || byteArray.length <= 0 || zzdug.zza(zza, byteArray)) {
                z = zzdug.zza(zzdug.zza(zzdg, "pcbc", this.zzhsw), byteArray2);
                if (z) {
                    return false;
                }
                File zza2 = zzdug.zza(zzgsVar.zzdc().zzdg(), "pcam.jar", this.zzhsw);
                if (zza2.exists() && zzdunVar != null && !zzdunVar.zzb(zza2)) {
                    return false;
                }
                String zzdg2 = zzgsVar.zzdc().zzdg();
                boolean z3 = true;
                if (!TextUtils.isEmpty(zzdg2)) {
                    File zza3 = zzdug.zza(zzdg2, "pcam.jar", this.zzhsw);
                    File zza4 = zzdug.zza(zzdg2, "pcbc", this.zzhsw);
                    File zza5 = zzdug.zza(zzdg2, "pcam.jar", zzayu());
                    File zza6 = zzdug.zza(zzdg2, "pcbc", zzayu());
                    if ((!zza3.exists() || zza3.renameTo(zza5)) && zza4.exists() && zza4.renameTo(zza6)) {
                        z2 = true;
                        if (z2) {
                            zzgt zzgtVar = (zzgt) ((zzekq) zzgt.zzdl().zzav(zzgsVar.zzdc().zzdg()).zzaw(zzgsVar.zzdc().zzdh()).zzdk(zzgsVar.zzdc().zzdj()).zzdl(zzgsVar.zzdc().zzdk()).zzdj(zzgsVar.zzdc().zzdi()).zzbiz());
                            zzgt zzek3 = zzek(zzdup.zzhtd);
                            SharedPreferences.Editor edit = this.zzclm.edit();
                            if (zzek3 != null && !zzgtVar.zzdg().equals(zzek3.zzdg())) {
                                edit.putString(zzayv(), zza(zzek3));
                            }
                            edit.putString(zzayw(), zza(zzgtVar));
                        }
                        z3 = false;
                        HashSet hashSet = new HashSet();
                        zzek = zzek(zzdup.zzhtd);
                        if (zzek != null) {
                            hashSet.add(zzek.zzdg());
                        }
                        zzek2 = zzek(zzdup.zzhte);
                        if (zzek2 != null) {
                            hashSet.add(zzek2.zzdg());
                        }
                        for (File file : zzayu().listFiles()) {
                            String name = file.getName();
                            if (!hashSet.contains(name)) {
                                zzdug.zze(zzdug.zza(name, zzayu()));
                            }
                        }
                        return z3;
                    }
                }
                z2 = false;
                if (z2) {
                }
                z3 = false;
                HashSet hashSet2 = new HashSet();
                zzek = zzek(zzdup.zzhtd);
                if (zzek != null) {
                }
                zzek2 = zzek(zzdup.zzhte);
                if (zzek2 != null) {
                }
                while (r6 < r0) {
                }
                return z3;
            }
        }
        z = false;
        if (z) {
        }
    }

    private final File zzayu() {
        File file = new File(this.zzhsv, Integer.toString(this.zzvq.zzv()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static String zza(zzgt zzgtVar) {
        return Hex.bytesToStringLowercase(zzgtVar.zzbgc().toByteArray());
    }

    private final String zzayv() {
        int zzv = this.zzvq.zzv();
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(zzv);
        return sb.toString();
    }

    private final String zzayw() {
        int zzv = this.zzvq.zzv();
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(zzv);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzgt zzek(int i) {
        String string;
        zzgt zzl;
        File zza;
        File zza2;
        boolean z;
        if (i == zzdup.zzhtd) {
            string = this.zzclm.getString(zzayw(), null);
        } else {
            string = i == zzdup.zzhte ? this.zzclm.getString(zzayv(), null) : null;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzl = zzgt.zzl(zzejg.zzt(Hex.stringToBytes(string)));
            String zzdg = zzl.zzdg();
            zza = zzdug.zza(zzdg, "pcam.jar", zzayu());
            if (!zza.exists()) {
                zza = zzdug.zza(zzdg, "pcam", zzayu());
            }
            zza2 = zzdug.zza(zzdg, "pcbc", zzayu());
        } catch (zzeld unused) {
        }
        if (zza.exists()) {
            if (zza2.exists()) {
                z = true;
                if (z) {
                    return null;
                }
                return zzl;
            }
        }
        z = false;
        if (z) {
        }
    }
}
