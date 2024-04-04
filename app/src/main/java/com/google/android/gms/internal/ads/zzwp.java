package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzwp<T> {
    private static final zzxt zzcje = zzqv();

    protected abstract T zza(zzxt zzxtVar) throws RemoteException;

    protected abstract T zzqi();

    protected abstract T zzqj() throws RemoteException;

    private static zzxt zzqv() {
        try {
            Object newInstance = zzvz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzaym.zzex("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzxt) {
                return (zzxt) queryLocalInterface;
            }
            return new zzxv(iBinder);
        } catch (Exception unused) {
            zzaym.zzex("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T zzqw() {
        zzxt zzxtVar = zzcje;
        if (zzxtVar == null) {
            zzaym.zzex("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zza(zzxtVar);
        } catch (RemoteException e) {
            zzaym.zzd("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T zzqx() {
        try {
            return zzqj();
        } catch (RemoteException e) {
            zzaym.zzd("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T zzd(Context context, boolean z) {
        boolean z2;
        T zzqw;
        boolean z3 = z;
        if (!z3) {
            zzwo.zzqm();
            if (!zzayd.zzf(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzaym.zzdy("Google Play Services is not available.");
                z3 = true;
            }
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z3 = true;
        }
        zzabh.initialize(context);
        if (zzada.zzdci.get().booleanValue()) {
            z3 = false;
        } else if (zzada.zzdcj.get().booleanValue()) {
            z3 = true;
            z2 = true;
            if (!z3) {
                zzqw = zzqw();
                if (zzqw == null && !z2) {
                    zzqw = zzqx();
                }
            } else {
                T zzqx = zzqx();
                int i = zzqx == null ? 1 : 0;
                if (i != 0) {
                    if (zzwo.zzqt().nextInt(zzadj.zzddl.get().intValue()) == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString("action", "dynamite_load");
                        bundle.putInt("is_missing", i);
                        zzwo.zzqm().zza(context, zzwo.zzqs().zzbrf, "gmob-apps", bundle, true);
                    }
                }
                zzqw = zzqx == null ? zzqw() : zzqx;
            }
            return zzqw != null ? zzqi() : zzqw;
        }
        z2 = false;
        if (!z3) {
        }
        if (zzqw != null) {
        }
    }
}
