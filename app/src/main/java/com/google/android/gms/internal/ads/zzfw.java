package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzfw implements Callable {
    private final zzcf.zza.C0009zza zzaaz;
    private final zzez zzvx;

    public zzfw(zzez zzezVar, zzcf.zza.C0009zza c0009zza) {
        this.zzvx = zzezVar;
        this.zzaaz = c0009zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzcy, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        if (this.zzvx.zzcp() != null) {
            this.zzvx.zzcp().get();
        }
        zzcf.zza zzco = this.zzvx.zzco();
        if (zzco == null) {
            return null;
        }
        try {
            synchronized (this.zzaaz) {
                zzcf.zza.C0009zza c0009zza = this.zzaaz;
                byte[] byteArray = zzco.toByteArray();
                c0009zza.zza(byteArray, 0, byteArray.length, zzekd.zzbia());
            }
            return null;
        } catch (zzeld unused) {
            return null;
        }
    }
}
