package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpc {
    private final zzcpa zzgos;
    private final zzdzk zzgot;

    public zzcpc(zzcpa zzcpaVar, zzdzk zzdzkVar) {
        this.zzgos = zzcpaVar;
        this.zzgot = zzdzkVar;
    }

    public final void zza(zzdqj<SQLiteDatabase, Void> zzdqjVar) {
        zzdzk zzdzkVar = this.zzgot;
        zzcpa zzcpaVar = this.zzgos;
        zzcpaVar.getClass();
        zzdyz.zza(zzdzkVar.submit(zzcpf.zza(zzcpaVar)), new zzcpe(this, zzdqjVar), this.zzgot);
    }
}
