package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzcli extends Exception {
    private final zzdnu zzglu;

    public zzcli(zzdnu zzdnuVar) {
        this.zzglu = zzdnuVar;
    }

    public zzcli(zzdnu zzdnuVar, String str) {
        super(str);
        this.zzglu = zzdnuVar;
    }

    public zzcli(zzdnu zzdnuVar, String str, Throwable th) {
        super(str, th);
        this.zzglu = zzdnuVar;
    }

    public final zzdnu zzarj() {
        return this.zzglu;
    }
}
