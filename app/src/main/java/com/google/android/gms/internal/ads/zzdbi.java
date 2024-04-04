package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdbi implements zzdeu<zzdbf> {
    private final Context context;
    private final zzdzk zzgfs;

    public zzdbi(zzdzk zzdzkVar, Context context) {
        this.zzgfs = zzdzkVar;
        this.context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdbf> zzata() {
        return this.zzgfs.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbh
            private final zzdbi zzgzq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzq = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgzq.zzatf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdbf zzatf() throws Exception {
        double d;
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzdbf(d, z);
    }
}
