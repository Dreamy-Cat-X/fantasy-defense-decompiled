package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzef;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzn extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzj zzbpl;

    private zzn(zzj zzjVar) {
        this.zzbpl = zzjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        Future future;
        try {
            zzj zzjVar = this.zzbpl;
            future = this.zzbpl.zzbpf;
            zzjVar.zzbpj = (zzef) future.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaym.zzd("", e);
        }
        return this.zzbpl.zzkk();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(String str) {
        WebView webView;
        WebView webView2;
        String str2 = str;
        webView = this.zzbpl.zzbph;
        if (webView == null || str2 == null) {
            return;
        }
        webView2 = this.zzbpl.zzbph;
        webView2.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzn(zzj zzjVar, zzm zzmVar) {
        this(zzjVar);
    }
}
