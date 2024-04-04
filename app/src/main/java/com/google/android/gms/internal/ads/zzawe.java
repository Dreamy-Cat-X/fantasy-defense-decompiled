package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzawe implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static zzawe zzdyy;
    private final SharedPreferences zzdyz;
    private final com.google.android.gms.ads.internal.util.zzf zzdza;
    private String zzdzb = "";

    public static synchronized zzawe zza(Context context, com.google.android.gms.ads.internal.util.zzf zzfVar) {
        zzawe zzaweVar;
        synchronized (zzawe.class) {
            if (zzdyy == null) {
                zzdyy = new zzawe(context, zzfVar);
            }
            zzaweVar = zzdyy;
        }
        return zzaweVar;
    }

    private zzawe(Context context, com.google.android.gms.ads.internal.util.zzf zzfVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzdyz = defaultSharedPreferences;
        this.zzdza = zzfVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzdyz, "IABTCF_PurposeConsents");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "");
            if (string.isEmpty() || this.zzdzb.equals(string)) {
                return;
            }
            this.zzdzb = string;
            boolean z = string.charAt(0) != '1';
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcoa)).booleanValue()) {
                this.zzdza.zzaq(z);
            }
            ((Boolean) zzwo.zzqq().zzd(zzabh.zzcnz)).booleanValue();
        }
    }
}
