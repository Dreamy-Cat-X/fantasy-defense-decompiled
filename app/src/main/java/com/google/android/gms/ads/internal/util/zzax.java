package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzwo;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzax {
    private static com.google.android.gms.internal.ads.zzae zzeee;
    private static final Object zzeef = new Object();

    @Deprecated
    private static final zzbb<Void> zzeeg = new zzba();

    public zzax(Context context) {
        zzbk(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static zzdzl<com.google.android.gms.internal.ads.zzy> zzeo(String str) {
        zzazc zzazcVar = new zzazc();
        zzeee.zze(new zzbd(str, zzazcVar));
        return zzazcVar;
    }

    public final zzdzl<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        zzbe zzbeVar = new zzbe(null);
        zzaz zzazVar = new zzaz(this, str, zzbeVar);
        zzayg zzaygVar = new zzayg(null);
        zzbc zzbcVar = new zzbc(this, i, str, zzbeVar, zzazVar, bArr, map, zzaygVar);
        if (zzayg.isEnabled()) {
            try {
                zzaygVar.zza(str, "GET", zzbcVar.getHeaders(), zzbcVar.zzg());
            } catch (com.google.android.gms.internal.ads.zzl e) {
                zzd.zzex(e.getMessage());
            }
        }
        zzeee.zze(zzbcVar);
        return zzbeVar;
    }

    public final zzdzl<String> zzb(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:12:0x0027, B:13:0x0030, B:14:0x002c, B:16:0x0032, B:17:0x0034), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:12:0x0027, B:13:0x0030, B:14:0x002c, B:16:0x0032, B:17:0x0034), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.internal.ads.zzae zzbk(Context context) {
        com.google.android.gms.internal.ads.zzae zzaeVar;
        boolean z;
        com.google.android.gms.internal.ads.zzae zza;
        synchronized (zzeef) {
            if (zzeee == null) {
                zzabh.initialize(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctr)).booleanValue()) {
                        z = true;
                        if (!z) {
                            zza = zzaq.zzbj(context);
                        } else {
                            zza = com.google.android.gms.internal.ads.zzbk.zza(context);
                        }
                        zzeee = zza;
                    }
                }
                z = false;
                if (!z) {
                }
                zzeee = zza;
            }
            zzaeVar = zzeee;
        }
        return zzaeVar;
    }
}
