package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzvn {
    public static final zzvn zzchp = new zzvn();

    protected zzvn() {
    }

    public static zzvi zza(Context context, zzzc zzzcVar) {
        Context context2;
        List list;
        zzva zzvaVar;
        String str;
        Date birthday = zzzcVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1L;
        String contentUrl = zzzcVar.getContentUrl();
        int gender = zzzcVar.getGender();
        Set<String> keywords = zzzcVar.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzzcVar.isTestDevice(context2);
        Location location = zzzcVar.getLocation();
        Bundle networkExtrasBundle = zzzcVar.getNetworkExtrasBundle(AdMobAdapter.class);
        if (zzzcVar.zzrn() != null) {
            zzvaVar = new zzva(zzzcVar.zzrn().getAdString(), zzwo.zzqu().containsKey(zzzcVar.zzrn().getQueryInfo()) ? zzwo.zzqu().get(zzzcVar.zzrn().getQueryInfo()) : "");
        } else {
            zzvaVar = null;
        }
        boolean manualImpressionsEnabled = zzzcVar.getManualImpressionsEnabled();
        String publisherProvidedId = zzzcVar.getPublisherProvidedId();
        SearchAdRequest zzri = zzzcVar.zzri();
        zzaam zzaamVar = zzri != null ? new zzaam(zzri) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzwo.zzqm();
            str = zzayd.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean isDesignedForFamilies = zzzcVar.isDesignedForFamilies();
        RequestConfiguration requestConfiguration = zzzj.zzrr().getRequestConfiguration();
        return new zzvi(8, time, networkExtrasBundle, gender, list, isTestDevice, Math.max(zzzcVar.zzrl(), requestConfiguration.getTagForChildDirectedTreatment()), manualImpressionsEnabled, publisherProvidedId, zzaamVar, location, contentUrl, zzzcVar.zzrk(), zzzcVar.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzzcVar.zzrm())), zzzcVar.zzrh(), str, isDesignedForFamilies, zzvaVar, Math.max(zzzcVar.zzro(), requestConfiguration.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(zzzcVar.getMaxAdContentRating(), requestConfiguration.getMaxAdContentRating()), zzvm.zzcho), zzzcVar.zzrg(), zzzcVar.zzrp());
    }

    public static zzaue zza(Context context, zzzc zzzcVar, String str) {
        return new zzaue(zza(context, zzzcVar), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ int zzc(String str, String str2) {
        return RequestConfiguration.zzadp.indexOf(str) - RequestConfiguration.zzadp.indexOf(str2);
    }
}
