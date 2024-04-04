package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpa extends SQLiteOpenHelper {
    public zzcpa(Context context) {
        super(context, "OfflineUpload.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)");
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "failed_requests");
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("statistic_name", "total_requests");
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues2);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("statistic_name", "last_successful_request_time");
        contentValues3.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
    }
}
