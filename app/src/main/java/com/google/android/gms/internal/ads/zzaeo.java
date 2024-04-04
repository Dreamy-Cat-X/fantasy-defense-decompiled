package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaeo extends NativeAd.Image {
    private final int height;
    private final Uri uri;
    private final int width;
    private final double zzdes;
    private final zzaej zzdex;
    private final Drawable zzdey;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        com.google.android.gms.internal.ads.zzaym.zzc("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        com.google.android.gms.internal.ads.zzaym.zzc("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0033, code lost:
    
        com.google.android.gms.internal.ads.zzaym.zzc("", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0023, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0024, code lost:
    
        com.google.android.gms.internal.ads.zzaym.zzc("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaeo(zzaej zzaejVar) {
        Drawable drawable;
        IObjectWrapper zztg;
        this.zzdex = zzaejVar;
        Uri uri = null;
        try {
            zztg = zzaejVar.zztg();
        } catch (RemoteException e) {
            zzaym.zzc("", e);
        }
        if (zztg != null) {
            drawable = (Drawable) ObjectWrapper.unwrap(zztg);
            this.zzdey = drawable;
            uri = this.zzdex.getUri();
            this.uri = uri;
            double d = 1.0d;
            d = this.zzdex.getScale();
            this.zzdes = d;
            int i = -1;
            int i2 = this.zzdex.getWidth();
            this.width = i2;
            i = this.zzdex.getHeight();
            this.height = i;
        }
        drawable = null;
        this.zzdey = drawable;
        uri = this.zzdex.getUri();
        this.uri = uri;
        double d2 = 1.0d;
        d2 = this.zzdex.getScale();
        this.zzdes = d2;
        int i3 = -1;
        int i22 = this.zzdex.getWidth();
        this.width = i22;
        i3 = this.zzdex.getHeight();
        this.height = i3;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzdey;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzdes;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int getWidth() {
        return this.width;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int getHeight() {
        return this.height;
    }
}
