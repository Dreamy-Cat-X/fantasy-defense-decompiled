package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcgb<T> implements zzahv<Object> {
    private final WeakReference<T> zzghq;
    private final String zzghr;
    private final zzahv<T> zzghs;
    private final /* synthetic */ zzcfp zzght;

    private zzcgb(zzcfp zzcfpVar, WeakReference<T> weakReference, String str, zzahv<T> zzahvVar) {
        this.zzght = zzcfpVar;
        this.zzghq = weakReference;
        this.zzghr = str;
        this.zzghs = zzahvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        T t = this.zzghq.get();
        if (t == null) {
            this.zzght.zzb(this.zzghr, this);
        } else {
            this.zzghs.zza(t, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcgb(zzcfp zzcfpVar, WeakReference weakReference, String str, zzahv zzahvVar, zzcfq zzcfqVar) {
        this(zzcfpVar, weakReference, str, zzahvVar);
    }
}
