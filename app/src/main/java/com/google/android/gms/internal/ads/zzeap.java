package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzemd;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzeap<KeyFormatProtoT extends zzemd, KeyT> {
    private final Class<KeyFormatProtoT> zzhzt;

    public zzeap(Class<KeyFormatProtoT> cls) {
        this.zzhzt = cls;
    }

    public abstract void zzd(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyT zze(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT zzr(zzejg zzejgVar) throws zzeld;

    public final Class<KeyFormatProtoT> zzbas() {
        return this.zzhzt;
    }
}
