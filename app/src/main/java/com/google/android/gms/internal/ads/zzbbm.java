package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbbm implements zzhf, zzik, zzmy, zzpc<zzom>, zzqj {
    private static int zzeml;
    private static int zzemm;
    private int bytesTransferred;
    private final Context context;
    private int zzblp;
    private final String zzbvf;
    private final int zzbvg;
    private final zzbar zzelm;
    private final zzhx zzemo;
    private zzhg zzemr;
    private ByteBuffer zzems;
    private boolean zzemt;
    private final WeakReference<zzbaq> zzemu;
    private zzbbw zzemv;
    private long zzemw;
    private final ArrayList<zzos> zzemx;
    private volatile zzbbi zzemy;
    private Set<WeakReference<zzbbg>> zzemz = new HashSet();
    private final zzbbn zzemn = new zzbbn();
    private final zzhx zzemp = new zzjb(zzlw.zzbcr, com.google.android.gms.ads.internal.util.zzm.zzecu, this);
    private final zzoa zzemq = new zznz();

    public zzbbm(Context context, zzbar zzbarVar, zzbaq zzbaqVar) {
        this.context = context;
        this.zzelm = zzbarVar;
        this.zzemu = new WeakReference<>(zzbaqVar);
        this.zzemo = new zzqd(this.context, zzlw.zzbcr, 0L, com.google.android.gms.ads.internal.util.zzm.zzecu, this, -1);
        if (com.google.android.gms.ads.internal.util.zzd.zzye()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        }
        zzeml++;
        zzhg zza = zzhk.zza(new zzhx[]{this.zzemp, this.zzemo}, this.zzemq, this.zzemn);
        this.zzemr = zza;
        zza.zza(this);
        this.bytesTransferred = 0;
        this.zzemw = 0L;
        this.zzblp = 0;
        this.zzemx = new ArrayList<>();
        this.zzemy = null;
        this.zzbvf = (zzbaqVar == null || zzbaqVar.zzabc() == null) ? "" : zzbaqVar.zzabc();
        this.zzbvg = zzbaqVar != null ? zzbaqVar.zzabd() : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zzhy zzhyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zzic zzicVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zznt zzntVar, zzoh zzohVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzb(int i, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzb(Surface surface) {
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzb(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzc(zzjl zzjlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzd(zzjl zzjlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzd(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zze(zzjl zzjlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final /* bridge */ /* synthetic */ void zze(zzom zzomVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zzek() {
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzf(zzjl zzjlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zzf(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzx(int i) {
    }

    public final zzhg zzacg() {
        return this.zzemr;
    }

    public static int zzach() {
        return zzeml;
    }

    public static int zzaci() {
        return zzemm;
    }

    private static long zzk(Map<String, List<String>> map) {
        if (map == null) {
            return 0L;
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getKey() != null && zzdvg.zza("content-length", entry.getKey()) && entry.getValue() != null && entry.getValue().get(0) != null) {
                        return Long.parseLong(entry.getValue().get(0));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0L;
    }

    public final void zza(zzbbw zzbbwVar) {
        this.zzemv = zzbbwVar;
    }

    public final zzbbn zzacj() {
        return this.zzemn;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zznd zzneVar;
        if (this.zzemr == null) {
            return;
        }
        this.zzems = byteBuffer;
        this.zzemt = z;
        if (uriArr.length == 1) {
            zzneVar = zzb(uriArr[0], str);
        } else {
            zznd[] zzndVarArr = new zznd[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zzndVarArr[i] = zzb(uriArr[i], str);
            }
            zzneVar = new zzne(zzndVarArr);
        }
        this.zzemr.zza(zzneVar);
        zzemm++;
    }

    public final void release() {
        zzhg zzhgVar = this.zzemr;
        if (zzhgVar != null) {
            zzhgVar.zzb(this);
            this.zzemr.release();
            this.zzemr = null;
            zzemm--;
        }
    }

    public final long getBytesTransferred() {
        return this.bytesTransferred;
    }

    private final boolean zzacc() {
        return this.zzemy != null && this.zzemy.zzacc();
    }

    public final long zzaaf() {
        if (zzacc()) {
            return 0L;
        }
        return this.bytesTransferred;
    }

    public final long zzna() {
        if (zzacc() && this.zzemy.zznb()) {
            return Math.min(this.bytesTransferred, this.zzemy.zzna());
        }
        return 0L;
    }

    public final long getTotalBytes() {
        if (!zzacc()) {
            while (!this.zzemx.isEmpty()) {
                this.zzemw += zzk(this.zzemx.remove(0).getResponseHeaders());
            }
            return this.zzemw;
        }
        return this.zzemy.getContentLength();
    }

    public final int zzaag() {
        return this.zzblp;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzb(IOException iOException) {
        zzbbw zzbbwVar = this.zzemv;
        if (zzbbwVar != null) {
            zzbbwVar.zza("onLoadError", iOException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzk(zzhs zzhsVar) {
        zzbaq zzbaqVar = this.zzemu.get();
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() || zzbaqVar == null || zzhsVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzhsVar.zzahf));
        hashMap.put("bitRate", String.valueOf(zzhsVar.zzagx));
        int i = zzhsVar.width;
        int i2 = zzhsVar.height;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", zzhsVar.zzaha);
        hashMap.put("videoSampleMime", zzhsVar.zzahb);
        hashMap.put("videoCodec", zzhsVar.zzagy);
        zzbaqVar.zza("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzg(int i, long j) {
        this.zzblp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzb(int i, int i2, int i3, float f) {
        zzbbw zzbbwVar = this.zzemv;
        if (zzbbwVar != null) {
            zzbbwVar.zzn(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzc(zzhs zzhsVar) {
        zzbaq zzbaqVar = this.zzemu.get();
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() || zzbaqVar == null || zzhsVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzhsVar.zzaha);
        hashMap.put("audioSampleMime", zzhsVar.zzahb);
        hashMap.put("audioCodec", zzhsVar.zzagy);
        zzbaqVar.zza("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(boolean z, int i) {
        zzbbw zzbbwVar = this.zzemv;
        if (zzbbwVar != null) {
            zzbbwVar.zzdr(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhf
    public final void zza(zzhd zzhdVar) {
        zzbbw zzbbwVar = this.zzemv;
        if (zzbbwVar != null) {
            zzbbwVar.zza("onPlayerError", zzhdVar);
        }
    }

    public final void zzdp(int i) {
        Iterator<WeakReference<zzbbg>> it = this.zzemz.iterator();
        while (it.hasNext()) {
            zzbbg zzbbgVar = it.next().get();
            if (zzbbgVar != null) {
                zzbbgVar.setReceiveBufferSize(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzemr == null) {
            return;
        }
        zzhh zzhhVar = new zzhh(this.zzemo, 1, surface);
        if (z) {
            this.zzemr.zzb(zzhhVar);
        } else {
            this.zzemr.zza(zzhhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzemr == null) {
            return;
        }
        zzhh zzhhVar = new zzhh(this.zzemp, 2, Float.valueOf(f));
        if (z) {
            this.zzemr.zzb(zzhhVar);
        } else {
            this.zzemr.zza(zzhhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaw(boolean z) {
        if (this.zzemr == null) {
            return;
        }
        for (int i = 0; i < this.zzemr.zzem(); i++) {
            this.zzemq.zzf(i, !z);
        }
    }

    private final zznd zzb(Uri uri, final String str) {
        final zzop zzopVar;
        zzka zzkaVar;
        if (this.zzemt && this.zzems.limit() > 0) {
            final byte[] bArr = new byte[this.zzems.limit()];
            this.zzems.get(bArr);
            zzopVar = new zzop(bArr) { // from class: com.google.android.gms.internal.ads.zzbbo
                private final byte[] zzegd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzegd = bArr;
                }

                @Override // com.google.android.gms.internal.ads.zzop
                public final zzom zzip() {
                    return new zzon(this.zzegd);
                }
            };
        } else {
            if (this.zzelm.zzeks > 0) {
                zzopVar = new zzop(this, str) { // from class: com.google.android.gms.internal.ads.zzbbr
                    private final String zzdhw;
                    private final zzbbm zzenh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzenh = this;
                        this.zzdhw = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzop
                    public final zzom zzip() {
                        return this.zzenh.zzff(this.zzdhw);
                    }
                };
            } else {
                zzopVar = new zzop(this, str) { // from class: com.google.android.gms.internal.ads.zzbbq
                    private final String zzdhw;
                    private final zzbbm zzenh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzenh = this;
                        this.zzdhw = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzop
                    public final zzom zzip() {
                        return this.zzenh.zzfe(this.zzdhw);
                    }
                };
            }
            if (this.zzelm.zzekt) {
                zzopVar = new zzop(this, zzopVar) { // from class: com.google.android.gms.internal.ads.zzbbt
                    private final zzbbm zzenh;
                    private final zzop zzenj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzenh = this;
                        this.zzenj = zzopVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzop
                    public final zzom zzip() {
                        return this.zzenh.zza(this.zzenj);
                    }
                };
            }
            if (this.zzems.limit() > 0) {
                final byte[] bArr2 = new byte[this.zzems.limit()];
                this.zzems.get(bArr2);
                zzopVar = new zzop(zzopVar, bArr2) { // from class: com.google.android.gms.internal.ads.zzbbs
                    private final byte[] zzdvj;
                    private final zzop zzeni;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzeni = zzopVar;
                        this.zzdvj = bArr2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzop
                    public final zzom zzip() {
                        zzop zzopVar2 = this.zzeni;
                        byte[] bArr3 = this.zzdvj;
                        return new zzbbz(new zzon(bArr3), bArr3.length, zzopVar2.zzip());
                    }
                };
            }
        }
        zzop zzopVar2 = zzopVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcme)).booleanValue()) {
            zzkaVar = zzbbv.zzenk;
        } else {
            zzkaVar = zzbbu.zzenk;
        }
        return new zzmz(uri, zzopVar2, zzkaVar, this.zzelm.zzeku, com.google.android.gms.ads.internal.util.zzm.zzecu, this, null, this.zzelm.zzekq);
    }

    public final void finalize() throws Throwable {
        zzeml--;
        if (com.google.android.gms.ads.internal.util.zzd.zzye()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final /* synthetic */ void zzc(zzom zzomVar, int i) {
        this.bytesTransferred += i;
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final /* synthetic */ void zza(zzom zzomVar, zzor zzorVar) {
        zzom zzomVar2 = zzomVar;
        if (zzomVar2 instanceof zzos) {
            this.zzemx.add((zzos) zzomVar2);
            return;
        }
        if (zzomVar2 instanceof zzbbi) {
            this.zzemy = (zzbbi) zzomVar2;
            final zzbaq zzbaqVar = this.zzemu.get();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() && zzbaqVar != null && this.zzemy.zzmy()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzemy.zznb()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzemy.zzacd()));
                com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(zzbaqVar, hashMap) { // from class: com.google.android.gms.internal.ads.zzbbp
                    private final Map zzega;
                    private final zzbaq zzeng;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzeng = zzbaqVar;
                        this.zzega = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzeng.zza("onGcacheInfoEvent", this.zzega);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzom zza(zzop zzopVar) {
        return new zzbbi(this.context, zzopVar.zzip(), this.zzbvf, this.zzbvg, this, new zzbbk(this) { // from class: com.google.android.gms.internal.ads.zzbbx
            private final zzbbm zzenh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzenh = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zzb(boolean z, long j) {
                this.zzenh.zzd(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbbw zzbbwVar = this.zzemv;
        if (zzbbwVar != null) {
            zzbbwVar.zzb(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzom zzfe(String str) {
        return new zzot(str, null, this.zzelm.zzekt ? null : this, this.zzelm.zzekn, this.zzelm.zzekp, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzom zzff(String str) {
        zzbbg zzbbgVar = new zzbbg(str, this.zzelm.zzekt ? null : this, this.zzelm.zzekn, this.zzelm.zzekp, this.zzelm.zzeks);
        this.zzemz.add(new WeakReference<>(zzbbgVar));
        return zzbbgVar;
    }
}
