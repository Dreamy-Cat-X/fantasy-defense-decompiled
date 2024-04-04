package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbfh {
    private final Context zzaaf;
    private final zzayt zzbos;
    private final WeakReference<Context> zzeug;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zza {
        private Context zzaaf;
        private zzayt zzbos;
        private WeakReference<Context> zzeug;

        public final zza zza(zzayt zzaytVar) {
            this.zzbos = zzaytVar;
            return this;
        }

        public final zza zzbx(Context context) {
            this.zzeug = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzaaf = context;
            return this;
        }
    }

    private zzbfh(zza zzaVar) {
        this.zzbos = zzaVar.zzbos;
        this.zzaaf = zzaVar.zzaaf;
        this.zzeug = zzaVar.zzeug;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzafo() {
        return this.zzaaf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference<Context> zzafp() {
        return this.zzeug;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzayt zzafq() {
        return this.zzbos;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzafr() {
        return com.google.android.gms.ads.internal.zzp.zzkq().zzq(this.zzaaf, this.zzbos.zzbrf);
    }

    public final zzef zzafs() {
        return new zzef(new com.google.android.gms.ads.internal.zzf(this.zzaaf, this.zzbos));
    }
}
