package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzblv implements zzepq<zzbxf<zzbus>> {
    private final zzble zzftk;
    private final zzeqd<zzbsx> zzftn;

    public zzblv(zzble zzbleVar, zzeqd<zzbsx> zzeqdVar) {
        this.zzftk = zzbleVar;
        this.zzftn = zzeqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        final zzbsx zzbsxVar = this.zzftn.get();
        return (zzbxf) zzepw.zza(new zzbxf(new zzbus(zzbsxVar) { // from class: com.google.android.gms.internal.ads.zzblg
            private final zzbsx zzftg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftg = zzbsxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbus
            public final void zzakc() {
                this.zzftg.zzalq();
            }
        }, zzayv.zzegn), "Cannot return null from a non-@Nullable @Provides method");
    }
}
