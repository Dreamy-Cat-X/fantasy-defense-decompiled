package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.kt.olleh.inapp.net.ResTags;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzaib implements zzahv<Object> {
    private final Object lock = new Object();
    private final Map<String, zzaid> zzdhb = new HashMap();

    public final void zza(String str, zzaid zzaidVar) {
        synchronized (this.lock) {
            this.zzdhb.put(str, zzaidVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get(ResTags.RESULT);
        if (TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.lock) {
            zzaid remove = this.zzdhb.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                com.google.android.gms.ads.internal.util.zzd.zzex(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.onFailure(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else {
                if (str5 == null) {
                    remove.zzc(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zzd.zzye()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        com.google.android.gms.ads.internal.util.zzd.zzeb(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.zzc(jSONObject);
                } catch (JSONException e) {
                    remove.onFailure(e.getMessage());
                }
            }
        }
    }

    public final <EngineT extends zzakl> zzdzl<JSONObject> zza(EngineT enginet, String str, JSONObject jSONObject) {
        zzazc zzazcVar = new zzazc();
        com.google.android.gms.ads.internal.zzp.zzkq();
        String zzyw = com.google.android.gms.ads.internal.util.zzm.zzyw();
        zza(zzyw, new zzaie(this, zzazcVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", zzyw);
            jSONObject2.put("args", jSONObject);
            enginet.zzb(str, jSONObject2);
        } catch (Exception e) {
            zzazcVar.setException(e);
        }
        return zzazcVar;
    }
}
