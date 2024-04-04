package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdu implements Runnable {
    private final /* synthetic */ zzdp zzwc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdu(zzdp zzdpVar) {
        this.zzwc = zzdpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzdsn zzdsnVar;
        Object obj2;
        obj = this.zzwc.zzvt;
        synchronized (obj) {
            z = this.zzwc.zzvu;
            if (z) {
                return;
            }
            this.zzwc.zzvu = true;
            try {
                this.zzwc.zzbs();
            } catch (Exception e) {
                zzdsnVar = this.zzwc.zzvo;
                zzdsnVar.zza(2023, -1L, e);
            }
            obj2 = this.zzwc.zzvt;
            synchronized (obj2) {
                this.zzwc.zzvu = false;
            }
        }
    }
}
