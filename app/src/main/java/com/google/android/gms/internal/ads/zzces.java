package com.google.android.gms.internal.ads;

import com.kt.olleh.inapp.net.InAppError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzces {
    private final Executor zzfqs;
    private final zzbxe zzgat;
    private final zzbjo zzggt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzces(Executor executor, zzbjo zzbjoVar, zzbxe zzbxeVar) {
        this.zzfqs = executor;
        this.zzgat = zzbxeVar;
        this.zzggt = zzbjoVar;
    }

    public final void zzi(final zzbdh zzbdhVar) {
        if (zzbdhVar == null) {
            return;
        }
        this.zzgat.zzv(zzbdhVar.getView());
        this.zzgat.zza(new zzqv(zzbdhVar) { // from class: com.google.android.gms.internal.ads.zzcev
            private final zzbdh zzesn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzesn = zzbdhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzqv
            public final void zza(zzqw zzqwVar) {
                this.zzesn.zzadi().zza(zzqwVar.zzbrn.left, zzqwVar.zzbrn.top, false);
            }
        }, this.zzfqs);
        this.zzgat.zza(new zzqv(zzbdhVar) { // from class: com.google.android.gms.internal.ads.zzceu
            private final zzbdh zzesn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzesn = zzbdhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzqv
            public final void zza(zzqw zzqwVar) {
                zzbdh zzbdhVar2 = this.zzesn;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", zzqwVar.zzbqz ? InAppError.FAILED : InAppError.SUCCESS);
                zzbdhVar2.zza("onAdVisibilityChanged", hashMap);
            }
        }, this.zzfqs);
        this.zzgat.zza(this.zzggt, this.zzfqs);
        this.zzggt.zzd(zzbdhVar);
        zzbdhVar.zza("/trackActiveViewUnit", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzcex
            private final zzces zzggu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzggu.zzg((zzbdh) obj, map);
            }
        });
        zzbdhVar.zza("/untrackActiveViewUnit", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzcew
            private final zzces zzggu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzggu.zzf((zzbdh) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzbdh zzbdhVar, Map map) {
        this.zzggt.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzbdh zzbdhVar, Map map) {
        this.zzggt.enable();
    }
}
