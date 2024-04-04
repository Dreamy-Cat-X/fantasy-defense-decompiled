package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtt {
    private final Context context;
    private final zzdsn zzvo;

    public zzdtt(Context context, zzdsn zzdsnVar) {
        this.context = context;
        this.zzvo = zzdsnVar;
    }

    private final void zzc(byte[] bArr, String str) {
        if (this.zzvo == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzdwf.OS_ARCH.value());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";");
        sb.append("CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        this.zzvo.zzg(4007, sb.toString());
    }

    private final String zzayh() {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String value = zzdwf.OS_ARCH.value();
        if (!TextUtils.isEmpty(value) && hashSet.contains(value)) {
            return value;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e) {
            zzdsn zzdsnVar = this.zzvo;
            if (zzdsnVar != null) {
                zzdsnVar.zza(2024, 0L, e);
            }
        } catch (NoSuchFieldException e2) {
            zzdsn zzdsnVar2 = this.zzvo;
            if (zzdsnVar2 != null) {
                zzdsnVar2.zza(2024, 0L, e2);
            }
        }
        if (Build.CPU_ABI != null) {
            return Build.CPU_ABI;
        }
        return Build.CPU_ABI2;
    }

    private final zzgq zzayi() {
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(this.context.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            zzdsn zzdsnVar = this.zzvo;
            if (zzdsnVar != null) {
                zzdsnVar.zzg(5017, "No lib/");
            }
            return zzgq.UNKNOWN;
        }
        File[] listFiles = file.listFiles(new zzdxt(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            zzdsn zzdsnVar2 = this.zzvo;
            if (zzdsnVar2 != null) {
                zzdsnVar2.zzg(5017, "No .so");
            }
            return zzgq.UNKNOWN;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            try {
                bArr = new byte[20];
            } finally {
            }
        } catch (IOException e) {
            zzc(null, e.toString());
        }
        if (fileInputStream.read(bArr) == 20) {
            byte[] bArr2 = {0, 0};
            if (bArr[5] == 2) {
                zzc(bArr, null);
                zzgq zzgqVar = zzgq.UNSUPPORTED;
                fileInputStream.close();
                return zzgqVar;
            }
            bArr2[0] = bArr[19];
            bArr2[1] = bArr[18];
            short s = ByteBuffer.wrap(bArr2).getShort();
            if (s == 3) {
                zzgq zzgqVar2 = zzgq.X86;
                fileInputStream.close();
                return zzgqVar2;
            }
            if (s == 40) {
                zzgq zzgqVar3 = zzgq.ARM7;
                fileInputStream.close();
                return zzgqVar3;
            }
            if (s == 62) {
                zzgq zzgqVar4 = zzgq.X86_64;
                fileInputStream.close();
                return zzgqVar4;
            }
            if (s == 183) {
                zzgq zzgqVar5 = zzgq.ARM64;
                fileInputStream.close();
                return zzgqVar5;
            }
            zzc(bArr, null);
            zzgq zzgqVar6 = zzgq.UNSUPPORTED;
            fileInputStream.close();
            return zzgqVar6;
        }
        fileInputStream.close();
        return zzgq.UNSUPPORTED;
    }

    public final zzgq zzayj() {
        zzgq zzayi = zzayi();
        if (zzayi == zzgq.UNKNOWN) {
            String zzayh = zzayh();
            if (TextUtils.isEmpty(zzayh)) {
                zzc(null, "Empty dev arch");
                zzayi = zzgq.UNSUPPORTED;
            } else if (zzayh.equalsIgnoreCase("i686") || zzayh.equalsIgnoreCase("x86")) {
                zzayi = zzgq.X86;
            } else if (zzayh.equalsIgnoreCase("x86_64")) {
                zzayi = zzgq.X86_64;
            } else if (zzayh.equalsIgnoreCase("arm64-v8a")) {
                zzayi = zzgq.ARM64;
            } else if (zzayh.equalsIgnoreCase("armeabi-v7a") || zzayh.equalsIgnoreCase("armv71")) {
                zzayi = zzgq.ARM7;
            } else {
                zzc(null, zzayh);
                zzayi = zzgq.UNSUPPORTED;
            }
        }
        zzdsn zzdsnVar = this.zzvo;
        if (zzdsnVar != null) {
            zzdsnVar.zzg(5018, zzayi.name());
        }
        return zzayi;
    }

    public static boolean zza(zzgq zzgqVar) {
        int i = zzdts.zzhsh[zzgqVar.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }
}
