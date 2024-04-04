package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzvz {
    private final zzvg zzcih;
    private final zzvh zzcii;
    private final zzzr zzcij;
    private final zzagn zzcik;
    private final zzauc zzcil;
    private final zzavg zzcim;
    private final zzaqt zzcin;
    private final zzagq zzcio;

    public zzvz(zzvg zzvgVar, zzvh zzvhVar, zzzr zzzrVar, zzagn zzagnVar, zzauc zzaucVar, zzavg zzavgVar, zzaqt zzaqtVar, zzagq zzagqVar) {
        this.zzcih = zzvgVar;
        this.zzcii = zzvhVar;
        this.zzcij = zzzrVar;
        this.zzcik = zzagnVar;
        this.zzcil = zzaucVar;
        this.zzcim = zzavgVar;
        this.zzcin = zzaqtVar;
        this.zzcio = zzagqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzwo.zzqm().zza(context, zzwo.zzqs().zzbrf, "gmob-apps", bundle, true);
    }

    public final zzxg zza(Context context, zzvp zzvpVar, String str, zzamt zzamtVar) {
        return new zzwh(this, context, zzvpVar, str, zzamtVar).zzd(context, false);
    }

    public final zzxd zzb(Context context, String str, zzamt zzamtVar) {
        return new zzwi(this, context, str, zzamtVar).zzd(context, false);
    }

    public final zzaen zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return new zzwk(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzaeu zza(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        return new zzwn(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzauq zzc(Context context, String str, zzamt zzamtVar) {
        return new zzwb(this, context, str, zzamtVar).zzd(context, false);
    }

    public final zzaqs zzb(Activity activity) {
        zzwa zzwaVar = new zzwa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzaym.zzev("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return zzwaVar.zzd(activity, z);
    }

    public final zzaxc zza(Context context, zzamt zzamtVar) {
        return new zzwd(this, context, zzamtVar).zzd(context, false);
    }

    public final zzaqh zzb(Context context, zzamt zzamtVar) {
        return new zzwf(this, context, zzamtVar).zzd(context, false);
    }
}
