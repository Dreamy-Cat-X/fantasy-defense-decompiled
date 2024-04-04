package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzea implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        zzdsn zzdsnVar;
        zzdp zzdpVar;
        zzdp zzdpVar2;
        try {
            zzdpVar = zzdx.zzwe;
            zzdpVar.zzbq();
            zzdpVar2 = zzdx.zzwe;
            zzdpVar2.zzbr();
        } catch (Exception e) {
            zzdsnVar = zzdx.zzwg;
            zzdsnVar.zza(2001, -1L, e);
        }
    }
}
