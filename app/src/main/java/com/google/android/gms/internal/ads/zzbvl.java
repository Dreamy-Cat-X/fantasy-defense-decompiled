package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.util.Clock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbvl {
    private final zzdjw zzfun;
    private final Set<zzbxf<zzuz>> zzfyn;
    private final Set<zzbxf<zzbqr>> zzfyo;
    private final Set<zzbxf<zzbrj>> zzfyp;
    private final Set<zzbxf<zzbsl>> zzfyq;
    private final Set<zzbxf<zzbsg>> zzfyr;
    private final Set<zzbxf<zzbqw>> zzfys;
    private final Set<zzbxf<zzbrf>> zzfyt;
    private final Set<zzbxf<AdMetadataListener>> zzfyu;
    private final Set<zzbxf<AppEventListener>> zzfyv;
    private final Set<zzbxf<zzbsy>> zzfyw;
    private final Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>> zzfyx;
    private final Set<zzbxf<zzbtf>> zzfyy;
    private zzbqu zzfyz;
    private zzcud zzfza;

    private zzbvl(zza zzaVar) {
        this.zzfyn = zzaVar.zzfyn;
        this.zzfyp = zzaVar.zzfyp;
        this.zzfyq = zzaVar.zzfyq;
        this.zzfyo = zzaVar.zzfyo;
        this.zzfyr = zzaVar.zzfyr;
        this.zzfys = zzaVar.zzfys;
        this.zzfyt = zzaVar.zzfyt;
        this.zzfyu = zzaVar.zzfyu;
        this.zzfyv = zzaVar.zzfyv;
        this.zzfyw = zzaVar.zzfzb;
        this.zzfun = zzaVar.zzfun;
        this.zzfyx = zzaVar.zzfyx;
        this.zzfyy = zzaVar.zzfyy;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zza {
        private zzdjw zzfun;
        private Set<zzbxf<zzbtf>> zzfyy = new HashSet();
        private Set<zzbxf<zzuz>> zzfyn = new HashSet();
        private Set<zzbxf<zzbqr>> zzfyo = new HashSet();
        private Set<zzbxf<zzbrj>> zzfyp = new HashSet();
        private Set<zzbxf<zzbsl>> zzfyq = new HashSet();
        private Set<zzbxf<zzbsg>> zzfyr = new HashSet();
        private Set<zzbxf<zzbqw>> zzfys = new HashSet();
        private Set<zzbxf<AdMetadataListener>> zzfyu = new HashSet();
        private Set<zzbxf<AppEventListener>> zzfyv = new HashSet();
        private Set<zzbxf<zzbrf>> zzfyt = new HashSet();
        private Set<zzbxf<zzbsy>> zzfzb = new HashSet();
        private Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>> zzfyx = new HashSet();

        public final zza zza(zzbqr zzbqrVar, Executor executor) {
            this.zzfyo.add(new zzbxf<>(zzbqrVar, executor));
            return this;
        }

        public final zza zza(zzbsg zzbsgVar, Executor executor) {
            this.zzfyr.add(new zzbxf<>(zzbsgVar, executor));
            return this;
        }

        public final zza zza(zzbqw zzbqwVar, Executor executor) {
            this.zzfys.add(new zzbxf<>(zzbqwVar, executor));
            return this;
        }

        public final zza zza(zzbrf zzbrfVar, Executor executor) {
            this.zzfyt.add(new zzbxf<>(zzbrfVar, executor));
            return this;
        }

        public final zza zza(AppEventListener appEventListener, Executor executor) {
            this.zzfyv.add(new zzbxf<>(appEventListener, executor));
            return this;
        }

        public final zza zza(zzuz zzuzVar, Executor executor) {
            this.zzfyn.add(new zzbxf<>(zzuzVar, executor));
            return this;
        }

        public final zza zza(zzbrj zzbrjVar, Executor executor) {
            this.zzfyp.add(new zzbxf<>(zzbrjVar, executor));
            return this;
        }

        public final zza zza(zzbsl zzbslVar, Executor executor) {
            this.zzfyq.add(new zzbxf<>(zzbslVar, executor));
            return this;
        }

        public final zza zza(com.google.android.gms.ads.internal.overlay.zzp zzpVar, Executor executor) {
            this.zzfyx.add(new zzbxf<>(zzpVar, executor));
            return this;
        }

        public final zza zza(zzbsy zzbsyVar, Executor executor) {
            this.zzfzb.add(new zzbxf<>(zzbsyVar, executor));
            return this;
        }

        public final zza zza(zzdjw zzdjwVar) {
            this.zzfun = zzdjwVar;
            return this;
        }

        public final zza zza(zzbtf zzbtfVar, Executor executor) {
            this.zzfyy.add(new zzbxf<>(zzbtfVar, executor));
            return this;
        }

        public final zzbvl zzamj() {
            return new zzbvl(this);
        }
    }

    public final Set<zzbxf<zzbqr>> zzalw() {
        return this.zzfyo;
    }

    public final Set<zzbxf<zzbsg>> zzalx() {
        return this.zzfyr;
    }

    public final Set<zzbxf<zzbqw>> zzaly() {
        return this.zzfys;
    }

    public final Set<zzbxf<zzbrf>> zzalz() {
        return this.zzfyt;
    }

    public final Set<zzbxf<AdMetadataListener>> zzama() {
        return this.zzfyu;
    }

    public final Set<zzbxf<AppEventListener>> zzamb() {
        return this.zzfyv;
    }

    public final Set<zzbxf<zzuz>> zzamc() {
        return this.zzfyn;
    }

    public final Set<zzbxf<zzbrj>> zzamd() {
        return this.zzfyp;
    }

    public final Set<zzbxf<zzbsl>> zzame() {
        return this.zzfyq;
    }

    public final Set<zzbxf<zzbsy>> zzamf() {
        return this.zzfyw;
    }

    public final Set<zzbxf<zzbtf>> zzamg() {
        return this.zzfyy;
    }

    public final Set<zzbxf<com.google.android.gms.ads.internal.overlay.zzp>> zzamh() {
        return this.zzfyx;
    }

    public final zzdjw zzami() {
        return this.zzfun;
    }

    public final zzbqu zzc(Set<zzbxf<zzbqw>> set) {
        if (this.zzfyz == null) {
            this.zzfyz = new zzbqu(set);
        }
        return this.zzfyz;
    }

    public final zzcud zza(Clock clock, zzcuf zzcufVar, zzcqx zzcqxVar) {
        if (this.zzfza == null) {
            this.zzfza = new zzcud(clock, zzcufVar, zzcqxVar);
        }
        return this.zzfza;
    }
}
