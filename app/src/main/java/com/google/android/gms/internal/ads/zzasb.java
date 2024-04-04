package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzasb implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzarw zzdse;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdsg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasb(zzarw zzarwVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdse = zzarwVar;
        this.zzdsg = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzdse.zza(thread, th);
            } catch (Throwable unused) {
                zzaym.zzev("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzdsg;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzdsg;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
