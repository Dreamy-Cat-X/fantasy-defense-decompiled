package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeeu extends zzekq<zzeeu, zza> implements zzemf {
    private static volatile zzemm<zzeeu> zzei;
    private static final zzeeu zzidt;
    private zzefv zzids;

    private zzeeu() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeeu, zza> implements zzemf {
        private zza() {
            super(zzeeu.zzidt);
        }

        /* synthetic */ zza(zzeew zzeewVar) {
            this();
        }
    }

    public final zzefv zzbcu() {
        zzefv zzefvVar = this.zzids;
        return zzefvVar == null ? zzefv.zzbeg() : zzefvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeew zzeewVar = null;
        switch (zzeew.zzds[i - 1]) {
            case 1:
                return new zzeeu();
            case 2:
                return new zza(zzeewVar);
            case 3:
                return zza(zzidt, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzids"});
            case 4:
                return zzidt;
            case 5:
                zzemm<zzeeu> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeeu.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidt);
                            zzei = zzemmVar;
                        }
                    }
                }
                return zzemmVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzeeu zzbcv() {
        return zzidt;
    }

    static {
        zzeeu zzeeuVar = new zzeeu();
        zzidt = zzeeuVar;
        zzekq.zza((Class<zzeeu>) zzeeu.class, zzeeuVar);
    }
}
