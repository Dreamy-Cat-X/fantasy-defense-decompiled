package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcak implements zzepq<zzcah> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzdsh> zzewa;
    private final zzeqd<JSONObject> zzexq;
    private final zzeqd<zzbjf> zzexx;
    private final zzeqd<zzbqq> zzeyt;
    private final zzeqd<zzbri> zzezi;
    private final zzeqd<zzbxe> zzfap;
    private final zzeqd<zzayt> zzfov;
    private final zzeqd<Clock> zzfra;
    private final zzeqd<zzcbt> zzfte;
    private final zzeqd<zzdmx> zzftm;
    private final zzeqd<zzdmi> zzfue;
    private final zzeqd<zzcfp> zzgbe;
    private final zzeqd<zzcbi> zzgbf;
    private final zzeqd<zzef> zzgbg;
    private final zzeqd<zzccl> zzgbh;

    public zzcak(zzeqd<Context> zzeqdVar, zzeqd<zzcbt> zzeqdVar2, zzeqd<JSONObject> zzeqdVar3, zzeqd<zzcfp> zzeqdVar4, zzeqd<zzcbi> zzeqdVar5, zzeqd<zzef> zzeqdVar6, zzeqd<zzbri> zzeqdVar7, zzeqd<zzbqq> zzeqdVar8, zzeqd<zzdmi> zzeqdVar9, zzeqd<zzayt> zzeqdVar10, zzeqd<zzdmx> zzeqdVar11, zzeqd<zzbjf> zzeqdVar12, zzeqd<zzccl> zzeqdVar13, zzeqd<Clock> zzeqdVar14, zzeqd<zzbxe> zzeqdVar15, zzeqd<zzdsh> zzeqdVar16) {
        this.zzeuo = zzeqdVar;
        this.zzfte = zzeqdVar2;
        this.zzexq = zzeqdVar3;
        this.zzgbe = zzeqdVar4;
        this.zzgbf = zzeqdVar5;
        this.zzgbg = zzeqdVar6;
        this.zzezi = zzeqdVar7;
        this.zzeyt = zzeqdVar8;
        this.zzfue = zzeqdVar9;
        this.zzfov = zzeqdVar10;
        this.zzftm = zzeqdVar11;
        this.zzexx = zzeqdVar12;
        this.zzgbh = zzeqdVar13;
        this.zzfra = zzeqdVar14;
        this.zzfap = zzeqdVar15;
        this.zzewa = zzeqdVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        return new zzcah(this.zzeuo.get(), this.zzfte.get(), this.zzexq.get(), this.zzgbe.get(), this.zzgbf.get(), this.zzgbg.get(), this.zzezi.get(), this.zzeyt.get(), this.zzfue.get(), this.zzfov.get(), this.zzftm.get(), this.zzexx.get(), this.zzgbh.get(), this.zzfra.get(), this.zzfap.get(), this.zzewa.get());
    }
}
