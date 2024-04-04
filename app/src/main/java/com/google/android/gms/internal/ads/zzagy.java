package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzagy implements Runnable {
    private final /* synthetic */ PublisherAdView zzdfs;
    private final /* synthetic */ zzxg zzdft;
    private final /* synthetic */ zzagv zzdfu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagy(zzagv zzagvVar, PublisherAdView publisherAdView, zzxg zzxgVar) {
        this.zzdfu = zzagvVar;
        this.zzdfs = publisherAdView;
        this.zzdft = zzxgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (!this.zzdfs.zza(this.zzdft)) {
            zzaym.zzex("Could not bind.");
        } else {
            onPublisherAdViewLoadedListener = this.zzdfu.zzdfp;
            onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.zzdfs);
        }
    }
}
