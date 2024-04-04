package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzmg;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzmn implements zzmg.zza {
    public final String id;

    public zzmn(String str) {
        this.id = (String) zzpf.checkNotNull(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
