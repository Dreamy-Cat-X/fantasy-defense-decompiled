package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzbn extends zzepa implements Closeable {
    private static zzepi zzcz = zzepi.zzn(zzbn.class);

    public zzbn(zzepc zzepcVar, zzbo zzboVar) throws IOException {
        zza(zzepcVar, zzepcVar.size(), zzboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzepa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zzizn.close();
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public String toString() {
        String obj = this.zzizn.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
