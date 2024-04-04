package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzadv extends zzaem {
    private final int height;
    private final Uri uri;
    private final int width;
    private final Drawable zzder;
    private final double zzdes;

    public zzadv(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.zzder = drawable;
        this.uri = uri;
        this.zzdes = d;
        this.width = i;
        this.height = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final IObjectWrapper zztg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzder);
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final Uri getUri() throws RemoteException {
        return this.uri;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final double getScale() {
        return this.zzdes;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int getWidth() {
        return this.width;
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int getHeight() {
        return this.height;
    }
}
