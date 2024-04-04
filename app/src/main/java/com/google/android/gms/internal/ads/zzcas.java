package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcas implements zzepq<zzqs> {
    private final zzeqd<zzayt> zzfrk;
    private final zzeqd<String> zzfrl;

    public zzcas(zzeqd<zzayt> zzeqdVar, zzeqd<String> zzeqdVar2) {
        this.zzfrk = zzeqdVar;
        this.zzfrl = zzeqdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        zzayt zzaytVar = this.zzfrk.get();
        String str = this.zzfrl.get();
        com.google.android.gms.ads.internal.zzp.zzkq();
        return (zzqs) zzepw.zza(new zzqs(com.google.android.gms.ads.internal.util.zzm.zzyw(), zzaytVar, str, new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
