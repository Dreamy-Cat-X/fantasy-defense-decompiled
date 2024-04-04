package com.google.android.gms.internal.ads;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzcdc extends View.OnClickListener, View.OnTouchListener {
    void zza(String str, View view, boolean z);

    View zzajo();

    Map<String, WeakReference<View>> zzaot();

    Map<String, WeakReference<View>> zzaou();

    Map<String, WeakReference<View>> zzaov();

    String zzaow();

    FrameLayout zzaox();

    zzqr zzaoy();

    IObjectWrapper zzaoz();

    View zzgc(String str);

    JSONObject zztj();
}
