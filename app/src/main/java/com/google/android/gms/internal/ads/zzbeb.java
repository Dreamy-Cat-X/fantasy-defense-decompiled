package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbeb extends zzyx {
    private boolean zzadv;
    private boolean zzadw;
    private int zzaex;
    private zzyz zzdmb;
    private final zzbaq zzehb;
    private final boolean zzesf;
    private final boolean zzesg;
    private boolean zzesh;
    private float zzesj;
    private float zzesk;
    private float zzesl;
    private zzafv zzesm;
    private final Object lock = new Object();
    private boolean zzesi = true;

    public zzbeb(zzbaq zzbaqVar, float f, boolean z, boolean z2) {
        this.zzehb = zzbaqVar;
        this.zzesj = f;
        this.zzesf = z;
        this.zzesg = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void play() {
        zze("play", null);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void pause() {
        zze("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void stop() {
        zze("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void mute(boolean z) {
        zze(z ? "mute" : "unmute", null);
    }

    public final void zzb(zzaaq zzaaqVar) {
        boolean z = zzaaqVar.zzadu;
        boolean z2 = zzaaqVar.zzadv;
        boolean z3 = zzaaqVar.zzadw;
        synchronized (this.lock) {
            this.zzadv = z2;
            this.zzadw = z3;
        }
        zze("initialState", CollectionUtils.mapOf("muteStart", z ? InAppError.FAILED : InAppError.SUCCESS, "customControlsRequested", z2 ? InAppError.FAILED : InAppError.SUCCESS, "clickToExpandRequested", z3 ? InAppError.FAILED : InAppError.SUCCESS));
    }

    private final void zze(String str, Map<String, String> map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzayv.zzegm.execute(new Runnable(this, hashMap) { // from class: com.google.android.gms.internal.ads.zzbea
            private final Map zzega;
            private final zzbeb zzese;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzese = this;
                this.zzega = hashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzese.zzl(this.zzega);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzesi;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzaex;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzesl;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getDuration() {
        float f;
        synchronized (this.lock) {
            f = this.zzesj;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final float getCurrentTime() {
        float f;
        synchronized (this.lock) {
            f = this.zzesk;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zza(zzyz zzyzVar) {
        synchronized (this.lock) {
            this.zzdmb = zzyzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyz zzrf() throws RemoteException {
        zzyz zzyzVar;
        synchronized (this.lock) {
            zzyzVar = this.zzdmb;
        }
        return zzyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzesf && this.zzadv;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    z = this.zzadw && this.zzesg;
                } finally {
                }
            }
        }
        return z;
    }

    public final void zze(float f) {
        synchronized (this.lock) {
            this.zzesk = f;
        }
    }

    public final void zzaeh() {
        boolean z;
        int i;
        synchronized (this.lock) {
            z = this.zzesi;
            i = this.zzaex;
            this.zzaex = 3;
        }
        zza(i, 3, z, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[Catch: all -> 0x004f, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x0013, B:12:0x002f, B:13:0x0038), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        float f4;
        synchronized (this.lock) {
            if (f2 == this.zzesj && f3 == this.zzesl) {
                z2 = false;
                this.zzesj = f2;
                this.zzesk = f;
                z3 = this.zzesi;
                this.zzesi = z;
                i2 = this.zzaex;
                this.zzaex = i;
                f4 = this.zzesl;
                this.zzesl = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.zzehb.getView().invalidate();
                }
            }
            z2 = true;
            this.zzesj = f2;
            this.zzesk = f;
            z3 = this.zzesi;
            this.zzesi = z;
            i2 = this.zzaex;
            this.zzaex = i;
            f4 = this.zzesl;
            this.zzesl = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
            }
        }
        if (z2) {
            try {
                if (this.zzesm != null) {
                    this.zzesm.zztv();
                }
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
        zza(i2, i, z3, z);
    }

    public final void zza(zzafv zzafvVar) {
        synchronized (this.lock) {
            this.zzesm = zzafvVar;
        }
    }

    private final void zza(final int i, final int i2, final boolean z, final boolean z2) {
        zzayv.zzegm.execute(new Runnable(this, i, i2, z, z2) { // from class: com.google.android.gms.internal.ads.zzbed
            private final int zzedk;
            private final int zzedl;
            private final boolean zzeqc;
            private final boolean zzeqd;
            private final zzbeb zzese;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzese = this;
                this.zzedk = i;
                this.zzedl = i2;
                this.zzeqc = z;
                this.zzeqd = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzese.zzb(this.zzedk, this.zzedl, this.zzeqc, this.zzeqd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(int i, int i2, boolean z, boolean z2) {
        synchronized (this.lock) {
            boolean z3 = i != i2;
            boolean z4 = !this.zzesh && i2 == 1;
            boolean z5 = z3 && i2 == 1;
            boolean z6 = z3 && i2 == 2;
            boolean z7 = z3 && i2 == 3;
            boolean z8 = z != z2;
            this.zzesh = this.zzesh || z4;
            if (z4) {
                try {
                    if (this.zzdmb != null) {
                        this.zzdmb.onVideoStart();
                    }
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
            if (z5 && this.zzdmb != null) {
                this.zzdmb.onVideoPlay();
            }
            if (z6 && this.zzdmb != null) {
                this.zzdmb.onVideoPause();
            }
            if (z7) {
                if (this.zzdmb != null) {
                    this.zzdmb.onVideoEnd();
                }
                this.zzehb.zzabi();
            }
            if (z8 && this.zzdmb != null) {
                this.zzdmb.onVideoMute(z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(Map map) {
        this.zzehb.zza("pubVideoCmd", (Map<String, ?>) map);
    }
}
