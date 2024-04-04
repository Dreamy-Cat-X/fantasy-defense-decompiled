package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface MediationAdapter extends MediationExtrasReceiver {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zza {
        private int zzesy;

        public final zza zzdw(int i) {
            this.zzesy = 1;
            return this;
        }

        public final Bundle zzaeq() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzesy);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
