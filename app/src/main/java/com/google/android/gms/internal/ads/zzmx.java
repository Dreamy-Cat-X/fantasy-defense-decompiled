package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzmx {
    private final zzkb zzarh;
    private final zzjz[] zzbep;
    private zzjz zzbeq;

    public zzmx(zzjz[] zzjzVarArr, zzkb zzkbVar) {
        this.zzbep = zzjzVarArr;
        this.zzarh = zzkbVar;
    }

    public final zzjz zza(zzjy zzjyVar, Uri uri) throws IOException, InterruptedException {
        zzjz zzjzVar = this.zzbeq;
        if (zzjzVar != null) {
            return zzjzVar;
        }
        zzjz[] zzjzVarArr = this.zzbep;
        int length = zzjzVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjz zzjzVar2 = zzjzVarArr[i];
            try {
            } catch (EOFException unused) {
            } finally {
                zzjyVar.zzgq();
            }
            if (zzjzVar2.zza(zzjyVar)) {
                this.zzbeq = zzjzVar2;
                break;
            }
            i++;
        }
        zzjz zzjzVar3 = this.zzbeq;
        if (zzjzVar3 == null) {
            String zza = zzps.zza(this.zzbep);
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
            sb.append("None of the available extractors (");
            sb.append(zza);
            sb.append(") could read the stream.");
            throw new zzns(sb.toString(), uri);
        }
        zzjzVar3.zza(this.zzarh);
        return this.zzbeq;
    }

    public final void release() {
        zzjz zzjzVar = this.zzbeq;
        if (zzjzVar != null) {
            zzjzVar.release();
            this.zzbeq = null;
        }
    }
}
