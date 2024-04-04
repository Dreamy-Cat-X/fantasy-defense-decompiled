package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzczt implements zzdeu<zzczu> {
    private final Context context;
    private final zzdmx zzfve;
    private final zzdzk zzgyp;
    private final View zzgyq;

    public zzczt(zzdzk zzdzkVar, Context context, zzdmx zzdmxVar, ViewGroup viewGroup) {
        this.zzgyp = zzdzkVar;
        this.context = context;
        this.zzfve = zzdmxVar;
        this.zzgyq = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzczu> zzata() {
        return this.zzgyp.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzczw
            private final zzczt zzgyt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgyt = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgyt.zzatb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzczu zzatb() throws Exception {
        Context context = this.context;
        zzvp zzvpVar = this.zzfve.zzbpe;
        ArrayList arrayList = new ArrayList();
        View view = this.zzgyq;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzczu(context, zzvpVar, arrayList);
    }
}
