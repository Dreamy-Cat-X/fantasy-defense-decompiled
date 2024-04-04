package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbce extends com.google.android.gms.ads.internal.util.zza {
    final zzbaq zzehb;
    private final String zzeio;
    private final String[] zzeip;
    final zzbcj zzenr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbce(zzbaq zzbaqVar, zzbcj zzbcjVar, String str, String[] strArr) {
        this.zzehb = zzbaqVar;
        this.zzenr = zzbcjVar;
        this.zzeio = str;
        this.zzeip = strArr;
        com.google.android.gms.ads.internal.zzp.zzlm().zza(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zza
    public final void zzwc() {
        try {
            this.zzenr.zze(this.zzeio, this.zzeip);
        } finally {
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(new zzbch(this));
        }
    }
}
