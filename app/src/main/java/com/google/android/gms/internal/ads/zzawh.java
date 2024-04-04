package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzawh implements zzqv {
    private final Object lock;
    private String zzbup;
    private final Context zzcln;
    private boolean zzdzo;

    public zzawh(Context context, String str) {
        this.zzcln = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzbup = str;
        this.zzdzo = false;
        this.lock = new Object();
    }

    public final void zzam(boolean z) {
        if (com.google.android.gms.ads.internal.zzp.zzlo().zzz(this.zzcln)) {
            synchronized (this.lock) {
                if (this.zzdzo == z) {
                    return;
                }
                this.zzdzo = z;
                if (TextUtils.isEmpty(this.zzbup)) {
                    return;
                }
                if (this.zzdzo) {
                    com.google.android.gms.ads.internal.zzp.zzlo().zzd(this.zzcln, this.zzbup);
                } else {
                    com.google.android.gms.ads.internal.zzp.zzlo().zze(this.zzcln, this.zzbup);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza(zzqw zzqwVar) {
        zzam(zzqwVar.zzbqz);
    }

    public final String getAdUnitId() {
        return this.zzbup;
    }
}
