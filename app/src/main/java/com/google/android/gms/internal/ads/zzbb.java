package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbb {
    private final int zzco;
    private final List<zzu> zzcp;
    private final int zzcq;
    private final InputStream zzcr;

    public zzbb(int i, List<zzu> list) {
        this(i, list, -1, null);
    }

    public zzbb(int i, List<zzu> list, int i2, InputStream inputStream) {
        this.zzco = i;
        this.zzcp = list;
        this.zzcq = i2;
        this.zzcr = inputStream;
    }

    public final int getStatusCode() {
        return this.zzco;
    }

    public final List<zzu> zzq() {
        return Collections.unmodifiableList(this.zzcp);
    }

    public final int getContentLength() {
        return this.zzcq;
    }

    public final InputStream getContent() {
        return this.zzcr;
    }
}
