package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
abstract class zzdwd extends zzdvf<String> {
    private int limit;
    private int offset = 0;
    private final zzdvj zzhuj;
    private final boolean zzhuk;
    final CharSequence zzhuo;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdwd(zzdvz zzdvzVar, CharSequence charSequence) {
        zzdvj zzdvjVar;
        int i;
        zzdvjVar = zzdvzVar.zzhuj;
        this.zzhuj = zzdvjVar;
        this.zzhuk = false;
        i = zzdvzVar.limit;
        this.limit = i;
        this.zzhuo = charSequence;
    }

    abstract int zzen(int i);

    abstract int zzeo(int i);

    @Override // com.google.android.gms.internal.ads.zzdvf
    protected final /* synthetic */ String zzazd() {
        int i = this.offset;
        while (true) {
            int i2 = this.offset;
            if (i2 != -1) {
                int zzen = zzen(i2);
                if (zzen == -1) {
                    zzen = this.zzhuo.length();
                    this.offset = -1;
                } else {
                    this.offset = zzeo(zzen);
                }
                int i3 = this.offset;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.offset = i4;
                    if (i4 > this.zzhuo.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i < zzen && this.zzhuj.zzc(this.zzhuo.charAt(i))) {
                        i++;
                    }
                    while (zzen > i && this.zzhuj.zzc(this.zzhuo.charAt(zzen - 1))) {
                        zzen--;
                    }
                    int i5 = this.limit;
                    if (i5 == 1) {
                        zzen = this.zzhuo.length();
                        this.offset = -1;
                        while (zzen > i && this.zzhuj.zzc(this.zzhuo.charAt(zzen - 1))) {
                            zzen--;
                        }
                    } else {
                        this.limit = i5 - 1;
                    }
                    return this.zzhuo.subSequence(i, zzen).toString();
                }
            } else {
                zzaze();
                return null;
            }
        }
    }
}
