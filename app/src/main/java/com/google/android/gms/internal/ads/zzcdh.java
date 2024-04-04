package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzcdh implements zzcbq {
    private final Context context;
    private final zzayt zzbpd;
    private final zzdmi zzeqz;
    private final zzdmx zzfve;
    private final zzbri zzgap;
    private final zzbqq zzgaq;
    private final zzang zzgfj;
    private final zzanh zzgfk;
    private final zzanm zzgfl;
    private boolean zzgau = false;
    private boolean zzgax = false;
    private boolean zzgfm = true;

    public zzcdh(zzang zzangVar, zzanh zzanhVar, zzanm zzanmVar, zzbri zzbriVar, zzbqq zzbqqVar, Context context, zzdmi zzdmiVar, zzayt zzaytVar, zzdmx zzdmxVar) {
        this.zzgfj = zzangVar;
        this.zzgfk = zzanhVar;
        this.zzgfl = zzanmVar;
        this.zzgap = zzbriVar;
        this.zzgaq = zzbqqVar;
        this.context = context;
        this.zzeqz = zzdmiVar;
        this.zzbpd = zzaytVar;
        this.zzfve = zzdmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void cancelUnconfirmedClick() {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void setClickConfirmingView(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final JSONObject zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(zzagi zzagiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzanh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzanj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzf(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzfw(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzg(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final boolean zzh(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            this.zzgfm = zzb(map, map2);
            HashMap<String, View> zzb = zzb(map);
            HashMap<String, View> zzb2 = zzb(map2);
            if (this.zzgfl != null) {
                this.zzgfl.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                return;
            }
            if (this.zzgfj != null) {
                this.zzgfj.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzgfj.zzv(wrap);
            } else if (this.zzgfk != null) {
                this.zzgfk.zzc(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzgfk.zzv(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to call trackView", e);
        }
    }

    private static HashMap<String, View> zzb(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            if (this.zzgfl != null) {
                this.zzgfl.zzw(wrap);
            } else if (this.zzgfj != null) {
                this.zzgfj.zzw(wrap);
            } else if (this.zzgfk != null) {
                this.zzgfk.zzw(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzgax && this.zzeqz.zzdlv) {
            return;
        }
        zzad(view);
    }

    private final void zzad(View view) {
        try {
            if (this.zzgfl != null && !this.zzgfl.getOverrideClickHandling()) {
                this.zzgfl.zzu(ObjectWrapper.wrap(view));
                this.zzgaq.onAdClicked();
            } else if (this.zzgfj != null && !this.zzgfj.getOverrideClickHandling()) {
                this.zzgfj.zzu(ObjectWrapper.wrap(view));
                this.zzgaq.onAdClicked();
            } else {
                if (this.zzgfk == null || this.zzgfk.getOverrideClickHandling()) {
                    return;
                }
                this.zzgfk.zzu(ObjectWrapper.wrap(view));
                this.zzgaq.onAdClicked();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzgax) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzeqz.zzdlv) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzad(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zztw() {
        this.zzgax = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final boolean isCustomClickGestureEnabled() {
        return this.zzeqz.zzdlv;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzb(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.zzgau && this.zzeqz.zzhhy != null) {
                this.zzgau |= com.google.android.gms.ads.internal.zzp.zzla().zzb(this.context, this.zzbpd.zzbrf, this.zzeqz.zzhhy.toString(), this.zzfve.zzhje);
            }
            if (this.zzgfm) {
                if (this.zzgfl != null && !this.zzgfl.getOverrideImpressionRecording()) {
                    this.zzgfl.recordImpression();
                    this.zzgap.onAdImpression();
                } else if (this.zzgfj != null && !this.zzgfj.getOverrideImpressionRecording()) {
                    this.zzgfj.recordImpression();
                    this.zzgap.onAdImpression();
                } else {
                    if (this.zzgfk == null || this.zzgfk.getOverrideImpressionRecording()) {
                        return;
                    }
                    this.zzgfk.recordImpression();
                    this.zzgap.onAdImpression();
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzd("Failed to call recordImpression", e);
        }
    }

    private final boolean zzb(Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        Object obj;
        JSONObject jSONObject = this.zzeqz.zzhin;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqn)).booleanValue() && jSONObject.length() != 0) {
            if (map == null) {
                map = new HashMap<>();
            }
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.putAll(map2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    WeakReference weakReference = (WeakReference) hashMap.get(next);
                    if (weakReference == null || (obj = weakReference.get()) == null) {
                        return false;
                    }
                    Class<?> cls = obj.getClass();
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqo)).booleanValue() && next.equals(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO)) {
                        Object zzape = zzape();
                        if (zzape == null) {
                            return false;
                        }
                        cls = zzape.getClass();
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        com.google.android.gms.ads.internal.util.zzbk.zza(optJSONArray, arrayList);
                        com.google.android.gms.ads.internal.zzp.zzkq();
                        if (!com.google.android.gms.ads.internal.util.zzm.zza(this.context.getClassLoader(), cls, arrayList)) {
                            return false;
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return true;
    }

    private final Object zzape() {
        IObjectWrapper zzvg;
        zzanm zzanmVar = this.zzgfl;
        if (zzanmVar != null) {
            try {
                zzvg = zzanmVar.zzvg();
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            zzang zzangVar = this.zzgfj;
            if (zzangVar != null) {
                try {
                    zzvg = zzangVar.zzvg();
                } catch (RemoteException unused2) {
                    return null;
                }
            } else {
                zzanh zzanhVar = this.zzgfk;
                if (zzanhVar != null) {
                    try {
                        zzvg = zzanhVar.zzvg();
                    } catch (RemoteException unused3) {
                        return null;
                    }
                } else {
                    zzvg = null;
                }
            }
        }
        if (zzvg != null) {
            try {
                return ObjectWrapper.unwrap(zzvg);
            } catch (IllegalArgumentException unused4) {
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(zzyj zzyjVar) {
        com.google.android.gms.ads.internal.util.zzd.zzex("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zza(zzyf zzyfVar) {
        com.google.android.gms.ads.internal.util.zzd.zzex("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzani() {
        com.google.android.gms.ads.internal.util.zzd.zzex("Mute This Ad is not supported for 3rd party ads");
    }
}
