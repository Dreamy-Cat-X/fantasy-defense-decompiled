package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzzc {
    private final int zzadl;
    private final int zzadm;
    private final String zzadn;
    private final boolean zzbnf;
    private final int zzcgy;
    private final String zzchb;
    private final String zzchd;
    private final Bundle zzchf;
    private final String zzchh;
    private final boolean zzchj;
    private final List<String> zzchl;
    private final int zzchm;
    private final Bundle zzcjj;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzcjk;
    private final SearchAdRequest zzcjl;
    private final Set<String> zzcjm;
    private final Set<String> zzcjn;
    private final AdInfo zzcjo;
    private final Date zzmu;
    private final Set<String> zzmw;
    private final Location zzmy;

    public zzzc(zzzf zzzfVar) {
        this(zzzfVar, null);
    }

    public zzzc(zzzf zzzfVar, SearchAdRequest searchAdRequest) {
        this.zzmu = zzzf.zza(zzzfVar);
        this.zzchd = zzzf.zzb(zzzfVar);
        this.zzchl = zzzf.zzc(zzzfVar);
        this.zzcgy = zzzf.zzd(zzzfVar);
        this.zzmw = Collections.unmodifiableSet(zzzf.zze(zzzfVar));
        this.zzmy = zzzf.zzf(zzzfVar);
        this.zzbnf = zzzf.zzg(zzzfVar);
        this.zzcjj = zzzf.zzh(zzzfVar);
        this.zzcjk = Collections.unmodifiableMap(zzzf.zzi(zzzfVar));
        this.zzchb = zzzf.zzj(zzzfVar);
        this.zzchh = zzzf.zzk(zzzfVar);
        this.zzcjl = searchAdRequest;
        this.zzadl = zzzf.zzl(zzzfVar);
        this.zzcjm = Collections.unmodifiableSet(zzzf.zzm(zzzfVar));
        this.zzchf = zzzf.zzn(zzzfVar);
        this.zzcjn = Collections.unmodifiableSet(zzzf.zzo(zzzfVar));
        this.zzchj = zzzf.zzp(zzzfVar);
        this.zzcjo = zzzf.zzq(zzzfVar);
        this.zzadm = zzzf.zzr(zzzfVar);
        this.zzadn = zzzf.zzs(zzzfVar);
        this.zzchm = zzzf.zzt(zzzfVar);
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzmu;
    }

    public final String getContentUrl() {
        return this.zzchd;
    }

    public final List<String> zzrg() {
        return new ArrayList(this.zzchl);
    }

    @Deprecated
    public final int getGender() {
        return this.zzcgy;
    }

    public final Set<String> getKeywords() {
        return this.zzmw;
    }

    public final Location getLocation() {
        return this.zzmy;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbnf;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzcjk.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls) {
        return this.zzcjj.getBundle(cls.getName());
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzcjj.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String getPublisherProvidedId() {
        return this.zzchb;
    }

    public final String zzrh() {
        return this.zzchh;
    }

    public final SearchAdRequest zzri() {
        return this.zzcjl;
    }

    public final boolean isTestDevice(Context context) {
        RequestConfiguration requestConfiguration = zzzj.zzrr().getRequestConfiguration();
        zzwo.zzqm();
        String zzbm = zzayd.zzbm(context);
        return this.zzcjm.contains(zzbm) || requestConfiguration.getTestDeviceIds().contains(zzbm);
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzrj() {
        return this.zzcjk;
    }

    public final Bundle zzrk() {
        return this.zzcjj;
    }

    public final int zzrl() {
        return this.zzadl;
    }

    public final Bundle getCustomTargeting() {
        return this.zzchf;
    }

    public final Set<String> zzrm() {
        return this.zzcjn;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzchj;
    }

    public final AdInfo zzrn() {
        return this.zzcjo;
    }

    public final int zzro() {
        return this.zzadm;
    }

    public final String getMaxAdContentRating() {
        return this.zzadn;
    }

    public final int zzrp() {
        return this.zzchm;
    }
}
