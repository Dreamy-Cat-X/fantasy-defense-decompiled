package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzeda extends zzeao<zzeas, zzedm> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeda(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzeao
    public final /* synthetic */ zzeas zzah(zzedm zzedmVar) throws GeneralSecurityException {
        zzedm zzedmVar2 = zzedmVar;
        return new zzeig(new zzeif(zzedmVar2.zzbbh().toByteArray()), zzedmVar2.zzbbi().zzbbm());
    }
}
