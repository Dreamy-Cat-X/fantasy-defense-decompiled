package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final /* synthetic */ class zzbde {
    static final /* synthetic */ int[] zzeox;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        zzeox = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzeox[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzeox[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzeox[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzeox[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
