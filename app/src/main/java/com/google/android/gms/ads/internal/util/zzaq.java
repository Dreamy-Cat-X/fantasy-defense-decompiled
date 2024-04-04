package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzaip;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzwo;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaq extends com.google.android.gms.internal.ads.zzau {
    private final Context context;

    public static com.google.android.gms.internal.ads.zzae zzbj(Context context) {
        com.google.android.gms.internal.ads.zzae zzaeVar = new com.google.android.gms.internal.ads.zzae(new com.google.android.gms.internal.ads.zzav(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaq(context, new com.google.android.gms.internal.ads.zzbd()));
        zzaeVar.start();
        return zzaeVar;
    }

    private zzaq(Context context, com.google.android.gms.internal.ads.zzar zzarVar) {
        super(zzarVar);
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzau, com.google.android.gms.internal.ads.zzx
    public final com.google.android.gms.internal.ads.zzy zzc(com.google.android.gms.internal.ads.zzaa<?> zzaaVar) throws com.google.android.gms.internal.ads.zzao {
        if (zzaaVar.zzh() && zzaaVar.getMethod() == 0) {
            if (Pattern.matches((String) zzwo.zzqq().zzd(zzabh.zzcts), zzaaVar.getUrl())) {
                zzwo.zzqm();
                if (zzayd.zzf(this.context, 13400000)) {
                    com.google.android.gms.internal.ads.zzy zzc = new zzaip(this.context).zzc(zzaaVar);
                    if (zzc != null) {
                        String valueOf = String.valueOf(zzaaVar.getUrl());
                        zzd.zzeb(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zzc;
                    }
                    String valueOf2 = String.valueOf(zzaaVar.getUrl());
                    zzd.zzeb(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zzc(zzaaVar);
    }
}
