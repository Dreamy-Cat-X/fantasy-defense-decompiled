package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzawr implements zzaww {
    static final zzaww zzdzp = new zzawr();

    private zzawr() {
    }

    @Override // com.google.android.gms.internal.ads.zzaww
    public final Object zza(zzbez zzbezVar) {
        String currentScreenName = zzbezVar.getCurrentScreenName();
        if (currentScreenName != null) {
            return currentScreenName;
        }
        String currentScreenClass = zzbezVar.getCurrentScreenClass();
        return currentScreenClass != null ? currentScreenClass : "";
    }
}
