package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzef;
import com.google.android.gms.internal.ads.zzei;
import com.google.android.gms.internal.ads.zzsm;
import com.google.android.gms.internal.ads.zzvi;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzvu;
import com.google.android.gms.internal.ads.zzwo;
import com.google.android.gms.internal.ads.zzwq;
import com.google.android.gms.internal.ads.zzwv;
import com.google.android.gms.internal.ads.zzww;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzxn;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxu;
import com.google.android.gms.internal.ads.zzxw;
import com.google.android.gms.internal.ads.zzyo;
import com.google.android.gms.internal.ads.zzyt;
import com.google.android.gms.internal.ads.zzyu;
import com.google.android.gms.internal.ads.zzza;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzj extends zzxj {
    private final Context context;
    private final zzayt zzbpd;
    private final zzvp zzbpe;
    private final Future<zzef> zzbpf = zzayv.zzegi.submit(new zzo(this));
    private final zzq zzbpg;
    private WebView zzbph;
    private zzwv zzbpi;
    private zzef zzbpj;
    private AsyncTask<Void, Void, String> zzbpk;

    public zzj(Context context, zzvp zzvpVar, String str, zzayt zzaytVar) {
        this.context = context;
        this.zzbpd = zzaytVar;
        this.zzbpe = zzvpVar;
        this.zzbph = new WebView(this.context);
        this.zzbpg = new zzq(context, str);
        zzbq(0);
        this.zzbph.setVerticalScrollBarEnabled(false);
        this.zzbph.getSettings().setJavaScriptEnabled(true);
        this.zzbph.setWebViewClient(new zzm(this));
        this.zzbph.setOnTouchListener(new zzl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyu getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvi zzviVar, zzww zzwwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxw zzxwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzyo zzyoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zze(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String zzkg() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzyt zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final IObjectWrapper zzkd() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzbph);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzbpk.cancel(true);
        this.zzbpf.cancel(true);
        this.zzbph.destroy();
        this.zzbph = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final boolean zza(zzvi zzviVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzbph, "This Search Ad has already been torn down");
        this.zzbpg.zza(zzviVar, this.zzbpd);
        this.zzbpk = new zzn(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwv zzwvVar) throws RemoteException {
        this.zzbpi = zzwvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxo zzxoVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxn zzxnVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void showInterstitial() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzke() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzvp zzkf() throws RemoteException {
        return this.zzbpe;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvp zzvpVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzarc zzarcVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzari zzariVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxo zzki() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzwv zzkj() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzacd zzacdVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzwq zzwqVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzxu zzxuVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaty zzatyVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setUserId(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zzbl(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzaaq zzaaqVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzza zzzaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzvu zzvuVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void zza(zzsm zzsmVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzbm(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzwo.zzqm();
            return zzayd.zze(this.context, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbq(int i) {
        if (this.zzbph == null) {
            return;
        }
        this.zzbph.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkk() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(zzact.zzdbq.get());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zzbpg.getQuery());
        builder.appendQueryParameter("pubId", this.zzbpg.zzlq());
        Map<String, String> zzlr = this.zzbpg.zzlr();
        for (String str : zzlr.keySet()) {
            builder.appendQueryParameter(str, zzlr.get(str));
        }
        Uri build = builder.build();
        zzef zzefVar = this.zzbpj;
        if (zzefVar != null) {
            try {
                build = zzefVar.zza(build, this.context);
            } catch (zzei e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Unable to process ad data", e);
            }
        }
        String zzkl = zzkl();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(zzkl).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(zzkl);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkl() {
        String zzlp = this.zzbpg.zzlp();
        if (TextUtils.isEmpty(zzlp)) {
            zzlp = "www.google.com";
        }
        String str = zzact.zzdbq.get();
        StringBuilder sb = new StringBuilder(String.valueOf(zzlp).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(zzlp);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzbn(String str) {
        if (this.zzbpj == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzbpj.zza(parse, this.context, null, null);
        } catch (zzei e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbo(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.context.startActivity(intent);
    }
}
