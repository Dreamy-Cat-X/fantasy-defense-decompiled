package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaef implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzaff zzdev;

    public zzaef(zzaff zzaffVar) {
        this.zzdev = zzaffVar;
        try {
            zzaffVar.zztt();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zzdev.zzts();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zzdev.zzq(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
    }
}
