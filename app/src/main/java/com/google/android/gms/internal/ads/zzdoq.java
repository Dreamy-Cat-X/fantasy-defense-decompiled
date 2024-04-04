package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.internal.ads.zzuc;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzdoq implements zzdor {
    private final ConcurrentHashMap<zzdpa, zzdoo> zzhlj;
    private zzdou zzhlk;
    private zzdos zzhll = new zzdos();

    public zzdoq(zzdou zzdouVar) {
        this.zzhlj = new ConcurrentHashMap<>(zzdouVar.zzhlz);
        this.zzhlk = zzdouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdor
    public final synchronized zzdpb<?> zza(zzdpa zzdpaVar) {
        zzdpb<?> zzdpbVar;
        zzdoo zzdooVar = this.zzhlj.get(zzdpaVar);
        zzdpbVar = null;
        if (zzdooVar != null) {
            zzdpbVar = zzdooVar.zzavs();
            if (zzdpbVar == null) {
                this.zzhll.zzawb();
            }
            zza(zzdpbVar, zzdooVar.zzavw());
        } else {
            this.zzhll.zzawa();
            zza((zzdpb<?>) null, (zzdpq) null);
        }
        return zzdpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdor
    public final synchronized boolean zza(zzdpa zzdpaVar, zzdpb<?> zzdpbVar) {
        boolean zzb;
        zzdoo zzdooVar = this.zzhlj.get(zzdpaVar);
        zzdpbVar.zzhmu = com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis();
        if (zzdooVar == null) {
            zzdooVar = new zzdoo(this.zzhlk.zzhlz, this.zzhlk.zzhma * 1000);
            if (this.zzhlj.size() == this.zzhlk.zzhly) {
                int i = zzdot.zzhls[this.zzhlk.zzhmd - 1];
                long j = Long.MAX_VALUE;
                zzdpa zzdpaVar2 = null;
                if (i == 1) {
                    for (Map.Entry<zzdpa, zzdoo> entry : this.zzhlj.entrySet()) {
                        if (entry.getValue().getCreationTimeMillis() < j) {
                            j = entry.getValue().getCreationTimeMillis();
                            zzdpaVar2 = entry.getKey();
                        }
                    }
                    if (zzdpaVar2 != null) {
                        this.zzhlj.remove(zzdpaVar2);
                    }
                } else if (i == 2) {
                    for (Map.Entry<zzdpa, zzdoo> entry2 : this.zzhlj.entrySet()) {
                        if (entry2.getValue().zzavt() < j) {
                            j = entry2.getValue().zzavt();
                            zzdpaVar2 = entry2.getKey();
                        }
                    }
                    if (zzdpaVar2 != null) {
                        this.zzhlj.remove(zzdpaVar2);
                    }
                } else if (i == 3) {
                    int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    for (Map.Entry<zzdpa, zzdoo> entry3 : this.zzhlj.entrySet()) {
                        if (entry3.getValue().zzavu() < i2) {
                            i2 = entry3.getValue().zzavu();
                            zzdpaVar2 = entry3.getKey();
                        }
                    }
                    if (zzdpaVar2 != null) {
                        this.zzhlj.remove(zzdpaVar2);
                    }
                }
                this.zzhll.zzawd();
            }
            this.zzhlj.put(zzdpaVar, zzdooVar);
            this.zzhll.zzawc();
        }
        zzb = zzdooVar.zzb(zzdpbVar);
        this.zzhll.zzawe();
        zzdov zzawf = this.zzhll.zzawf();
        zzdpq zzavw = zzdooVar.zzavw();
        if (zzdpbVar != null) {
            zzdpbVar.zzhms.zzakz().zzd((zzuc.zzb) ((zzekq) zzuc.zzb.zznm().zza(zzuc.zzb.zza.zznk().zzb(zzuc.zzb.zzc.IN_MEMORY).zza(zzuc.zzb.zze.zznq().zzu(zzawf.zzhmg).zzv(zzawf.zzhmh).zzca(zzavw.zzhnp))).zzbiz()));
        }
        dumpToLog();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdor
    public final synchronized boolean zzb(zzdpa zzdpaVar) {
        zzdoo zzdooVar = this.zzhlj.get(zzdpaVar);
        if (zzdooVar != null) {
            return zzdooVar.size() < this.zzhlk.zzhlz;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdor
    @Deprecated
    public final zzdpa zza(zzvi zzviVar, String str, zzvu zzvuVar) {
        return new zzdpd(zzviVar, str, new zzatc(this.zzhlk.context).zzwq().zzdwh, this.zzhlk.zzhmb, zzvuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdor
    public final zzdou zzavz() {
        return this.zzhlk;
    }

    private final void zza(zzdpb<?> zzdpbVar, zzdpq zzdpqVar) {
        if (zzdpbVar != null) {
            zzdpbVar.zzhms.zzakz().zzc((zzuc.zzb) ((zzekq) zzuc.zzb.zznm().zza(zzuc.zzb.zza.zznk().zzb(zzuc.zzb.zzc.IN_MEMORY).zza(zzuc.zzb.zzd.zzno().zzt(zzdpqVar.zzhno).zzbz(zzdpqVar.zzhnp))).zzbiz()));
        }
        dumpToLog();
    }

    private final void dumpToLog() {
        if (zzdou.zzawh()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzhlk.zzhlx);
            sb.append(" PoolCollection");
            sb.append(this.zzhll.zzawg());
            int i = 0;
            for (Map.Entry<zzdpa, zzdoo> entry : this.zzhlj.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().size(); i2++) {
                    sb.append("[O]");
                }
                for (int size = entry.getValue().size(); size < this.zzhlk.zzhlz; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().zzavv());
                sb.append("\n");
            }
            while (i < this.zzhlk.zzhly) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
        }
    }
}
