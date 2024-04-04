package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzuc;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpo implements zzdza<Bundle> {
    private final /* synthetic */ boolean zzgpl;
    final /* synthetic */ zzcpp zzgpm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpo(zzcpp zzcppVar, boolean z) {
        this.zzgpm = zzcppVar;
        this.zzgpl = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        com.google.android.gms.ads.internal.util.zzd.zzev("Failed to get signals bundle");
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(Bundle bundle) {
        final ArrayList zzl;
        final zzuc.zzo.zzb zzk;
        final zzuc.zzm zzj;
        zzcpc zzcpcVar;
        Bundle bundle2 = bundle;
        zzcpp zzcppVar = this.zzgpm;
        zzl = zzcpp.zzl(bundle2);
        zzcpp zzcppVar2 = this.zzgpm;
        zzk = zzcpp.zzk(bundle2);
        zzj = this.zzgpm.zzj(bundle2);
        zzcpcVar = this.zzgpm.zzgpo;
        final boolean z = this.zzgpl;
        zzcpcVar.zza(new zzdqj(this, z, zzl, zzj, zzk) { // from class: com.google.android.gms.internal.ads.zzcpr
            private final boolean zzeiv;
            private final zzcpo zzgps;
            private final ArrayList zzgpt;
            private final zzuc.zzm zzgpu;
            private final zzuc.zzo.zzb zzgpv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgps = this;
                this.zzeiv = z;
                this.zzgpt = zzl;
                this.zzgpu = zzj;
                this.zzgpv = zzk;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final Object apply(Object obj) {
                byte[] zza;
                zzcpo zzcpoVar = this.zzgps;
                boolean z2 = this.zzeiv;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                zza = zzcpoVar.zzgpm.zza(z2, this.zzgpt, this.zzgpu, this.zzgpv);
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
                contentValues.put("serialized_proto_data", zza);
                sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
                sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
                if (!z2) {
                    sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
                }
                return null;
            }
        });
    }
}
