package com.google.android.gms.ads.internal.util;

import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzy extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzu
    public final int zzza() {
        return 14;
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzu
    public final long zzze() {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcry)).booleanValue()) {
            return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        }
        return -1L;
    }
}
