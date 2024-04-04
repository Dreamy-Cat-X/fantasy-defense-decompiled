package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzegi extends zzekq<zzegi, zza> implements zzemf {
    private static volatile zzemm<zzegi> zzei;
    private static final zzegi zzigp;
    private int zzicj;
    private zzegl zzigo;

    private zzegi() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzegi, zza> implements zzemf {
        private zza() {
            super(zzegi.zzigp);
        }

        public final zza zzfq(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzegi) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzb(zzegl zzeglVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzegi) this.zzioz).zza(zzeglVar);
            return this;
        }

        /* synthetic */ zza(zzegj zzegjVar) {
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

    public final zzegl zzbff() {
        zzegl zzeglVar = this.zzigo;
        return zzeglVar == null ? zzegl.zzbfk() : zzeglVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzegl zzeglVar) {
        zzeglVar.getClass();
        this.zzigo = zzeglVar;
    }

    public static zzegi zzx(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzegi) zzekq.zza(zzigp, zzejgVar, zzekdVar);
    }

    public static zza zzbfg() {
        return zzigp.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegj zzegjVar = null;
        switch (zzegj.zzds[i - 1]) {
            case 1:
                return new zzegi();
            case 2:
                return new zza(zzegjVar);
            case 3:
                return zza(zzigp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzicj", "zzigo"});
            case 4:
                return zzigp;
            case 5:
                zzemm<zzegi> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzegi.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzigp);
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
        zzegi zzegiVar = new zzegi();
        zzigp = zzegiVar;
        zzekq.zza((Class<zzegi>) zzegi.class, zzegiVar);
    }
}
