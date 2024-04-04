package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzemd;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzean<KeyFormatProtoT extends zzemd, KeyProtoT extends zzemd> {
    private final zzeap<KeyFormatProtoT, KeyProtoT> zzhzw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzean(zzeap<KeyFormatProtoT, KeyProtoT> zzeapVar) {
        this.zzhzw = zzeapVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyProtoT zzq(zzejg zzejgVar) throws GeneralSecurityException, zzeld {
        KeyFormatProtoT zzr = this.zzhzw.zzr(zzejgVar);
        this.zzhzw.zzd(zzr);
        return this.zzhzw.zze(zzr);
    }
}
