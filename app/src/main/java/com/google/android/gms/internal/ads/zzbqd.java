package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbqd {
    private final Context context;
    private final zzdmx zzfve;
    private Bundle zzfxd;
    private final String zzfxe;
    private final zzdmw zzfxf;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zza {
        private Context context;
        private zzdmx zzfve;
        private Bundle zzfxd;
        private String zzfxe;
        private zzdmw zzfxf;

        public final zza zzcg(Context context) {
            this.context = context;
            return this;
        }

        public final zza zza(zzdmx zzdmxVar) {
            this.zzfve = zzdmxVar;
            return this;
        }

        public final zza zze(Bundle bundle) {
            this.zzfxd = bundle;
            return this;
        }

        public final zza zzfs(String str) {
            this.zzfxe = str;
            return this;
        }

        public final zzbqd zzalm() {
            return new zzbqd(this);
        }

        public final zza zza(zzdmw zzdmwVar) {
            this.zzfxf = zzdmwVar;
            return this;
        }
    }

    private zzbqd(zza zzaVar) {
        this.context = zzaVar.context;
        this.zzfve = zzaVar.zzfve;
        this.zzfxd = zzaVar.zzfxd;
        this.zzfxe = zzaVar.zzfxe;
        this.zzfxf = zzaVar.zzfxf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza zzalh() {
        return new zza().zzcg(this.context).zza(this.zzfve).zzfs(this.zzfxe).zze(this.zzfxd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdmx zzali() {
        return this.zzfve;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdmw zzalj() {
        return this.zzfxf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzalk() {
        return this.zzfxd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzall() {
        return this.zzfxe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzcf(Context context) {
        return this.zzfxe != null ? context : this.context;
    }
}
