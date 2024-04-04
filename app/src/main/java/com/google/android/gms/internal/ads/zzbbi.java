package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbbi implements zzom {
    private final Context context;
    private boolean isOpen;
    private Uri uri;
    private final String zzbvf;
    private final int zzbvg;
    private final zzpc<zzom> zzely;
    private final zzom zzelz;
    private final zzbbk zzema;
    private InputStream zzemc;
    private volatile zztd zzemd;
    private boolean zzbuu = false;
    private boolean zzeme = false;
    private boolean zzbux = false;
    private boolean zzemf = false;
    private long zzbuw = 0;
    private final AtomicLong zzemh = new AtomicLong(-1);
    private zzdzl<Long> zzemg = null;
    private final boolean zzemb = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue();

    public zzbbi(Context context, zzom zzomVar, String str, int i, zzpc<zzom> zzpcVar, zzbbk zzbbkVar) {
        this.context = context;
        this.zzelz = zzomVar;
        this.zzely = zzpcVar;
        this.zzema = zzbbkVar;
        this.zzbvf = str;
        this.zzbvg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final void close() throws IOException {
        zzpc<zzom> zzpcVar;
        if (!this.isOpen) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.isOpen = false;
        this.uri = null;
        boolean z = (this.zzemb && this.zzemc == null) ? false : true;
        InputStream inputStream = this.zzemc;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzemc = null;
        } else {
            this.zzelz.close();
        }
        if (!z || (zzpcVar = this.zzely) == null) {
            return;
        }
        zzpcVar.zze(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f4  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.google.android.gms.internal.ads.zzom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzor zzorVar) throws IOException {
        Long l;
        boolean z;
        boolean z2;
        zztr zztrVar;
        String str = "ms";
        if (this.isOpen) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        boolean z3 = true;
        this.isOpen = true;
        this.uri = zzorVar.uri;
        if (!this.zzemb) {
            zzb(zzorVar);
        }
        this.zzemd = zztd.zzd(zzorVar.uri);
        ?? r4 = -1;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzctm)).booleanValue()) {
            if (this.zzemd != null) {
                this.zzemd.zzbve = zzorVar.position;
                this.zzemd.zzbvf = zzdwi.zzho(this.zzbvf);
                this.zzemd.zzbvg = this.zzbvg;
                if (this.zzemd.zzbvd) {
                    l = (Long) zzwo.zzqq().zzd(zzabh.zzcto);
                } else {
                    l = (Long) zzwo.zzqq().zzd(zzabh.zzctn);
                }
                long longValue = l.longValue();
                long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime();
                com.google.android.gms.ads.internal.zzp.zzlk();
                Future<zztr> zza = zzts.zza(this.context, this.zzemd);
                try {
                    try {
                        zztrVar = zza.get(longValue, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        z2 = false;
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        z3 = false;
                    }
                    try {
                        this.zzbuu = zztrVar.zzmy();
                        this.zzbux = zztrVar.zznb();
                        this.zzemf = zztrVar.zzmz();
                        this.zzbuw = zztrVar.zzna();
                        if (!zzace()) {
                            this.zzemc = zztrVar.getInputStream();
                            if (this.zzemb) {
                                zzb(zzorVar);
                            }
                            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                            this.zzema.zzb(true, elapsedRealtime2);
                            this.zzeme = true;
                            StringBuilder sb = new StringBuilder(44);
                            sb.append("Cache connection took ");
                            sb.append(elapsedRealtime2);
                            sb.append("ms");
                            com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
                            return -1L;
                        }
                        long elapsedRealtime3 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                        this.zzema.zzb(true, elapsedRealtime3);
                        this.zzeme = true;
                        StringBuilder sb2 = new StringBuilder(44);
                        sb2.append("Cache connection took ");
                        sb2.append(elapsedRealtime3);
                        sb2.append("ms");
                        com.google.android.gms.ads.internal.util.zzd.zzeb(sb2.toString());
                    } catch (InterruptedException unused3) {
                        z2 = true;
                        zza.cancel(true);
                        Thread.currentThread().interrupt();
                        long elapsedRealtime4 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                        this.zzema.zzb(z2, elapsedRealtime4);
                        this.zzeme = z2;
                        StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Cache connection took ");
                        sb3.append(elapsedRealtime4);
                        sb3.append("ms");
                        str = sb3.toString();
                        com.google.android.gms.ads.internal.util.zzd.zzeb(str);
                        r4 = sb3;
                        this.zzeme = false;
                        if (this.zzemd != null) {
                        }
                        return this.zzelz.zza(zzorVar);
                    } catch (ExecutionException | TimeoutException unused4) {
                        z = true;
                        zza.cancel(true);
                        long elapsedRealtime5 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                        this.zzema.zzb(z, elapsedRealtime5);
                        this.zzeme = z;
                        StringBuilder sb4 = new StringBuilder(44);
                        sb4.append("Cache connection took ");
                        sb4.append(elapsedRealtime5);
                        sb4.append("ms");
                        str = sb4.toString();
                        com.google.android.gms.ads.internal.util.zzd.zzeb(str);
                        r4 = sb4;
                        this.zzeme = false;
                        if (this.zzemd != null) {
                        }
                        return this.zzelz.zza(zzorVar);
                    } catch (Throwable th2) {
                        th = th2;
                        long elapsedRealtime6 = com.google.android.gms.ads.internal.zzp.zzkx().elapsedRealtime() - elapsedRealtime;
                        this.zzema.zzb(z3, elapsedRealtime6);
                        this.zzeme = z3;
                        StringBuilder sb5 = new StringBuilder(44);
                        sb5.append("Cache connection took ");
                        sb5.append(elapsedRealtime6);
                        sb5.append(str);
                        com.google.android.gms.ads.internal.util.zzd.zzeb(sb5.toString());
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z3 = r4;
                }
            }
        } else {
            zztc zztcVar = null;
            if (this.zzemd != null) {
                this.zzemd.zzbve = zzorVar.position;
                this.zzemd.zzbvf = zzdwi.zzho(this.zzbvf);
                this.zzemd.zzbvg = this.zzbvg;
                zztcVar = com.google.android.gms.ads.internal.zzp.zzkw().zza(this.zzemd);
            }
            if (zztcVar != null && zztcVar.zzmv()) {
                this.zzbuu = zztcVar.zzmy();
                this.zzbux = zztcVar.zznb();
                this.zzemf = zztcVar.zzmz();
                this.zzbuw = zztcVar.zzna();
                this.zzeme = true;
                if (!zzace()) {
                    this.zzemc = zztcVar.zzmw();
                    if (this.zzemb) {
                        zzb(zzorVar);
                    }
                    return -1L;
                }
            }
        }
        this.zzeme = false;
        if (this.zzemd != null) {
            zzorVar = new zzor(Uri.parse(this.zzemd.url), zzorVar.zzbii, zzorVar.zzbij, zzorVar.position, zzorVar.zzcm, zzorVar.zzck, zzorVar.flags);
        }
        return this.zzelz.zza(zzorVar);
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        zzpc<zzom> zzpcVar;
        if (!this.isOpen) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzemc;
        if (inputStream != null) {
            read = inputStream.read(bArr, i, i2);
        } else {
            read = this.zzelz.read(bArr, i, i2);
        }
        if ((!this.zzemb || this.zzemc != null) && (zzpcVar = this.zzely) != null) {
            zzpcVar.zzc(this, read);
        }
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        return this.uri;
    }

    public final boolean zzmy() {
        return this.zzbuu;
    }

    public final boolean zzacc() {
        return this.zzeme;
    }

    public final boolean zznb() {
        return this.zzbux;
    }

    public final boolean zzacd() {
        return this.zzemf;
    }

    public final long zzna() {
        return this.zzbuw;
    }

    public final long getContentLength() {
        if (this.zzemd == null) {
            return -1L;
        }
        if (this.zzemh.get() != -1) {
            return this.zzemh.get();
        }
        synchronized (this) {
            if (this.zzemg == null) {
                this.zzemg = zzayv.zzegi.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzbbl
                    private final zzbbi zzemk;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzemk = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzemk.zzacf();
                    }
                });
            }
        }
        if (!this.zzemg.isDone()) {
            return -1L;
        }
        try {
            this.zzemh.compareAndSet(-1L, this.zzemg.get().longValue());
            return this.zzemh.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    private final void zzb(zzor zzorVar) {
        zzpc<zzom> zzpcVar = this.zzely;
        if (zzpcVar != null) {
            zzpcVar.zza(this, zzorVar);
        }
    }

    private final boolean zzace() {
        if (!this.zzemb) {
            return false;
        }
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzctp)).booleanValue() || this.zzbux) {
            return ((Boolean) zzwo.zzqq().zzd(zzabh.zzctq)).booleanValue() && !this.zzemf;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Long zzacf() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzp.zzkw().zzb(this.zzemd));
    }
}
