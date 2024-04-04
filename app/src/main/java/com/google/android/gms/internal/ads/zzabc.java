package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzabc {
    private final Collection<zzaaw<?>> zzcli = new ArrayList();
    private final Collection<zzaaw<String>> zzclj = new ArrayList();
    private final Collection<zzaaw<String>> zzclk = new ArrayList();

    public final void zza(zzaaw zzaawVar) {
        this.zzcli.add(zzaawVar);
    }

    public final void zzb(zzaaw<String> zzaawVar) {
        this.zzclj.add(zzaawVar);
    }

    public final void zzc(zzaaw<String> zzaawVar) {
        this.zzclk.add(zzaawVar);
    }

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzaaw<?> zzaawVar : this.zzcli) {
            if (zzaawVar.getSource() == 1) {
                zzaawVar.zza(editor, zzaawVar.zzb(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzaym.zzev("Flag Json is null.");
        }
    }

    public final List<String> zzsb() {
        ArrayList arrayList = new ArrayList();
        Iterator<zzaaw<String>> it = this.zzclj.iterator();
        while (it.hasNext()) {
            String str = (String) zzwo.zzqq().zzd(it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzabm.zzsh());
        return arrayList;
    }

    public final List<String> zzsc() {
        List<String> zzsb = zzsb();
        Iterator<zzaaw<String>> it = this.zzclk.iterator();
        while (it.hasNext()) {
            String str = (String) zzwo.zzqq().zzd(it.next());
            if (!TextUtils.isEmpty(str)) {
                zzsb.add(str);
            }
        }
        zzsb.addAll(zzabm.zzsi());
        return zzsb;
    }
}
