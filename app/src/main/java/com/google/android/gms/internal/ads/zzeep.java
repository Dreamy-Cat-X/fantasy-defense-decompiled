package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeep extends zzekq<zzeep, zza> implements zzemf {
    private static volatile zzemm<zzeep> zzei;
    private static final zzeep zzidk;
    private int zzicj;
    private zzejg zzick = zzejg.zzikj;

    private zzeep() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzeep, zza> implements zzemf {
        private zza() {
            super(zzeep.zzidk);
        }

        public final zza zzfc(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeep) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzy(zzejg zzejgVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzeep) this.zzioz).zzs(zzejgVar);
            return this;
        }

        /* synthetic */ zza(zzeeq zzeeqVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzicj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzicj = i;
    }

    public final zzejg zzbbh() {
        return this.zzick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzejg zzejgVar) {
        zzejgVar.getClass();
        this.zzick = zzejgVar;
    }

    public static zzeep zzo(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzeep) zzekq.zza(zzidk, zzejgVar, zzekdVar);
    }

    public static zza zzbcr() {
        return zzidk.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzeeq zzeeqVar = null;
        switch (zzeeq.zzds[i - 1]) {
            case 1:
                return new zzeep();
            case 2:
                return new zza(zzeeqVar);
            case 3:
                return zza(zzidk, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzicj", "zzick"});
            case 4:
                return zzidk;
            case 5:
                zzemm<zzeep> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzeep.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzidk);
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
        zzeep zzeepVar = new zzeep();
        zzidk = zzeepVar;
        zzekq.zza((Class<zzeep>) zzeep.class, zzeepVar);
    }
}
