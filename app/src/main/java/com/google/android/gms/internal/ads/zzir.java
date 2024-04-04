package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzir extends Thread {
    private final /* synthetic */ AudioTrack zzajm;
    private final /* synthetic */ zzis zzajn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzis zzisVar, AudioTrack audioTrack) {
        this.zzajn = zzisVar;
        this.zzajm = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zzajm.flush();
            this.zzajm.release();
        } finally {
            conditionVariable = this.zzajn.zzajv;
            conditionVariable.open();
        }
    }
}
