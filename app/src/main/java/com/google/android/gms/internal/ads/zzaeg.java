package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaeg extends NativeAd.AdChoicesInfo {
    private String text;
    private final List<NativeAd.Image> zzdem = new ArrayList();
    private final zzaeb zzdew;

    public zzaeg(zzaeb zzaebVar) {
        zzaej zzaejVar;
        IBinder iBinder;
        this.zzdew = zzaebVar;
        try {
            this.text = zzaebVar.getText();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
            this.text = "";
        }
        try {
            for (zzaej zzaejVar2 : zzaebVar.zztc()) {
                if (!(zzaejVar2 instanceof IBinder) || (iBinder = (IBinder) zzaejVar2) == null) {
                    zzaejVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    if (queryLocalInterface instanceof zzaej) {
                        zzaejVar = (zzaej) queryLocalInterface;
                    } else {
                        zzaejVar = new zzael(iBinder);
                    }
                }
                if (zzaejVar != null) {
                    this.zzdem.add(new zzaeo(zzaejVar));
                }
            }
        } catch (RemoteException e2) {
            zzaym.zzc("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.text;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzdem;
    }
}
