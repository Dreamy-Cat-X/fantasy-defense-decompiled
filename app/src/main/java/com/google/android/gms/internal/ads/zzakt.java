package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzakt implements zzahv<zzalm> {
    private final /* synthetic */ zzalf zzdil;
    private final /* synthetic */ zzakb zzdim;
    private final /* synthetic */ zzako zzdin;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakt(zzako zzakoVar, zzalf zzalfVar, zzakb zzakbVar) {
        this.zzdin = zzakoVar;
        this.zzdil = zzalfVar;
        this.zzdim = zzakbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzalm zzalmVar, Map map) {
        Object obj;
        com.google.android.gms.ads.internal.util.zzau zzauVar;
        obj = this.zzdin.lock;
        synchronized (obj) {
            if (this.zzdil.getStatus() != -1 && this.zzdil.getStatus() != 1) {
                this.zzdin.status = 0;
                zzauVar = this.zzdin.zzdif;
                zzauVar.zzg(this.zzdim);
                this.zzdil.zzl(this.zzdim);
                this.zzdin.zzdih = this.zzdil;
                com.google.android.gms.ads.internal.util.zzd.zzeb("Successfully loaded JS Engine.");
            }
        }
    }
}
