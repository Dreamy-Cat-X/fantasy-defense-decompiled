package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfj extends zzafi {
    private final Context zzaaf;
    private final zzcbi zzgao;
    private zzcaz zzgdt;
    private zzcce zzgha;

    public zzcfj(Context context, zzcbi zzcbiVar, zzcce zzcceVar, zzcaz zzcazVar) {
        this.zzaaf = context;
        this.zzgao = zzcbiVar;
        this.zzgha = zzcceVar;
        this.zzgdt = zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final IObjectWrapper zztl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final String zzct(String str) {
        return this.zzgao.zzaoc().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final zzaej zzcu(String str) {
        return this.zzgao.zzaoa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final List<String> getAvailableAssetNames() {
        SimpleArrayMap<String, zzadv> zzaoa = this.zzgao.zzaoa();
        SimpleArrayMap<String, String> zzaoc = this.zzgao.zzaoc();
        String[] strArr = new String[zzaoa.size() + zzaoc.size()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzaoa.size()) {
            strArr[i3] = zzaoa.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzaoc.size()) {
            strArr[i3] = zzaoc.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final String getCustomTemplateId() {
        return this.zzgao.getCustomTemplateId();
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void performClick(String str) {
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar != null) {
            zzcazVar.zzfw(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void recordImpression() {
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar != null) {
            zzcazVar.zzanh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final zzyu getVideoController() {
        return this.zzgao.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void destroy() {
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar != null) {
            zzcazVar.destroy();
        }
        this.zzgdt = null;
        this.zzgha = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final IObjectWrapper zztq() {
        return ObjectWrapper.wrap(this.zzaaf);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzp(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup)) {
            return false;
        }
        zzcce zzcceVar = this.zzgha;
        if (!(zzcceVar != null && zzcceVar.zza((ViewGroup) unwrap))) {
            return false;
        }
        this.zzgao.zzanx().zza(new zzcfi(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zztr() {
        zzcaz zzcazVar = this.zzgdt;
        return (zzcazVar == null || zzcazVar.zzano()) && this.zzgao.zzany() != null && this.zzgao.zzanx() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final boolean zzts() {
        IObjectWrapper zzanz = this.zzgao.zzanz();
        if (zzanz != null) {
            com.google.android.gms.ads.internal.zzp.zzlf().zzab(zzanz);
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcuv)).booleanValue() || this.zzgao.zzany() == null) {
                return true;
            }
            this.zzgao.zzany().zza("onSdkLoaded", new ArrayMap());
            return true;
        }
        com.google.android.gms.ads.internal.util.zzd.zzex("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzcaz zzcazVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzgao.zzanz() == null || (zzcazVar = this.zzgdt) == null) {
            return;
        }
        zzcazVar.zzaa((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzaff
    public final void zztt() {
        String zzaob = this.zzgao.zzaob();
        if ("Google".equals(zzaob)) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Illegal argument specified for omid partner name.");
            return;
        }
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar != null) {
            zzcazVar.zzi(zzaob, false);
        }
    }
}
