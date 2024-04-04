package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapz implements DialogInterface.OnClickListener {
    private final /* synthetic */ String zzdop;
    private final /* synthetic */ String zzdoq;
    private final /* synthetic */ zzaqa zzdor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapz(zzaqa zzaqaVar, String str, String str2) {
        this.zzdor = zzaqaVar;
        this.zzdop = str;
        this.zzdoq = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.zzdor.context;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.zzdop;
            String str2 = this.zzdoq;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzp.zzkq();
            com.google.android.gms.ads.internal.util.zzm.zza(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzdor.zzds("Could not store picture.");
        }
    }
}
