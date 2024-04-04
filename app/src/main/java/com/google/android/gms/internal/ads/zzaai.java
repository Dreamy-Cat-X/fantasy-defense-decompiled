package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaai extends zzym {
    private final OnAdMetadataChangedListener zzclc;

    public zzaai(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzclc = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzyn
    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zzclc;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
