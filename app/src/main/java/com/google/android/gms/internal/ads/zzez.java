package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcf;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzez {
    private static final String TAG = zzez.class.getSimpleName();
    protected Context context;
    private zzex zzyq;
    private ExecutorService zzyr;
    private DexClassLoader zzys;
    private zzeh zzyt;
    private byte[] zzyu;
    private boolean zzyx;
    private zzdt zzza;
    private Map<Pair<String, String>, zzgm> zzzd;
    private volatile AdvertisingIdClient zzyv = null;
    private volatile boolean zzwj = false;
    private Future zzyw = null;
    private volatile zzcf.zza zzyy = null;
    private Future zzyz = null;
    private boolean zzzb = false;
    private boolean zzzc = false;
    private boolean zzze = false;

    public static zzez zza(Context context, String str, String str2, boolean z) {
        zzez zzezVar = new zzez(context);
        try {
            zzezVar.zzyr = Executors.newCachedThreadPool(new zzfc());
            zzezVar.zzwj = z;
            if (z) {
                zzezVar.zzyw = zzezVar.zzyr.submit(new zzfb(zzezVar));
            }
            zzezVar.zzyr.execute(new zzfd(zzezVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzezVar.zzzb = googleApiAvailabilityLight.getApkVersion(zzezVar.context) > 0;
                zzezVar.zzzc = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzezVar.context) == 0;
            } catch (Throwable unused) {
            }
            zzezVar.zza(0, true);
            if (zzfi.isMainThread() && ((Boolean) zzwo.zzqq().zzd(zzabh.zzcro)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzeh zzehVar = new zzeh(null);
            zzezVar.zzyt = zzehVar;
            try {
                zzezVar.zzyu = zzehVar.zzao(str);
                try {
                    try {
                        try {
                            File cacheDir = zzezVar.context.getCacheDir();
                            if (cacheDir == null && (cacheDir = zzezVar.context.getDir("dex", 0)) == null) {
                                throw new zzew();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1598581401714"));
                            if (!file.exists()) {
                                byte[] zza = zzezVar.zzyt.zza(zzezVar.zzyu, str2);
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                fileOutputStream.write(zza, 0, zza.length);
                                fileOutputStream.close();
                            }
                            zzezVar.zzb(cacheDir, "1598581401714");
                            try {
                                zzezVar.zzys = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzezVar.context.getClassLoader());
                                zzc(file);
                                zzezVar.zza(cacheDir, "1598581401714");
                                zzap(String.format("%s/%s.dex", cacheDir, "1598581401714"));
                                zzezVar.zzza = new zzdt(zzezVar);
                                zzezVar.zzze = true;
                            } catch (Throwable th) {
                                zzc(file);
                                zzezVar.zza(cacheDir, "1598581401714");
                                zzap(String.format("%s/%s.dex", cacheDir, "1598581401714"));
                                throw th;
                            }
                        } catch (zzek e) {
                            throw new zzew(e);
                        } catch (FileNotFoundException e2) {
                            throw new zzew(e2);
                        }
                    } catch (NullPointerException e3) {
                        throw new zzew(e3);
                    }
                } catch (IOException e4) {
                    throw new zzew(e4);
                }
            } catch (zzek e5) {
                throw new zzew(e5);
            }
        } catch (zzew unused2) {
        }
        return zzezVar;
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean isInitialized() {
        return this.zzze;
    }

    public final ExecutorService zzcg() {
        return this.zzyr;
    }

    public final DexClassLoader zzch() {
        return this.zzys;
    }

    public final zzeh zzci() {
        return this.zzyt;
    }

    public final byte[] zzcj() {
        return this.zzyu;
    }

    public final boolean zzck() {
        return this.zzzb;
    }

    public final zzdt zzcl() {
        return this.zzza;
    }

    public final boolean zzcm() {
        return this.zzzc;
    }

    public final boolean zzcb() {
        return this.zzyq.zzcb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzex zzcn() {
        return this.zzyq;
    }

    public final zzcf.zza zzco() {
        return this.zzyy;
    }

    public final Future zzcp() {
        return this.zzyz;
    }

    private zzez(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.zzyx = z;
        this.context = z ? applicationContext : context;
        this.zzzd = new HashMap();
        if (this.zzyq == null) {
            this.zzyq = new zzex(this.context);
        }
    }

    private final void zza(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        zzc(file3);
                        return;
                    }
                    System.out.print("test");
                    System.out.print("test");
                    System.out.print("test");
                    zzcf.zzc.zza zzc = zzcf.zzc.zzbe().zzd(zzejg.zzt(Build.VERSION.SDK.getBytes())).zzc(zzejg.zzt(str.getBytes()));
                    byte[] bytes = this.zzyt.zzb(this.zzyu, bArr).getBytes();
                    zzc.zza(zzejg.zzt(bytes)).zzb(zzejg.zzt(zzcx.zzb(bytes)));
                    file2.createNewFile();
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] byteArray = ((zzcf.zzc) ((zzekq) zzc.zzbiz())).toByteArray();
                        fileOutputStream.write(byteArray, 0, byteArray.length);
                        fileOutputStream.close();
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        zzc(file3);
                    } catch (zzek | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        zzc(file3);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        zzc(file3);
                        throw th;
                    }
                } catch (zzek | IOException | NoSuchAlgorithmException unused9) {
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzek | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void zzap(String str) {
        zzc(new File(str));
    }

    private static void zzc(File file) {
        if (!file.exists()) {
            Log.d(TAG, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        } else {
            file.delete();
        }
    }

    private final boolean zzb(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                zzc(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                try {
                    if (fileInputStream2.read(bArr) <= 0) {
                        Log.d(TAG, "Cannot read the cache data.");
                        zzc(file2);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return false;
                    }
                    zzcf.zzc zzb = zzcf.zzc.zzb(bArr, zzekd.zzbia());
                    if (str.equals(new String(zzb.zzbc().toByteArray())) && Arrays.equals(zzb.zzbb().toByteArray(), zzcx.zzb(zzb.zzba().toByteArray())) && Arrays.equals(zzb.zzbd().toByteArray(), Build.VERSION.SDK.getBytes())) {
                        byte[] zza = this.zzyt.zza(this.zzyu, new String(zzb.zzba().toByteArray()));
                        file3.createNewFile();
                        fileOutputStream = new FileOutputStream(file3);
                        try {
                            fileOutputStream.write(zza, 0, zza.length);
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            return true;
                        } catch (zzek | IOException | NoSuchAlgorithmException unused4) {
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused6) {
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException unused7) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException unused8) {
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                    zzc(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused9) {
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (zzek | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            }
        } catch (zzek | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzzd.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzzd.put(new Pair<>(str, str2), new zzgm(this, str, str2, clsArr));
        return true;
    }

    public final Method zza(String str, String str2) {
        zzgm zzgmVar = this.zzzd.get(new Pair(str, str2));
        if (zzgmVar == null) {
            return null;
        }
        return zzgmVar.zzdb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcq() {
        try {
            if (this.zzyv == null && this.zzyx) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.context);
                advertisingIdClient.start();
                this.zzyv = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzyv = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, boolean z) {
        if (this.zzzc) {
            Future<?> submit = this.zzyr.submit(new zzfe(this, i, z));
            if (i == 0) {
                this.zzyz = submit;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcf.zza zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return zzcr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(int i, zzcf.zza zzaVar) {
        if (i < 4) {
            return zzaVar == null || !zzaVar.zzaj() || zzaVar.zzaf().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzaVar.zzao() || !zzaVar.zzap().zzbg() || zzaVar.zzap().zzbh() == -2;
        }
        return false;
    }

    private final zzcf.zza zzcr() {
        try {
            return zzdsx.zzj(this.context, this.context.getPackageName(), Integer.toString(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final AdvertisingIdClient zzcs() {
        if (!this.zzwj) {
            return null;
        }
        if (this.zzyv != null) {
            return this.zzyv;
        }
        Future future = this.zzyw;
        if (future != null) {
            try {
                future.get(2000L, TimeUnit.MILLISECONDS);
                this.zzyw = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzyw.cancel(true);
            }
        }
        return this.zzyv;
    }

    public final int zzbu() {
        if (this.zzza != null) {
            return zzdt.zzbu();
        }
        return Integer.MIN_VALUE;
    }
}
