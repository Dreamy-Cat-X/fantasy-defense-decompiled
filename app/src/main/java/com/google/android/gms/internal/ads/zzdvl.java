package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdvl extends zzdvi {
    private final char zzhuc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvl(char c) {
        this.zzhuc = c;
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final boolean zzc(char c) {
        return c == this.zzhuc;
    }

    public final String toString() {
        String zzd;
        zzd = zzdvj.zzd(this.zzhuc);
        StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(zzd);
        sb.append("')");
        return sb.toString();
    }
}
