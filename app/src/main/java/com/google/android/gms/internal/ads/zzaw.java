package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzaw implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        return bArr.length - bArr2.length;
    }
}
