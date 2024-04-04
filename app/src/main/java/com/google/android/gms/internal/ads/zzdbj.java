package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbj implements zzdeu<zzder<Bundle>> {
    private final zzdjf zzgzr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbj(zzdjf zzdjfVar) {
        this.zzgzr = zzdjfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzder<Bundle>> zzata() {
        zzdjf zzdjfVar = this.zzgzr;
        return zzdyz.zzag((zzdjfVar == null || zzdjfVar.zzaur() == null || this.zzgzr.zzaur().isEmpty()) ? null : new zzder(this) { // from class: com.google.android.gms.internal.ads.zzdbm
            private final zzdbj zzgzs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzs = this;
            }

            @Override // com.google.android.gms.internal.ads.zzder
            public final void zzr(Object obj) {
                this.zzgzs.zzo((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Bundle bundle) {
        bundle.putString("key_schema", this.zzgzr.zzaur());
    }
}
