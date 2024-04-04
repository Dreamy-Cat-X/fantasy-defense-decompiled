package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzrw {
    private ByteArrayOutputStream zzbtw = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzbtx = new Base64OutputStream(this.zzbtw, 10);

    public final void write(byte[] bArr) throws IOException {
        this.zzbtx.write(bArr);
    }

    public final String toString() {
        try {
            this.zzbtx.close();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zzbtw.close();
            return this.zzbtw.toString();
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.util.zzd.zzc("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zzbtw = null;
            this.zzbtx = null;
        }
    }
}
