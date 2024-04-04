package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztu {
    private final zztz zzbvs;
    private final zzuc.zzi.zza zzbvt;
    private final boolean zzbvu;

    public static zztu zzne() {
        return new zztu();
    }

    public zztu(zztz zztzVar) {
        this.zzbvt = zzuc.zzi.zzof();
        this.zzbvs = zztzVar;
        this.zzbvu = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcuj)).booleanValue();
    }

    private zztu() {
        this.zzbvt = zzuc.zzi.zzof();
        this.zzbvu = false;
        this.zzbvs = new zztz();
    }

    public final synchronized void zza(zztw.zza.zzb zzbVar) {
        if (this.zzbvu) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcuk)).booleanValue()) {
                zzc(zzbVar);
            } else {
                zzb(zzbVar);
            }
        }
    }

    private final synchronized void zzb(zztw.zza.zzb zzbVar) {
        this.zzbvt.zzob().zza(zznf());
        this.zzbvs.zzf(((zzuc.zzi) ((zzekq) this.zzbvt.zzbiz())).toByteArray()).zzbv(zzbVar.zzv()).log();
        String valueOf = String.valueOf(Integer.toString(zzbVar.zzv(), 10));
        com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zztw.zza.zzb zzbVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(zzbVar).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zzd.zzeb("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zzd.zzeb("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zzd.zzeb("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zzd.zzeb("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzd(zztw.zza.zzb zzbVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzbvt.zzoa(), Long.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime()), Integer.valueOf(zzbVar.zzv()), Base64.encodeToString(((zzuc.zzi) ((zzekq) this.zzbvt.zzbiz())).toByteArray(), 3));
    }

    public final synchronized void zza(zztt zzttVar) {
        if (this.zzbvu) {
            try {
                zzttVar.zza(this.zzbvt);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private static List<Long> zznf() {
        List<String> zzsc = zzabh.zzsc();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = zzsc.iterator();
        while (it.hasNext()) {
            for (String str : it.next().split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zzd.zzeb("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }
}
