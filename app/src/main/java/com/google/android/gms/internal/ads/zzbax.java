package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbax extends zzbab implements TextureView.SurfaceTextureListener, zzbbw {
    private Surface zzblj;
    private final zzbaq zzehb;
    private final zzbat zzehc;
    private final boolean zzehd;
    private int zzehi;
    private int zzehj;
    private int zzehl;
    private int zzehm;
    private zzbao zzehn;
    private final boolean zzeho;
    private zzazy zzehq;
    private String[] zzeip;
    private final zzbar zzelm;
    private zzbbm zzeln;
    private String zzelo;
    private boolean zzelp;
    private int zzelq;
    private boolean zzelr;
    private boolean zzels;
    private float zzelt;

    public zzbax(Context context, zzbat zzbatVar, zzbaq zzbaqVar, boolean z, boolean z2, zzbar zzbarVar) {
        super(context);
        this.zzelq = 1;
        this.zzehd = z2;
        this.zzehb = zzbaqVar;
        this.zzehc = zzbatVar;
        this.zzeho = z;
        this.zzelm = zzbarVar;
        setSurfaceTextureListener(this);
        this.zzehc.zzb(this);
    }

    private final zzbbm zzabn() {
        return new zzbbm(this.zzehb.getContext(), this.zzelm, this.zzehb);
    }

    private final String zzabo() {
        return com.google.android.gms.ads.internal.zzp.zzkq().zzq(this.zzehb.getContext(), this.zzehb.zzabf().zzbrf);
    }

    private final boolean zzabp() {
        zzbbm zzbbmVar = this.zzeln;
        return (zzbbmVar == null || zzbbmVar.zzacg() == null || this.zzelp) ? false : true;
    }

    private final boolean zzabq() {
        return zzabp() && this.zzelq != 1;
    }

    private final void zzabr() {
        String str;
        if (this.zzeln != null || (str = this.zzelo) == null || this.zzblj == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzbcj zzfc = this.zzehb.zzfc(this.zzelo);
            if (zzfc instanceof zzbcu) {
                zzbbm zzacl = ((zzbcu) zzfc).zzacl();
                this.zzeln = zzacl;
                if (zzacl.zzacg() == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Precached video player has been released.");
                    return;
                }
            } else if (zzfc instanceof zzbcv) {
                zzbcv zzbcvVar = (zzbcv) zzfc;
                String zzabo = zzabo();
                ByteBuffer byteBuffer = zzbcvVar.getByteBuffer();
                boolean zzacm = zzbcvVar.zzacm();
                String url = zzbcvVar.getUrl();
                if (url == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzex("Stream cache URL is null.");
                    return;
                } else {
                    zzbbm zzabn = zzabn();
                    this.zzeln = zzabn;
                    zzabn.zza(new Uri[]{Uri.parse(url)}, zzabo, byteBuffer, zzacm);
                }
            } else {
                String valueOf = String.valueOf(this.zzelo);
                com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.zzeln = zzabn();
            String zzabo2 = zzabo();
            Uri[] uriArr = new Uri[this.zzeip.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzeip;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzeln.zza(uriArr, zzabo2);
        }
        this.zzeln.zza(this);
        zza(this.zzblj, false);
        if (this.zzeln.zzacg() != null) {
            int playbackState = this.zzeln.zzacg().getPlaybackState();
            this.zzelq = playbackState;
            if (playbackState == 3) {
                zzabs();
            }
        }
    }

    private final void zza(Surface surface, boolean z) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zza(surface, z);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzb(f, z);
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("Trying to set volume before player is initalized.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab, com.google.android.gms.internal.ads.zzbau
    public final void zzaah() {
        zza(this.zzeib.getVolume(), false);
    }

    private final void zzabs() {
        if (this.zzelr) {
            return;
        }
        this.zzelr = true;
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbaw
            private final zzbax zzell;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzell = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzell.zzacb();
            }
        });
        zzaah();
        this.zzehc.zzfb();
        if (this.zzels) {
            play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final String zzaab() {
        String str = this.zzeho ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zza(zzazy zzazyVar) {
        this.zzehq = zzazyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzelo = str;
            this.zzeip = new String[]{str};
            zzabr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzb(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.zzelo = str;
            this.zzeip = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzabr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void play() {
        if (zzabq()) {
            if (this.zzelm.zzekk) {
                zzabu();
            }
            this.zzeln.zzacg().zzg(true);
            this.zzehc.zzabk();
            this.zzeib.zzabk();
            this.zzeia.zzaaj();
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbbb
                private final zzbax zzell;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzell = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzell.zzabz();
                }
            });
            return;
        }
        this.zzels = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void stop() {
        if (zzabp()) {
            this.zzeln.zzacg().stop();
            if (this.zzeln != null) {
                zza((Surface) null, true);
                zzbbm zzbbmVar = this.zzeln;
                if (zzbbmVar != null) {
                    zzbbmVar.zza((zzbbw) null);
                    this.zzeln.release();
                    this.zzeln = null;
                }
                this.zzelq = 1;
                this.zzelp = false;
                this.zzelr = false;
                this.zzels = false;
            }
        }
        this.zzehc.zzabl();
        this.zzeib.zzabl();
        this.zzehc.onStop();
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void pause() {
        if (zzabq()) {
            if (this.zzelm.zzekk) {
                zzabv();
            }
            this.zzeln.zzacg().zzg(false);
            this.zzehc.zzabl();
            this.zzeib.zzabl();
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbba
                private final zzbax zzell;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzell = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzell.zzaby();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void seekTo(int i) {
        if (zzabq()) {
            this.zzeln.zzacg().seekTo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzdl(int i) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzacj().zzdt(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzdm(int i) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzacj().zzdu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzdn(int i) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzacj().zzdn(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzdo(int i) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzacj().zzdo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzdp(int i) {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzdp(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zza(float f, float f2) {
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getCurrentPosition() {
        if (zzabq()) {
            return (int) this.zzeln.zzacg().zzen();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getDuration() {
        if (zzabq()) {
            return (int) this.zzeln.zzacg().getDuration();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getVideoWidth() {
        return this.zzehi;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getVideoHeight() {
        return this.zzehj;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzaaf() {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            return zzbbmVar.zzaaf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzna() {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            return zzbbmVar.zzna();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long getTotalBytes() {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            return zzbbmVar.getTotalBytes();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int zzaag() {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            return zzbbmVar.zzaag();
        }
        return -1;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzelt;
        if (f != 0.0f && this.zzehn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            float f4 = this.zzelt;
            if (f4 < f3) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzm(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i4 = this.zzehl;
            if (((i4 > 0 && i4 != measuredWidth) || ((i3 = this.zzehm) > 0 && i3 != measuredHeight)) && this.zzehd && zzabp()) {
                zzhg zzacg = this.zzeln.zzacg();
                if (zzacg.zzen() > 0 && !zzacg.zzel()) {
                    zza(0.0f, true);
                    zzacg.zzg(true);
                    long zzen = zzacg.zzen();
                    long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
                    while (zzabp() && zzacg.zzen() == zzen && com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis() - currentTimeMillis <= 250) {
                    }
                    zzacg.zzg(false);
                    zzaah();
                }
            }
            this.zzehl = measuredWidth;
            this.zzehm = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzeho) {
            zzbao zzbaoVar = new zzbao(getContext());
            this.zzehn = zzbaoVar;
            zzbaoVar.zza(surfaceTexture, i, i2);
            this.zzehn.start();
            SurfaceTexture zzaav = this.zzehn.zzaav();
            if (zzaav != null) {
                surfaceTexture = zzaav;
            } else {
                this.zzehn.zzaau();
                this.zzehn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzblj = surface;
        if (this.zzeln == null) {
            zzabr();
        } else {
            zza(surface, true);
            if (!this.zzelm.zzekk) {
                zzabu();
            }
        }
        if (this.zzehi == 0 || this.zzehj == 0) {
            zzo(i, i2);
        } else {
            zzabt();
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbbd
            private final zzbax zzell;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzell = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzell.zzabx();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzm(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, i, i2) { // from class: com.google.android.gms.internal.ads.zzbbc
            private final int zzedk;
            private final int zzedl;
            private final zzbax zzell;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzell = this;
                this.zzedk = i;
                this.zzedl = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzell.zzp(this.zzedk, this.zzedl);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzehc.zzc(this);
        this.zzeia.zza(surfaceTexture, this.zzehq);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzaau();
            this.zzehn = null;
        }
        if (this.zzeln != null) {
            zzabv();
            Surface surface = this.zzblj;
            if (surface != null) {
                surface.release();
            }
            this.zzblj = null;
            zza((Surface) null, true);
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbbf
            private final zzbax zzell;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzell = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzell.zzabw();
            }
        });
        return true;
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzbbe
            private final int zzedk;
            private final zzbax zzell;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzell = this;
                this.zzedk = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzell.zzds(this.zzedk);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzb(final boolean z, final long j) {
        if (this.zzehb != null) {
            zzayv.zzegm.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.zzbbh
                private final boolean zzeiv;
                private final zzbax zzell;
                private final long zzelx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzell = this;
                    this.zzeiv = z;
                    this.zzelx = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzell.zzc(this.zzeiv, this.zzelx);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzdr(int i) {
        if (this.zzelq != i) {
            this.zzelq = i;
            if (i == 3) {
                zzabs();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zzelm.zzekk) {
                zzabv();
            }
            this.zzehc.zzabl();
            this.zzeib.zzabl();
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbaz
                private final zzbax zzell;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzell = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzell.zzaca();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zzn(int i, int i2) {
        this.zzehi = i;
        this.zzehj = i2;
        zzabt();
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzelp = true;
        if (this.zzelm.zzekk) {
            zzabv();
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, sb2) { // from class: com.google.android.gms.internal.ads.zzbay
            private final String zzdhw;
            private final zzbax zzell;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzell = this;
                this.zzdhw = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzell.zzfd(this.zzdhw);
            }
        });
    }

    private final void zzabt() {
        zzo(this.zzehi, this.zzehj);
    }

    private final void zzo(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzelt != f) {
            this.zzelt = f;
            requestLayout();
        }
    }

    private final void zzabu() {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzaw(true);
        }
    }

    private final void zzabv() {
        zzbbm zzbbmVar = this.zzeln;
        if (zzbbmVar != null) {
            zzbbmVar.zzaw(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzehb.zza(z, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzds(int i) {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzabw() {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzaal();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(int i, int i2) {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzk(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzabx() {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzaai();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaby() {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.onPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzabz() {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzaaj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfd(String str) {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzl("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaca() {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzaak();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzacb() {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.zzfb();
        }
    }
}
