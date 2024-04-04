package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfq extends zzgo {
    private static final zzgn<zzcy> zzaau = new zzgn<>();
    private final Context zzaas;
    private zzby.zza zzaav;

    public zzfq(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2, Context context, zzby.zza zzaVar) {
        super(zzezVar, str, str2, c0009zza, i, 27);
        this.zzaav = null;
        this.zzaas = context;
        this.zzaav = zzaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x0113, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001f, B:10:0x0029, B:15:0x0039, B:17:0x0045, B:18:0x0082, B:21:0x0089, B:23:0x00ac, B:25:0x00dc, B:26:0x00b6, B:30:0x00c3, B:32:0x00cd, B:33:0x00d0, B:35:0x0048, B:38:0x0056, B:40:0x005c, B:43:0x006b, B:45:0x0075, B:47:0x007d, B:48:0x0080, B:50:0x00df, B:51:0x00e5), top: B:3:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zzgo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        boolean z;
        zzcy zzcyVar;
        zzcb zzcbVar;
        AtomicReference<zzcy> zzas = zzaau.zzas(this.zzaas.getPackageName());
        synchronized (zzas) {
            zzcy zzcyVar2 = zzas.get();
            if (zzcyVar2 != null && !zzfi.zzar(zzcyVar2.zznp) && !zzcyVar2.zznp.equals("E") && !zzcyVar2.zznp.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                z = false;
                if (z) {
                    if (!zzfi.zzar(zza(this.zzaav))) {
                        zzcbVar = zzcb.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                    } else {
                        zzby.zza zzaVar = this.zzaav;
                        if (Boolean.valueOf(zzfi.zzar(zza(zzaVar)) && zzaVar != null && zzaVar.zzx() && zzaVar.zzy().zzac() == zzcb.ENUM_SIGNAL_SOURCE_GASS).booleanValue() && this.zzvx.zzcm()) {
                            zzcbVar = zzcb.ENUM_SIGNAL_SOURCE_GASS;
                        } else {
                            zzcbVar = zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD;
                        }
                    }
                    zzcy zzcyVar3 = new zzcy((String) this.zzabj.invoke(null, this.zzaas, Boolean.valueOf(zzcbVar == zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD)));
                    if (zzfi.zzar(zzcyVar3.zznp) || zzcyVar3.zznp.equals("E")) {
                        int i = zzfp.zzaat[zzcbVar.ordinal()];
                        if (i == 1) {
                            zzcyVar3.zznp = this.zzaav.zzaa().zzaf();
                        } else if (i == 2) {
                            String zzcx = zzcx();
                            if (!zzfi.zzar(zzcx)) {
                                zzcyVar3.zznp = zzcx;
                            }
                        }
                    }
                    zzas.set(zzcyVar3);
                }
                zzcyVar = zzas.get();
            }
            z = true;
            if (z) {
            }
            zzcyVar = zzas.get();
        }
        synchronized (this.zzaaz) {
            if (zzcyVar != null) {
                this.zzaaz.zzv(zzcyVar.zznp);
                this.zzaaz.zzt(zzcyVar.zznq);
                this.zzaaz.zzx(zzcyVar.zznr);
                this.zzaaz.zzy(zzcyVar.zzns);
                this.zzaaz.zzz(zzcyVar.zznt);
            }
        }
    }

    private static String zza(zzby.zza zzaVar) {
        if (zzaVar == null || !zzaVar.zzz() || zzfi.zzar(zzaVar.zzaa().zzaf())) {
            return null;
        }
        return zzaVar.zzaa().zzaf();
    }

    private final String zzcx() {
        try {
            if (this.zzvx.zzcp() != null) {
                this.zzvx.zzcp().get();
            }
            zzcf.zza zzco = this.zzvx.zzco();
            if (zzco == null || !zzco.zzaj()) {
                return null;
            }
            return zzco.zzaf();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
