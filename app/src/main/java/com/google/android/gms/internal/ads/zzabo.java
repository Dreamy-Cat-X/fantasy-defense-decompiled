package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: D:\decomp\classes.dex */
public final class zzabo {
    private Context context;
    private File file;
    private String zzbrf;
    private String zzczr;
    private BlockingQueue<zzaby> zzczu = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> zzczv = new LinkedHashMap<>();
    private Map<String, zzabs> zzczw = new HashMap();
    private final HashSet<String> zzczx = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    private AtomicBoolean zzczy;

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.context = context;
        this.zzbrf = str;
        this.zzczr = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzczy = atomicBoolean;
        atomicBoolean.set(zzada.zzdck.get().booleanValue());
        if (this.zzczy.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.file = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzczv.put(entry.getKey(), entry.getValue());
        }
        zzayv.zzegi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzabn
            private final zzabo zzczt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzczt = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzczt.zzsj();
            }
        });
        this.zzczw.put("action", zzabs.zzdaa);
        this.zzczw.put("ad_format", zzabs.zzdaa);
        this.zzczw.put("e", zzabs.zzdab);
    }

    public final boolean zza(zzaby zzabyVar) {
        return this.zzczu.offer(zzabyVar);
    }

    private final void zza(Map<String, String> map, zzabx zzabxVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzczr).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzabxVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzabxVar.zzsn())) {
                sb.append("&it=");
                sb.append(zzabxVar.zzsn());
            }
            if (!TextUtils.isEmpty(zzabxVar.zzso())) {
                sb.append("&blat=");
                sb.append(zzabxVar.zzso());
            }
            uri = sb.toString();
        }
        if (this.zzczy.get()) {
            File file = this.file;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(uri.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                com.google.android.gms.ads.internal.util.zzd.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            com.google.android.gms.ads.internal.util.zzd.zzd("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    com.google.android.gms.ads.internal.util.zzd.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    com.google.android.gms.ads.internal.util.zzd.zzd("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                }
            } else {
                com.google.android.gms.ads.internal.util.zzd.zzex("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzp.zzkq();
            com.google.android.gms.ads.internal.util.zzm.zzb(this.context, this.zzbrf, uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, zzcq(key).zzf((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    public final zzabs zzcq(String str) {
        zzabs zzabsVar = this.zzczw.get(str);
        return zzabsVar != null ? zzabsVar : zzabs.zzczz;
    }

    public final void zzcr(String str) {
        if (this.zzczx.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzbrf);
        linkedHashMap.put("ue", str);
        zza(zza(this.zzczv, linkedHashMap), (zzabx) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzsj() {
        while (true) {
            try {
                zzaby take = this.zzczu.take();
                zzabx zzsp = take.zzsp();
                if (zzsp != null && !TextUtils.isEmpty(zzsp.zzsn())) {
                    zza(zza(this.zzczv, take.zzsq()), zzsp);
                }
            } catch (InterruptedException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
