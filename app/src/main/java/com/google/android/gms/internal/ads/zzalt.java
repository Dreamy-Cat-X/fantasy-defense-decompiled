package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzalt {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final zzalu<JSONObject> zzdjj = new zzalv();
    public static final zzals<InputStream> zzdjk = zzalw.zzdjl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ InputStream zze(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(UTF_8));
    }
}
