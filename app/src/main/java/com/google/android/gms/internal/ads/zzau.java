package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzau implements zzx {
    private static final boolean DEBUG = zzaq.DEBUG;

    @Deprecated
    private final zzbe zzcc;
    private final zzar zzcd;
    private final zzat zzce;

    public zzau(zzar zzarVar) {
        this(zzarVar, new zzat(4096));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzau(zzar zzarVar, zzat zzatVar) {
        this.zzcd = zzarVar;
        this.zzcc = zzarVar;
        this.zzce = zzatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0204 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzy zzc(zzaa<?> zzaaVar) throws zzao {
        List<zzu> list;
        zzbb zzbbVar;
        byte[] bArr;
        Map<String, String> map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            List<zzu> emptyList = Collections.emptyList();
            try {
                try {
                    zzn zzf = zzaaVar.zzf();
                    if (zzf == null) {
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        if (zzf.zzr != null) {
                            hashMap.put("If-None-Match", zzf.zzr);
                        }
                        if (zzf.zzt > 0) {
                            hashMap.put("If-Modified-Since", zzbc.zzb(zzf.zzt));
                        }
                        map = hashMap;
                    }
                    zzbb zza = this.zzcd.zza(zzaaVar, map);
                    try {
                        int statusCode = zza.getStatusCode();
                        List<zzu> zzq = zza.zzq();
                        if (statusCode == 304) {
                            zzn zzf2 = zzaaVar.zzf();
                            if (zzf2 == null) {
                                return new zzy(304, (byte[]) null, true, SystemClock.elapsedRealtime() - elapsedRealtime, zzq);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!zzq.isEmpty()) {
                                Iterator<zzu> it = zzq.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(it.next().getName());
                                }
                            }
                            ArrayList arrayList = new ArrayList(zzq);
                            if (zzf2.zzx != null) {
                                if (!zzf2.zzx.isEmpty()) {
                                    for (zzu zzuVar : zzf2.zzx) {
                                        if (!treeSet.contains(zzuVar.getName())) {
                                            arrayList.add(zzuVar);
                                        }
                                    }
                                }
                            } else if (!zzf2.zzw.isEmpty()) {
                                for (Map.Entry<String, String> entry : zzf2.zzw.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzu(entry.getKey(), entry.getValue()));
                                    }
                                }
                            }
                            return new zzy(304, zzf2.data, true, SystemClock.elapsedRealtime() - elapsedRealtime, (List<zzu>) arrayList);
                        }
                        InputStream content = zza.getContent();
                        byte[] zza2 = content != null ? zza(content, zza.getContentLength()) : new byte[0];
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (DEBUG || elapsedRealtime2 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = zzaaVar;
                                objArr[1] = Long.valueOf(elapsedRealtime2);
                                objArr[2] = zza2 != null ? Integer.valueOf(zza2.length) : "null";
                                objArr[3] = Integer.valueOf(statusCode);
                                objArr[4] = Integer.valueOf(zzaaVar.zzj().zzc());
                                zzaq.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (statusCode < 200 || statusCode > 299) {
                                throw new IOException();
                            }
                            return new zzy(statusCode, zza2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzq);
                        } catch (IOException e) {
                            e = e;
                            list = zzq;
                            bArr = zza2;
                            zzbbVar = zza;
                            if (zzbbVar == null) {
                                int statusCode2 = zzbbVar.getStatusCode();
                                zzaq.e("Unexpected response code %d for %s", Integer.valueOf(statusCode2), zzaaVar.getUrl());
                                if (bArr != null) {
                                    zzy zzyVar = new zzy(statusCode2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, list);
                                    if (statusCode2 != 401 && statusCode2 != 403) {
                                        if (statusCode2 >= 400 && statusCode2 <= 499) {
                                            throw new zzr(zzyVar);
                                        }
                                        if (statusCode2 >= 500 && statusCode2 <= 599) {
                                            throw new zzam(zzyVar);
                                        }
                                        throw new zzam(zzyVar);
                                    }
                                    zza("auth", zzaaVar, new zzl(zzyVar));
                                } else {
                                    zza("network", zzaaVar, new zzz());
                                }
                            } else {
                                throw new zzab(e);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        list = emptyList;
                        zzbbVar = zza;
                        bArr = null;
                        if (zzbbVar == null) {
                        }
                    }
                } catch (MalformedURLException e3) {
                    String valueOf = String.valueOf(zzaaVar.getUrl());
                    throw new RuntimeException(valueOf.length() != 0 ? "Bad URL ".concat(valueOf) : new String("Bad URL "), e3);
                } catch (SocketTimeoutException unused) {
                    zza("socket", zzaaVar, new zzap());
                }
            } catch (IOException e4) {
                e = e4;
                list = emptyList;
                zzbbVar = null;
            }
        }
    }

    private static void zza(String str, zzaa<?> zzaaVar, zzao zzaoVar) throws zzao {
        zzan zzj = zzaaVar.zzj();
        int zzi = zzaaVar.zzi();
        try {
            zzj.zza(zzaoVar);
            zzaaVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzi)));
        } catch (zzao e) {
            zzaaVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzi)));
            throw e;
        }
    }

    private final byte[] zza(InputStream inputStream, int i) throws IOException, zzam {
        zzbi zzbiVar = new zzbi(this.zzce, i);
        try {
            if (inputStream == null) {
                throw new zzam();
            }
            byte[] zzf = this.zzce.zzf(1024);
            while (true) {
                int read = inputStream.read(zzf);
                if (read == -1) {
                    break;
                }
                zzbiVar.write(zzf, 0, read);
            }
            byte[] byteArray = zzbiVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    zzaq.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzce.zza(zzf);
            zzbiVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzaq.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzce.zza(null);
            zzbiVar.close();
            throw th;
        }
    }
}
