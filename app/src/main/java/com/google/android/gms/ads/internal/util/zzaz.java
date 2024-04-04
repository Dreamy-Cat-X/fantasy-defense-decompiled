package com.google.android.gms.ads.internal.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaz implements com.google.android.gms.internal.ads.zzai {
    private final /* synthetic */ String zzeek;
    private final /* synthetic */ zzbe zzeel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(zzax zzaxVar, String str, zzbe zzbeVar) {
        this.zzeek = str;
        this.zzeel = zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzai
    public final void zzc(com.google.android.gms.internal.ads.zzao zzaoVar) {
        String str = this.zzeek;
        String zzaoVar2 = zzaoVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzaoVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzaoVar2);
        zzd.zzex(sb.toString());
        this.zzeel.zzb(null);
    }
}
