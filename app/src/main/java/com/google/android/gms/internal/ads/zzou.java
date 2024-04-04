package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzou extends IOException {
    private final int type;
    private final zzor zzbiv;

    public zzou(String str, zzor zzorVar, int i) {
        super(str);
        this.zzbiv = zzorVar;
        this.type = 1;
    }

    public zzou(IOException iOException, zzor zzorVar, int i) {
        super(iOException);
        this.zzbiv = zzorVar;
        this.type = i;
    }

    public zzou(String str, IOException iOException, zzor zzorVar, int i) {
        super(str, iOException);
        this.zzbiv = zzorVar;
        this.type = 1;
    }
}
