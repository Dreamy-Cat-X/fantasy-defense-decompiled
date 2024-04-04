package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzatp extends ContextWrapper {
    private Context zzdxj;
    private WeakReference<Activity> zzdxk;

    private zzatp(Context context) {
        super(context);
        this.zzdxk = new WeakReference<>(null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized void setAppPackageName(String str) throws PackageManager.NameNotFoundException {
        this.zzdxj = super.createPackageContext(str, 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.zzdxj != null) {
            return this.zzdxj.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        if (this.zzdxj != null) {
            return this.zzdxj.getPackageName();
        }
        return super.getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        if (this.zzdxj != null) {
            return this.zzdxj.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        zzf(zze(intent));
    }

    private final synchronized Intent zze(Intent intent) {
        if (this.zzdxj != null && intent.getComponent() != null && intent.getComponent().getPackageName().equals(this.zzdxj.getPackageName())) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
            return intent2;
        }
        return intent;
    }

    private final synchronized void zzf(Intent intent) {
        Activity activity = this.zzdxk.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        try {
            Intent intent2 = (Intent) intent.clone();
            intent2.setFlags(intent.getFlags() & (-268435457));
            activity.startActivity(intent2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzku().zza(th, "");
            intent.addFlags(268435456);
            super.startActivity(intent);
        }
    }

    public static zzatp zzx(Context context) {
        return new zzatp(zzl(context));
    }

    public static Context zzy(Context context) {
        if (context instanceof zzatp) {
            return ((zzatp) context).getBaseContext();
        }
        return zzl(context);
    }

    private static Context zzl(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
