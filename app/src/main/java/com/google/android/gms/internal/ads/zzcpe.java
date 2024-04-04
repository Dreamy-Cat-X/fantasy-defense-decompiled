package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzcpe implements zzdza<SQLiteDatabase> {
    private final /* synthetic */ zzdqj zzgou;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpe(zzcpc zzcpcVar, zzdqj zzdqjVar) {
        this.zzgou = zzdqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final void zzb(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        com.google.android.gms.ads.internal.util.zzd.zzev(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    @Override // com.google.android.gms.internal.ads.zzdza
    public final /* synthetic */ void onSuccess(SQLiteDatabase sQLiteDatabase) {
        try {
            this.zzgou.apply(sQLiteDatabase);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zzd.zzev(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
