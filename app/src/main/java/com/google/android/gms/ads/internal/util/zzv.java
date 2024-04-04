package com.google.android.gms.ads.internal.util;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzv extends zzu {
    public zzv() {
        super();
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final boolean zza(Context context, WebSettings webSettings) {
        super.zza(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final String getDefaultUserAgent(Context context) {
        String str;
        zzbt zzzp = zzbt.zzzp();
        if (TextUtils.isEmpty(zzzp.zzefc)) {
            if (ClientLibraryUtils.isPackageSide()) {
                str = (String) zzbu.zza(context, new zzbw(zzzp, context));
            } else {
                str = (String) zzbu.zza(context, new zzbv(zzzp, GooglePlayServicesUtilLight.getRemoteContext(context), context));
            }
            zzzp.zzefc = str;
        }
        return zzzp.zzefc;
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final void zzbf(Context context) {
        zzbt zzzp = zzbt.zzzp();
        zzd.zzeb("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(zzzp.zzefc)) {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (ClientLibraryUtils.isPackageSide() || remoteContext == null) {
                SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, putString, "admob_user_agent");
                }
            }
            zzzp.zzefc = defaultUserAgent;
        }
        zzd.zzeb("User agent is updated.");
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final int zza(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final int zzb(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }
}
