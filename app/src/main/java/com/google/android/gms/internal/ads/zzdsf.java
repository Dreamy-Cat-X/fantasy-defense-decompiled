package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.kt.olleh.inapp.net.InAppError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdsf {
    private final Context context;
    private final Clock zzbpw;
    private final String zzbrf;
    private final String zzcix;
    private final String zzdsl;
    private final zzef zzfpp;
    private final zzdmw zzfxf;
    private final zzcud zzfza;

    public zzdsf(zzcud zzcudVar, zzayt zzaytVar, String str, String str2, Context context, zzdmw zzdmwVar, Clock clock, zzef zzefVar) {
        this.zzfza = zzcudVar;
        this.zzbrf = zzaytVar.zzbrf;
        this.zzdsl = str;
        this.zzcix = str2;
        this.context = context;
        this.zzfxf = zzdmwVar;
        this.zzbpw = clock;
        this.zzfpp = zzefVar;
    }

    public final List<String> zza(zzdmt zzdmtVar, zzdmi zzdmiVar, List<String> list) {
        return zza(zzdmtVar, zzdmiVar, false, "", "", list);
    }

    public static List<String> zza(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append(2);
            sb.append(".");
            sb.append(i2);
            arrayList.add(zzc(str, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    public final List<String> zza(zzdmt zzdmtVar, zzdmi zzdmiVar, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = z ? InAppError.FAILED : InAppError.SUCCESS;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String zzc = zzc(zzc(zzc(it.next(), "@gw_adlocid@", zzdmtVar.zzhiy.zzfve.zzhje), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzbrf);
            if (zzdmiVar != null) {
                zzc = zzawy.zzc(zzc(zzc(zzc(zzc, "@gw_qdata@", zzdmiVar.zzdlm), "@gw_adnetid@", zzdmiVar.id), "@gw_allocid@", zzdmiVar.zzdkl), this.context, zzdmiVar.zzdve);
            }
            String zzc2 = zzc(zzc(zzc(zzc, "@gw_adnetstatus@", this.zzfza.zzase()), "@gw_seqnum@", this.zzdsl), "@gw_sessid@", this.zzcix);
            boolean z2 = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcrw)).booleanValue() && !TextUtils.isEmpty(str);
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z2 || isEmpty) {
                if (this.zzfpp.zzb(Uri.parse(zzc2))) {
                    Uri.Builder buildUpon = Uri.parse(zzc2).buildUpon();
                    if (z2) {
                        buildUpon = buildUpon.appendQueryParameter("ms", str);
                    }
                    if (isEmpty) {
                        buildUpon = buildUpon.appendQueryParameter("attok", str2);
                    }
                    zzc2 = buildUpon.build().toString();
                }
            }
            arrayList.add(zzc2);
        }
        return arrayList;
    }

    public final List<String> zza(zzdmi zzdmiVar, List<String> list, zzato zzatoVar) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        try {
            String type = zzatoVar.getType();
            String num = Integer.toString(zzatoVar.getAmount());
            zzdmw zzdmwVar = this.zzfxf;
            String zzhd = zzdmwVar == null ? "" : zzhd(zzdmwVar.zzdxo);
            zzdmw zzdmwVar2 = this.zzfxf;
            String zzhd2 = zzdmwVar2 != null ? zzhd(zzdmwVar2.zzdxp) : "";
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzawy.zzc(zzc(zzc(zzc(zzc(zzc(zzc(it.next(), "@gw_rwd_userid@", Uri.encode(zzhd)), "@gw_rwd_custom_data@", Uri.encode(zzhd2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(type)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzbrf), this.context, zzdmiVar.zzdve));
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }

    private static String zzc(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzhd(String str) {
        return (TextUtils.isEmpty(str) || !zzayg.isEnabled()) ? str : "fakeForAdDebugLog";
    }
}
