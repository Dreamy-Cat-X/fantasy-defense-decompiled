package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzgt extends zzekq<zzgt, zza> implements zzemf {
    private static final zzgt zzacf;
    private static volatile zzemm<zzgt> zzei;
    private String zzaca = "";
    private String zzacb = "";
    private long zzacc;
    private long zzacd;
    private long zzace;
    private int zzdt;

    private zzgt() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzgt, zza> implements zzemf {
        private zza() {
            super(zzgt.zzacf);
        }

        public final zza zzav(String str) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzgt) this.zzioz).zzat(str);
            return this;
        }

        public final zza zzaw(String str) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzgt) this.zzioz).zzau(str);
            return this;
        }

        public final zza zzdj(long j) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzgt) this.zzioz).zzdg(j);
            return this;
        }

        public final zza zzdk(long j) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzgt) this.zzioz).zzdh(j);
            return this;
        }

        public final zza zzdl(long j) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzgt) this.zzioz).zzdi(j);
            return this;
        }

        /* synthetic */ zza(zzgu zzguVar) {
            this();
        }
    }

    public final String zzdg() {
        return this.zzaca;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzaca = str;
    }

    public final String zzdh() {
        return this.zzacb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzau(String str) {
        str.getClass();
        this.zzdt |= 2;
        this.zzacb = str;
    }

    public final long zzdi() {
        return this.zzacc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdg(long j) {
        this.zzdt |= 4;
        this.zzacc = j;
    }

    public final long zzdj() {
        return this.zzacd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdh(long j) {
        this.zzdt |= 8;
        this.zzacd = j;
    }

    public final long zzdk() {
        return this.zzace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdi(long j) {
        this.zzdt |= 16;
        this.zzace = j;
    }

    public static zzgt zzl(zzejg zzejgVar) throws zzeld {
        return (zzgt) zzekq.zza(zzacf, zzejgVar);
    }

    public static zzgt zzb(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzgt) zzekq.zza(zzacf, zzejgVar, zzekdVar);
    }

    public static zza zzdl() {
        return zzacf.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzgu zzguVar = null;
        switch (zzgu.zzds[i - 1]) {
            case 1:
                return new zzgt();
            case 2:
                return new zza(zzguVar);
            case 3:
                return zza(zzacf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdt", "zzaca", "zzacb", "zzacc", "zzacd", "zzace"});
            case 4:
                return zzacf;
            case 5:
                zzemm<zzgt> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzgt.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzacf);
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

    public static zzgt zzdm() {
        return zzacf;
    }

    static {
        zzgt zzgtVar = new zzgt();
        zzacf = zzgtVar;
        zzekq.zza((Class<zzgt>) zzgt.class, zzgtVar);
    }
}
