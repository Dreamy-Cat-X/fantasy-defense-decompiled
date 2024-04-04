package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbh extends zzaa<String> {
    private final Object mLock;
    private zzal<String> zzcv;

    public zzbh(int i, String str, zzal<String> zzalVar, zzai zzaiVar) {
        super(i, str, zzaiVar);
        this.mLock = new Object();
        this.zzcv = zzalVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaa
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public void zza(String str) {
        zzal<String> zzalVar;
        synchronized (this.mLock) {
            zzalVar = this.zzcv;
        }
        if (zzalVar != null) {
            zzalVar.zzb(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaa
    public final zzaj<String> zza(zzy zzyVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzyVar.data;
            Map<String, String> map = zzyVar.zzal;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzyVar.data);
        }
        return zzaj.zza(str, zzbc.zzb(zzyVar));
    }
}
