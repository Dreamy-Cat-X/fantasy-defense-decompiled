package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebb;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebc implements zzebb.zzb {
    private final /* synthetic */ zzeay zziap;
    private final /* synthetic */ zzeam zziaq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebc(zzeay zzeayVar, zzeam zzeamVar) {
        this.zziap = zzeayVar;
        this.zziaq = zzeamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final <Q> zzeal<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzeaz(this.zziap, this.zziaq, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final zzeal<?> zzbba() {
        zzeay zzeayVar = this.zziap;
        return new zzeaz(zzeayVar, this.zziaq, zzeayVar.zzbaq());
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Class<?> zzbbb() {
        return this.zziap.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Set<Class<?>> zzbap() {
        return this.zziap.zzbap();
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Class<?> zzbbc() {
        return this.zziaq.getClass();
    }
}
