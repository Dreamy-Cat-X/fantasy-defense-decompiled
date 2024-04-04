package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeph extends zzepi {
    private Logger logger;

    public zzeph(String str) {
        this.logger = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zziq(String str) {
        this.logger.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
