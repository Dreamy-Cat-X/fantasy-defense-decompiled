package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzasj;
import com.google.android.gms.internal.ads.zzawd;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zza {
    private final Context context;
    private boolean zzboe;
    private zzawd zzbof;
    private zzasj zzbog;

    public zza(Context context, zzawd zzawdVar, zzasj zzasjVar) {
        this.context = context;
        this.zzbof = zzawdVar;
        this.zzbog = null;
        if (0 == 0) {
            this.zzbog = new zzasj();
        }
    }

    private final boolean zzjx() {
        zzawd zzawdVar = this.zzbof;
        return (zzawdVar != null && zzawdVar.zzwt().zzdyv) || this.zzbog.zzdvg;
    }

    public final void recordClick() {
        this.zzboe = true;
    }

    public final boolean zzjy() {
        return !zzjx() || this.zzboe;
    }

    public final void zzbk(String str) {
        if (zzjx()) {
            if (str == null) {
                str = "";
            }
            zzawd zzawdVar = this.zzbof;
            if (zzawdVar != null) {
                zzawdVar.zza(str, null, 3);
                return;
            }
            if (!this.zzbog.zzdvg || this.zzbog.zzdvh == null) {
                return;
            }
            for (String str2 : this.zzbog.zzdvh) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzp.zzkq();
                    com.google.android.gms.ads.internal.util.zzm.zzb(this.context, "", replace);
                }
            }
        }
    }
}
