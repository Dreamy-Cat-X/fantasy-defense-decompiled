package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdvz {
    private final int limit;
    private final zzdvj zzhuj;
    private final boolean zzhuk;
    private final zzdwg zzhul;

    private zzdvz(zzdwg zzdwgVar) {
        this(zzdwgVar, false, zzdvn.zzhud, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    private zzdvz(zzdwg zzdwgVar, boolean z, zzdvj zzdvjVar, int i) {
        this.zzhul = zzdwgVar;
        this.zzhuk = false;
        this.zzhuj = zzdvjVar;
        this.limit = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static zzdvz zza(zzdvj zzdvjVar) {
        zzdwa.checkNotNull(zzdvjVar);
        return new zzdvz(new zzdwc(zzdvjVar));
    }

    public final Iterable<String> zza(CharSequence charSequence) {
        zzdwa.checkNotNull(charSequence);
        return new zzdwe(this, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> zzb(CharSequence charSequence) {
        return this.zzhul.zzb(this, charSequence);
    }

    public final List<String> zzc(CharSequence charSequence) {
        zzdwa.checkNotNull(charSequence);
        Iterator<String> zzb = zzb(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzb.hasNext()) {
            arrayList.add(zzb.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
