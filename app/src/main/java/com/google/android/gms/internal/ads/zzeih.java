package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeih extends ThreadLocal<Mac> {
    private final /* synthetic */ zzeie zziji;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeih(zzeie zzeieVar) {
        this.zziji = zzeieVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zzbfw, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzeht<zzehz, Mac> zzehtVar = zzeht.zziir;
            str = this.zziji.zzijb;
            Mac zzhy = zzehtVar.zzhy(str);
            key = this.zziji.zzijc;
            zzhy.init(key);
            return zzhy;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
