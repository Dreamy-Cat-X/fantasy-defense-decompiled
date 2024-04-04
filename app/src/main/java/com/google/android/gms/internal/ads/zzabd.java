package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzabd implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzcln;
    private final Object lock = new Object();
    private final ConditionVariable zzcll = new ConditionVariable();
    private volatile boolean zzze = false;
    private volatile boolean zzckk = false;
    private SharedPreferences zzclm = null;
    private Bundle metaData = new Bundle();
    private JSONObject zzclo = new JSONObject();

    public final void initialize(Context context) {
        if (this.zzze) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzze) {
                return;
            }
            if (!this.zzckk) {
                this.zzckk = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzcln = applicationContext;
            try {
                this.metaData = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzcln.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext == null && context != null) {
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 != null) {
                        context = applicationContext2;
                    }
                    remoteContext = context;
                }
                if (remoteContext == null) {
                    return;
                }
                zzwo.zzqo();
                SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
                this.zzclm = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
                zzads.zza(new zzabi(this));
                zzsd();
                this.zzze = true;
            } finally {
                this.zzckk = false;
                this.zzcll.open();
            }
        }
    }

    public final <T> T zzd(final zzaaw<T> zzaawVar) {
        if (!this.zzcll.block(5000L)) {
            synchronized (this.lock) {
                if (!this.zzckk) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzze || this.zzclm == null) {
            synchronized (this.lock) {
                if (this.zzze && this.zzclm != null) {
                }
                return zzaawVar.zzsa();
            }
        }
        if (zzaawVar.getSource() == 2) {
            Bundle bundle = this.metaData;
            if (bundle == null) {
                return zzaawVar.zzsa();
            }
            return zzaawVar.zza(bundle);
        }
        if (zzaawVar.getSource() == 1 && this.zzclo.has(zzaawVar.getKey())) {
            return zzaawVar.zzb(this.zzclo);
        }
        return (T) com.google.android.gms.ads.internal.util.zzbu.zza(new zzdwh(this, zzaawVar) { // from class: com.google.android.gms.internal.ads.zzabg
            private final zzabd zzclp;
            private final zzaaw zzclq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzclp = this;
                this.zzclq = zzaawVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdwh
            public final Object get() {
                return this.zzclp.zze(this.zzclq);
            }
        });
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzsd();
        }
    }

    private final void zzsd() {
        if (this.zzclm == null) {
            return;
        }
        try {
            this.zzclo = new JSONObject((String) com.google.android.gms.ads.internal.util.zzbu.zza(new zzdwh(this) { // from class: com.google.android.gms.internal.ads.zzabf
                private final zzabd zzclp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzclp = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdwh
                public final Object get() {
                    return this.zzclp.zzse();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzse() {
        return this.zzclm.getString("flag_configuration", "{}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zze(zzaaw zzaawVar) {
        return zzaawVar.zza(this.zzclm);
    }
}
