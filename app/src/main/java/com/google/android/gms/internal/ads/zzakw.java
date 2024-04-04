package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzakw implements zzahv<zzalm> {
    private final /* synthetic */ zzakb zzdim;
    private final /* synthetic */ zzako zzdin;
    private final /* synthetic */ zzef zzdip;
    private final /* synthetic */ com.google.android.gms.ads.internal.util.zzbr zzdiq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakw(zzako zzakoVar, zzef zzefVar, zzakb zzakbVar, com.google.android.gms.ads.internal.util.zzbr zzbrVar) {
        this.zzdin = zzakoVar;
        this.zzdip = zzefVar;
        this.zzdim = zzakbVar;
        this.zzdiq = zzbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzalm zzalmVar, Map map) {
        Object obj;
        int i;
        obj = this.zzdin.lock;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zzd.zzew("JS Engine is requesting an update");
            i = this.zzdin.status;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zzd.zzew("Starting reload.");
                this.zzdin.status = 2;
                this.zzdin.zza(this.zzdip);
            }
            this.zzdim.zzb("/requestReload", (zzahv<? super zzalm>) this.zzdiq.get());
        }
    }
}
