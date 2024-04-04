package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbmz {
    protected final zzdmi zzeqz;
    protected final zzdmt zzfpl;
    private final zzbrl zzful;
    private final zzbsb zzfum;
    private final zzdjw zzfun;
    private final zzbqm zzfuo;
    private final zzbti zzfup;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbmz(zzbmy zzbmyVar) {
        zzdmt zzdmtVar;
        zzdmi zzdmiVar;
        zzbrl zzbrlVar;
        zzbsb zzbsbVar;
        zzdjw zzdjwVar;
        zzbqm zzbqmVar;
        zzbti zzbtiVar;
        zzdmtVar = zzbmyVar.zzfpl;
        this.zzfpl = zzdmtVar;
        zzdmiVar = zzbmyVar.zzeqz;
        this.zzeqz = zzdmiVar;
        zzbrlVar = zzbmyVar.zzful;
        this.zzful = zzbrlVar;
        zzbsbVar = zzbmyVar.zzfum;
        this.zzfum = zzbsbVar;
        zzdjwVar = zzbmyVar.zzfun;
        this.zzfun = zzdjwVar;
        zzbqmVar = zzbmyVar.zzfuo;
        this.zzfuo = zzbqmVar;
        zzbtiVar = zzbmyVar.zzfup;
        this.zzfup = zzbtiVar;
    }

    public final zzbrl zzakn() {
        return this.zzful;
    }

    public void zzajy() {
        this.zzfum.onAdLoaded();
    }

    public final zzbqm zzako() {
        return this.zzfuo;
    }

    public void destroy() {
        this.zzful.zzce(null);
    }

    public final zzdjw zzakp() {
        return this.zzfun;
    }

    public final zzbuj zzakq() {
        return this.zzfup.zzakq();
    }
}
