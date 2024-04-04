package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcel {
    public final int type;
    public final String zzck;
    public final String zzdpj;
    public final zzadv zzggq;

    public zzcel(String str, String str2) {
        this.type = 1;
        this.zzck = str;
        this.zzdpj = str2;
        this.zzggq = null;
    }

    public zzcel(String str, zzadv zzadvVar) {
        this.type = 2;
        this.zzck = str;
        this.zzdpj = null;
        this.zzggq = zzadvVar;
    }
}
