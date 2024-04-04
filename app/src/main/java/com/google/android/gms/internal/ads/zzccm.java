package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzccm {
    private final zzcbq zzgbo;
    private final zzcfp zzgel;
    private final zzcgx zzger;
    private final zzbjo zzges;

    public zzccm(zzcgx zzcgxVar, zzcfp zzcfpVar, zzbjo zzbjoVar, zzcbq zzcbqVar) {
        this.zzger = zzcgxVar;
        this.zzgel = zzcfpVar;
        this.zzges = zzbjoVar;
        this.zzgbo = zzcbqVar;
    }

    public final View zzapd() throws zzbdt {
        zzbdh zza = this.zzger.zza(zzvp.zzqd(), null, null);
        zza.getView().setVisibility(8);
        zza.zza("/sendMessageToSdk", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzccp
            private final zzccm zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzget.zzd((zzbdh) obj, map);
            }
        });
        zza.zza("/adMuted", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzcco
            private final zzccm zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzget.zzc((zzbdh) obj, map);
            }
        });
        this.zzgel.zza(new WeakReference(zza), "/loadHtml", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzccr
            private final zzccm zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, final Map map) {
                final zzccm zzccmVar = this.zzget;
                zzbdh zzbdhVar = (zzbdh) obj;
                zzbdhVar.zzadi().zza(new zzbes(zzccmVar, map) { // from class: com.google.android.gms.internal.ads.zzccs
                    private final Map zzega;
                    private final zzccm zzget;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzget = zzccmVar;
                        this.zzega = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbes
                    public final void zzai(boolean z) {
                        this.zzget.zza(this.zzega, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzbdhVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzbdhVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzgel.zza(new WeakReference(zza), "/showOverlay", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzccq
            private final zzccm zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzget.zzb((zzbdh) obj, map);
            }
        });
        this.zzgel.zza(new WeakReference(zza), "/hideOverlay", new zzahv(this) { // from class: com.google.android.gms.internal.ads.zzcct
            private final zzccm zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahv
            public final void zza(Object obj, Map map) {
                this.zzget.zza((zzbdh) obj, map);
            }
        });
        return zza.getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        com.google.android.gms.ads.internal.util.zzd.zzew("Hiding native ads overlay.");
        zzbdhVar.getView().setVisibility(8);
        this.zzges.zzbe(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbdh zzbdhVar, Map map) {
        com.google.android.gms.ads.internal.util.zzd.zzew("Showing native ads overlay.");
        zzbdhVar.getView().setVisibility(0);
        this.zzges.zzbe(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzgel.zza("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbdh zzbdhVar, Map map) {
        this.zzgbo.zzani();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbdh zzbdhVar, Map map) {
        this.zzgel.zza("sendMessageToNativeJs", (Map<String, ?>) map);
    }
}
