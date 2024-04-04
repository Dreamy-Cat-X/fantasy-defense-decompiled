package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        try {
            zzwo.zzqn().zzb(this, new zzamu()).zzc(intent);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("RemoteException calling handleNotificationIntent: ");
            sb.append(valueOf);
            zzaym.zzev(sb.toString());
        }
    }
}
