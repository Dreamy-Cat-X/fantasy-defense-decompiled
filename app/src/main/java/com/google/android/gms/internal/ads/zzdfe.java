package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdfe implements zzdeu<zzdfb> {
    private final Context context;
    private final zzdzk zzgfs;

    public zzdfe(zzdzk zzdzkVar, Context context) {
        this.zzgfs = zzdzkVar;
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdfb> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdfd
            private final zzdfe zzhcc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhcc = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhcc.zzatu();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ zzdfb zzatu() throws Exception {
        int networkType;
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        if (PlatformVersion.isAtLeastR()) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczj)).booleanValue()) {
                networkType = 0;
                int phoneType = telephonyManager.getPhoneType();
                com.google.android.gms.ads.internal.zzp.zzkq();
                int i4 = -1;
                if (com.google.android.gms.ads.internal.util.zzm.zzp(this.context, "android.permission.ACCESS_NETWORK_STATE")) {
                    i = -2;
                    z = false;
                    i2 = -1;
                } else {
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        i4 = activeNetworkInfo.getType();
                        i3 = activeNetworkInfo.getDetailedState().ordinal();
                    } else {
                        i3 = -1;
                    }
                    i2 = i3;
                    i = i4;
                    z = connectivityManager.isActiveNetworkMetered();
                }
                return new zzdfb(networkOperator, i, networkType, phoneType, z, i2);
            }
        }
        networkType = telephonyManager.getNetworkType();
        int phoneType2 = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzp.zzkq();
        int i42 = -1;
        if (com.google.android.gms.ads.internal.util.zzm.zzp(this.context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
        return new zzdfb(networkOperator, i, networkType, phoneType2, z, i2);
    }
}
