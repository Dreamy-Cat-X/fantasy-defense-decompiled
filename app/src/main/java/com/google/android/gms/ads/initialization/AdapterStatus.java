package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
