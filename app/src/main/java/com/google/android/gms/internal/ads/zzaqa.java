package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqa extends zzaqf {
    private final Context context;
    private final Map<String, String> zzdak;

    public zzaqa(zzbdh zzbdhVar, Map<String, String> map) {
        super(zzbdhVar, "storePicture");
        this.zzdak = map;
        this.context = zzbdhVar.zzaba();
    }

    public final void execute() {
        if (this.context == null) {
            zzds("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (!com.google.android.gms.ads.internal.util.zzm.zzap(this.context).zzry()) {
            zzds("Feature is not supported by the device.");
            return;
        }
        String str = this.zzdak.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzds("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            zzds(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (!com.google.android.gms.ads.internal.util.zzm.zzeh(lastPathSegment)) {
            String valueOf2 = String.valueOf(lastPathSegment);
            zzds(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources resources = com.google.android.gms.ads.internal.zzp.zzku().getResources();
        com.google.android.gms.ads.internal.zzp.zzkq();
        AlertDialog.Builder zzao = com.google.android.gms.ads.internal.util.zzm.zzao(this.context);
        zzao.setTitle(resources != null ? resources.getString(R.string.s1) : "Save image");
        zzao.setMessage(resources != null ? resources.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        zzao.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzapz(this, str, lastPathSegment));
        zzao.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzaqc(this));
        zzao.create().show();
    }
}
