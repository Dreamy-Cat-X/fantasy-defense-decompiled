package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcu extends zzbcj implements zzbbw {
    private String zzeio;
    private boolean zzeok;
    private zzbbm zzeon;
    private Exception zzeoo;
    private boolean zzeop;

    public zzbcu(zzbaq zzbaqVar, zzbar zzbarVar) {
        super(zzbaqVar);
        zzbbm zzbbmVar = new zzbbm(zzbaqVar.getContext(), zzbarVar, this.zzenz.get());
        this.zzeon = zzbbmVar;
        zzbbmVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzdr(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzn(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzb(final boolean z, final long j) {
        final zzbaq zzbaqVar = this.zzenz.get();
        if (zzbaqVar != null) {
            zzayv.zzegm.execute(new Runnable(zzbaqVar, z, j) { // from class: com.google.android.gms.internal.ads.zzbcx
                private final boolean zzeiv;
                private final long zzelx;
                private final zzbaq zzeng;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeng = zzbaqVar;
                    this.zzeiv = z;
                    this.zzelx = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzeng.zza(this.zzeiv, this.zzelx);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(String str, Exception exc) {
        String str2 = (String) zzwo.zzqq().zzd(zzabh.zzcmc);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.zzeoo = exc;
        com.google.android.gms.ads.internal.util.zzd.zzd("Precache error", exc);
        zzfj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzdm(int i) {
        this.zzeon.zzacj().zzdu(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzdl(int i) {
        this.zzeon.zzacj().zzdt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzdn(int i) {
        this.zzeon.zzacj().zzdn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void zzdo(int i) {
        this.zzeon.zzacj().zzdo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbcj, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzbbm zzbbmVar = this.zzeon;
        if (zzbbmVar != null) {
            zzbbmVar.zza((zzbbw) null);
            this.zzeon.release();
        }
        super.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbcj
    public final String zzfh(String str) {
        String valueOf = String.valueOf(super.zzfh(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final boolean zzfg(String str) {
        return zze(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x009f, code lost:
    
        if (r15.zzeoo == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a5, code lost:
    
        throw r15.zzeoo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00af, code lost:
    
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00b1, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r6 = r13;
        r7 = r14;
        r5 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [long] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // com.google.android.gms.internal.ads.zzbcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(String str, String[] strArr) {
        String str2;
        String str3;
        ?? r5;
        Exception exc;
        String str4;
        zzbcu zzbcuVar;
        long j;
        long j2;
        long j3;
        String str5;
        long j4;
        String str6;
        long j5;
        long j6;
        long j7;
        zzbcu zzbcuVar2 = this;
        String str7 = str;
        zzbcuVar2.zzeio = str7;
        String zzfh = zzfh(str);
        String str8 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try {
                    uriArr[i] = Uri.parse(strArr[i]);
                } catch (Exception e) {
                    exc = e;
                    str4 = str7;
                    str3 = zzfh;
                    zzbcuVar = zzbcuVar2;
                    String str9 = str8;
                    String message = exc.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str4);
                    sb.append(" Exception: ");
                    sb.append(message);
                    com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
                    release();
                    zzbcuVar.zza(str4, str3, str9, zzb(str9, exc));
                    return false;
                }
            }
            zzbcuVar2.zzeon.zza(uriArr, zzbcuVar2.zzefc);
            zzbaq zzbaqVar = zzbcuVar2.zzenz.get();
            if (zzbaqVar != null) {
                zzbaqVar.zza(zzfh, zzbcuVar2);
            }
            Clock zzkx = com.google.android.gms.ads.internal.zzp.zzkx();
            long currentTimeMillis = zzkx.currentTimeMillis();
            long longValue = ((Long) zzwo.zzqq().zzd(zzabh.zzcmj)).longValue();
            long longValue2 = ((Long) zzwo.zzqq().zzd(zzabh.zzcmi)).longValue() * 1000;
            long intValue = ((Integer) zzwo.zzqq().zzd(zzabh.zzcmh)).intValue();
            boolean booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue();
            ?? r1 = -1;
            ?? r6 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzkx.currentTimeMillis() - currentTimeMillis > longValue2) {
                            long j8 = longValue2;
                            StringBuilder sb2 = new StringBuilder(47);
                            sb2.append("Timeout reached. Limit: ");
                            sb2.append(j8);
                            sb2.append(" ms");
                            throw new IOException(sb2.toString());
                        }
                        if (zzbcuVar2.zzeok) {
                            break;
                        }
                        if (!zzbcuVar2.zzeop) {
                            zzhg zzacg = zzbcuVar2.zzeon.zzacg();
                            if (zzacg == null) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long duration = zzacg.getDuration();
                            if (duration > 0) {
                                long bufferedPosition = zzacg.getBufferedPosition();
                                if (bufferedPosition != r1) {
                                    try {
                                        j = r6;
                                        j7 = duration;
                                        j2 = longValue2;
                                        j4 = longValue;
                                        str6 = zzfh;
                                    } catch (Throwable th) {
                                        th = th;
                                        r5 = this;
                                        str2 = str;
                                        str3 = zzfh;
                                    }
                                    try {
                                        zza(str, zzfh, bufferedPosition, j7, bufferedPosition > 0, booleanValue ? zzbcuVar2.zzeon.zzaaf() : -1L, booleanValue ? zzbcuVar2.zzeon.zzna() : -1L, booleanValue ? zzbcuVar2.zzeon.getTotalBytes() : -1L, zzbbm.zzach(), zzbbm.zzaci());
                                        j6 = bufferedPosition;
                                        j5 = duration;
                                        str2 = j7;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r5 = this;
                                        str2 = str;
                                        str3 = str6;
                                        try {
                                            throw th;
                                        } catch (Exception e2) {
                                            e = e2;
                                            exc = e;
                                            zzbcuVar = r5;
                                            str4 = str2;
                                            String str92 = str8;
                                            String message2 = exc.getMessage();
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message2).length());
                                            sb3.append("Failed to preload url ");
                                            sb3.append(str4);
                                            sb3.append(" Exception: ");
                                            sb3.append(message2);
                                            com.google.android.gms.ads.internal.util.zzd.zzex(sb3.toString());
                                            release();
                                            zzbcuVar.zza(str4, str3, str92, zzb(str92, exc));
                                            return false;
                                        }
                                    }
                                } else {
                                    j = r6;
                                    j2 = longValue2;
                                    j4 = longValue;
                                    str6 = zzfh;
                                    j5 = duration;
                                    j6 = r1;
                                    str2 = r6;
                                }
                                r5 = (bufferedPosition > j5 ? 1 : (bufferedPosition == j5 ? 0 : -1));
                                if (r5 >= 0) {
                                    zzc(str, str6, j5);
                                } else {
                                    try {
                                        zzbcu zzbcuVar3 = this;
                                        str2 = str;
                                        str3 = str6;
                                        if (zzbcuVar3.zzeon.getBytesTransferred() < j || bufferedPosition <= 0) {
                                            j3 = j4;
                                            str5 = j6;
                                            r5 = zzbcuVar3;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                j = r6;
                                j2 = longValue2;
                                str2 = str7;
                                str3 = zzfh;
                                r5 = zzbcuVar2;
                                j3 = longValue;
                                str5 = r1;
                            }
                            try {
                                try {
                                    r5.wait(j3);
                                } catch (InterruptedException unused) {
                                    throw new IOException("Wait interrupted.");
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str8 = str5;
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                longValue = j3;
                zzbcuVar2 = r5;
                str7 = str2;
                zzfh = str3;
                r6 = j;
                longValue2 = j2;
                r1 = str5;
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            str2 = str7;
            str3 = zzfh;
            r5 = zzbcuVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcj
    public final void abort() {
        zzfj(null);
    }

    private final void zzfj(String str) {
        synchronized (this) {
            this.zzeok = true;
            notify();
            release();
        }
        String str2 = this.zzeio;
        if (str2 != null) {
            String zzfh = zzfh(str2);
            Exception exc = this.zzeoo;
            if (exc != null) {
                zza(this.zzeio, zzfh, "badUrl", zzb(str, exc));
            } else {
                zza(this.zzeio, zzfh, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbbm zzacl() {
        synchronized (this) {
            this.zzeop = true;
            notify();
        }
        this.zzeon.zza((zzbbw) null);
        zzbbm zzbbmVar = this.zzeon;
        this.zzeon = null;
        return zzbbmVar;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
