package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfs implements zzdeu<zzdfp> {
    private final Context context;
    private final String packageName;
    private final zzdzk zzgfs;
    private final zzatb zzhcn;

    public zzdfs(zzatb zzatbVar, Context context, String str, zzdzk zzdzkVar) {
        this.zzhcn = zzatbVar;
        this.context = context;
        this.packageName = str;
        this.zzgfs = zzdzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdfp> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdfr
            private final zzdfs zzhcm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcm = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhcm.zzatv();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdfp zzatv() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzatb zzatbVar = this.zzhcn;
        if (zzatbVar != null) {
            zzatbVar.zza(this.context, this.packageName, jSONObject);
        }
        return new zzdfp(jSONObject);
    }
}
