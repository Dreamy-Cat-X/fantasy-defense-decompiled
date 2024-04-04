package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcls implements zzepq<zzdzl<String>> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzef> zzfqg;
    private final zzeqd<zzdzk> zzfwo;

    private zzcls(zzeqd<zzef> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzdzk> zzeqdVar3) {
        this.zzfqg = zzeqdVar;
        this.zzeuo = zzeqdVar2;
        this.zzfwo = zzeqdVar3;
    }

    public static zzcls zzx(zzeqd<zzef> zzeqdVar, zzeqd<Context> zzeqdVar2, zzeqd<zzdzk> zzeqdVar3) {
        return new zzcls(zzeqdVar, zzeqdVar2, zzeqdVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        final zzef zzefVar = this.zzfqg.get();
        final Context context = this.zzeuo.get();
        return (zzdzl) zzepw.zza(this.zzfwo.get().submit(new Callable(zzefVar, context) { // from class: com.google.android.gms.internal.ads.zzclt
            private final Context zzckg;
            private final zzef zzgmh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmh = zzefVar;
                this.zzckg = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzef zzefVar2 = this.zzgmh;
                return zzefVar2.zzca().zzb(this.zzckg);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
