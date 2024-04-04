package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcps {
    private Context context;
    private final zzdro zzdgv;
    private zzayt zzdsc;
    private final com.google.android.gms.ads.internal.util.zzf zzdza = com.google.android.gms.ads.internal.zzp.zzku().zzxq();
    private zzcpc zzgpo;
    private zztu zzgpw;
    private final String zzgpx;

    public zzcps(Context context, zzayt zzaytVar, zztu zztuVar, zzcpc zzcpcVar, String str, zzdro zzdroVar) {
        this.context = context;
        this.zzdsc = zzaytVar;
        this.zzgpw = zztuVar;
        this.zzgpo = zzcpcVar;
        this.zzgpx = str;
        this.zzdgv = zzdroVar;
    }

    public final void zzarz() {
        try {
            this.zzgpo.zza(new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzcpv
                private final zzcps zzgpz;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgpz = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final Object apply(Object obj) {
                    return this.zzgpz.zza((SQLiteDatabase) obj);
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zzd.zzev(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    private static void zza(SQLiteDatabase sQLiteDatabase, ArrayList<zzuc.zzo.zza> arrayList) {
        ArrayList<zzuc.zzo.zza> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            zzuc.zzo.zza zzaVar = arrayList2.get(i);
            i++;
            zzuc.zzo.zza zzaVar2 = zzaVar;
            if (zzaVar2.zzos() == zzum.ENUM_TRUE && zzaVar2.getTimestamp() > j) {
                j = zzaVar2.getTimestamp();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(SQLiteDatabase sQLiteDatabase) throws Exception {
        int i = 0;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            this.zzdgv.zzb(zzdrp.zzgz("oa_upload").zzu("oa_failed_reqs", String.valueOf(zzcpt.zza(sQLiteDatabase, 0))).zzu("oa_total_reqs", String.valueOf(zzcpt.zza(sQLiteDatabase, 1))).zzu("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis())).zzu("oa_last_successful_time", String.valueOf(zzcpt.zzb(sQLiteDatabase, 2))).zzu("oa_session_id", this.zzdza.zzys() ? "" : this.zzgpx));
            ArrayList<zzuc.zzo.zza> zzb = zzcpt.zzb(sQLiteDatabase);
            zza(sQLiteDatabase, zzb);
            ArrayList<zzuc.zzo.zza> arrayList = zzb;
            int size = arrayList.size();
            while (i < size) {
                zzuc.zzo.zza zzaVar = arrayList.get(i);
                i++;
                zzuc.zzo.zza zzaVar2 = zzaVar;
                zzdrp zzu = zzdrp.zzgz("oa_signals").zzu("oa_session_id", this.zzdza.zzys() ? "" : this.zzgpx);
                zzuc.zzm zzow = zzaVar2.zzow();
                zzu.zzu("oa_sig_ts", String.valueOf(zzaVar2.getTimestamp())).zzu("oa_sig_status", String.valueOf(zzaVar2.zzos().zzv())).zzu("oa_sig_resp_lat", String.valueOf(zzaVar2.zzot())).zzu("oa_sig_render_lat", String.valueOf(zzaVar2.zzou())).zzu("oa_sig_formats", zzdxa.zza(zzaVar2.zzov(), zzcpw.zzdyn).toString()).zzu("oa_sig_nw_type", zzow.zzok() ? String.valueOf(zzow.zzol().zzv()) : "-1").zzu("oa_sig_wifi", String.valueOf(zzaVar2.zzox().zzv())).zzu("oa_sig_airplane", String.valueOf(zzaVar2.zzoy().zzv())).zzu("oa_sig_data", String.valueOf(zzaVar2.zzoz().zzv())).zzu("oa_sig_nw_resp", String.valueOf(zzaVar2.zzpa())).zzu("oa_sig_offline", String.valueOf(zzaVar2.zzpb().zzv())).zzu("oa_sig_nw_state", String.valueOf(zzaVar2.zzpc().zzv()));
                if (zzow.zzom() && zzow.zzok() && zzow.zzol().equals(zzuc.zzm.zzc.CELL)) {
                    zzu.zzu("oa_sig_cell_type", String.valueOf(zzow.zzon().zzv()));
                }
                this.zzdgv.zzb(zzu);
            }
        } else {
            ArrayList<zzuc.zzo.zza> zzb2 = zzcpt.zzb(sQLiteDatabase);
            final zzuc.zzo zzoVar = (zzuc.zzo) ((zzekq) zzuc.zzo.zzpf().zzca(this.context.getPackageName()).zzcb(Build.MODEL).zzcl(zzcpt.zza(sQLiteDatabase, 0)).zzf(zzb2).zzcm(zzcpt.zza(sQLiteDatabase, 1)).zzev(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()).zzew(zzcpt.zzb(sQLiteDatabase, 2)).zzbiz());
            zza(sQLiteDatabase, zzb2);
            this.zzgpw.zza(new zztt(zzoVar) { // from class: com.google.android.gms.internal.ads.zzcpu
                private final zzuc.zzo zzgpy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgpy = zzoVar;
                }

                @Override // com.google.android.gms.internal.ads.zztt
                public final void zza(zzuc.zzi.zza zzaVar3) {
                    zzaVar3.zza(this.zzgpy);
                }
            });
            final zzuc.zzu zzuVar = (zzuc.zzu) ((zzekq) zzuc.zzu.zzpm().zzcn(this.zzdsc.zzege).zzco(this.zzdsc.zzegf).zzcp(this.zzdsc.zzegg ? 0 : 2).zzbiz());
            this.zzgpw.zza(new zztt(zzuVar) { // from class: com.google.android.gms.internal.ads.zzcpx
                private final zzuc.zzu zzgqa;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgqa = zzuVar;
                }

                @Override // com.google.android.gms.internal.ads.zztt
                public final void zza(zzuc.zzi.zza zzaVar3) {
                    zzaVar3.zza(zzaVar3.zzoc().zzbim().zza(this.zzgqa));
                }
            });
            this.zzgpw.zza(zztw.zza.zzb.OFFLINE_UPLOAD);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
