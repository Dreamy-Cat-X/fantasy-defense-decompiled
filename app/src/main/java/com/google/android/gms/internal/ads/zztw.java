package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import com.sncompany.newtower.GameThread;
import com.sncompany.newtower.NetworkThread;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zztw {

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class zza extends zzekq<zza, C0023zza> implements zzemf {
        private static final zza zzbvv;
        private static volatile zzemm<zza> zzei;

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* loaded from: D:\decomp\classes.dex */
        public enum zzb implements zzekv {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
            AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
            AD_FAILED_TO_LOAD_TIMEOUT(102),
            AD_FAILED_TO_LOAD_CANCELLED(103),
            AD_FAILED_TO_LOAD_NO_ERROR(104),
            AD_FAILED_TO_LOAD_NOT_FOUND(105),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(GameThread.GAME_PLAY2_IMAGE_LOAD),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
            REQUEST_FAILED_TO_RENDER(1007),
            REQUEST_IS_PREFETCH(1100),
            REQUEST_SAVED_TO_CACHE(1101),
            REQUEST_LOADED_FROM_CACHE(1102),
            REQUEST_PREFETCH_INTERCEPTED(1103),
            REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
            REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
            NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
            NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
            REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(NetworkThread.DATA_COMMAND_LOGIN_ACCEPTED),
            ANDROID_WEBVIEW_CRASH(10002),
            OFFLINE_UPLOAD(10003),
            DELAY_PAGE_LOAD_CANCELLED_AD(10004);

            private static final zzeku<zzb> zzep = new zztx();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzekv
            public final int zzv() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzb(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
        /* renamed from: com.google.android.gms.internal.ads.zztw$zza$zza, reason: collision with other inner class name */
        /* loaded from: D:\decomp\classes.dex */
        public static final class C0023zza extends zzekq.zzb<zza, C0023zza> implements zzemf {
            private C0023zza() {
                super(zza.zzbvv);
            }

            /* synthetic */ C0023zza(zztv zztvVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzekq
        public final Object zza(int i, Object obj, Object obj2) {
            zztv zztvVar = null;
            switch (zztv.zzds[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0023zza(zztvVar);
                case 3:
                    return zza(zzbvv, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzbvv;
                case 5:
                    zzemm<zza> zzemmVar = zzei;
                    if (zzemmVar == null) {
                        synchronized (zza.class) {
                            zzemmVar = zzei;
                            if (zzemmVar == null) {
                                zzemmVar = new zzekq.zza<>(zzbvv);
                                zzei = zzemmVar;
                            }
                        }
                    }
                    return zzemmVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zzbvv = zzaVar;
            zzekq.zza((Class<zza>) zza.class, zzaVar);
        }
    }
}
