package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbhj;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzbff implements zzbij {
    private static zzbff zzeuf;

    protected abstract zzdfm zza(zzdgr zzdgrVar);

    public abstract zzdro zzaes();

    public abstract Executor zzaet();

    public abstract ScheduledExecutorService zzaeu();

    public abstract Executor zzaev();

    public abstract zzdzk zzaew();

    public abstract zzbsx zzaex();

    public abstract zzchu zzaey();

    public abstract zzbho zzaez();

    public abstract zzblw zzafa();

    public abstract zzdiv zzafb();

    public abstract zzbkc zzafc();

    public abstract zzbkp zzafd();

    public abstract zzdho zzafe();

    public abstract zzbzc zzaff();

    public abstract zzdkq zzafg();

    public abstract zzbzy zzafh();

    public abstract zzcgm zzafi();

    public abstract zzdlz zzafj();

    public abstract zzcys zzafk();

    public abstract zzcyv zzafl();

    public abstract zzcqi zzafm();

    public abstract zzdnr<zzcfp> zzafn();

    public static zzbff zza(Context context, zzamt zzamtVar, int i) {
        zzbff zzh = zzh(context, i);
        zzh.zzaey().zzb(zzamtVar);
        return zzh;
    }

    @Deprecated
    public static zzbff zzh(Context context, int i) {
        synchronized (zzbff.class) {
            if (zzeuf != null) {
                return zzeuf;
            }
            return zza(new zzayt(ModuleDescriptor.MODULE_VERSION, i, true, false), context, new zzbgc());
        }
    }

    @Deprecated
    private static zzbff zza(zzayt zzaytVar, Context context, zzbhj.zza zzaVar) {
        zzbff zzbffVar;
        synchronized (zzbff.class) {
            if (zzeuf == null) {
                zzeuf = new zzbgy().zzc(new zzbfh(new zzbfh.zza().zza(zzaytVar).zzbx(context))).zza(new zzbhj(zzaVar)).zzahv();
                zzabh.initialize(context);
                com.google.android.gms.ads.internal.zzp.zzku().zzd(context, zzaytVar);
                com.google.android.gms.ads.internal.zzp.zzkw().initialize(context);
                com.google.android.gms.ads.internal.zzp.zzkq().zzal(context);
                com.google.android.gms.ads.internal.zzp.zzkq().zzam(context);
                com.google.android.gms.ads.internal.zzp.zzkq();
                com.google.android.gms.ads.internal.util.zzm.zzbc(context);
                com.google.android.gms.ads.internal.util.zzb.zzak(context);
                com.google.android.gms.ads.internal.zzp.zzkt().initialize(context);
                com.google.android.gms.ads.internal.zzp.zzll().initialize(context);
                com.google.android.gms.ads.internal.util.zzf zzxq = com.google.android.gms.ads.internal.zzp.zzku().zzxq();
                zzxq.initialize(context);
                zzawe.zza(context, zzxq);
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcxb)).booleanValue()) {
                    if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcob)).booleanValue()) {
                        zztu zztuVar = new zztu(new zztz(context));
                        zzcpc zzcpcVar = new zzcpc(new zzcpa(context), zzeuf.zzaew());
                        com.google.android.gms.ads.internal.zzp.zzkq();
                        new zzcps(context, zzaytVar, zztuVar, zzcpcVar, com.google.android.gms.ads.internal.util.zzm.zzyw(), zzeuf.zzaes()).zzarz();
                    }
                }
            }
            zzbffVar = zzeuf;
        }
        return zzbffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbij
    public final zzdfm zza(zzasu zzasuVar, int i) {
        return zza(new zzdgr(zzasuVar, i));
    }
}
