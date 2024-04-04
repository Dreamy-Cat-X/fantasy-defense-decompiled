package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.sncompany.newtower.Texture2D;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzazo extends zzbab implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzeha = new HashMap();
    private final zzbaq zzehb;
    private final zzbat zzehc;
    private final boolean zzehd;
    private int zzehe;
    private int zzehf;
    private MediaPlayer zzehg;
    private Uri zzehh;
    private int zzehi;
    private int zzehj;
    private int zzehk;
    private int zzehl;
    private int zzehm;
    private zzbao zzehn;
    private boolean zzeho;
    private int zzehp;
    private zzazy zzehq;
    private Integer zzehr;

    public zzazo(Context context, zzbaq zzbaqVar, boolean z, boolean z2, zzbar zzbarVar, zzbat zzbatVar) {
        super(context);
        this.zzehe = 0;
        this.zzehf = 0;
        this.zzehr = null;
        setSurfaceTextureListener(this);
        this.zzehb = zzbaqVar;
        this.zzehc = zzbatVar;
        this.zzeho = z;
        this.zzehd = z2;
        zzbatVar.zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzna() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final String zzaab() {
        String str = this.zzeho ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zza(zzazy zzazyVar) {
        this.zzehq = zzazyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zztd zzd = zztd.zzd(parse);
        if (zzd == null || zzd.url != null) {
            if (zzd != null) {
                parse = Uri.parse(zzd.url);
            }
            this.zzehh = parse;
            this.zzehp = 0;
            zzaac();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void stop() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzehg;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzehg.release();
            this.zzehg = null;
            zzdj(0);
            this.zzehf = 0;
        }
        this.zzehc.onStop();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        this.zzehi = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzehj = videoHeight;
        if (this.zzehi == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView prepared");
        zzdj(2);
        this.zzehc.zzfb();
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazq(this, mediaPlayer));
        this.zzehi = mediaPlayer.getVideoWidth();
        this.zzehj = mediaPlayer.getVideoHeight();
        int i = this.zzehp;
        if (i != 0) {
            seekTo(i);
        }
        zzaad();
        int i2 = this.zzehi;
        int i3 = this.zzehj;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        com.google.android.gms.ads.internal.util.zzd.zzew(sb.toString());
        if (this.zzehf == 3) {
            play();
        }
        zzaah();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView completion");
        zzdj(5);
        this.zzehf = 5;
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazt(this));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeha.get(Integer.valueOf(i));
        String str2 = zzeha.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeha.get(Integer.valueOf(i));
        String str2 = zzeha.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        com.google.android.gms.ads.internal.util.zzd.zzex(sb.toString());
        zzdj(-1);
        this.zzehf = -1;
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazs(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzehk = i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView surface created");
        zzaac();
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazv(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView surface changed");
        boolean z = this.zzehf == 3;
        boolean z2 = this.zzehi == i && this.zzehj == i2;
        if (this.zzehg != null && z && z2) {
            int i3 = this.zzehp;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzm(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazu(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzehg;
        if (mediaPlayer != null && this.zzehp == 0) {
            this.zzehp = mediaPlayer.getCurrentPosition();
        }
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzaau();
        }
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazx(this));
        zzat(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzehc.zzc(this);
        this.zzeia.zza(surfaceTexture, this.zzehq);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzazr
            private final int zzedk;
            private final zzazo zzehv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzehv = this;
                this.zzedk = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzehv.zzdk(this.zzedk);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.zzehi, i);
        int defaultSize2 = getDefaultSize(this.zzehj, i2);
        if (this.zzehi > 0 && this.zzehj > 0 && this.zzehn == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.zzehi;
                int i5 = i4 * size2;
                int i6 = this.zzehj;
                if (i5 < size * i6) {
                    defaultSize = (i4 * size2) / i6;
                    defaultSize2 = size2;
                } else {
                    if (i4 * size2 > size * i6) {
                        defaultSize2 = (i6 * size) / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i7 = (this.zzehj * size) / this.zzehi;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i8 = (this.zzehi * size2) / this.zzehj;
                if (mode != Integer.MIN_VALUE || i8 <= size) {
                    defaultSize = i8;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i9 = this.zzehi;
                int i10 = this.zzehj;
                if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                    defaultSize2 = i10;
                } else {
                    i9 = (i9 * size2) / i10;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                } else {
                    defaultSize2 = (this.zzehj * size) / this.zzehi;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzm(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i11 = this.zzehl;
            if ((i11 > 0 && i11 != defaultSize) || ((i3 = this.zzehm) > 0 && i3 != defaultSize2)) {
                zzaad();
            }
            this.zzehl = defaultSize;
            this.zzehm = defaultSize2;
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    private final void zzaac() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzehh == null || surfaceTexture == null) {
            return;
        }
        zzat(false);
        try {
            com.google.android.gms.ads.internal.zzp.zzlg();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzehg = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzehg.setOnCompletionListener(this);
            this.zzehg.setOnErrorListener(this);
            this.zzehg.setOnInfoListener(this);
            this.zzehg.setOnPreparedListener(this);
            this.zzehg.setOnVideoSizeChangedListener(this);
            this.zzehk = 0;
            if (this.zzeho) {
                zzbao zzbaoVar = new zzbao(getContext());
                this.zzehn = zzbaoVar;
                zzbaoVar.zza(surfaceTexture, getWidth(), getHeight());
                this.zzehn.start();
                SurfaceTexture zzaav = this.zzehn.zzaav();
                if (zzaav != null) {
                    surfaceTexture = zzaav;
                } else {
                    this.zzehn.zzaau();
                    this.zzehn = null;
                }
            }
            this.zzehg.setDataSource(getContext(), this.zzehh);
            com.google.android.gms.ads.internal.zzp.zzlh();
            this.zzehg.setSurface(new Surface(surfaceTexture));
            this.zzehg.setAudioStreamType(3);
            this.zzehg.setScreenOnWhilePlaying(true);
            this.zzehg.prepareAsync();
            zzdj(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzehh);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zzd.zzd(sb.toString(), e);
            onError(this.zzehg, 1, 0);
        }
    }

    private final void zzaad() {
        if (this.zzehd && zzaae() && this.zzehg.getCurrentPosition() > 0 && this.zzehf != 3) {
            com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView nudging MediaPlayer");
            zzd(0.0f);
            this.zzehg.start();
            int currentPosition = this.zzehg.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
            while (zzaae() && this.zzehg.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzehg.pause();
            zzaah();
        }
    }

    private final void zzat(boolean z) {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView release");
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzaau();
            this.zzehn = null;
        }
        MediaPlayer mediaPlayer = this.zzehg;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzehg.release();
            this.zzehg = null;
            zzdj(0);
            if (z) {
                this.zzehf = 0;
                this.zzehf = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void play() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView play");
        if (zzaae()) {
            this.zzehg.start();
            zzdj(3);
            this.zzeia.zzaaj();
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazw(this));
        }
        this.zzehf = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void pause() {
        com.google.android.gms.ads.internal.util.zzd.zzeb("AdMediaPlayerView pause");
        if (zzaae() && this.zzehg.isPlaying()) {
            this.zzehg.pause();
            zzdj(4);
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzazz(this));
        }
        this.zzehf = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getDuration() {
        if (zzaae()) {
            return this.zzehg.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getCurrentPosition() {
        if (zzaae()) {
            return this.zzehg.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        if (zzaae()) {
            this.zzehg.seekTo(i);
            this.zzehp = 0;
        } else {
            this.zzehp = i;
        }
    }

    private final boolean zzaae() {
        int i;
        return (this.zzehg == null || (i = this.zzehe) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zza(float f, float f2) {
        zzbao zzbaoVar = this.zzehn;
        if (zzbaoVar != null) {
            zzbaoVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzehg;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzehg;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzaaf() {
        if (this.zzehr != null) {
            return (getTotalBytes() * this.zzehk) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long getTotalBytes() {
        if (this.zzehr != null) {
            return getDuration() * this.zzehr.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final int zzaag() {
        if (Build.VERSION.SDK_INT < 26 || !zzaae()) {
            return -1;
        }
        return this.zzehg.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzbab, com.google.android.gms.internal.ads.zzbau
    public final void zzaah() {
        zzd(this.zzeib.getVolume());
    }

    private final void zzd(float f) {
        MediaPlayer mediaPlayer = this.zzehg;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            com.google.android.gms.ads.internal.util.zzd.zzex("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() || this.zzehb == null || mediaPlayer == null || Build.VERSION.SDK_INT < 19 || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            this.zzehr = valueOf;
                            hashMap.put("bitRate", String.valueOf(valueOf));
                        }
                        if (format2.containsKey("width") && format2.containsKey("height")) {
                            int integer = format2.getInteger("width");
                            int integer2 = format2.getInteger("height");
                            StringBuilder sb = new StringBuilder(23);
                            sb.append(integer);
                            sb.append("x");
                            sb.append(integer2);
                            hashMap.put("resolution", sb.toString());
                        }
                        if (format2.containsKey("mime")) {
                            hashMap.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            hashMap.put("videoCodec", format2.getString("codecs-string"));
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        hashMap.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        hashMap.put("audioCodec", format.getString("codecs-string"));
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        this.zzehb.zza("onMetadataEvent", hashMap);
    }

    private final void zzdj(int i) {
        if (i == 3) {
            this.zzehc.zzabk();
            this.zzeib.zzabk();
        } else if (this.zzehe == 3) {
            this.zzehc.zzabl();
            this.zzeib.zzabl();
        }
        this.zzehe = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdk(int i) {
        zzazy zzazyVar = this.zzehq;
        if (zzazyVar != null) {
            zzazyVar.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzeha.put(-1004, "MEDIA_ERROR_IO");
            zzeha.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzeha.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzeha.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzeha.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzeha.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzeha.put(1, "MEDIA_ERROR_UNKNOWN");
        zzeha.put(1, "MEDIA_INFO_UNKNOWN");
        zzeha.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzeha.put(701, "MEDIA_INFO_BUFFERING_START");
        zzeha.put(702, "MEDIA_INFO_BUFFERING_END");
        zzeha.put(Integer.valueOf((int) Texture2D.SCRWIDTH_800), "MEDIA_INFO_BAD_INTERLEAVING");
        zzeha.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzeha.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzeha.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzeha.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
