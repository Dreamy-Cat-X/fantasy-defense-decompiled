package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatm extends zzatr {
    private final String type;
    private final int zzdxh;

    public zzatm(String str, int i) {
        this.type = str;
        this.zzdxh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzato
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzato
    public final int getAmount() {
        return this.zzdxh;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzatm)) {
            zzatm zzatmVar = (zzatm) obj;
            if (Objects.equal(this.type, zzatmVar.type) && Objects.equal(Integer.valueOf(this.zzdxh), Integer.valueOf(zzatmVar.zzdxh))) {
                return true;
            }
        }
        return false;
    }
}
