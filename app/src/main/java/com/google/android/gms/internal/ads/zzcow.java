package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcow implements zzepq<zzcou> {
    private final zzeqd<Set<zzcox>> zzgkh;
    private final zzeqd<zzdrp> zzgoo;

    private zzcow(zzeqd<Set<zzcox>> zzeqdVar, zzeqd<zzdrp> zzeqdVar2) {
        this.zzgkh = zzeqdVar;
        this.zzgoo = zzeqdVar2;
    }

    public static zzcow zzam(zzeqd<Set<zzcox>> zzeqdVar, zzeqd<zzdrp> zzeqdVar2) {
        return new zzcow(zzeqdVar, zzeqdVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcou(this.zzgkh.get(), this.zzgoo.get());
    }
}
