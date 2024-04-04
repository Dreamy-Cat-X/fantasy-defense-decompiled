package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzege extends zzekq<zzege, zza> implements zzemf {
    private static volatile zzemm<zzege> zzei;
    private static final zzege zzigl;
    private int zzicj;
    private zzegh zzigk;

    private zzege() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq.zzb<zzege, zza> implements zzemf {
        private zza() {
            super(zzege.zzigl);
        }

        public final zza zzfp(int i) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzege) this.zzioz).setVersion(0);
            return this;
        }

        public final zza zzb(zzegh zzeghVar) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            ((zzege) this.zzioz).zza(zzeghVar);
            return this;
        }

        /* synthetic */ zza(zzegf zzegfVar) {
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

    public final zzegh zzbez() {
        zzegh zzeghVar = this.zzigk;
        return zzeghVar == null ? zzegh.zzbfd() : zzeghVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzegh zzeghVar) {
        zzeghVar.getClass();
        this.zzigk = zzeghVar;
    }

    public static zzege zzv(zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (zzege) zzekq.zza(zzigl, zzejgVar, zzekdVar);
    }

    public static zza zzbfa() {
        return zzigl.zzbil();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzekq
    public final Object zza(int i, Object obj, Object obj2) {
        zzegf zzegfVar = null;
        switch (zzegf.zzds[i - 1]) {
            case 1:
                return new zzege();
            case 2:
                return new zza(zzegfVar);
            case 3:
                return zza(zzigl, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzicj", "zzigk"});
            case 4:
                return zzigl;
            case 5:
                zzemm<zzege> zzemmVar = zzei;
                if (zzemmVar == null) {
                    synchronized (zzege.class) {
                        zzemmVar = zzei;
                        if (zzemmVar == null) {
                            zzemmVar = new zzekq.zza<>(zzigl);
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
        zzege zzegeVar = new zzege();
        zzigl = zzegeVar;
        zzekq.zza((Class<zzege>) zzege.class, zzegeVar);
    }
}
