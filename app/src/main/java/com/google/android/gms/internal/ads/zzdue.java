package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdue {
    private final zzgt zzhsn;
    private final File zzhso;
    private final File zzhsp;
    private final File zzhsq;
    private byte[] zzhsr;

    public zzdue(zzgt zzgtVar, File file, File file2, File file3) {
        this.zzhsn = zzgtVar;
        this.zzhso = file;
        this.zzhsp = file3;
        this.zzhsq = file2;
    }

    public final zzgt zzayn() {
        return this.zzhsn;
    }

    public final File zzayo() {
        return this.zzhso;
    }

    public final File zzayp() {
        return this.zzhsp;
    }

    public final byte[] zzayq() {
        if (this.zzhsr == null) {
            this.zzhsr = zzdug.zzf(this.zzhsq);
        }
        byte[] bArr = this.zzhsr;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean zzff(long j) {
        return this.zzhsn.zzdi() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
