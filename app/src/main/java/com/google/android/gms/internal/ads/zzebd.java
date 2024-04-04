package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebb;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzebd implements zzebb.zzb {
    private final /* synthetic */ zzeam zziar;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebd(zzeam zzeamVar) {
        this.zziar = zzeamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Class<?> zzbbc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final <Q> zzeal<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzeak(this.zziar, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final zzeal<?> zzbba() {
        zzeam zzeamVar = this.zziar;
        return new zzeak(zzeamVar, zzeamVar.zzbaq());
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Class<?> zzbbb() {
        return this.zziar.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Set<Class<?>> zzbap() {
        return this.zziar.zzbap();
    }
}
