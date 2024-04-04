package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzf {
    private String zzadn;
    private String zzchb;
    private String zzchd;
    private String zzchh;
    private boolean zzchj;
    private AdInfo zzcjo;
    private Date zzmu;
    private Location zzmy;
    private final HashSet<String> zzcjx = new HashSet<>();
    private final Bundle zzcjj = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzcjy = new HashMap<>();
    private final HashSet<String> zzcjz = new HashSet<>();
    private final Bundle zzchf = new Bundle();
    private final HashSet<String> zzcka = new HashSet<>();
    private final List<String> zzchl = new ArrayList();
    private int zzcgy = -1;
    private boolean zzbnf = false;
    private int zzadl = -1;
    private int zzadm = -1;
    private int zzchm = 60000;

    public final void zzcf(String str) {
        this.zzcjx.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzcjy.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzcjj.putBundle(cls.getName(), bundle);
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzcjj.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzcjj.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzcjj.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzcg(String str) {
        this.zzcjz.add(str);
    }

    public final void zzch(String str) {
        this.zzcjz.remove(str);
    }

    @Deprecated
    public final void zza(Date date) {
        this.zzmu = date;
    }

    public final void zzci(String str) {
        this.zzchd = str;
    }

    public final void zzc(List<String> list) {
        this.zzchl.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                zzaym.zzex("neighboring content URL should not be null or empty");
            } else {
                this.zzchl.add(str);
            }
        }
    }

    @Deprecated
    public final void zzcx(int i) {
        this.zzcgy = i;
    }

    public final void zza(Location location) {
        this.zzmy = location;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbnf = z;
    }

    public final void zzcj(String str) {
        this.zzchb = str;
    }

    public final void zzck(String str) {
        this.zzchh = str;
    }

    @Deprecated
    public final void zzz(boolean z) {
        this.zzadl = z ? 1 : 0;
    }

    public final void zzd(String str, String str2) {
        this.zzchf.putString(str, str2);
    }

    public final void zzcl(String str) {
        this.zzcka.add(str);
    }

    @Deprecated
    public final void zzaa(boolean z) {
        this.zzchj = z;
    }

    public final void zza(AdInfo adInfo) {
        this.zzcjo = adInfo;
    }

    @Deprecated
    public final void zzcy(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.zzadm = i;
        }
    }

    @Deprecated
    public final void zzcm(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.zzadn = str;
        }
    }

    public final void zzcz(int i) {
        this.zzchm = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Date zza(zzzf zzzfVar) {
        return zzzfVar.zzmu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzb(zzzf zzzfVar) {
        return zzzfVar.zzchd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List zzc(zzzf zzzfVar) {
        return zzzfVar.zzchl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzd(zzzf zzzfVar) {
        return zzzfVar.zzcgy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zze(zzzf zzzfVar) {
        return zzzfVar.zzcjx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Location zzf(zzzf zzzfVar) {
        return zzzfVar.zzmy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzg(zzzf zzzfVar) {
        return zzzfVar.zzbnf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzh(zzzf zzzfVar) {
        return zzzfVar.zzcjj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashMap zzi(zzzf zzzfVar) {
        return zzzfVar.zzcjy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzj(zzzf zzzfVar) {
        return zzzfVar.zzchb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzk(zzzf zzzfVar) {
        return zzzfVar.zzchh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzl(zzzf zzzfVar) {
        return zzzfVar.zzadl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzm(zzzf zzzfVar) {
        return zzzfVar.zzcjz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzn(zzzf zzzfVar) {
        return zzzfVar.zzchf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzo(zzzf zzzfVar) {
        return zzzfVar.zzcka;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzp(zzzf zzzfVar) {
        return zzzfVar.zzchj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AdInfo zzq(zzzf zzzfVar) {
        return zzzfVar.zzcjo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzr(zzzf zzzfVar) {
        return zzzfVar.zzadm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzs(zzzf zzzfVar) {
        return zzzfVar.zzadn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzt(zzzf zzzfVar) {
        return zzzfVar.zzchm;
    }
}
