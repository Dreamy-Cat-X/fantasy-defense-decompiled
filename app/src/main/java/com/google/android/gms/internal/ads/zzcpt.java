package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzuc;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpt {
    public static ArrayList<zzuc.zzo.zza> zzb(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzuc.zzo.zza> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzuc.zzo.zza.zzg(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzeld e) {
                com.google.android.gms.ads.internal.util.zzd.zzev("Unable to deserialize proto from offline signals database:");
                com.google.android.gms.ads.internal.util.zzd.zzev(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static int zza(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor zzc = zzc(sQLiteDatabase, i);
        if (zzc.getCount() > 0) {
            zzc.moveToNext();
            i2 = 0 + zzc.getInt(zzc.getColumnIndexOrThrow("value"));
        }
        zzc.close();
        return i2;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor zzc = zzc(sQLiteDatabase, 2);
        long j = 0;
        if (zzc.getCount() > 0) {
            zzc.moveToNext();
            j = 0 + zzc.getLong(zzc.getColumnIndexOrThrow("value"));
        }
        zzc.close();
        return j;
    }

    private static Cursor zzc(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i == 2) {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}
