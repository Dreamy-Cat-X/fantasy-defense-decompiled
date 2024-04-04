package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczu implements zzder<Bundle> {
    private final Context context;
    private final zzvp zzbpe;
    private final List<Parcelable> zzgyr;

    public zzczu(Context context, zzvp zzvpVar, List<Parcelable> list) {
        this.context = context;
        this.zzbpe = zzvpVar;
        this.zzgyr = list;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final /* synthetic */ void zzr(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (zzadg.zzddg.get().booleanValue()) {
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.zzp.zzkq();
            bundle3.putString("activity", com.google.android.gms.ads.internal.util.zzm.zzaq(this.context));
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.zzbpe.width);
            bundle4.putInt("height", this.zzbpe.height);
            bundle3.putBundle("size", bundle4);
            if (this.zzgyr.size() > 0) {
                List<Parcelable> list = this.zzgyr;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
