package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbxe extends zzbvk<zzqv> implements zzqv {
    private final Context context;
    private final zzdmi zzeqz;
    private Map<View, zzqr> zzfzg;

    public zzbxe(Context context, Set<zzbxf<zzqv>> set, zzdmi zzdmiVar) {
        super(set);
        this.zzfzg = new WeakHashMap(1);
        this.context = context;
        this.zzeqz = zzdmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final synchronized void zza(final zzqw zzqwVar) {
        zza(new zzbvm(zzqwVar) { // from class: com.google.android.gms.internal.ads.zzbxh
            private final zzqw zzfzi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzi = zzqwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbvm
            public final void zzo(Object obj) {
                ((zzqv) obj).zza(this.zzfzi);
            }
        });
    }

    public final synchronized void zzv(View view) {
        zzqr zzqrVar = this.zzfzg.get(view);
        if (zzqrVar == null) {
            zzqrVar = new zzqr(this.context, view);
            zzqrVar.zza(this);
            this.zzfzg.put(view, zzqrVar);
        }
        if (this.zzeqz != null && this.zzeqz.zzdvf) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqb)).booleanValue()) {
                zzqrVar.zzen(((Long) zzwo.zzqq().zzd(zzabh.zzcqa)).longValue());
                return;
            }
        }
        zzqrVar.zzls();
    }

    public final synchronized void zzw(View view) {
        if (this.zzfzg.containsKey(view)) {
            this.zzfzg.get(view).zzb(this);
            this.zzfzg.remove(view);
        }
    }
}
