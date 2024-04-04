package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdcb implements zzdeu<zzdcc> {
    private final Context context;
    private final zzdzk zzgfs;

    public zzdcb(Context context, zzdzk zzdzkVar) {
        this.context = context;
        this.zzgfs = zzdzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdcc> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdce
            private final zzdcb zzhag;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhag = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzyh;
                String zzyj;
                String str;
                com.google.android.gms.ads.internal.zzp.zzkq();
                zzrl zzyf = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyf();
                Bundle bundle = null;
                if (zzyf != null && zzyf != null && (!com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyg() || !com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyi())) {
                    if (zzyf.zzml()) {
                        zzyf.wakeup();
                    }
                    zzrf zzmj = zzyf.zzmj();
                    if (zzmj != null) {
                        zzyh = zzmj.zzly();
                        str = zzmj.zzlz();
                        zzyj = zzmj.zzma();
                        if (zzyh != null) {
                            com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzec(zzyh);
                        }
                        if (zzyj != null) {
                            com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzed(zzyj);
                        }
                    } else {
                        zzyh = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyh();
                        zzyj = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyj();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyi()) {
                        if (zzyj != null && !TextUtils.isEmpty(zzyj)) {
                            bundle2.putString("v_fp_vertical", zzyj);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzyh != null && !com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyg()) {
                        bundle2.putString("fingerprint", zzyh);
                        if (!zzyh.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzdcc(bundle);
            }
        });
    }
}
