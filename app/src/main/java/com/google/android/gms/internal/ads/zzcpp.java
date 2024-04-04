package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzuc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcpp {
    private static final SparseArray<zzuc.zzo.zzb> zzgpq;
    private final Context context;
    private final zzbpw zzfvl;
    private final zzcpi zzgmp;
    private final TelephonyManager zzgpn;
    private final zzcpc zzgpo;
    private zzum zzgpp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpp(Context context, zzbpw zzbpwVar, zzcpi zzcpiVar, zzcpc zzcpcVar) {
        this.context = context;
        this.zzfvl = zzbpwVar;
        this.zzgmp = zzcpiVar;
        this.zzgpo = zzcpcVar;
        this.zzgpn = (TelephonyManager) context.getSystemService("phone");
    }

    private static zzum zzbj(boolean z) {
        return z ? zzum.ENUM_TRUE : zzum.ENUM_FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzuc.zzm zzj(Bundle bundle) {
        zzuc.zzm.zzb zzbVar;
        zzuc.zzm.zza zzoo = zzuc.zzm.zzoo();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzgpp = zzum.ENUM_TRUE;
        } else {
            this.zzgpp = zzum.ENUM_FALSE;
            if (i == 0) {
                zzoo.zza(zzuc.zzm.zzc.CELL);
            } else if (i == 1) {
                zzoo.zza(zzuc.zzm.zzc.WIFI);
            } else {
                zzoo.zza(zzuc.zzm.zzc.NETWORKTYPE_UNSPECIFIED);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzuc.zzm.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzuc.zzm.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzuc.zzm.zzb.LTE;
                    break;
                default:
                    zzbVar = zzuc.zzm.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzoo.zza(zzbVar);
        }
        return (zzuc.zzm) ((zzekq) zzoo.zzbiz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzuc.zzo.zzb zzk(Bundle bundle) {
        return zzgpq.get(zzdnl.zza(zzdnl.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzuc.zzo.zzb.UNSPECIFIED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList<zzuc.zzc.zza> zzl(Bundle bundle) {
        List<String> emptyList;
        List asList;
        zzuc.zzc.zza zzaVar;
        Object obj = bundle.get("ad_types");
        if (obj instanceof List) {
            asList = (List) obj;
        } else if (obj instanceof String[]) {
            asList = Arrays.asList((String[]) obj);
        } else {
            emptyList = Collections.emptyList();
            ArrayList<zzuc.zzc.zza> arrayList = new ArrayList<>();
            for (String str : emptyList) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                        }
                        if (c == 0) {
                            zzaVar = zzuc.zzc.zza.BANNER;
                        } else if (c == 1) {
                            zzaVar = zzuc.zzc.zza.INTERSTITIAL;
                        } else if (c == 2) {
                            zzaVar = zzuc.zzc.zza.NATIVE_APP_INSTALL;
                        } else if (c == 3) {
                            zzaVar = zzuc.zzc.zza.REWARD_BASED_VIDEO_AD;
                        } else {
                            zzaVar = zzuc.zzc.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                        }
                        arrayList.add(zzaVar);
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 2;
                        }
                        if (c == 0) {
                        }
                        arrayList.add(zzaVar);
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 3;
                        }
                        if (c == 0) {
                        }
                        arrayList.add(zzaVar);
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                        }
                        if (c == 0) {
                        }
                        arrayList.add(zzaVar);
                        break;
                    default:
                        if (c == 0) {
                        }
                        arrayList.add(zzaVar);
                        break;
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj2 : asList) {
            if (obj2 instanceof String) {
                arrayList2.add((String) obj2);
            }
        }
        emptyList = Collections.unmodifiableList(arrayList2);
        ArrayList<zzuc.zzc.zza> arrayList3 = new ArrayList<>();
        while (r7.hasNext()) {
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] zza(boolean z, ArrayList<zzuc.zzc.zza> arrayList, zzuc.zzm zzmVar, zzuc.zzo.zzb zzbVar) {
        return ((zzuc.zzo.zza) ((zzekq) zzuc.zzo.zza.zzpd().zze(arrayList).zzh(zzbj(com.google.android.gms.ads.internal.zzp.zzks().zzb(this.context.getContentResolver()) != 0)).zzi(com.google.android.gms.ads.internal.zzp.zzks().zza(this.context, this.zzgpn)).zzet(this.zzgmp.zzot()).zzeu(this.zzgmp.zzou()).zzcj(this.zzgmp.getResponseCode()).zzb(zzbVar).zzb(zzmVar).zzj(this.zzgpp).zzf(zzbj(z)).zzes(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()).zzg(zzbj(com.google.android.gms.ads.internal.zzp.zzks().zza(this.context.getContentResolver()) != 0)).zzbiz())).toByteArray();
    }

    public final void zzbi(boolean z) {
        zzdyz.zza(this.zzfvl.zzalf(), new zzcpo(this, z), zzayv.zzegn);
    }

    static {
        SparseArray<zzuc.zzo.zzb> sparseArray = new SparseArray<>();
        zzgpq = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzuc.zzo.zzb.CONNECTED);
        zzgpq.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzuc.zzo.zzb.CONNECTING);
        zzgpq.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzuc.zzo.zzb.CONNECTING);
        zzgpq.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzuc.zzo.zzb.CONNECTING);
        zzgpq.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzuc.zzo.zzb.DISCONNECTING);
        zzgpq.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzuc.zzo.zzb.DISCONNECTED);
        zzgpq.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzuc.zzo.zzb.DISCONNECTED);
        zzgpq.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzuc.zzo.zzb.DISCONNECTED);
        zzgpq.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzuc.zzo.zzb.DISCONNECTED);
        zzgpq.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzuc.zzo.zzb.DISCONNECTED);
        zzgpq.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzuc.zzo.zzb.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzgpq.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzuc.zzo.zzb.CONNECTING);
        }
        zzgpq.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzuc.zzo.zzb.CONNECTING);
    }
}
