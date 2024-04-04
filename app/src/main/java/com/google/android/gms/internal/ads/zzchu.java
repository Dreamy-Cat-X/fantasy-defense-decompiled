package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzchu {
    private final zzcht zzgit;
    private final AtomicReference<zzamt> zzgiu = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchu(zzcht zzchtVar) {
        this.zzgit = zzchtVar;
    }

    public final void zzb(zzamt zzamtVar) {
        this.zzgiu.compareAndSet(null, zzamtVar);
    }

    public final zzdno zzd(String str, JSONObject jSONObject) throws zzdnf {
        zzamy zze;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zze = new zzanp(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zze = new zzanp(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zze = new zzanp(new zzapp());
            } else {
                zze = zze(str, jSONObject);
            }
            zzdno zzdnoVar = new zzdno(zze);
            this.zzgit.zza(str, zzdnoVar);
            return zzdnoVar;
        } catch (Throwable th) {
            throw new zzdnf(th);
        }
    }

    public final zzaoz zzdf(String str) throws RemoteException {
        zzaoz zzdf = zzapx().zzdf(str);
        this.zzgit.zza(str, zzdf);
        return zzdf;
    }

    public final boolean zzapw() {
        return this.zzgiu.get() != null;
    }

    private final zzamy zze(String str, JSONObject jSONObject) throws RemoteException {
        zzamt zzapx = zzapx();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (zzapx.zzde(jSONObject.getString("class_name"))) {
                    return zzapx.zzdd("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return zzapx.zzdd("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Invalid custom event.", e);
            }
        }
        return zzapx.zzdd(str);
    }

    private final zzamt zzapx() throws RemoteException {
        zzamt zzamtVar = this.zzgiu.get();
        if (zzamtVar != null) {
            return zzamtVar;
        }
        com.google.android.gms.ads.internal.util.zzd.zzex("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
