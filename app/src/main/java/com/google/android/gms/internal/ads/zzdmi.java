package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.nonagon.transaction.omid.OmidSettings;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdmi {
    public final String id;
    public final boolean zzbpc;
    public final String zzchd;
    public final String zzdkl;
    public final String zzdkw;
    public final String zzdkx;
    public final List<String> zzdlg;
    public final List<String> zzdlh;
    public final String zzdlm;
    public final boolean zzdlt;
    public final boolean zzdlu;
    public final boolean zzdlv;
    public final String zzdnh;
    public final List<String> zzduf;
    public final String zzdui;
    public final String zzdul;
    public final zzaun zzdur;
    public final List<String> zzdus;
    public final List<String> zzdut;
    public final boolean zzdvb;
    public final boolean zzdve;
    public final boolean zzdvf;
    public final boolean zzdvy;
    public final String zzesu;
    public final int zzfru;
    public final boolean zzfrv;
    public final boolean zzfrw;
    public final String zzfxj;
    public final List<String> zzhhk;
    public final int zzhhl;
    public final int zzhhm;
    public final List<String> zzhhn;
    public final List<String> zzhho;
    public final List<String> zzhhp;
    public final List<String> zzhhq;
    public final int zzhhr;
    public final List<zzdmh> zzhhs;
    public final zzdml zzhht;
    public final List<String> zzhhu;
    public final List<zzdmh> zzhhv;
    public final JSONObject zzhhw;
    public final zzavy zzhhx;
    public final JSONObject zzhhy;
    public final JSONObject zzhhz;
    public final String zzhia;
    public final boolean zzhib;
    public final int zzhic;
    public final int zzhid;
    public final OmidSettings zzhie;
    public final int zzhif;
    public final boolean zzhig;
    public final zzarb zzhih;
    public final zzvr zzhii;
    public final String zzhij;
    public final boolean zzhik;
    public final JSONObject zzhil;
    public final boolean zzhim;
    public final JSONObject zzhin;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x049a. Please report as an issue. */
    public zzdmi(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<zzdmh> list;
        char c;
        List<String> list2;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<String> emptyList10 = Collections.emptyList();
        List<zzdmh> emptyList11 = Collections.emptyList();
        List<String> emptyList12 = Collections.emptyList();
        List<zzdmh> emptyList13 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObject2;
        JSONObject jSONObject9 = jSONObject3;
        JSONObject jSONObject10 = jSONObject4;
        JSONObject jSONObject11 = jSONObject5;
        JSONObject jSONObject12 = jSONObject6;
        zzaun zzaunVar = null;
        zzdml zzdmlVar = null;
        zzavy zzavyVar = null;
        zzarb zzarbVar = null;
        zzvr zzvrVar = null;
        String str13 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        int i7 = -1;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        List<String> list3 = emptyList12;
        List<zzdmh> list4 = emptyList13;
        List<String> list5 = emptyList10;
        List<zzdmh> list6 = emptyList11;
        List<String> list7 = emptyList8;
        List<String> list8 = emptyList9;
        List<String> list9 = emptyList6;
        List<String> list10 = emptyList7;
        List<String> list11 = emptyList4;
        List<String> list12 = emptyList5;
        List<String> list13 = emptyList2;
        List<String> list14 = emptyList3;
        List<String> list15 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str14 = nextName == null ? "" : nextName;
            switch (str14.hashCode()) {
                case -1980587809:
                    list = list4;
                    if (str14.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    break;
                case -1965512151:
                    list = list4;
                    if (str14.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    break;
                case -1812055556:
                    list = list4;
                    if (str14.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    break;
                case -1662989631:
                    list = list4;
                    if (str14.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    break;
                case -1620470467:
                    list = list4;
                    if (str14.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    break;
                case -1440104884:
                    list = list4;
                    if (str14.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    break;
                case -1439500848:
                    list = list4;
                    if (str14.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    break;
                case -1428969291:
                    list = list4;
                    if (str14.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    break;
                case -1403779768:
                    list = list4;
                    if (str14.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    break;
                case -1375413093:
                    list = list4;
                    if (str14.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    break;
                case -1360811658:
                    list = list4;
                    if (str14.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    break;
                case -1306015996:
                    list = list4;
                    if (str14.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    break;
                case -1303332046:
                    list = list4;
                    if (str14.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    break;
                case -1289032093:
                    list = list4;
                    if (str14.equals("extras")) {
                        c = 29;
                        break;
                    }
                    break;
                case -1240082064:
                    list = list4;
                    if (str14.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    break;
                case -1234181075:
                    list = list4;
                    if (str14.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    break;
                case -1168140544:
                    list = list4;
                    if (str14.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1152230954:
                    list = list4;
                    if (str14.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1146534047:
                    list = list4;
                    if (str14.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    break;
                case -1115838944:
                    list = list4;
                    if (str14.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1081936678:
                    list = list4;
                    if (str14.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    break;
                case -1078050970:
                    list = list4;
                    if (str14.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1051269058:
                    list = list4;
                    if (str14.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    break;
                case -982608540:
                    list = list4;
                    if (str14.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    break;
                case -776859333:
                    list = list4;
                    if (str14.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    break;
                case -544216775:
                    list = list4;
                    if (str14.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    break;
                case -437057161:
                    list = list4;
                    if (str14.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    break;
                case -404433734:
                    list = list4;
                    if (str14.equals("rtb_native_required_assets")) {
                        c = '9';
                        break;
                    }
                    break;
                case -404326515:
                    list = list4;
                    if (str14.equals("render_timeout_ms")) {
                        c = '&';
                        break;
                    }
                    break;
                case -397704715:
                    list = list4;
                    if (str14.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    break;
                case -388807511:
                    list = list4;
                    if (str14.equals("content_url")) {
                        c = ':';
                        break;
                    }
                    break;
                case -369773488:
                    list = list4;
                    if (str14.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    break;
                case -213424028:
                    list = list4;
                    if (str14.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    break;
                case -154616268:
                    list = list4;
                    if (str14.equals("is_offline_ad")) {
                        c = '8';
                        break;
                    }
                    break;
                case -29338502:
                    list = list4;
                    if (str14.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 3107:
                    list = list4;
                    if (str14.equals("ad")) {
                        c = 18;
                        break;
                    }
                    break;
                case 3355:
                    list = list4;
                    if (str14.equals("id")) {
                        c = 23;
                        break;
                    }
                    break;
                case 3076010:
                    list = list4;
                    if (str14.equals("data")) {
                        c = 22;
                        break;
                    }
                    break;
                case 63195984:
                    list = list4;
                    if (str14.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    break;
                case 107433883:
                    list = list4;
                    if (str14.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    break;
                case 230323073:
                    list = list4;
                    if (str14.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    break;
                case 418392395:
                    list = list4;
                    if (str14.equals("is_closable_area_disabled")) {
                        c = '$';
                        break;
                    }
                    break;
                case 549176928:
                    list = list4;
                    if (str14.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    break;
                case 597473788:
                    list = list4;
                    if (str14.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    break;
                case 673261304:
                    list = list4;
                    if (str14.equals("reward_granted_urls")) {
                        c = 7;
                        break;
                    }
                    break;
                case 754887508:
                    list = list4;
                    if (str14.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    break;
                case 791122864:
                    list = list4;
                    if (str14.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1010584092:
                    list = list4;
                    if (str14.equals("transaction_id")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 1100650276:
                    list = list4;
                    if (str14.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1321720943:
                    list = list4;
                    if (str14.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1637553475:
                    list = list4;
                    if (str14.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    break;
                case 1638957285:
                    list = list4;
                    if (str14.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1686319423:
                    list = list4;
                    if (str14.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1688341040:
                    list = list4;
                    if (str14.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1799285870:
                    list = list4;
                    if (str14.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    break;
                case 1839650832:
                    list = list4;
                    if (str14.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1875425491:
                    list = list4;
                    if (str14.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    break;
                case 2068142375:
                    list = list4;
                    if (str14.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    break;
                case 2072888499:
                    list = list4;
                    if (str14.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    break;
                default:
                    list = list4;
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    list2 = list3;
                    list15 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 1:
                    list2 = list3;
                    String nextString = jsonReader.nextString();
                    if ("banner".equals(nextString)) {
                        i = 1;
                    } else if ("interstitial".equals(nextString)) {
                        i = 2;
                    } else if ("native_express".equals(nextString)) {
                        i = 3;
                    } else if ("native".equals(nextString)) {
                        i = 4;
                    } else if ("rewarded".equals(nextString)) {
                        i = 5;
                    } else {
                        i = "app_open_ad".equals(nextString) ? 6 : 0;
                    }
                    list3 = list2;
                    list4 = list;
                    break;
                case 2:
                    list2 = list3;
                    list13 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 3:
                    list2 = list3;
                    list14 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 4:
                    list2 = list3;
                    list11 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 5:
                    list2 = list3;
                    int nextInt = jsonReader.nextInt();
                    i2 = (nextInt == 0 || nextInt == 1) ? nextInt : 0;
                    list3 = list2;
                    list4 = list;
                    break;
                case 6:
                    list2 = list3;
                    list12 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 7:
                    list2 = list3;
                    com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case '\b':
                    list2 = list3;
                    list9 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case '\t':
                    list2 = list3;
                    list10 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case '\n':
                    list2 = list3;
                    str = jsonReader.nextString();
                    list3 = list2;
                    list4 = list;
                    break;
                case 11:
                    list2 = list3;
                    str2 = jsonReader.nextString();
                    list3 = list2;
                    list4 = list;
                    break;
                case '\f':
                    list2 = list3;
                    zzaunVar = zzaun.zza(com.google.android.gms.ads.internal.util.zzbk.zzd(jsonReader));
                    list3 = list2;
                    list4 = list;
                    break;
                case '\r':
                    list2 = list3;
                    list7 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 14:
                    list2 = list3;
                    list8 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 15:
                    list2 = list3;
                    list5 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 16:
                    list2 = list3;
                    i3 = jsonReader.nextInt();
                    list3 = list2;
                    list4 = list;
                    break;
                case 17:
                    list2 = list3;
                    list6 = zzdmh.zze(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 18:
                    list2 = list3;
                    zzdmlVar = new zzdml(jsonReader);
                    list3 = list2;
                    list4 = list;
                    break;
                case 19:
                    list4 = zzdmh.zze(jsonReader);
                    break;
                case 20:
                    list3 = com.google.android.gms.ads.internal.util.zzbk.zza(jsonReader);
                    list4 = list;
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    list4 = list;
                    break;
                case 22:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    list4 = list;
                    break;
                case 23:
                    str4 = jsonReader.nextString();
                    list4 = list;
                    break;
                case 24:
                    str5 = jsonReader.nextString();
                    list4 = list;
                    break;
                case 25:
                    str6 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader).toString();
                    list4 = list;
                    break;
                case 26:
                    zzavyVar = zzavy.zzg(com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader));
                    list4 = list;
                    break;
                case 27:
                    str7 = jsonReader.nextString();
                    list4 = list;
                    break;
                case 28:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    list4 = list;
                    break;
                case 29:
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    list4 = list;
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '%':
                    list2 = list3;
                    String nextString2 = jsonReader.nextString();
                    if ("landscape".equalsIgnoreCase(nextString2)) {
                        i4 = 6;
                    } else {
                        i4 = "portrait".equalsIgnoreCase(nextString2) ? 7 : -1;
                    }
                    list3 = list2;
                    list4 = list;
                    break;
                case '&':
                    i5 = jsonReader.nextInt();
                    list4 = list;
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '(':
                    str8 = jsonReader.nextString();
                    list4 = list;
                    break;
                case ')':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    list4 = list;
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case ',':
                    i6 = jsonReader.nextInt();
                    list4 = list;
                    break;
                case '-':
                    i7 = jsonReader.nextInt();
                    list4 = list;
                    break;
                case '.':
                    str9 = jsonReader.nextString();
                    list4 = list;
                    break;
                case '/':
                    str10 = jsonReader.nextString();
                    list4 = list;
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '1':
                    JSONObject zzc = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    if (zzc == null) {
                        list2 = list3;
                        zzarbVar = null;
                    } else {
                        list2 = list3;
                        zzarbVar = new zzarb(zzc.optBoolean("enable_prewarming", false), zzc.optString("prefetch_url", ""));
                    }
                    list3 = list2;
                    list4 = list;
                    break;
                case '2':
                    z12 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '3':
                    zzvrVar = zzvr.zza(com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader));
                    list4 = list;
                    break;
                case '4':
                    str11 = jsonReader.nextString();
                    list4 = list;
                    break;
                case '5':
                    z13 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '6':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    list4 = list;
                    break;
                case '7':
                    str12 = jsonReader.nextString();
                    list4 = list;
                    break;
                case '8':
                    z14 = jsonReader.nextBoolean();
                    list4 = list;
                    break;
                case '9':
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbk.zzc(jsonReader);
                    list4 = list;
                    break;
                case ':':
                    str13 = jsonReader.nextString();
                    list4 = list;
                    break;
                default:
                    list2 = list3;
                    jsonReader.skipValue();
                    list3 = list2;
                    list4 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zzhhk = list15;
        this.zzhhl = i;
        this.zzdlg = list13;
        this.zzdlh = list14;
        this.zzhhn = list11;
        this.zzhhm = i2;
        this.zzdus = list12;
        this.zzdut = list9;
        this.zzhho = list10;
        this.zzdkw = str;
        this.zzdkx = str2;
        this.zzdur = zzaunVar;
        this.zzhhp = list7;
        this.zzhhq = list8;
        this.zzduf = list5;
        this.zzhhr = i3;
        this.zzhhs = list6;
        this.zzhht = zzdmlVar;
        this.zzhhu = list3;
        this.zzhhv = list4;
        this.zzdkl = str3;
        this.zzhhw = jSONObject7;
        this.id = str4;
        this.zzdlm = str5;
        this.zzdul = str6;
        this.zzhhx = zzavyVar;
        this.zzdui = str7;
        this.zzhhy = jSONObject8;
        this.zzhhz = jSONObject9;
        this.zzdlt = z;
        this.zzdlu = z2;
        this.zzdlv = z3;
        this.zzdvy = z4;
        this.zzhib = z5;
        this.zzfrw = z6;
        this.zzbpc = z7;
        this.zzhic = i4;
        this.zzhid = i5;
        this.zzdvb = z8;
        this.zzesu = str8;
        this.zzhie = new OmidSettings(jSONObject10);
        this.zzdve = z9;
        this.zzdvf = z10;
        this.zzhif = i6;
        this.zzdnh = str9;
        this.zzfru = i7;
        this.zzfxj = str10;
        this.zzhig = z11;
        this.zzhih = zzarbVar;
        this.zzfrv = z12;
        this.zzhii = zzvrVar;
        this.zzhij = str11;
        this.zzhik = z13;
        this.zzhil = jSONObject11;
        this.zzhia = str12;
        this.zzhim = z14;
        this.zzhin = jSONObject12;
        this.zzchd = str13;
    }
}
