package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdef implements zzdeu<zzdeg> {
    private final Context context;
    private final zzayt zzbpd;
    private final zzdzk zzgfs;

    public zzdef(zzdzk zzdzkVar, Context context, zzayt zzaytVar) {
        this.zzgfs = zzdzkVar;
        this.context = context;
        this.zzbpd = zzaytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdeg> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdei
            private final zzdef zzhbk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhbk = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhbk.zzatq();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdeg zzatq() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.context).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzp.zzkq();
        boolean zzav = com.google.android.gms.ads.internal.util.zzm.zzav(this.context);
        String str = this.zzbpd.zzbrf;
        com.google.android.gms.ads.internal.zzp.zzks();
        boolean zzzc = com.google.android.gms.ads.internal.util.zzu.zzzc();
        com.google.android.gms.ads.internal.zzp.zzkq();
        return new zzdeg(isCallerInstantApp, zzav, str, zzzc, com.google.android.gms.ads.internal.util.zzm.zzas(this.context), DynamiteModule.getRemoteVersion(this.context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.context, ModuleDescriptor.MODULE_ID));
    }
}
