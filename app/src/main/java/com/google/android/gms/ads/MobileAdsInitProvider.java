package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzzo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class MobileAdsInitProvider extends ContentProvider {
    private final zzzo zzadk = new zzzo();

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.zzadk.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return this.zzadk.onCreate();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.zzadk.query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return this.zzadk.getType(uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.zzadk.insert(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.zzadk.delete(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.zzadk.update(uri, contentValues, str, strArr);
    }
}
