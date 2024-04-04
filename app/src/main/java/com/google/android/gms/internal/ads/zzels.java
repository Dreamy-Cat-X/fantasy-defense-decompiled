package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzels implements zzema {
    private zzema[] zziqt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzels(zzema... zzemaVarArr) {
        this.zziqt = zzemaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zze(Class<?> cls) {
        for (zzema zzemaVar : this.zziqt) {
            if (zzemaVar.zze(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final zzemb zzf(Class<?> cls) {
        for (zzema zzemaVar : this.zziqt) {
            if (zzemaVar.zze(cls)) {
                return zzemaVar.zzf(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
