package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdnq {
    public static ParcelFileDescriptor zze(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        zzayv.zzegi.execute(new Runnable(inputStream, parcelFileDescriptor2) { // from class: com.google.android.gms.internal.ads.zzdnt
            private final InputStream zzhjz;
            private final ParcelFileDescriptor zzhka;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhjz = inputStream;
                this.zzhka = parcelFileDescriptor2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InputStream inputStream2 = this.zzhjz;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.zzhka);
                        try {
                            IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
