package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcfb extends zzajm implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadw {
    private zzyu zzgcm;
    private View zzgcr;
    private zzcaz zzgdt;
    private boolean zzerh = false;
    private boolean zzggx = false;

    public zzcfb(zzcaz zzcazVar, zzcbi zzcbiVar) {
        this.zzgcr = zzcbiVar.zzanw();
        this.zzgcm = zzcbiVar.getVideoController();
        this.zzgdt = zzcazVar;
        if (zzcbiVar.zzanx() != null) {
            zzcbiVar.zzanx().zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(IObjectWrapper iObjectWrapper, zzajo zzajoVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzerh) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Instream ad can not be shown after destroy().");
            zza(zzajoVar, 2);
            return;
        }
        if (this.zzgcr == null || this.zzgcm == null) {
            String str = this.zzgcr == null ? "can not get video view." : "can not get video controller.";
            com.google.android.gms.ads.internal.util.zzd.zzev(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            zza(zzajoVar, 0);
            return;
        }
        if (this.zzggx) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Instream ad should not be used again.");
            zza(zzajoVar, 1);
            return;
        }
        this.zzggx = true;
        zzapi();
        ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zzgcr, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza(this.zzgcr, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzp.zzln();
        zzazk.zza(this.zzgcr, (ViewTreeObserver.OnScrollChangedListener) this);
        zzapj();
        try {
            zzajoVar.zzud();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zza(iObjectWrapper, new zzcfd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final zzyu getVideoController() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzerh) {
            com.google.android.gms.ads.internal.util.zzd.zzev("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzgcm;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final zzaei zztx() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzerh) {
            com.google.android.gms.ads.internal.util.zzd.zzev("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar == null || zzcazVar.zzanp() == null) {
            return null;
        }
        return this.zzgdt.zzanp().zztx();
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzapi();
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar != null) {
            zzcazVar.destroy();
        }
        this.zzgdt = null;
        this.zzgcr = null;
        this.zzgcm = null;
        this.zzerh = true;
    }

    private final void zzapi() {
        View view = this.zzgcr;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zzgcr);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzapj();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzapj();
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzth() {
        com.google.android.gms.ads.internal.util.zzm.zzecu.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcfa
            private final zzcfb zzggw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggw = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzggw.zzapk();
            }
        });
    }

    private final void zzapj() {
        View view;
        zzcaz zzcazVar = this.zzgdt;
        if (zzcazVar == null || (view = this.zzgcr) == null) {
            return;
        }
        zzcazVar.zzb(view, Collections.emptyMap(), Collections.emptyMap(), zzcaz.zzz(this.zzgcr));
    }

    private static void zza(zzajo zzajoVar, int i) {
        try {
            zzajoVar.zzdb(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapk() {
        try {
            destroy();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
        }
    }
}
