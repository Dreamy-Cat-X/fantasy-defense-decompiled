package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzwv;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzm extends WebViewClient {
    private final /* synthetic */ zzj zzbpl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzm(zzj zzjVar) {
        this.zzbpl = zzjVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzwv zzwvVar;
        zzwv zzwvVar2;
        String zzbn;
        zzwv zzwvVar3;
        zzwv zzwvVar4;
        zzwv zzwvVar5;
        zzwv zzwvVar6;
        zzwv zzwvVar7;
        zzwv zzwvVar8;
        if (str.startsWith(this.zzbpl.zzkl())) {
            return false;
        }
        if (!str.startsWith("gmsg://noAdLoaded")) {
            if (!str.startsWith("gmsg://scriptLoadFailed")) {
                if (!str.startsWith("gmsg://adResized")) {
                    if (str.startsWith("gmsg://")) {
                        return true;
                    }
                    zzwvVar = this.zzbpl.zzbpi;
                    if (zzwvVar != null) {
                        try {
                            zzwvVar2 = this.zzbpl.zzbpi;
                            zzwvVar2.onAdLeftApplication();
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
                        }
                    }
                    zzbn = this.zzbpl.zzbn(str);
                    this.zzbpl.zzbo(zzbn);
                    return true;
                }
                zzwvVar3 = this.zzbpl.zzbpi;
                if (zzwvVar3 != null) {
                    try {
                        zzwvVar4 = this.zzbpl.zzbpi;
                        zzwvVar4.onAdLoaded();
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e2);
                    }
                }
                this.zzbpl.zzbq(this.zzbpl.zzbm(str));
                return true;
            }
            zzwvVar5 = this.zzbpl.zzbpi;
            if (zzwvVar5 != null) {
                try {
                    zzwvVar6 = this.zzbpl.zzbpi;
                    zzwvVar6.onAdFailedToLoad(0);
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e3);
                }
            }
            this.zzbpl.zzbq(0);
            return true;
        }
        zzwvVar7 = this.zzbpl.zzbpi;
        if (zzwvVar7 != null) {
            try {
                zzwvVar8 = this.zzbpl.zzbpi;
                zzwvVar8.onAdFailedToLoad(3);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e4);
            }
        }
        this.zzbpl.zzbq(0);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzwv zzwvVar;
        zzwv zzwvVar2;
        zzwvVar = this.zzbpl.zzbpi;
        if (zzwvVar != null) {
            try {
                zzwvVar2 = this.zzbpl.zzbpi;
                zzwvVar2.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
