package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zztw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public class zzbdg extends WebViewClient implements zzbet {
    private final Object lock;
    private boolean zzbrg;
    private zzuz zzcgr;
    private zzahc zzdfv;
    private zzahe zzdfx;
    private com.google.android.gms.ads.internal.zza zzdgt;
    private zzapv zzdgx;
    private com.google.android.gms.ads.internal.overlay.zzp zzdra;
    private com.google.android.gms.ads.internal.overlay.zzu zzdre;
    private boolean zzdve;
    protected zzbdh zzeoz;
    private final zztu zzepa;
    private final HashMap<String, List<zzahv<? super zzbdh>>> zzepb;
    private zzbes zzepc;
    private zzbev zzepd;
    private zzbeu zzepe;
    private boolean zzepf;
    private boolean zzepg;
    private boolean zzeph;
    private boolean zzepi;
    private final zzaqg zzepj;
    protected zzawd zzepk;
    private boolean zzepl;
    private boolean zzepm;
    private int zzepn;
    private final HashSet<String> zzepo;
    private View.OnAttachStateChangeListener zzepp;

    public zzbdg(zzbdh zzbdhVar, zztu zztuVar, boolean z) {
        this(zzbdhVar, zztuVar, z, new zzaqg(zzbdhVar, zzbdhVar.zzadd(), new zzaas(zzbdhVar.getContext())), null);
    }

    private zzbdg(zzbdh zzbdhVar, zztu zztuVar, boolean z, zzaqg zzaqgVar, zzapv zzapvVar) {
        this.zzepb = new HashMap<>();
        this.lock = new Object();
        this.zzepf = false;
        this.zzepa = zztuVar;
        this.zzeoz = zzbdhVar;
        this.zzbrg = z;
        this.zzepj = zzaqgVar;
        this.zzdgx = null;
        this.zzepo = new HashSet<>(Arrays.asList(((String) zzwo.zzqq().zzd(zzabh.zzcvv)).split(",")));
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zza(int i, int i2, boolean z) {
        this.zzepj.zzj(i, i2);
        zzapv zzapvVar = this.zzdgx;
        if (zzapvVar != null) {
            zzapvVar.zza(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zza(zzuz zzuzVar, zzahc zzahcVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzahe zzaheVar, com.google.android.gms.ads.internal.overlay.zzu zzuVar, boolean z, zzahy zzahyVar, com.google.android.gms.ads.internal.zza zzaVar, zzaqi zzaqiVar, zzawd zzawdVar, zzcpy zzcpyVar, zzdsh zzdshVar, zzcju zzcjuVar, zzdro zzdroVar) {
        com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar == null ? new com.google.android.gms.ads.internal.zza(this.zzeoz.getContext(), zzawdVar, null) : zzaVar;
        this.zzdgx = new zzapv(this.zzeoz, zzaqiVar);
        this.zzepk = zzawdVar;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcor)).booleanValue()) {
            zza("/adMetadata", new zzagz(zzahcVar));
        }
        zza("/appEvent", new zzahb(zzaheVar));
        zza("/backButton", zzahg.zzdgj);
        zza("/refresh", zzahg.zzdgk);
        zza("/canOpenApp", zzahg.zzdga);
        zza("/canOpenURLs", zzahg.zzdfz);
        zza("/canOpenIntents", zzahg.zzdgb);
        zza("/close", zzahg.zzdgd);
        zza("/customClose", zzahg.zzdge);
        zza("/instrument", zzahg.zzdgn);
        zza("/delayPageLoaded", zzahg.zzdgp);
        zza("/delayPageClosed", zzahg.zzdgq);
        zza("/getLocationInfo", zzahg.zzdgr);
        zza("/log", zzahg.zzdgg);
        zza("/mraid", new zzaia(zzaVar2, this.zzdgx, zzaqiVar));
        zza("/mraidLoaded", this.zzepj);
        zza("/open", new zzahz(zzaVar2, this.zzdgx, zzcpyVar, zzcjuVar, zzdroVar));
        zza("/precache", new zzbco());
        zza("/touch", zzahg.zzdgi);
        zza("/video", zzahg.zzdgl);
        zza("/videoMeta", zzahg.zzdgm);
        if (zzcpyVar != null && zzdshVar != null) {
            zza("/click", zzdne.zza(zzcpyVar, zzdshVar));
            zza("/httpTrack", zzdne.zzb(zzcpyVar, zzdshVar));
        } else {
            zza("/click", zzahg.zzdgc);
            zza("/httpTrack", zzahg.zzdgf);
        }
        if (com.google.android.gms.ads.internal.zzp.zzlo().zzz(this.zzeoz.getContext())) {
            zza("/logScionEvent", new zzahx(this.zzeoz.getContext()));
        }
        this.zzcgr = zzuzVar;
        this.zzdra = zzpVar;
        this.zzdfv = zzahcVar;
        this.zzdfx = zzaheVar;
        this.zzdre = zzuVar;
        this.zzdgt = zzaVar2;
        this.zzepf = z;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public void onAdClicked() {
        zzuz zzuzVar = this.zzcgr;
        if (zzuzVar != null) {
            zzuzVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final com.google.android.gms.ads.internal.zza zzaco() {
        return this.zzdgt;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final boolean zzacp() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbrg;
        }
        return z;
    }

    public final boolean zzacq() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzepg;
        }
        return z;
    }

    public final boolean zzacr() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeph;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzacs() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzact() {
        synchronized (this.lock) {
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.lock) {
            if (this.zzeoz.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zzd.zzeb("Blank page loaded, 1...");
                this.zzeoz.zzado();
                return;
            }
            this.zzepl = true;
            zzbev zzbevVar = this.zzepd;
            if (zzbevVar != null) {
                zzbevVar.zzuk();
                this.zzepd = null;
            }
            zzacz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzawd zzawdVar, int i) {
        if (!zzawdVar.zzwu() || i <= 0) {
            return;
        }
        zzawdVar.zzl(view);
        if (zzawdVar.zzwu()) {
            com.google.android.gms.ads.internal.util.zzm.zzecu.postDelayed(new zzbdl(this, view, zzawdVar, i), 100L);
        }
    }

    private final void zzacu() {
        if (this.zzepp == null) {
            return;
        }
        this.zzeoz.getView().removeOnAttachStateChangeListener(this.zzepp);
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzacv() {
        zzawd zzawdVar = this.zzepk;
        if (zzawdVar != null) {
            WebView webView = this.zzeoz.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza(webView, zzawdVar, 10);
                return;
            }
            zzacu();
            this.zzepp = new zzbdk(this, zzawdVar);
            this.zzeoz.getView().addOnAttachStateChangeListener(this.zzepp);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzacw() {
        synchronized (this.lock) {
            this.zzepi = true;
        }
        this.zzepn++;
        zzacz();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzacx() {
        this.zzepn--;
        zzacz();
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzacy() {
        zztu zztuVar = this.zzepa;
        if (zztuVar != null) {
            zztuVar.zza(zztw.zza.zzb.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzepm = true;
        zzacz();
        this.zzeoz.destroy();
    }

    private final void zzacz() {
        if (this.zzepc != null && ((this.zzepl && this.zzepn <= 0) || this.zzepm)) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqu)).booleanValue() && this.zzeoz.zzabe() != null) {
                zzabp.zza(this.zzeoz.zzabe().zzsk(), this.zzeoz.zzaaz(), "awfllc");
            }
            this.zzepc.zzai(!this.zzepm);
            this.zzepc = null;
        }
        this.zzeoz.zzads();
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzb zzbVar) {
        boolean zzadn = this.zzeoz.zzadn();
        zza(new AdOverlayInfoParcel(zzbVar, (!zzadn || this.zzeoz.zzadg().zzaem()) ? this.zzcgr : null, zzadn ? null : this.zzdra, this.zzdre, this.zzeoz.zzabf()));
    }

    public final void zza(com.google.android.gms.ads.internal.util.zzbf zzbfVar, zzcpy zzcpyVar, zzcju zzcjuVar, zzdro zzdroVar, String str, String str2, int i) {
        zzbdh zzbdhVar = this.zzeoz;
        zza(new AdOverlayInfoParcel(zzbdhVar, zzbdhVar.zzabf(), zzbfVar, zzcpyVar, zzcjuVar, zzdroVar, str, str2, i));
    }

    public final void zzb(boolean z, int i) {
        zzuz zzuzVar = (!this.zzeoz.zzadn() || this.zzeoz.zzadg().zzaem()) ? this.zzcgr : null;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzdra;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.zzdre;
        zzbdh zzbdhVar = this.zzeoz;
        zza(new AdOverlayInfoParcel(zzuzVar, zzpVar, zzuVar, zzbdhVar, z, i, zzbdhVar.zzabf()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzadn = this.zzeoz.zzadn();
        zzuz zzuzVar = (!zzadn || this.zzeoz.zzadg().zzaem()) ? this.zzcgr : null;
        zzbdm zzbdmVar = zzadn ? null : new zzbdm(this.zzeoz, this.zzdra);
        zzahc zzahcVar = this.zzdfv;
        zzahe zzaheVar = this.zzdfx;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.zzdre;
        zzbdh zzbdhVar = this.zzeoz;
        zza(new AdOverlayInfoParcel(zzuzVar, zzbdmVar, zzahcVar, zzaheVar, zzuVar, zzbdhVar, z, i, str, zzbdhVar.zzabf()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzadn = this.zzeoz.zzadn();
        zzuz zzuzVar = (!zzadn || this.zzeoz.zzadg().zzaem()) ? this.zzcgr : null;
        zzbdm zzbdmVar = zzadn ? null : new zzbdm(this.zzeoz, this.zzdra);
        zzahc zzahcVar = this.zzdfv;
        zzahe zzaheVar = this.zzdfx;
        com.google.android.gms.ads.internal.overlay.zzu zzuVar = this.zzdre;
        zzbdh zzbdhVar = this.zzeoz;
        zza(new AdOverlayInfoParcel(zzuzVar, zzbdmVar, zzahcVar, zzaheVar, zzuVar, zzbdhVar, z, i, str, str2, zzbdhVar.zzabf()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzapv zzapvVar = this.zzdgx;
        boolean zzvo = zzapvVar != null ? zzapvVar.zzvo() : false;
        com.google.android.gms.ads.internal.zzp.zzkp();
        com.google.android.gms.ads.internal.overlay.zzo.zza(this.zzeoz.getContext(), adOverlayInfoParcel, !zzvo);
        if (this.zzepk != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdqz != null) {
                str = adOverlayInfoParcel.zzdqz.url;
            }
            this.zzepk.zzdv(str);
        }
    }

    public final void zza(String str, zzahv<? super zzbdh> zzahvVar) {
        synchronized (this.lock) {
            List<zzahv<? super zzbdh>> list = this.zzepb.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.zzepb.put(str, list);
            }
            list.add(zzahvVar);
        }
    }

    public final void zzb(String str, zzahv<? super zzbdh> zzahvVar) {
        synchronized (this.lock) {
            List<zzahv<? super zzbdh>> list = this.zzepb.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzahvVar);
        }
    }

    public final void zza(String str, Predicate<zzahv<? super zzbdh>> predicate) {
        synchronized (this.lock) {
            List<zzahv<? super zzbdh>> list = this.zzepb.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzahv<? super zzbdh> zzahvVar : list) {
                if (predicate.apply(zzahvVar)) {
                    arrayList.add(zzahvVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void reset() {
        zzawd zzawdVar = this.zzepk;
        if (zzawdVar != null) {
            zzawdVar.zzww();
            this.zzepk = null;
        }
        zzacu();
        synchronized (this.lock) {
            this.zzepb.clear();
            this.zzcgr = null;
            this.zzdra = null;
            this.zzepc = null;
            this.zzepd = null;
            this.zzdfv = null;
            this.zzdfx = null;
            this.zzepf = false;
            this.zzbrg = false;
            this.zzepg = false;
            this.zzepi = false;
            this.zzdre = null;
            this.zzepe = null;
            if (this.zzdgx != null) {
                this.zzdgx.zzac(true);
                this.zzdgx = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zza(zzbes zzbesVar) {
        this.zzepc = zzbesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zza(zzbev zzbevVar) {
        this.zzepd = zzbevVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzepf && webView == this.zzeoz.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzuz zzuzVar = this.zzcgr;
                    if (zzuzVar != null) {
                        zzuzVar.onAdClicked();
                        zzawd zzawdVar = this.zzepk;
                        if (zzawdVar != null) {
                            zzawdVar.zzdv(str);
                        }
                        this.zzcgr = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzeoz.getWebView().willNotDraw()) {
                try {
                    zzef zzadl = this.zzeoz.zzadl();
                    if (zzadl != null && zzadl.zzb(parse)) {
                        parse = zzadl.zza(parse, this.zzeoz.getContext(), this.zzeoz.getView(), this.zzeoz.zzaba());
                    }
                } catch (zzei unused) {
                    String valueOf2 = String.valueOf(str);
                    com.google.android.gms.ads.internal.util.zzd.zzex(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zza zzaVar = this.zzdgt;
                if (zzaVar == null || zzaVar.zzjy()) {
                    zza(new com.google.android.gms.ads.internal.overlay.zzb("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.zzdgt.zzbk(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                com.google.android.gms.ads.internal.util.zzd.zzex(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map<String, String> map) {
        zztc zza;
        try {
            String zzc = zzawy.zzc(str, this.zzeoz.getContext(), this.zzdve);
            if (!zzc.equals(str)) {
                return zzd(zzc, map);
            }
            zztd zzbs = zztd.zzbs(str);
            if (zzbs != null && (zza = com.google.android.gms.ads.internal.zzp.zzkw().zza(zzbs)) != null && zza.zzmv()) {
                return new WebResourceResponse("", "", zza.zzmw());
            }
            if (zzayg.isEnabled() && zzacz.zzdch.get().booleanValue()) {
                return zzd(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(e, "AdWebViewClient.interceptRequest");
            return zzada();
        }
    }

    private static WebResourceResponse zzada() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcog)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzd(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    if (!(openConnection instanceof HttpURLConnection)) {
                        throw new IOException("Invalid protocol.");
                    }
                    httpURLConnection = (HttpURLConnection) openConnection;
                    com.google.android.gms.ads.internal.zzp.zzkq().zza(this.zzeoz.getContext(), this.zzeoz.zzabf().zzbrf, false, httpURLConnection, false, 60000);
                    zzayg zzaygVar = new zzayg();
                    zzaygVar.zza(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzaygVar.zza(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        return null;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        com.google.android.gms.ads.internal.util.zzd.zzex("Protocol is null");
                        return zzada();
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        String valueOf = String.valueOf(protocol);
                        com.google.android.gms.ads.internal.util.zzd.zzex(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
                        return zzada();
                    }
                    String valueOf2 = String.valueOf(headerField);
                    com.google.android.gms.ads.internal.util.zzd.zzdy(valueOf2.length() != 0 ? "Redirecting to ".concat(valueOf2) : new String("Redirecting to "));
                    httpURLConnection.disconnect();
                    url = url2;
                } else {
                    TrafficStats.clearThreadStatsTag();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Too many redirects (20)");
                    throw new IOException(sb.toString());
                }
            }
            com.google.android.gms.ads.internal.zzp.zzkq();
            return com.google.android.gms.ads.internal.util.zzm.zzd(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void zzav(boolean z) {
        this.zzepf = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzvv() {
        synchronized (this.lock) {
            this.zzepf = false;
            this.zzbrg = true;
            zzayv.zzegm.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdj
                private final zzbdg zzepq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzepq = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbdg zzbdgVar = this.zzepq;
                    zzbdgVar.zzeoz.zzadr();
                    com.google.android.gms.ads.internal.overlay.zze zzade = zzbdgVar.zzeoz.zzade();
                    if (zzade != null) {
                        zzade.zzvv();
                    }
                }
            });
        }
    }

    public final void zzax(boolean z) {
        this.zzdve = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzi(int i, int i2) {
        zzapv zzapvVar = this.zzdgx;
        if (zzapvVar != null) {
            zzapvVar.zzi(i, i2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzj(Uri uri) {
        final String path = uri.getPath();
        List<zzahv<? super zzbdh>> list = this.zzepb.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcvu)).booleanValue() && this.zzepo.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) zzwo.zzqq().zzd(zzabh.zzcvw)).intValue()) {
                    String valueOf = String.valueOf(path);
                    com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(valueOf) : new String("Parsing gmsg query params on BG thread: "));
                    zzdyz.zza(com.google.android.gms.ads.internal.zzp.zzkq().zzh(uri), new zzbdn(this, list, path, uri), zzayv.zzegm);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzp.zzkq();
            zza(com.google.android.gms.ads.internal.util.zzm.zzg(uri), list, path);
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf2);
        com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcya)).booleanValue() || com.google.android.gms.ads.internal.zzp.zzku().zzxk() == null) {
            return;
        }
        zzayv.zzegi.execute(new Runnable(path) { // from class: com.google.android.gms.internal.ads.zzbdi
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = path;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzp.zzku().zzxk().zzcr(this.zzdjy.substring(1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Map<String, String> map, List<zzahv<? super zzbdh>> list, String str) {
        if (com.google.android.gms.ads.internal.util.zzd.zzye()) {
            String valueOf = String.valueOf(str);
            com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zzd.zzeb(sb.toString());
            }
        }
        Iterator<zzahv<? super zzbdh>> it = list.iterator();
        while (it.hasNext()) {
            it.next().zza(this.zzeoz, map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzay(boolean z) {
        synchronized (this.lock) {
            this.zzepg = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbet
    public final void zzaz(boolean z) {
        synchronized (this.lock) {
            this.zzeph = z;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzeoz.zzc(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
