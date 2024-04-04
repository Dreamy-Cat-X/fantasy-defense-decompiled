package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbex extends MutableContextWrapper {
    private Context zzaaf;
    private Activity zzefi;
    private Context zzest;

    public zzbex(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        this.zzaaf = context.getApplicationContext();
        this.zzefi = context instanceof Activity ? (Activity) context : null;
        this.zzest = context;
        super.setBaseContext(this.zzaaf);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.zzefi;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.zzaaf.startActivity(intent);
        }
    }

    public final Activity zzaba() {
        return this.zzefi;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.zzest.getSystemService(str);
    }

    public final Context zzadd() {
        return this.zzest;
    }
}
