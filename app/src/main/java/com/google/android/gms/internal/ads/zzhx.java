package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzhx extends zzhi {
    void disable();

    int getState();

    int getTrackType();

    boolean isReady();

    void setIndex(int i);

    void start() throws zzhd;

    void stop() throws zzhd;

    void zza(zzhz zzhzVar, zzhs[] zzhsVarArr, zznm zznmVar, long j, boolean z, long j2) throws zzhd;

    void zza(zzhs[] zzhsVarArr, zznm zznmVar, long j) throws zzhd;

    void zzb(long j, long j2) throws zzhd;

    void zzdm(long j) throws zzhd;

    zzia zzdz();

    zzpj zzea();

    zznm zzeb();

    boolean zzec();

    void zzed();

    boolean zzee();

    void zzef() throws IOException;

    boolean zzfe();
}
