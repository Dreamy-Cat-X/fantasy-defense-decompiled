package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdr implements zzdun {
    private final /* synthetic */ zzdsm zzvv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdr(zzdp zzdpVar, zzdsm zzdsmVar) {
        this.zzvv = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdun
    public final boolean zzb(File file) {
        try {
            return this.zzvv.zzb(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
