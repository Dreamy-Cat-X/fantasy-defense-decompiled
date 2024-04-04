package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcuf {
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzcht zzgit;
    private final zzdnk zzgjr;

    public zzcuf(zzdnk zzdnkVar, zzcht zzchtVar, zzcju zzcjuVar, zzdro zzdroVar) {
        this.zzgjr = zzdnkVar;
        this.zzgit = zzchtVar;
        this.zzdgu = zzcjuVar;
        this.zzdgv = zzdroVar;
    }

    public final void zza(zzdmj zzdmjVar, zzdmi zzdmiVar, int i, @Nullable zzcqu zzcquVar, long j) {
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            zzdrp zzu = zzdrp.zzgz("adapter_status").zzb(zzdmjVar).zzf(zzdmiVar).zzu("adapter_l", String.valueOf(j)).zzu("sc", Integer.toString(i));
            if (zzcquVar != null) {
                zzu.zzu("arec", Integer.toString(zzcquVar.zzasa().errorCode));
                String zzgt = this.zzgjr.zzgt(zzcquVar.getMessage());
                if (zzgt != null) {
                    zzu.zzu("areec", zzgt);
                }
            }
            zzchq zzi = this.zzgit.zzi(zzdmiVar.zzhhu);
            if (zzi != null) {
                zzu.zzu("ancn", zzi.zzdhk);
                if (zzi.zzgip != null) {
                    zzu.zzu("adapter_v", zzi.zzgip.toString());
                }
                if (zzi.zzgiq != null) {
                    zzu.zzu("adapter_sv", zzi.zzgiq.toString());
                }
            }
            this.zzdgv.zzb(zzu);
            return;
        }
        zzcjx zzr = this.zzdgu.zzaqt().zza(zzdmjVar).zzc(zzdmiVar).zzr("action", "adapter_status").zzr("adapter_l", String.valueOf(j));
        zzr.zzr("sc", Integer.toString(i));
        if (zzcquVar != null) {
            zzr.zzr("arec", Integer.toString(zzcquVar.zzasa().errorCode));
            String zzgt2 = this.zzgjr.zzgt(zzcquVar.getMessage());
            if (zzgt2 != null) {
                zzr.zzr("areec", zzgt2);
            }
        }
        zzchq zzi2 = this.zzgit.zzi(zzdmiVar.zzhhu);
        if (zzi2 != null) {
            zzr.zzr("ancn", zzi2.zzdhk);
            if (zzi2.zzgip != null) {
                zzr.zzr("adapter_v", zzi2.zzgip.toString());
            }
            if (zzi2.zzgiq != null) {
                zzr.zzr("adapter_sv", zzi2.zzgiq.toString());
            }
        }
        zzr.zzaqv();
    }
}
