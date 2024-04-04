package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdpd implements zzdpa {
    private final Object[] zzhmv;

    public zzdpd(zzvi zzviVar, String str, int i, String str2, zzvu zzvuVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzviVar.zzcgx));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zzq(zzviVar.extras));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzviVar.extras.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzviVar.zzcgy));
        }
        if (hashSet.contains("keywords")) {
            if (zzviVar.zzcgz != null) {
                arrayList.add(zzviVar.zzcgz.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzviVar.zzcha));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzviVar.zzadl));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzviVar.zzbnf));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzviVar.zzchb);
        }
        if (hashSet.contains("location")) {
            if (zzviVar.zzmy != null) {
                arrayList.add(zzviVar.zzmy.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzviVar.zzchd);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zzq(zzviVar.zzche));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zzq(zzviVar.zzchf));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzviVar.zzchg != null) {
                arrayList.add(zzviVar.zzchg.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzviVar.zzchh);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzviVar.zzchi);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzviVar.zzchj));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzviVar.zzadm));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzviVar.zzadn);
        }
        if (hashSet.contains("orientation")) {
            if (zzvuVar != null) {
                arrayList.add(Integer.valueOf(zzvuVar.orientation));
            } else {
                arrayList.add(null);
            }
        }
        this.zzhmv = arrayList.toArray();
    }

    @Override // com.google.android.gms.internal.ads.zzdpa
    public final boolean equals(Object obj) {
        if (obj instanceof zzdpd) {
            return Arrays.equals(this.zzhmv, ((zzdpd) obj).zzhmv);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdpa
    public final int hashCode() {
        return Arrays.hashCode(this.zzhmv);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.zzhmv);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    private static String zzq(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = zzq((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}
