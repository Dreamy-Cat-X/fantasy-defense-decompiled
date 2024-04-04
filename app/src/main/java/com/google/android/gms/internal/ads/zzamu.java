package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzamu extends zzamw {
    private static final zzapf zzdma = new zzapf();
    private Map<Class<? extends NetworkExtras>, NetworkExtras> zzdlz;

    @Override // com.google.android.gms.internal.ads.zzamt
    public final zzamy zzdd(String str) throws RemoteException {
        return zzdg(str);
    }

    @Override // com.google.android.gms.internal.ads.zzamt
    public final boolean zzde(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzamu.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            zzaym.zzex(sb.toString());
            return false;
        }
    }

    public final void zzf(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.zzdlz = map;
    }

    private final <NetworkExtrasT extends com.google.ads.mediation.NetworkExtras, ServerParametersT extends MediationServerParameters> zzamy zzdg(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzamu.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                MediationAdapter mediationAdapter = (MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new zzanx(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.zzdlz.get(mediationAdapter.getAdditionalParametersType()));
            }
            if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                return new zzanp((com.google.android.gms.ads.mediation.MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (Adapter.class.isAssignableFrom(cls)) {
                return new zzanp((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(" (not a valid adapter).");
            zzaym.zzex(sb.toString());
            throw new RemoteException();
        } catch (Throwable unused) {
            return zzdh(str);
        }
    }

    private final zzamy zzdh(String str) throws RemoteException {
        try {
            zzaym.zzdy("Reflection failed, retrying using direct instantiation");
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            zzaym.zzd(sb.toString(), th);
        }
        if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
            return new zzanp(new AdMobAdapter());
        }
        if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
            return new zzanp(new AdUrlAdapter());
        }
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            return new zzanp(new CustomEventAdapter());
        }
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
            return new zzanx(customEventAdapter, (CustomEventExtras) this.zzdlz.get(customEventAdapter.getAdditionalParametersType()));
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzamt
    public final zzaoz zzdf(String str) throws RemoteException {
        return zzapf.zzdo(str);
    }
}
