package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzctu<AdT> implements zzcqq<AdT> {
    protected abstract zzdzl<AdT> zza(zzdmx zzdmxVar, Bundle bundle);

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return !TextUtils.isEmpty(zzdmiVar.zzhhw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<AdT> zzb(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        String optString = zzdmiVar.zzhhw.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzdmx zzdmxVar = zzdmtVar.zzhiy.zzfve;
        zzdmz zzgs = new zzdmz().zzb(zzdmxVar).zzgs(optString);
        Bundle zzm = zzm(zzdmxVar.zzhjd.zzche);
        Bundle zzm2 = zzm(zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzm2.putInt("gw", 1);
        String optString2 = zzdmiVar.zzhhw.optString("mad_hac", null);
        if (optString2 != null) {
            zzm2.putString("mad_hac", optString2);
        }
        String optString3 = zzdmiVar.zzhhw.optString("adJson", null);
        if (optString3 != null) {
            zzm2.putString("_ad", optString3);
        }
        zzm2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzdmiVar.zzhhz.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzdmiVar.zzhhz.optString(next, null);
            if (next != null) {
                zzm2.putString(next, optString4);
            }
        }
        zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzm2);
        zzdmx zzavi = zzgs.zzh(new zzvi(zzdmxVar.zzhjd.versionCode, zzdmxVar.zzhjd.zzcgx, zzm2, zzdmxVar.zzhjd.zzcgy, zzdmxVar.zzhjd.zzcgz, zzdmxVar.zzhjd.zzcha, zzdmxVar.zzhjd.zzadl, zzdmxVar.zzhjd.zzbnf, zzdmxVar.zzhjd.zzchb, zzdmxVar.zzhjd.zzchc, zzdmxVar.zzhjd.zzmy, zzdmxVar.zzhjd.zzchd, zzm, zzdmxVar.zzhjd.zzchf, zzdmxVar.zzhjd.zzchg, zzdmxVar.zzhjd.zzchh, zzdmxVar.zzhjd.zzchi, zzdmxVar.zzhjd.zzchj, zzdmxVar.zzhjd.zzchk, zzdmxVar.zzhjd.zzadm, zzdmxVar.zzhjd.zzadn, zzdmxVar.zzhjd.zzchl, zzdmxVar.zzhjd.zzchm)).zzavi();
        Bundle bundle = new Bundle();
        zzdmj zzdmjVar = zzdmtVar.zzhiz.zzera;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzdmjVar.zzdlj));
        bundle2.putInt("refresh_interval", zzdmjVar.zzhio);
        bundle2.putString("gws_query_id", zzdmjVar.zzbvf);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzdmtVar.zzhiy.zzfve.zzhje;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", zzdmiVar.zzdkl);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzdmiVar.zzdlg));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzdmiVar.zzdlh));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzdmiVar.zzduf));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzdmiVar.zzhhp));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzdmiVar.zzdus));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzdmiVar.zzdut));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzdmiVar.zzhho));
        bundle3.putString("transaction_id", zzdmiVar.zzdkw);
        bundle3.putString("valid_from_timestamp", zzdmiVar.zzdkx);
        bundle3.putBoolean("is_closable_area_disabled", zzdmiVar.zzbpc);
        if (zzdmiVar.zzdur != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzdmiVar.zzdur.zzdxh);
            bundle4.putString("rb_type", zzdmiVar.zzdur.type);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zza(zzavi, bundle);
    }

    private static Bundle zzm(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
