package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebb;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeba implements zzebb.zzb {
    private final /* synthetic */ zzeal zziaj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeba(zzeal zzealVar) {
        this.zziaj = zzealVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Class<?> zzbbc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final <Q> zzeal<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (!this.zziaj.zzbal().equals(cls)) {
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        return this.zziaj;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final zzeal<?> zzbba() {
        return this.zziaj;
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Class<?> zzbbb() {
        return this.zziaj.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzebb.zzb
    public final Set<Class<?>> zzbap() {
        return Collections.singleton(this.zziaj.zzbal());
    }
}
