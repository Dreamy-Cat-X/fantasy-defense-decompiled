package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcqx {
    private zzdmi zzeqz = null;
    private final Map<String, zzvt> zzgrg = Collections.synchronizedMap(new HashMap());
    private final List<zzvt> zzadt = Collections.synchronizedList(new ArrayList());

    public final void zzd(zzdmi zzdmiVar) {
        String str = zzdmiVar.zzdkl;
        if (this.zzgrg.containsKey(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzdmiVar.zzhhw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzdmiVar.zzhhw.getString(next));
            } catch (JSONException unused) {
            }
        }
        zzvt zzvtVar = new zzvt(zzdmiVar.zzhia, 0L, null, bundle);
        this.zzadt.add(zzvtVar);
        this.zzgrg.put(str, zzvtVar);
    }

    public final void zza(zzdmi zzdmiVar, long j, zzvc zzvcVar) {
        String str = zzdmiVar.zzdkl;
        if (this.zzgrg.containsKey(str)) {
            if (this.zzeqz == null) {
                this.zzeqz = zzdmiVar;
            }
            zzvt zzvtVar = this.zzgrg.get(str);
            zzvtVar.zzchz = j;
            zzvtVar.zzcia = zzvcVar;
        }
    }

    public final zzbqm zzasc() {
        return new zzbqm(this.zzeqz, "", this);
    }

    public final List<zzvt> getAdapterResponses() {
        return this.zzadt;
    }
}
