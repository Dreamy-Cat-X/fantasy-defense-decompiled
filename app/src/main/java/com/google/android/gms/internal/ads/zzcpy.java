package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpy extends SQLiteOpenHelper {
    private final Context context;
    private final zzdzk zzgot;

    public zzcpy(Context context, zzdzk zzdzkVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzwo.zzqq().zzd(zzabh.zzczg)).intValue());
        this.context = context;
        this.zzgot = zzdzkVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    private final void zza(zzdqj<SQLiteDatabase, Void> zzdqjVar) {
        zzdyz.zza(this.zzgot.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcqb
            private final zzcpy zzgqe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqe = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgqe.getWritableDatabase();
            }
        }), new zzcqh(this, zzdqjVar), this.zzgot);
    }

    private static void zza(SQLiteDatabase sQLiteDatabase, zzayq zzayqVar) {
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {ImagesContract.URL};
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = 1");
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", strArr, sb.toString(), null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr2 = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr2[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzayqVar.zzel(strArr2[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void zza(final zzayq zzayqVar) {
        zza(new zzdqj(zzayqVar) { // from class: com.google.android.gms.internal.ads.zzcqa
            private final zzayq zzdsf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdsf = zzayqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final Object apply(Object obj) {
                return zzcpy.zza(this.zzdsf, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(final SQLiteDatabase sQLiteDatabase, final zzayq zzayqVar, final String str) {
        this.zzgot.execute(new Runnable(sQLiteDatabase, str, zzayqVar) { // from class: com.google.android.gms.internal.ads.zzcqd
            private final String zzdhw;
            private final SQLiteDatabase zzgqg;
            private final zzayq zzgqh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqg = sQLiteDatabase;
                this.zzdhw = str;
                this.zzgqh = zzayqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcpy.zza(this.zzgqg, this.zzdhw, this.zzgqh);
            }
        });
    }

    public final void zzb(final zzayq zzayqVar, final String str) {
        zza(new zzdqj(this, zzayqVar, str) { // from class: com.google.android.gms.internal.ads.zzcqc
            private final String zzdkf;
            private final zzcpy zzgqe;
            private final zzayq zzgqf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqe = this;
                this.zzgqf = zzayqVar;
                this.zzdkf = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final Object apply(Object obj) {
                return this.zzgqe.zza(this.zzgqf, this.zzdkf, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    public final void zzgm(final String str) {
        zza(new zzdqj(this, str) { // from class: com.google.android.gms.internal.ads.zzcqf
            private final String zzdhw;
            private final zzcpy zzgqe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqe = this;
                this.zzdhw = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final Object apply(Object obj) {
                zzcpy.zza((SQLiteDatabase) obj, this.zzdhw);
                return null;
            }
        });
    }

    public final void zza(final zzcqj zzcqjVar) {
        zza(new zzdqj(this, zzcqjVar) { // from class: com.google.android.gms.internal.ads.zzcqe
            private final zzcpy zzgqe;
            private final zzcqj zzgqi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqe = this;
                this.zzgqi = zzcqjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final Object apply(Object obj) {
                return this.zzgqe.zza(this.zzgqi, (SQLiteDatabase) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzcqj zzcqjVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzcqjVar.timestamp));
        contentValues.put("gws_query_id", zzcqjVar.zzbvf);
        contentValues.put(ImagesContract.URL, zzcqjVar.url);
        contentValues.put("event_state", Integer.valueOf(zzcqjVar.zzgqj - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzp.zzkq();
        com.google.android.gms.ads.internal.util.zzbf zzbe = com.google.android.gms.ads.internal.util.zzm.zzbe(this.context);
        if (zzbe != null) {
            try {
                zzbe.zzap(ObjectWrapper.wrap(this.context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zza("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(zzayq zzayqVar, String str, SQLiteDatabase sQLiteDatabase) throws Exception {
        zza(sQLiteDatabase, zzayqVar, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(SQLiteDatabase sQLiteDatabase, String str, zzayq zzayqVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zza(sQLiteDatabase, zzayqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zza(zzayq zzayqVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zza(sQLiteDatabase, zzayqVar);
        return null;
    }
}
