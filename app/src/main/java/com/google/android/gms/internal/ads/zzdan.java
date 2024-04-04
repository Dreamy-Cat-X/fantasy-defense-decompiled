package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdan implements zzdeu<zzdal> {
    private final String zzdsl;
    private final zzchu zzgle;
    private final zzdzk zzgyp;

    public zzdan(String str, zzdzk zzdzkVar, zzchu zzchuVar) {
        this.zzdsl = str;
        this.zzgyp = zzdzkVar;
        this.zzgle = zzchuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdal> zzata() {
        if (new BigInteger(this.zzdsl).equals(BigInteger.ONE)) {
            if (!zzdwi.zzar((String) zzwo.zzqq().zzd(zzabh.zzcqf))) {
                return this.zzgyp.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdaq
                    private final zzdan zzgzh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgzh = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzgzh.zzatc();
                    }
                });
            }
        }
        return zzdyz.zzag(new zzdal(new Bundle()));
    }

    private static Bundle zzb(zzdno zzdnoVar) {
        Bundle bundle = new Bundle();
        try {
            if (zzdnoVar.zzvc() != null) {
                bundle.putString("sdk_version", zzdnoVar.zzvc().toString());
            }
        } catch (zzdnf unused) {
        }
        try {
            if (zzdnoVar.zzvb() != null) {
                bundle.putString("adapter_version", zzdnoVar.zzvb().toString());
            }
        } catch (zzdnf unused2) {
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdal zzatc() throws Exception {
        List<String> asList = Arrays.asList(((String) zzwo.zzqq().zzd(zzabh.zzcqf)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                bundle.putBundle(str, zzb(this.zzgle.zzd(str, new JSONObject())));
            } catch (zzdnf unused) {
            }
        }
        return new zzdal(bundle);
    }
}
