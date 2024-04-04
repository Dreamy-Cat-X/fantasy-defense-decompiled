package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdti extends zzekq<zzdti, zzb> implements zzemf {
    private static volatile zzemm<zzdti> zzei;
    private static final zzeky<Integer, zza> zzhrs = new zzdtl();
    private static final zzdti zzhrw;
    private int zzdt;
    private zzekw zzhrr = zzbio();
    private String zzhrt = "";
    private String zzhru = "";
    private String zzhrv = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum zza implements zzekv {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);

        private static final zzeku<zza> zzep = new zzdtm();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzekv
        public final int zzv() {
            return this.value;
        }

        public static zza zzei(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static zzekx zzw() {
            return zzdtn.zzer;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzdti() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zzb extends zzekq.zzb<zzdti, zzb> implements zzemf {
        private zzb() {
            super(zzdti.zzhrw);
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzdti) this.zzioz).zza(zzaVar);
            return this;
        }

        public final zzb zzhj(String str) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzdti) this.zzioz).zzhi(str);
            return this;
        }

        /* synthetic */ zzb(zzdtl zzdtlVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzekw zzekwVar = this.zzhrr;
        if (!zzekwVar.zzbgh()) {
            this.zzhrr = zzekq.zza(zzekwVar);
        }
        this.zzhrr.zzhh(zzaVar.zzv());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzhi(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzhrt = str;
    }

    public static zzb zzayd() {
        return zzhrw.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzdtl zzdtlVar = null;
        switch (zzdtk.zzds[i - 1]) {
            case 1:
                return new zzdti();
            case 2:
                return new zzb(zzdtlVar);
            case 3:
                return zza(zzhrw, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdt", "zzhrr", zza.zzw(), "zzhrt", "zzhru", "zzhrv"});
            case 4:
                return zzhrw;
            case 5:
                zzemm<zzdti> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzdti.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzhrw);
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
        zzdti zzdtiVar = new zzdti();
        zzhrw = zzdtiVar;
        zzekq.zza((Class<zzdti>) zzdti.class, zzdtiVar);
    }
}
