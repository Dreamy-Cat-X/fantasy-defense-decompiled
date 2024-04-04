package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzgy {
    public static final String[] zza = {"app_background", "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter", "session_start_with_rollout", "firebase_campaign"};
    public static final String[] zzb = {"ad_impression"};
    public static final String[] zzc = {"_ab", "_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep", "_ssr", "_cmp"};
    public static final String[] zzd = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    protected zzgy() {
    }

    public static String zza(String str) {
        return zzik.zza(str, zzc, zza);
    }

    public static String zzb(String str) {
        return zzik.zza(str, zza, zzc);
    }
}
