package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzccl implements View.OnClickListener {
    private final Clock zzbpw;
    private final zzcfp zzgel;
    private zzagi zzgem;
    private zzahv<Object> zzgen;
    String zzgeo;
    Long zzgep;
    WeakReference<View> zzgeq;

    public zzccl(zzcfp zzcfpVar, Clock clock) {
        this.zzgel = zzcfpVar;
        this.zzbpw = clock;
    }

    public final void zza(final zzagi zzagiVar) {
        this.zzgem = zzagiVar;
        zzahv<Object> zzahvVar = this.zzgen;
        if (zzahvVar != null) {
            this.zzgel.zzb("/unconfirmedClick", zzahvVar);
        }
        zzahv<Object> zzahvVar2 = new zzahv(this, zzagiVar) { // from class: com.google.android.gms.internal.ads.zzcck
            private final zzccl zzgej;
            private final zzagi zzgek;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgej = this;
                this.zzgek = zzagiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                zzccl zzcclVar = this.zzgej;
                zzagi zzagiVar2 = this.zzgek;
                try {
                    zzcclVar.zzgep = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zzd.zzev("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzcclVar.zzgeo = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzagiVar2 == null) {
                    com.google.android.gms.ads.internal.util.zzd.zzdy("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzagiVar2.onUnconfirmedClickReceived(str);
                } catch (RemoteException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzgen = zzahvVar2;
        this.zzgel.zza("/unconfirmedClick", zzahvVar2);
    }

    public final zzagi zzapb() {
        return this.zzgem;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzgem == null || this.zzgep == null) {
            return;
        }
        zzapc();
        try {
            this.zzgem.onUnconfirmedClickCancelled();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzgeq;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zzgeo != null && this.zzgep != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zzgeo);
            hashMap.put("time_interval", String.valueOf(this.zzbpw.currentTimeMillis() - this.zzgep.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzgel.zza("sendMessageToNativeJs", hashMap);
        }
        zzapc();
    }

    private final void zzapc() {
        View view;
        this.zzgeo = null;
        this.zzgep = null;
        WeakReference<View> weakReference = this.zzgeq;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzgeq = null;
    }
}
