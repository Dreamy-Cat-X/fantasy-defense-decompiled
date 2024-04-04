package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbye {
    private final zzbdh zzdhu;
    private final zzbzl zzfzq;

    public zzbye(zzbzl zzbzlVar) {
        this(zzbzlVar, null);
    }

    public zzbye(zzbzl zzbzlVar, zzbdh zzbdhVar) {
        this.zzfzq = zzbzlVar;
        this.zzdhu = zzbdhVar;
    }

    public final zzbzl zzamr() {
        return this.zzfzq;
    }

    public final zzbdh zzajb() {
        return this.zzdhu;
    }

    public final View zzams() {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar != null) {
            return zzbdhVar.getWebView();
        }
        return null;
    }

    public final View zzamt() {
        zzbdh zzbdhVar = this.zzdhu;
        if (zzbdhVar == null) {
            return null;
        }
        return zzbdhVar.getWebView();
    }

    public Set<zzbxf<zzbqr>> zzb(zzbpr zzbprVar) {
        return Collections.singleton(zzbxf.zzb(zzbprVar, zzayv.zzegn));
    }

    public Set<zzbxf<zzbwu>> zzc(zzbpr zzbprVar) {
        return Collections.singleton(zzbxf.zzb(zzbprVar, zzayv.zzegn));
    }

    public final zzbxf<zzbus> zzb(Executor executor) {
        final zzbdh zzbdhVar = this.zzdhu;
        return new zzbxf<>(new zzbus(zzbdhVar) { // from class: com.google.android.gms.internal.ads.zzbyg
            private final zzbdh zzesn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzesn = zzbdhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbus
            public final void zzakc() {
                zzbdh zzbdhVar2 = this.zzesn;
                if (zzbdhVar2.zzade() != null) {
                    zzbdhVar2.zzade().close();
                }
            }
        }, executor);
    }
}
