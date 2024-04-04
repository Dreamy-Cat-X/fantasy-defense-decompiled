package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdti;
import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdtp extends zzekq<zzdtp, zzb> implements zzemf {
    private static volatile zzemm<zzdtp> zzei;
    private static final zzdtp zzhsd;
    private int zzdt;
    private int zzhsa;
    private zzdti zzhsc;
    private String zzdu = "";
    private String zzhsb = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum zza implements zzekv {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);

        private static final zzeku<zza> zzep = new zzdtr();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzekv
        public final int zzv() {
            return this.value;
        }

        public static zza zzej(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static zzekx zzw() {
            return zzdtq.zzer;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzdtp() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq.zzb<zzdtp, zzb> implements zzemf {
        private zzb() {
            super(zzdtp.zzhsd);
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzdtp) this.zzioz).zza(zzaVar);
            return this;
        }

        public final zzb zzhk(String str) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzdtp) this.zzioz).zzo(str);
            return this;
        }

        public final zzb zza(zzdti.zzb zzbVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzdtp) this.zzioz).zza((zzdti) ((zzekq) zzbVar.zzbiz()));
            return this;
        }

        /* synthetic */ zzb(zzdto zzdtoVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzhsa = zzaVar.zzv();
        this.zzdt |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(String str) {
        str.getClass();
        this.zzdt |= 2;
        this.zzdu = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdti zzdtiVar) {
        zzdtiVar.getClass();
        this.zzhsc = zzdtiVar;
        this.zzdt |= 8;
    }

    public static zzb zzayf() {
        return zzhsd.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzdto zzdtoVar = null;
        switch (zzdto.zzds[i - 1]) {
            case 1:
                return new zzdtp();
            case 2:
                return new zzb(zzdtoVar);
            case 3:
                return zza(zzhsd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdt", "zzhsa", zza.zzw(), "zzdu", "zzhsb", "zzhsc"});
            case 4:
                return zzhsd;
            case 5:
                zzemm<zzdtp> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzdtp.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzhsd);
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

    static {
        zzdtp zzdtpVar = new zzdtp();
        zzhsd = zzdtpVar;
        zzekq.zza((Class<zzdtp>) zzdtp.class, zzdtpVar);
    }
}
