package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaas {
    private final Context context;

    public zzaas(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.context = context;
    }

    public final boolean zzrw() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return zza(intent);
    }

    public final boolean zzrx() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return zza(intent);
    }

    public final boolean zzry() {
        return ((Boolean) com.google.android.gms.ads.internal.util.zzbu.zza(this.context, new zzaar())).booleanValue() && Wrappers.packageManager(this.context).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean zzrz() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    private final boolean zza(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
