package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbhj {
    private zza zzfoe;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class zza {
        public abstract zzbcr zzafw();

        public abstract zzbaa zzafx();

        public abstract zztz zzafy();

        public abstract zzawf zzafz();

        public abstract zzard zzaga();

        public abstract zzacn zzagb();
    }

    public zzbhj(zza zzaVar) {
        this.zzfoe = zzaVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzavw, com.google.android.gms.internal.ads.zzawc] */
    public final com.google.android.gms.ads.internal.zzb zzaij() {
        zza zzaVar = this.zzfoe;
        return new com.google.android.gms.ads.internal.zzb(zzaVar.zzafw(), zzaVar.zzafx(), new zzavw(zzaVar.zzafz()), zzaVar.zzafy(), zzaVar.zzaga(), zzaVar.zzagb());
    }

    public final zzawf zzafz() {
        return this.zzfoe.zzafz();
    }

    public final zzard zzaga() {
        return this.zzfoe.zzaga();
    }

    public final zzacn zzagb() {
        return this.zzfoe.zzagb();
    }
}
