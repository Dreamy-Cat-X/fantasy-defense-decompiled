package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzcf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzft extends zzgo {
    public zzft(zzez zzezVar, String str, String str2, zzcf.zza.C0009zza c0009zza, int i, int i2) {
        super(zzezVar, str, str2, c0009zza, i, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    /* renamed from: zzcy */
    public final Void call() throws Exception {
        if (this.zzvx.isInitialized()) {
            return super.call();
        }
        if (!this.zzvx.zzck()) {
            return null;
        }
        zzcz();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgo
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzvx.zzck()) {
            zzcz();
            return;
        }
        synchronized (this.zzaaz) {
            this.zzaaz.zzab((String) this.zzabj.invoke(null, this.zzvx.getContext()));
        }
    }

    private final void zzcz() {
        AdvertisingIdClient zzcs = this.zzvx.zzcs();
        if (zzcs == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzcs.getInfo();
            String zzaq = zzfi.zzaq(info.getId());
            if (zzaq != null) {
                synchronized (this.zzaaz) {
                    this.zzaaz.zzab(zzaq);
                    this.zzaaz.zza(info.isLimitAdTrackingEnabled());
                    this.zzaaz.zza(zzcf.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgo, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
